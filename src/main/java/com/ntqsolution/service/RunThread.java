package com.ntqsolution.service;


import com.ntqsolution.Container;
import com.ntqsolution.entity.*;
import com.ntqsolution.utils.ThreadUtil;

public class RunThread extends Thread {

    @Override
    public void run() {
        while (true) {
            Animals animal = Container.pollAnimal();
            if (ThreadUtil.isNull(animal)) {
                ThreadUtil.sleep(20);
                continue;
            }
            AnimalProcessor processor = null;
            if (animal instanceof Horse) {
                processor = new HorseProcessor(animal);
            } else if (animal instanceof Cow) {
                processor = new CowProcessor(animal);
            } else if (animal instanceof Chicken) {
                processor = new ChickenProcessor(animal);
            }
            processor.process();
        }
    }
}

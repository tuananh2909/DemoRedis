package com.ntqsolution.service;

import com.ntqsolution.entity.Animals;
import com.ntqsolution.utils.Const;

public class HorseProcessor extends AnimalProcessor {
    public HorseProcessor(Animals animal) {
        super(animal);
    }

    @Override
    public void process() {
        System.out.println(animal.getName() + " bắt đầu");
        for (int i = Const.DEFAULT; i <= Const.HORSE_DESTINATION; i += animal.getRandomDistance()) {
            System.out.println(animal.getName() + " đã chạy được: " + i);
        }
        System.out.println(animal.getName() + " đã xẻ thịt!");
    }
}

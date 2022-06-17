package com.ntqsolution.service;

import com.ntqsolution.entity.Animals;

public class ChickenProcessor extends AnimalProcessor {
    public ChickenProcessor(Animals animal) {
        super(animal);
    }

    @Override
    public void process() {
        System.out.println(animal.getName() + " đã luộc!");
    }
}

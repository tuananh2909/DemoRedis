package com.ntqsolution.service;

import com.ntqsolution.entity.Animals;

public class CowProcessor extends AnimalProcessor {
    public CowProcessor(Animals animal) {
        super(animal);
    }

    @Override
    public void process() {
        System.out.println(animal.getName() + " đã xẻ thịt!");
    }
}

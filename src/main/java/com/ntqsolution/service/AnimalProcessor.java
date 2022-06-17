package com.ntqsolution.service;

import com.ntqsolution.entity.Animals;

public class AnimalProcessor implements Processor {
    public Animals animal;

    public AnimalProcessor(Animals animal) {
        this.animal = animal;
    }

    @Override
    public void process() {

    }
}

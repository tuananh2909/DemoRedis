package com.ntqsolution.redis;

public class AnimalRedisCache extends BaseRedis{

    public static final String ANIMAL_KEY = "animal";

    public String getAnimalName(){
        return get(ANIMAL_KEY);
    }
}

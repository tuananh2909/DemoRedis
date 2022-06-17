package com.ntqsolution.redis;

public class HorseRedisCache extends BaseRedis{

    public static final String HORSE = "Horse";

    public String get(){
        return get(HORSE);
    }
}

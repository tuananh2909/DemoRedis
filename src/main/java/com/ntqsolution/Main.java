package com.ntqsolution;

import com.ntqsolution.entity.Chicken;
import com.ntqsolution.entity.Cow;
import com.ntqsolution.entity.Horse;
import redis.clients.jedis.Jedis;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Horse horse = new Horse("horse");
        Cow cow = new Cow("cow");
        Chicken chicken = new Chicken("chicken");

        Container.add(horse);
        Container.add(chicken);
        Container.add(cow);

//        ThreadUtil.start();
//
//        Container.init();

        Jedis jedis = new Jedis();
        Jedis jedis2 = new Jedis();
        jedis2.close();
        jedis.hset("Animal", "name", "horse");
        jedis.hset("Animal", "name", "cow");
        jedis.hset("Animal", "name", "chicken");


        //String name = jedis.hget("Animal", "name");
        Map<String, String> fields = jedis.hgetAll("Animal");
    }
}

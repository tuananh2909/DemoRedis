package com.ntqsolution.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class RedisFactory {

    private static Jedis jedis  = new Jedis();

    private static JedisPool jedisPool;

    public static Jedis getConnect(){
        return jedisPool.getResource();
    }

    public static void init(){


        //TODO creatJedisPool
    }

}

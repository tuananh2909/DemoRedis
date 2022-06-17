package com.ntqsolution.redis;

import redis.clients.jedis.Jedis;

public abstract class BaseRedis {

    protected Jedis getConnection(){
        return  RedisFactory.getConnect();
    }


    protected void set(String key,String value){
        try(Jedis jedis = getConnection()){

        }
        try {
            Jedis jedis = getConnection();
            jedis.set(key, value);
        }catch(Exception ex){

        }
    }

    protected String get(String key){
        try {
            Jedis jedis = getConnection();
            return jedis.get(key);
        }catch(Exception ex){

        }
        return null;
    }


}

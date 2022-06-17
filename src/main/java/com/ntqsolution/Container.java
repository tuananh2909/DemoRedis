package com.ntqsolution;

import com.ntqsolution.entity.Animals;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;

public class Container {
    static LinkedBlockingDeque<Animals> queue = new LinkedBlockingDeque<>();
    static Map<String, Integer> map = new ConcurrentHashMap<>();

    public static void init() {
        map.put("receiver", 2);
        map.put("sender", -3);
    }

    public static void add(Animals animals) {
        queue.add(animals);
    }

    public static Animals pollAnimal() {
        return queue.poll();
    }

    public static int getSize() {
        return queue.size();
    }
}

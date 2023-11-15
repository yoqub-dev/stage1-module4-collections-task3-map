package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> swappedMap = new HashMap<>();

        for (Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
            String value = entry.getValue();
            int key = entry.getKey();

            // If the value doesn't exist in the swappedMap or maps to a smaller key
            if (!swappedMap.containsKey(value) || swappedMap.get(value) > key) {
                swappedMap.put(value, key);
            }
        }

        return swappedMap;
    }
}

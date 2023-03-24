package task2;


import java.util.*;
public class ChainHashCollection{
    private final Integer maxValue = 1000;
    private final Vector<SortedMap<Integer, Integer>> collection;

    public ChainHashCollection(){
        this.collection = new Vector<>(32);
    }

    public Integer[] sort(Integer[] arr) {
        if (arr == null) return null;

        for (int i = 0; i < arr.length; i++) {
            collection.add(new TreeMap<>());
        }
        for (Integer t : arr) {
            if (maxValue <= t && t <= -maxValue) {
                continue;
            }
            int index = countHash(t);
            if (collection.get(index).containsKey(t)) {
                collection.get(index).put(t, collection.get(index).get(t) + 1);
            } else collection.get(index).put(t, 1);
        }
        int index = 0;
        Integer[] resultArray = new Integer[arr.length];
        for (SortedMap<Integer, Integer> map: collection) {
            for (Integer val: map.keySet()) {
                for (int i = 0; i < map.get(val); i++) {
                    resultArray[index++] = val;
                }
            }
        }

        collection.clear();
        return resultArray;
    }

    private Integer countHash(Integer value) {
        return  Math.abs( value) * collection.size() / maxValue;
    }
}


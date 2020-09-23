package Jav8.Collections;

import java.util.*;

public class MyHashSet {
    private final int ARRAY_SIZE = 100;
    private final int MAX_VALUE = 1000000;

    List<List<Integer>> parentList;

    public MyHashSet() {
        parentList = new ArrayList<>(ARRAY_SIZE);
        for(int i = 0; i < ARRAY_SIZE; i++){
            parentList.add(null);
        }
    }
    public boolean contains(int key) {
        int index = key % ARRAY_SIZE;
        return !(parentList.get(index) == null) && parentList.get(index).contains(key);
    }
    public void add(int key) {
        int index = key % ARRAY_SIZE;
        List<Integer> list = parentList.get(index);
        if (list == (null)){
            list = new LinkedList<>();
            parentList.add(index, list);
            list.add(key);
        }
        else{
            if(!list.contains(key)){
                list.add(key);
            }
        }
    }
    public void remove(int key) {
        int index = key % ARRAY_SIZE;
        List<Integer> list = parentList.get(index);
        list.remove(Integer.valueOf(key));
    }
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (List<Integer> integers : parentList) {
            if (integers != null)
                str.append(integers);
        }
        return str.toString();
    }
}

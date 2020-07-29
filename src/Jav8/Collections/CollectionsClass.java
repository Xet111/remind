package Jav8.Collections;

import java.util.*;

public class CollectionsClass {

    public void linkedListMethod(){
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Anime");
        linkedList.add("Food");
        linkedList.add("Sex");
        linkedList.add("Drugs");


        System.out.println(linkedList);

    }

    public void setMethod(){
        Set<Integer> set = new HashSet<>();
        set.add(13);
        set.add(1);
        set.add(22);
        set.add(3);
        set.add(49);
        System.out.println(set);
        Iterator<Integer> iterator = set.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void treeSetMethod(){
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(12);
        treeSet.add(20);
        treeSet.add(3);
        treeSet.add(13);
        treeSet.add(9);
        Iterator iterator = treeSet.iterator();
        iterator.forEachRemaining(System.out::println);
        iterator = treeSet.iterator();
        System.out.println(iterator.next());
//        while (iterator.hasNext()){
//            iterator
//            if (iterator.next().equals(13)){
//                System.out.println("Found");
//                break;
//            }


      //  }

        System.out.println(treeSet);

    }

    public void linkedHashSetMethod(){
        LinkedHashSet<Integer> set = new LinkedHashSet();
        set.add(12);
        set.add(22);
        set.add(9);
        Iterator <Integer>iterator = set.iterator();
        iterator.forEachRemaining(o -> System.out.println(o+2));


        System.out.println(set);
    }




}



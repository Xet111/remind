package Jav8.Generics;

import Jav8.Patterns.FabricMethodLesson.DialogWeb;
import Jav8.Patterns.FabricMethodLesson.FactoryMethod;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class GenericsL<E> {
    public <T extends E> ArrayList<T> genericPlay(Collection<? extends T> coll){
        ArrayList<T> collection = new ArrayList<>();
        collection.addAll(coll);
        return collection;
    }
    public void go(){
        ArrayList<DialogWeb> dialogWeb = new ArrayList<DialogWeb>();
        dialogWeb.add(new DialogWeb());
        dialogWeb.add(new DialogWeb());
        System.out.println(new GenericsL<FactoryMethod>().genericPlay(dialogWeb));
    }
}

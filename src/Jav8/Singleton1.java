package Jav8;

public class Singleton1 {
    private static final Singleton1 singleton1 = new Singleton1();

    private Singleton1(){


    }
    public void view(){
        System.out.println("ANIME");
    }

    public static Singleton1 initialize(){
        return singleton1;
    }
}

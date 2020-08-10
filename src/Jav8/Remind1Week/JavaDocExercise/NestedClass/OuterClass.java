package Jav8.Remind1Week.JavaDocExercise.NestedClass;

public class OuterClass {
    private static int i = 1;
    public static int x = 2;

    public static class NestedClass {

        public void methodNested(){
            System.out.println(i);
            System.out.println(x);
        }
    }
    public class InnerClasso{
        public int x = 1;
        public void methodInner(){
            System.out.println(x);
        }
    }


}

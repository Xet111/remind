package Jav8.Remind1Week.JavaDocExercise.NestedClass;

import java.util.Iterator;

public class DataStructure {
    private final static int SIZE = 18;
    int [] arr = new int[SIZE];

    public void allEven(){
        for (int i = 0; i < SIZE; i++){
            arr[i] = i;
        }

        DataStructureIterator iterator = new EvenIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


    interface DataStructureIterator extends Iterator<Integer> {
    }

    public class EvenIterator implements DataStructureIterator{
        private int nextIndex = 0;
        @Override
        public boolean hasNext() {
            return (nextIndex <= SIZE - 1);
        }

        @Override
        public Integer next() {
            int indexValue = arr[nextIndex];
            nextIndex += 2;
            return indexValue;
        }
    }
}

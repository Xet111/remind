package Jav8.Sorting;

import java.util.Arrays;

public class SortMethods {
    private int [] arr = {2,1,3,4,3,5,6,8,9,0};
    int res;
    private void filling() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10 + 1);
        }
        System.out.println(Arrays.toString(arr));
    }

    public int [] bubbleSorting(){
        int res;
        for (int i = 0; i < arr.length; i++){

            for (int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] > arr[j + 1]){
                    res = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = res;
                }
            }

        }
        return arr;

    }

    public int [] shakerSort(){
        int left = 0;
        int right = arr.length - 1;

        do{
            for (int i =  left; i < right; i ++) {
                if (arr[i] > arr[i + 1]) {
                    res = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = res;
                }
            }
                right--;

                for (int j = right; j > left; j--){
                    if (arr[j] < arr[j - 1]){
                        res = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = res;
                    }
                }
                left++;


        }
        while (left < right);
        return arr;
    }

    public int [] combSort(){

        int dist = (int)(arr.length);

        while (dist != 1){
            dist = (int)(dist/1.247);

            for (int i = 0; i < arr.length; i ++){
                if (i + dist <= arr.length -1){
                if (arr[i] > arr[i + dist]){
                    res = arr[i];
                    arr[i] = arr [i + dist];
                    arr[i + dist] = res;
                }}
            }
            //System.out.println(dist);
        }

        return arr;
    }

    public int[] insertionSort(){
        int j;
        System.out.println(Arrays.toString(arr));
        for (int i = 1; i < arr.length ; i ++){
            j = i - 1;
            res = arr[i];

            while (j >= 0 && arr[j] > res ){
                arr[j + 1] = arr [j];
                j--;
            }
            arr[j+1] = res;


        }
        return arr;
    }

    public int [] rememberBubbleSorting(){
        int temp;

        for (int i = 0 ; i < arr.length; i++){
            for (int j = 0; j < arr.length - i - 1; j ++){
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j +1 ];
                    arr[j+ 1] = temp;
                }
            }
        }
        return arr;

    }

    public int [] rememberShakerSort(){
        int left = 0;
        int right = arr.length -1;

        do {
            for (int i = left; i < right; i++) {
                if (arr[i] > arr[i + 1]) {
                    res = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = res;
                }
            }
                right--;
                for (int j = right; j > left; j--) {
                    if (arr[j] < arr[j - 1]) {
                        res = arr[j];
                        arr[j] = arr[j - 1];
                        arr[j - 1] = res;
                    }
                }
                left++;

        }
        while(left < right);

        return arr;
    }

}

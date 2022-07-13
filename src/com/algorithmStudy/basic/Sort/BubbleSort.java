package com.algorithmStudy.basic.Sort;

public class BubbleSort {
    static int[] bubbleSort(int[] arr){
        //배열의 앞의 원소를 인덱스할 i
        for (int i = 0; i < arr.length - 1; i++) {
            //배열의 뒤의 원소를 인덱스할 j
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[j] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {9, 10, 7, 6, 8, 1, 5, 3, 4, 2};
        int[] sortArr = bubbleSort(arr);
        for (int i : sortArr) {

            System.out.println("sort = " + i);

        }
    }
}

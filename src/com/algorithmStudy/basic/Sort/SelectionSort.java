package com.algorithmStudy.basic.Sort;

public class SelectionSort {

    static void selectionSortDesc(int[] arr) {
        int desc = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    desc = arr[i];
                    arr[i] = arr[j];
                    arr[j] = desc;
                }
            }
        }
        for (int i : arr) {
            System.out.println("sort Desc =" + i);
        }
    }

    static void selectionSortAsc(int[] arr) {
        int asc = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    asc = arr[i];
                    arr[i] = arr[j];
                    arr[j] = asc;
                }
            }
        }

        for (int i : arr) {
            System.out.println("sort Asc = " + i);
        }
    }

    public static void main(String[] args) {
        int[] sortArr = {10 , 6 , 3 , 1 , 5 , 4 , 9 , 8 , 7 , 2};
        selectionSortAsc(sortArr);
        selectionSortDesc(sortArr);
    }
}

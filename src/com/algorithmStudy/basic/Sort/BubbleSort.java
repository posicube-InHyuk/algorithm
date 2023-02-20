package com.algorithmStudy.basic.Sort;

public class BubbleSort {
    static int[] bubbleSortAsc(int[] arr) {
        System.out.println("\n" + "버블정렬 오름차순");
        int temp = 0;
        //배열의 앞의 원소를 인덱스할 i
        //배열의 길이만큼 반복할 바깥쪽 반복문
        for (int i = 0; i < arr.length; i++) {
            //배열의 길이 -1만큼 반복
            for (int j = 0; j < arr.length - i; j++) {
                //배열의 마지막 원소가 인덱스되며
                //배열의 j번째 원소와 j + 1번째 원소를 비교한다. (두개씩)
                //배열의 j번째 원소가  j + 1번째 원소보다 클 경우
                //1. j에는 j+1이 / 2. j+1에는 j가
                if (j + 1 < arr.length && arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            // 정렬 과정 출력
            System.out.print("\n" + i + " 번째 정렬 완료된 배열 : ");
            for (int x : arr) {
                System.out.print(x + " ");
            }
        }
        System.out.println();
        return arr;
    }

    static int[] bubbleSortDesc(int[] arr) {
        System.out.println("\n" + "버블정렬 내림차순");
        int temp = 0;
        //배열의 앞의 원소를 인덱스할 i
        //배열의 길이만큼 반복할 바깥쪽 반복문
        for (int i = 0; i < arr.length; i++) {
            //배열의 길이 -1만큼 반복
            for (int j = 0; j < arr.length - i; j++) {
                //배열의 마지막 원소가 인덱스되며
                //배열의 j번째 원소와 j + 1번째 원소를 비교한다. (두개씩)
                //j + 1번째 원소가 j번째 원소보다 클 경우
                //1. j에는 j+1이 / 2. j+1에는 j가
                if (j + 1 < arr.length && arr[j] < arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
            // 정렬 과정 출력
            System.out.print("\n" + i + " 번째 정렬 완료된 배열 : ");
            for (int x : arr) {
                System.out.print(x + " ");
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {9, 10, 7, 6, 8, 1, 5, 3, 4, 2};
        bubbleSortAsc(arr);
        bubbleSortDesc(arr);
    }
}

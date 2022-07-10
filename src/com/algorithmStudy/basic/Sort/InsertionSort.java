package com.algorithmStudy.basic.Sort;

public class InsertionSort {

    /*
    1. 현재 타겟이 되는 숫자와 이전 위치에 있는 원소들을 비교한다. (첫 번째 타겟은 두 번째 원소부터 시작한다.)
    2. 타겟이 되는 숫자가 이전 위치에 있던 원소보다 작다면 위치를 서로 교환한다.
    3. 그 다음 타겟을 찾아 위와 같은 방법으로 반복한다.
    삽입 정렬의 시간복잡도는 최선의 경우 O(N) , 최악의 경우에는 O(N2)
    */

    public static void main(String[] args) {
        int[] arr = {9, 10, 7, 6, 8, 1, 5, 3, 4, 2};
        insertionSort(arr);
        for (int i : arr) {
            System.out.println("i = " + i);
        }
    }

    static int[] insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            //정렬의 타겟이될 n번째의 다음 원소
            int target = arr[i];
            //정렬의 타겟과 비교할 n번째 원소의 idx
            int n = i - 1;
            //n가 0보다 크거나 같고 target원소가 n번째 원소보다 작은 경우 반복
            while (n >= 0 && target < arr[n]) {
                //arr의 n번째 원소를 arr의 n + 1번째로 민다.
                arr[n + 1] = arr[n];
                //while문의 조건이 true일 경우 n -1번째와 target을 한번 더 비교해야해서 정렬하기 위해 n--해준다.
                n--;
            }
            //위 while문에 걸리지 않으면 target의 정렬 위치가 확정됨을 의미 해당 위치에 할당해준다.
            arr[n + 1 ] = target;
        }

        return arr;
    }

}

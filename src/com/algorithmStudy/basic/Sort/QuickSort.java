package com.algorithmStudy.basic.Sort;

public class QuickSort {
    /*
        분할 정복 알고리즘의 하나로, 배열을 pivot 값을 기준으로 두 개의 부분 배열로 분할하고 , 각 부분 배열을 재귀적으로 정렬하는 알고리즘입니다.
        평균적으로 가장 빠른 정렬 알고리즘이며, 시간 복잡도는 O(nlogn)입니다.
        pivot 값 선택에 따라서 최악의 경우에는 O(n^2)의 시간 복잡도를 가질 수 있습니다.
    */


    // 퀵 정렬 수행 메서드
    public void sort(int[] arr, int start, int end) {
        // start가 end보다 작은 경우에만 분할 및 정렬을 수행함
        if (start < end) {
            // 배열을 pivot 값을 기준으로 두 개의 부분 배열로 분할하고, 각 부분 배열을 재귀적으로 정렬하는 메서드를 호출함
            int pivotIndex = partition(arr, start, end);
            sort(arr, start, pivotIndex - 1);
            sort(arr, pivotIndex + 1, end);
        }
    }

    // 배열을 pivot 값 기준으로 분할하는 메서드
    private int partition(int[] arr, int start, int end) {
        // pivot 값을 배열의 마지막 값으로 설정함
        int pivot = arr[end];
        // i는 pivot보다 작은 값들 중 가장 마지막 인덱스를 가리키는 변수
        int i = start - 1;
        // 배열의 첫 번째부터 마지막 바로 앞까지 반복하면서 pivot보다 작은 값들을 배열의 앞쪽으로 이동시킴
        for (int j = start; j < end; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // pivot의 위치를 pivot보다 작은 값들의 뒤에 위치시킴
        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;
        // pivot의 위치를 반환함
        return i + 1;
    }

    public static void main(String[] args) {

    }
}

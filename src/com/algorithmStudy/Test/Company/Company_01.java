package com.algorithmStudy.Test.Company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Company_01 {
    public static int[] reverseArr(int[] arr){
        int len = arr.length;
        int[] result = new int[len];

        for (int i = 0; i < arr.length; i++) {
            result[(len-1)-i] = arr[i];
        }

        return result;
    }

    public static void main(String[] args) {
        // 배열 뒤집기
        int[] result = reverseArr(new int[]{1, 2, 3, 4, 5});
        for (int i : result) {
            System.out.println("i = " + i);
        }
    }
}


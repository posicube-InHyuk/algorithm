package com.algorithmStudy.backjoon;
import java.util.Arrays;
import java.util.Scanner;

public class backjoon_10818_one_dimensional_array{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        String stringParam = scanner.nextLine();

        scanner.close();

        String[] strings = stringParam.split(" ");
        int [] ints = new int[count];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }

        Arrays.sort(ints);

        System.out.println(ints[0] + " " + ints[count-1]);
    }
}

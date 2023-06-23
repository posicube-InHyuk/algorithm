package com.algorithmStudy.basic;

public class StringReverse {

    public static String stringReverse(String str){
        // 1. 파라미터로 받은 문자열이 ""이거나 길이가 1이면 리턴한다.
        if (str.length() == 1 || str.isEmpty()) return str;
        else {
            //2. 첫번째 문자열의 char부터 stringReverse() 메서드의 파라미터로 할당한다.
            //2-1. 이 과정에서 method call stack(LIFO)이 쌓이며 12번째 라인이 끝나게되면 call stack의 마지막 메서드 13번째 라인이 시작되게 된다.
            String reversed = stringReverse(str.substring(1));

            // 3. 재귀적으로 뒤집힌 문자열과 첫 번째 문자를 결합하여 결과를 반환한다.
            // 3-1. reversed {!} + str.charAt(0) {d}
            // 3-2. reversed {d!} + str.charAt(0) {ld}
            // 3-3. reversed {ld!} + str.charAt(0) {rld}
            return reversed + str.charAt(0);
        }
    }

    public static void main(String[] args) {
        String result = stringReverse("Hello World!");
        System.out.println("result = " + result);
    }
}

package com.algorithmStudy.basic.DynamicProgramming.Fibonacci;

import org.apache.commons.lang3.time.StopWatch;

public class Main {
    /*
        1. Main Task부터 Sub Task 순으로 순차적으로 Top Down하며 풀어나가는 Dynamic Programming 예제이다.
        2. 대표적인 Dynamic Programming 예제인 Fibonacci 수열을 구현한다.
        FibonacciNaive : Dynamic Programming을 적용하지 않음
        FibonacciRecursive : Top Down 방식의 Dynamic Programming을 적용

    */
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();

//        Fibonacci fibonacci = new FibonacciNaive();
//        Fibonacci fibonacci = new FibonacciRecursiveTopDown();
        Fibonacci fibonacci = new FibonacciBottomUp();

//        stopWatch.start();
        int fibonacciTest = fibonacci.fibonacci(10000);
        System.out.println("fibonacciTest = " + fibonacciTest);
//        stopWatch.stop();
//        System.out.println("수행시간: " + stopWatch.getTime() + " ms");

        equalsTest();
    }

    public static void equalsTest() {

        Fibonacci fibonacciNaive = new FibonacciNaive();
        Fibonacci fibonacciRecursiveTopDown = new FibonacciRecursiveTopDown();
        Fibonacci fibonacciBottomUp = new FibonacciBottomUp();

        int fibonacciNaiveTest = fibonacciNaive.fibonacci(10);
        int fibonacciBottomUpTest = fibonacciBottomUp.fibonacci(10);
        int fibonacciRecursiveTopDownTest = fibonacciRecursiveTopDown.fibonacci(10);

        assert fibonacciNaiveTest == fibonacciBottomUpTest : "Naive != BottomUp";
        assert fibonacciNaiveTest == fibonacciRecursiveTopDownTest : "Naive != TopDown";
        assert fibonacciBottomUpTest == fibonacciRecursiveTopDownTest : "BottomUp != Recursive";
    }
}

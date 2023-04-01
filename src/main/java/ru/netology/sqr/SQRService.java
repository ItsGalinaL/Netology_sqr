package ru.netology.sqr;

import java.util.stream.IntStream;

public class SQRService {

    public int sqrCount(int left, int right) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (sqr >= left && sqr <= right) {
                count = count + 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        IntStream.range(10, 99)
                .map(i -> i * i)
                .forEach(System.out::println);
    }
}

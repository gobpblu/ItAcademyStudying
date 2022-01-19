package com.company.debug;

public class ArrayMethods {
    int first;
    int second;

    public ArrayMethods(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    public static String[] fizzBuzz(int start, int end) {
        String[] nums = new String[end - start];
        for (int i = start; i < end; i++) {
            if (i % 3 == 0 && i % 5 == 0) nums[i - start] = "FizzBuzz";
            else if (i % 3 == 0) nums[i - start] = "Fizz";
            else if (i % 5 == 0) nums[i - start] = "Buzz";
            else nums[i - start] = String.valueOf(i);
        }
        return (nums);
    }

    @Override
    public String toString() {
        String message = "Первое число: " + this.first + "\n" +
        "Второе число: " + this.second;
        return message;
    }
}

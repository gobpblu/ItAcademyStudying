package com.company.debug;

import java.util.Arrays;
import java.util.Scanner;

public class DebugMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        System.out.println(Arrays.toString(fizzBuzz(first,second)));
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
}

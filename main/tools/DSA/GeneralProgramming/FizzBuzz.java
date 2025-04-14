package main.tools.DSA.GeneralProgramming;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {

        System.out.println(fizzBuzz(15).toString());
    }

    public static List<String> fizzBuzz(int n) {
        List<String> strArray = new ArrayList();
        int a = 1;
        while (a <= n) {
            if (a % 3 == 0 && a % 5 == 0) {
                strArray.add("FizzBuzz");
            } else if (a % 5 == 0) {
                strArray.add("Buzz");
            } else if (a % 3 == 0) {
                strArray.add("Fizz");
            } else {
                strArray.add(String.valueOf(a));
            }
            a++;
        }
        return strArray;
    }
}

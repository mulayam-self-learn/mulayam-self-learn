package main.tools.DSA.DataStructures.Stack;

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) throws Exception {
         //int[] asteroids = {18, 12, 8, 9, 7, 7, 6, -7, -8, -5, 12, 15, -16, 40, -34, 30};      //[18, 40, 30]
        int[] asteroids = {-18, -12, -8, -9, -7, -7, -6, 7, 8, 5, -12, -15, 16, -40, 34, -30};  //[-18, -40, -30]
        //int[] asteroids ={-2,-1,1,2};


        // consider right and left moving asteroid is not constant
        System.out.println(Arrays.toString(asteroidCollision1(asteroids)));
        // consider right moving asteroid constant
        System.out.println(Arrays.toString(asteroidCollision(asteroids)));
    }

    public static int[] asteroidCollision1(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            if (stack.isEmpty()) stack.add(asteroids[i]);
            else if (!stack.isEmpty() && asteroids[i] > 0 && stack.peek() > 0) stack.add(asteroids[i]);
            else if (!stack.isEmpty() && asteroids[i] < 0 && stack.peek() < 0) stack.add(asteroids[i]);
            else if (asteroids[i] < 0 && stack.peek() <= Math.abs(asteroids[i]) && stack.pop() < Math.abs(asteroids[i]))
                i--;
            else if (asteroids[i] > 0 && Math.abs(stack.peek()) <= asteroids[i] && Math.abs(stack.pop()) < asteroids[i])
                i--;
        }
        return stack.stream().mapToInt(i -> i).toArray();
    }

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] > 0 || stack.isEmpty() || stack.peek() < 0)
                stack.add(asteroids[i]);
            else if (stack.peek() <= -asteroids[i] && stack.pop() < -asteroids[i])
                i--;
        }
        return stack.stream().mapToInt(i -> i).toArray();
    }

}

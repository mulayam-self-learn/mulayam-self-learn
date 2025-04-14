package main.tools.DSA.DataStructures.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

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
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < asteroids.length; i++) {
            if (linkedList.isEmpty())
                linkedList.add(asteroids[i]);
            else if (!linkedList.isEmpty() && asteroids[i] > 0 && linkedList.getLast() > 0)
                linkedList.add(asteroids[i]);
            else if (!linkedList.isEmpty() && asteroids[i] < 0 && linkedList.getLast() < 0)
                linkedList.add(asteroids[i]);
            else if (asteroids[i] < 0 && linkedList.getLast() <= Math.abs(asteroids[i]) && linkedList.pollLast() < Math.abs(asteroids[i]))
                i--;
            else if (asteroids[i] > 0 && Math.abs(linkedList.getLast()) <= asteroids[i] && Math.abs(linkedList.pollLast()) < asteroids[i])
                i--;
        }
        return linkedList.stream().mapToInt(i -> i).toArray();
    }

    public static int[] asteroidCollision(int[] asteroids) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] > 0 || linkedList.isEmpty() || linkedList.getLast() < 0)
                linkedList.add(asteroids[i]);
            else if (linkedList.getLast() <= -asteroids[i] && linkedList.pollLast() < -asteroids[i])
                i--;
        }
        return linkedList.stream().mapToInt(i -> i).toArray();
    }

}

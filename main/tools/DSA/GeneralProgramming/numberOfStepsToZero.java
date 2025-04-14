package main.tools.DSA.GeneralProgramming;

public class numberOfStepsToZero {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(15));
    }
    public static int numberOfSteps(int num) {
        int step = 0;
        while(num>0){
            if(num%2 == 0){
                num /= 2;
                step++;
            }else{
                num -= 1;
                step++;
            }
        }
        return step;
    }
}

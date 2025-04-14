package main.tools.DSA.GeneralProgramming;

public class maximumWealthMatrix {
    public static void main(String[] args) {
        int[][] accounts = {{2,8,7},
                {7,1,3},
                {1,9,5}};
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        int maximumWealth=0;
        int cuttentWealth =0;
        int rows = accounts.length;
        int columns = accounts[0].length;
        for(int i=0; i<rows;i++){
            cuttentWealth = 0;
            for(int j=0; j<columns;j++){
                cuttentWealth += accounts[i][j];
            }
            if(cuttentWealth > maximumWealth){
                maximumWealth = cuttentWealth;
            }
        }
        return maximumWealth;
    }
}

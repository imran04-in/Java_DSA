package Practice.Arrays;

public class Maxwealth {
    public static void main(String[] args) {
        //https://leetcode.com/problems/richest-customer-wealth/description/
   int[][] accounts = {
           {1,5},
            {7,3},
            {3,5} };
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        int maxwaelth = Integer.MIN_VALUE;
        for (int rows= 0; rows < accounts.length; rows++) {
            int wealth =0;
            for (int col = 0; col < accounts[rows].length; col++) {
                wealth += accounts[rows][col];
            }

            if (wealth > maxwaelth){
                maxwaelth = wealth;
            }
        }
        return maxwaelth;
    }
}

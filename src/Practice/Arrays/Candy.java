package Practice.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Candy {
    public static void main(String[] args) {

        //https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/submissions/1755802386/
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> isGreatest = new ArrayList<>();
        int maxCandies =0;
        for (int i = 0; i < candies.length; i++) {
            maxCandies = Math.max(maxCandies,candies[i]);
        }
        for (int i = 0; i < candies.length; i++) {
            int newCandies = candies[i] + extraCandies;
            isGreatest.add(newCandies >= maxCandies);

        }

        return isGreatest;
    }
}


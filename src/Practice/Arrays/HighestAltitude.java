package Practice.Arrays;

public class HighestAltitude {
    public static void main(String[] args) {
       int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain) {

        int[] altitudes = new int[gain.length+1];
              altitudes[0] = 0;
          int maxAltitude = altitudes[0];
        for (int i = 0; i < gain.length; i++) {
            altitudes[i + 1] = altitudes[i] + gain[i];

            maxAltitude = Math.max(maxAltitude,altitudes[i+1]);
        }
        return maxAltitude;
    }
}

class Solution {

    // Check if it's possible to complete at least totalTrips with mid time
    public static boolean possible(int[] time, long mid, int totalTrips) {
        long actualTrips = 0;
        for (int i = 0; i < time.length; i++) {
            actualTrips += mid / time[i];
        }
        return actualTrips >= totalTrips;
    }

    // Find the minimum time among all machines
    public static int findMin(int[] time) {
        int min = Integer.MAX_VALUE;
        for (int t : time) {
            if (t < min) {
                min = t;
            }
        }
        return min;
    }

    // Main function to calculate minimum time required
    public long minimumTime(int[] time, int totalTrips) {
        long low = 1;
        long high = (long) findMin(time) * totalTrips; // Adjusted to cast to long for large numbers

        while (low < high) {
            long mid = low + (high - low) / 2;
            if (possible(time, mid, totalTrips)) {
                high = mid; // If mid time is possible, try for smaller time
            } else {
                low = mid + 1; // If mid time is not enough, increase the time
            }
        }
        return low; // Return the minimum time found
    }
}
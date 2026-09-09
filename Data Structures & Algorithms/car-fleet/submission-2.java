class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] carTuples = new int[position.length][2];
        for (int i = 0; i < position.length; i++) {
            carTuples[i][0] = position[i];
            carTuples[i][1] = speed[i];
        }

        Arrays.sort(carTuples, (a, b) -> Integer.compare(b[0], a[0]));

        int fleets = 1;
        double prevTime = (double) (target - carTuples[0][0]) / carTuples[0][1];
        for (int i = 1; i < position.length; i++) {
            int[] p = carTuples[i];

            double time = (double) (target - p[0]) / p[1];

            if (time > prevTime) {
                fleets++;
                prevTime = time;
            }
        }
        return fleets;
    }
}

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] carTuples = new int[position.length][2];
        for (int i = 0; i < position.length; i++) {
            carTuples[i][0] = position[i];
            carTuples[i][1] = speed[i];
        }

        Arrays.sort(carTuples, (a, b) -> Integer.compare(b[0], a[0]));
        Deque<Double> stack = new ArrayDeque<>();

        for (int[] p : carTuples) {
            double time = (double) (target - p[0]) / p[1];

            // Só adiciona se o tempo for estritamente maior que o do topo.
            // Se for menor ou igual, ele alcança o carro da frente e se funde à frota dele.
            if (stack.isEmpty() || time > stack.peek()) {
                stack.push(time);
            }
        }
        return stack.size();
    }
}

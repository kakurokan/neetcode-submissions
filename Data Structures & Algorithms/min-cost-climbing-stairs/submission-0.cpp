class Solution {
   public:
    int minCostClimbingStairs(vector<int>& cost) {
        int n = cost.size();
        std::vector<int> memo(n + 1);

        for(int i = 2; i <= n; i++){
            memo[i] = std::min(
                memo[i - 1] + cost[i - 1],
                memo[i - 2] + cost[i - 2]
            );
        }

        return memo[n];
    }
};

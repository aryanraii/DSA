package Array;

public class MaximumPointsYouCanObtainfromCards_Lc1423 {
/// Sliding Window: Time Complexity-->O(2*k)
    public int maxScore(int[] cardPoints, int k) {
        int leftSum=0;
        int rightSum=0;
        int maxSum=0;

        for(int i=0; i<k; i++){
            leftSum+=cardPoints[i];
        }
        maxSum=leftSum;

        int n=cardPoints.length;
        int idx=n-1;
        for(int i=k-1; i>=0; i--){
            leftSum-=cardPoints[i];
            rightSum+=cardPoints[idx];
            idx--;
            maxSum=Math.max(maxSum,rightSum+leftSum);
        }
        return maxSum;
    }
}

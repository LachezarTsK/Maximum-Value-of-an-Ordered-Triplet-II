
public class Solution {

    public long maximumTripletValue(int[] input) {
        long maxTripletValue = 0;
        int maxFirstOperand = 0;
        int maxDifferenceFirstMinusSecondOperands = 0;

        for (int i = 0; i < input.length; ++i) {
            maxTripletValue = Math.max(maxTripletValue, maxDifferenceFirstMinusSecondOperands * (long) input[i]);
            maxFirstOperand = Math.max(maxFirstOperand, input[i]);
            maxDifferenceFirstMinusSecondOperands = Math.max(maxDifferenceFirstMinusSecondOperands, maxFirstOperand - input[i]);
        }
        return maxTripletValue;
    }
}

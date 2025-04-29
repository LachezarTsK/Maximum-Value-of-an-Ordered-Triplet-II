
public class Solution
{
    public long MaximumTripletValue(int[] input)
    {
        long maxTripletValue = 0;
        int maxFirstOperand = 0;
        int maxDifferenceFirstMinusSecondOperands = 0;

        for (int i = 0; i < input.Length; ++i)
        {
            maxTripletValue = Math.Max(maxTripletValue, maxDifferenceFirstMinusSecondOperands * (long)input[i]);
            maxFirstOperand = Math.Max(maxFirstOperand, input[i]);
            maxDifferenceFirstMinusSecondOperands = Math.Max(maxDifferenceFirstMinusSecondOperands, maxFirstOperand - input[i]);
        }
        return maxTripletValue;
    }
}

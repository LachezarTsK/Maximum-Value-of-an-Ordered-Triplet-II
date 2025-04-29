
import kotlin.math.max

class Solution {

    fun maximumTripletValue(input: IntArray): Long {
        var maxTripletValue: Long = 0
        var maxFirstOperand = 0
        var maxDifferenceFirstMinusSecondOperands = 0

        for (i in input.indices) {
            maxTripletValue = max(maxTripletValue, maxDifferenceFirstMinusSecondOperands * input[i].toLong())
            maxFirstOperand = max(maxFirstOperand, input[i])
            maxDifferenceFirstMinusSecondOperands = max(maxDifferenceFirstMinusSecondOperands, maxFirstOperand - input[i])
        }
        return maxTripletValue
    }
}

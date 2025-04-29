
package main

func maximumTripletValue(input []int) int64 {
    var maxTripletValue int64 = 0
    maxFirstOperand := 0
    maxDifferenceFirstMinusSecondOperands := 0

    for i := range input {
        maxTripletValue = max(maxTripletValue, int64(maxDifferenceFirstMinusSecondOperands)*int64(input[i]))
        maxFirstOperand = max(maxFirstOperand, input[i])
        maxDifferenceFirstMinusSecondOperands = max(maxDifferenceFirstMinusSecondOperands, maxFirstOperand-input[i])
    }
    return maxTripletValue
}


/**
 * @param {number[]} input
 * @return {number}
 */
var maximumTripletValue = function (input) {
    let maxTripletValue = 0;
    let maxFirstOperand = 0;
    let maxDifferenceFirstMinusSecondOperands = 0;

    for (let i = 0; i < input.length; ++i) {
        maxTripletValue = Math.max(maxTripletValue, maxDifferenceFirstMinusSecondOperands * input[i]);
        maxFirstOperand = Math.max(maxFirstOperand, input[i]);
        maxDifferenceFirstMinusSecondOperands = Math.max(maxDifferenceFirstMinusSecondOperands, maxFirstOperand - input[i]);
    }
    return maxTripletValue;
};

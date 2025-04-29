
#include <vector>
#include <algorithm>
using namespace std;

class Solution {

public:
    long long maximumTripletValue(const vector<int>& input) const {
        long long maxTripletValue = 0;
        int maxFirstOperand = 0;
        int maxDifferenceFirstMinusSecondOperands = 0;

        for (int i = 0; i < input.size(); ++i) {
            maxTripletValue = max(maxTripletValue, maxDifferenceFirstMinusSecondOperands * static_cast<long long>(input[i]));
            maxFirstOperand = max(maxFirstOperand, input[i]);
            maxDifferenceFirstMinusSecondOperands = max(maxDifferenceFirstMinusSecondOperands, maxFirstOperand - input[i]);
        }
        return maxTripletValue;
    }
};

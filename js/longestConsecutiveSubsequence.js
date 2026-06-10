/**
 * @param {number[]} nums
 * @return {number}
 */
var longestConsecutive = function(nums) {
    const sequenceSet = new Set(nums);

    let longestSequence = 0;

    for (num of sequenceSet) {
        const currentNumber = num;

        // check if current number is the start of a sequence
        // we can check this by checking if it has a number lower than the current 
        // number by a difference of 1
        // if current number is 10, check if there is 9 in the sequence

        const previous = currentNumber - 1;

        const isStartOfASequence = !sequenceSet.has(previous);

        if (isStartOfASequence) {
            // keep increamenting and check if the other sequence exist

            let isSequence = true;
            let count = 1;
            let current = num

            while (isSequence) {
                const nextnumber = current + 1;
                current = current + 1;
                if (sequenceSet.has(nextnumber)) {
                    count++;
                } else {
                    isSequence = false;
                }
            }

            longestSequence = Math.max(longestSequence, count);
        }
    }

    return longestSequence;
};
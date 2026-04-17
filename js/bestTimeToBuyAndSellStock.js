/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let bestBuy = prices[0];
    let bestSale = prices[0];

    let bestDiff = bestSale - bestBuy;

    for (let i =0; i < prices.length; i++) {
        const prevBestBuy = bestBuy
        const prevBestSale = bestSale
        if (prices[i] < prevBestBuy) {
            bestBuy = prices[i]
            bestSale = prices[i]
        }

        if (prices[i] > prevBestSale) {
            bestSale = prices[i]
        }

        if ((bestSale - bestBuy) > bestDiff) {
            bestDiff = bestSale - bestBuy
        }
     }
    return bestDiff;
    
};


// best buy = i
// best sale = i
// if i see a number less than best buy - update best buy and best sale
// if i see a number greeater than best sale, update best sale

// 7 - 7, 7
// 1 - 1, 1
// 5 - 1, 5
// 3 - 1, 5
// 6 - 1, 6
// 4 - 1, 6


// 7 - 7, 7
// 6 - 6, 6


// [2,4,1]
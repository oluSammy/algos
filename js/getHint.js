/**
 * @param {string} secret
 * @param {string} guess
 * @return {string}
 */
var getHint = function(secret, guess) {
    const freq = {};
    let A = 0
    let B = 0;

    // check for A(s)
    for (let i = 0; i <guess.length; i++) {
        if (guess[i] === secret[i]) {
            A++;
        } else {
            freq[secret[i]] = (freq[secret[i]] ?? 0) + 1;
        }
    }

    // check for B(s)
    for (let i = 0; i < guess.length; i++) {
        if (guess[i] !== secret[i]) {
            const currentChar = guess[i]
            const charExists = freq[currentChar] !== undefined;

            if (charExists) {
                B++;
            }

            const currentFreq = freq[currentChar];
            if (currentFreq !== undefined) {
                if (currentFreq === 1) {
                    delete freq[currentChar]
                } else {
                    freq[currentChar] = freq[currentChar] - 1
                }

            }
        }
    }

    return `${A}A${B}B`;
};
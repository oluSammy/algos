/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    let openChars = ["(", "{", "["];
    let closedChars = [")", "}", "]"];


    if (closedChars.includes(s[0])) {
        return false;
    }

    const stack = [];

    for (let i = 0; i < s.length; i++) {
        const current = s[i];

        // is current a closed char
        if (closedChars.includes(current)) {
            // the last item has to be a matching open char
            const prev = stack.pop();

            // there's no item in the stack and the current item is a clossing char
            if (prev === undefined) {
                return false
            }

            // there's an item in the stack and the current item is a clossing char
            const closedIndex = closedChars.indexOf(current);
            const openIndex = openChars.indexOf(prev);

            // they are not matching indexes
            if (closedIndex !== openIndex) {
                return false
            }
        } else {
            stack.push(current)
        }
    }
    
    return stack.length === 0;
};
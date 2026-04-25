// class Node {
//   constructor(val) {
//     this.val = val;
//     this.left = null;
//     this.right = null;
//   }
// }

// using breadth first search
const treeSum = (root) => {
    // todo
    if (root === null) return 0;
  
    let sum = 0;
    const queue = [root];
  
    while(queue.length > 0) {
      // remove the first item in the queue
      const current = queue.shift();
      sum = sum + current.val;
  
      if (current.left) {
        queue.push(current.left);
      }
  
      if (current.right) {
        queue.push(current.right);
      }
    }
    
    return sum;
  };
  
  module.exports = {
    treeSum,
  };
  
// class Node {
//   constructor(val) {
//     this.val = val;
//     this.left = null;
//     this.right = null;
//   }
// }

const treeSum = (root) => {
    // todo
    if (root === null) return 0;
  
    let sum = 0;
  
    const traverse = (node) => {
      if (node === null) return;
  
      sum = sum + node.val;
      traverse(node.left);
      traverse(node.right);
    }
  
    traverse(root);  
    
    return sum;
  };
  
  module.exports = {
    treeSum,
  };
  
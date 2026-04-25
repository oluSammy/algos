const depthFirstValues = (root) => {
  const values = [];

  const traverse = (node) => {
    if (node === null) return;

    values.push(node.val);
    traverse(node.left);
    traverse(node.right);
  }

  traverse(root);

  return values;
};
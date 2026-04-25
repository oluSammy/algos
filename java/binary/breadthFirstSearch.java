import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node<T> {
  T val;
  Node<T> left;
  Node<T> right;
  
  public Node(T val) {
    this.val = val;
    this.left = null;
    this.right = null;
  }
}

class Source {
  public static List<String> breadthFirstValues(Node<String> root) {
    if (root == null) {
      return new ArrayList<>();
    }
    
    List<String> output = new ArrayList<>();
    Queue<Node<String>> queue = new LinkedList<>();

    // add the root
    queue.offer(root);

    while(!queue.isEmpty()) {
      Node<String> current = queue.poll();
      output.add(current.val);

      if (current.left != null) {
        queue.offer(current.left);
      }

      if(current.right != null) {
        queue.offer(current.right);
      }
    }
    
    // todo
    return output;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}
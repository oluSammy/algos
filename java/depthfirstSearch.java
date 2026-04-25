import java.util.List;
import java.util.ArrayList;

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
  public static List<String> depthFirstValues(Node<String> root) {
    List<String> output = new ArrayList<>();

    traverse(root, output);
    
    // todo
    return output;
  }

  private static void traverse(Node<String> current, List<String> output) {
    if (current == null) {
      return;
    }

    output.add(current.val);
    traverse(current.left, output);
    traverse(current.right, output);
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}

package binaryTree;

public class BinaryTreeApplication {

    public static void main(String[] args) {
        final var node = Node.of(10, Node.of(20, null, Node.of(50, Node.of(10, null, null), null)), null);

        final var binaryTree = BinaryTree.of(node);
        System.out.println(binaryTree.sum());
    }
}

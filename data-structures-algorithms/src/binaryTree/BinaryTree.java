package binaryTree;

import java.util.Objects;
import java.util.Stack;

public class BinaryTree {

    private Node root;

    private BinaryTree(final Node root) {
        this.root = root;
    }

    public static BinaryTree of(final Node root) {
        return new BinaryTree(root);
    }


    public int sum() {
        return sum(root, 0);
    }

    private int sum(Node node, int sum) {
        if (Objects.isNull(node)) {
            node = root;
        }

        sum += node.getValue();

        if (Objects.nonNull(node.getLeft())) {
            sum = sum(node.getLeft(), sum);
        }

        if (Objects.nonNull(node.getRight())) {
            sum = sum(node.getRight(), sum);
        }

        return sum;
    }

    public int max() {
        if (Objects.isNull(root)) {
            throw new IllegalStateException("Empty Tree");
        }

        Stack<Node> nodeStack = new Stack<>();
        nodeStack.push(root);

        int max = Integer.MIN_VALUE;

        while(!nodeStack.isEmpty()) {
            Node currentNode = nodeStack.pop();
            max = Math.max(max, currentNode.getValue());

            if (Objects.nonNull(currentNode.getRight())) {
                nodeStack.push(currentNode.getRight());
            }

            if (Objects.nonNull(currentNode.getLeft())) {
                nodeStack.push(currentNode.getLeft());
            }
        }

        return max;
    }


    public Node getRoot() {
        return root;
    }

    public void setRoot(final Node root) {
        this.root = root;
    }

    @Override
    public String toString() {
        return "BinaryTree{"
                + "root="
                + root
                + '}';
    }
}

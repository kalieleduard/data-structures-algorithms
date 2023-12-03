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

    public String postOrderPercussion() {
        final StringBuilder builder = new StringBuilder();
        postOrderPercussion(root, builder);
        builder.replace(builder.length() - 1, builder.length(), "");
        return builder.toString();
    }

    private void postOrderPercussion(final Node root, final StringBuilder stringBuilder) {
        if (Objects.nonNull(root.getLeft())) {
            postOrderPercussion(root.getLeft(), stringBuilder);
        }

        if (Objects.nonNull(root.getRight())) {
            postOrderPercussion(root.getRight(), stringBuilder);
        }

        stringBuilder.append(root.getValue()).append("-");
    }

    public int height() {
        return height(root);
    }

    private int height(final Node root) {
        int left = 0;
        int right = 0;

        if (Objects.nonNull(root.getLeft())) {
            left = height(root.getLeft());
        }

        if (Objects.nonNull(root.getRight())) {
            right = height(root.getRight());
        }

        return Math.max(left, right) + 1;
    }


    public int sum() {
        if (Objects.isNull(root)) {
            throw new IllegalStateException("Empty Tree");
        }

        final Stack<Node> nodeStack = new Stack<>();
        nodeStack.push(root);

        int sum = 0;

        while(!nodeStack.isEmpty()) {
            final Node currentNode = nodeStack.pop();
            sum += currentNode.getValue();

            if (Objects.nonNull(currentNode.getRight())) {
                nodeStack.push(currentNode.getRight());
            }

            if (Objects.nonNull(currentNode.getLeft())) {
                nodeStack.push(currentNode.getLeft());
            }
        }

        return sum;
    }

    public int recursiveSum() {
        return recursiveSum(root, 0);
    }

    private int recursiveSum(Node node, int sum) {
        if (Objects.isNull(node)) {
            node = root;
        }

        sum += node.getValue();

        if (Objects.nonNull(node.getLeft())) {
            sum = recursiveSum(node.getLeft(), sum);
        }

        if (Objects.nonNull(node.getRight())) {
            sum = recursiveSum(node.getRight(), sum);
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

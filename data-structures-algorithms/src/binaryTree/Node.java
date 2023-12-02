package binaryTree;

public class Node {

    private int value;
    private Node left;
    private Node right;

    private Node(final int value,
                final Node left,
                final Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public static Node of(final int value,
                          final Node left,
                          final Node right) {
        return new Node(value, left, right);
    }

    public int getValue() {
        return value;
    }

    public void setValue(final int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(final Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(final Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{"
                + "value="
                + value
                + ", left="
                + left
                + ", right="
                + right
                + '}';
    }
}

package binaryTree;

import java.util.Objects;

public class BinaryTree {

    private Node root;

    private BinaryTree(final Node root) {
        this.root = root;
    }

    public static BinaryTree of(final Node root) {
        return new BinaryTree(root);
    }

    /**
     *
     * @param node: can be null
     * @param sum: recursively sum
     * @return sum
     */
    public int sum(Node node, int sum) {
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

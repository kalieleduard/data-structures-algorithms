package binaryTree;

public class BinaryTreeApplication {

    public static void main(String[] args) {
        final var j = Node.of(10, null, null);
        final var i = Node.of(9, null, j);
        final var h = Node.of(8, i, null);
        final var g = Node.of(7, null, null);
        final var f = Node.of(6, null, g);
        final var e = Node.of(5, null, null);
        final var d = Node.of(4, e, f);
        final var c = Node.of(3, null, null);
        final var b = Node.of(2, c, d);
        final var a = Node.of(1, b, h);

        final var binaryTree = BinaryTree.of(a);
        System.out.println(binaryTree.height());
    }
}

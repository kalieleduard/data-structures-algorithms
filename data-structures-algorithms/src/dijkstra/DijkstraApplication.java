package dijkstra;

public class DijkstraApplication {
    public static void main(String[] args) {
        final var a = new Node("A");
        final var b = new Node("B");
        final var c = new Node("C");
        final var d = new Node("D");
        final var e = new Node("E");
        final var f = new Node("F");

        a.addDestination(b, 2);
        a.addDestination(d, 8);

        d.addDestination(e, 3);
        d.addDestination(f, 2);

        b.addDestination(e, 6);
        b.addDestination(d, 5);

        e.addDestination(c, 9);

        f.addDestination(e, 1);
        f.addDestination(c, 3);

        final var graph = new Graph();

        graph.addNode(a);
        graph.addNode(b);
        graph.addNode(c);
        graph.addNode(d);
        graph.addNode(e);
        graph.addNode(f);

        System.out.println(graph.calculateShortestDistance("A", "C"));
    }
}

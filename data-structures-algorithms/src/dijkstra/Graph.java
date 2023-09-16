package dijkstra;

import java.awt.*;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Graph {
    private final Set<Node> nodes = new HashSet<>();

    public void addNode(final Node node) {
        nodes.add(node);
    }

    public String calculateShortestDistance(final String nodeNameX, final String nodeNameY) {
        final var nodeX = findNode(nodeNameX);
        final var nodeY = findNode(nodeNameY);

        final Set<Node> unvisitedNodes = nodes;
        final Set<Node> visitedNodes = new HashSet<>();

        final var currentNode = unvisitedNodes.iterator().next();
        final var shortestDistance = 0;

        while(!currentNode.getAdjacentNodes().isEmpty()) {
            final var adjacentNodes = currentNode.getAdjacentNodes().entrySet();

            for (final Map.Entry<Node, Integer> entry : adjacentNodes) {
                final var adjacentNode = entry.getKey();
                adjacentNode.setShortestDistance(shortestDistance + entry.getValue());
            }
        }

        return null;
    }

    private Node findNode(final String aName) {
        for (final Node node : nodes) {
            if (node.getName().equals(aName)) {
                return node;
            }
        }

        throw new RuntimeException("Could not find node named: " + aName);
    }
}

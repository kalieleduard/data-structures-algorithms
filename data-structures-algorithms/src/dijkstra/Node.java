package dijkstra;

import java.util.HashMap;
import java.util.Map;

public class Node {

    private final Map<Node, Integer> adjacentNodes = new HashMap<>();
    private final String name;
    private int shortestDistance;

    public Node(final String name) {
        this.name = name;
    }

    public void addDestination(final Node destination, final int distance) {
        adjacentNodes.put(destination, distance);
    }

    public Map<Node, Integer> getAdjacentNodes() {
        return adjacentNodes;
    }

    public String getName() {
        return name;
    }

    public int getShortestDistance() {
        return shortestDistance;
    }

    public void setShortestDistance(int shortestDistance) {
        this.shortestDistance = shortestDistance;
    }
}

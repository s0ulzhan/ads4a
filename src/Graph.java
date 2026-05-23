import java.util.*;
public class Graph {
    private Map<Integer, List<Edge>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    public void addVertex(Vertex v) {
        adjList.putIfAbsent(v.getId(), new ArrayList<>());
    }

    public void addEdge(int from, int to, int weight) {
        if (!adjList.containsKey(from) || !adjList.containsKey(to)) {
            System.out.println("Error: vertex does not exist");
            return;
        }

        Vertex source = new Vertex(from);
        Vertex destination = new Vertex(to);

        Edge edge = new Edge(source, destination, weight);

        adjList.get(from).add(edge);
    }

    public void printGraph() {
        for (int v : adjList.keySet()) {
            System.out.print(v + " -> ");

            for (Edge edge : adjList.get(v)) {

                System.out.print(
                        edge.getDestination().getId()
                                + "(w:"
                                + edge.getWeight()
                                + ") "
                );
        }
            System.out.println();
    }

    public void bfs(int start) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        visited.add(start);
        queue.add(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            for (Edge edge : adjList.get(current)) {

                int neighbor = edge.getDestination().getId();

                if (!visited.contains(neighbor)) {

                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    public void dfs(int start) {
        Set<Integer> visited = new HashSet<>();
        dfsHelper(start, visited);
        System.out.println();
    }

    private void dfsHelper(int current, Set<Integer> visited) {
        visited.add(current);
        System.out.print(current + " ");

        for (Edge edge : adjList.get(current)) {

            int neighbor = edge.getDestination().getId();

            if (!visited.contains(neighbor)) {
                dfsHelper(neighbor, visited);
            }
        }
    }
}

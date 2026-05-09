import java.util.*;

public class Experiment {

    private List<String> results = new ArrayList<>();

    public void runTraversals(Graph g, int start, String graphName) {

        System.out.println("===== " + graphName + " =====");

        long startTime = System.nanoTime();

        System.out.print("BFS: ");
        g.bfs(start);

        long endTime = System.nanoTime();

        long bfsTime = endTime - startTime;

        startTime = System.nanoTime();

        System.out.print("DFS: ");
        g.dfs(start);

        endTime = System.nanoTime();

        long dfsTime = endTime - startTime;

        results.add(graphName + " | BFS: " + bfsTime + " ns | DFS: " + dfsTime + " ns");

        System.out.println("BFS Time: " + bfsTime + " ns");
        System.out.println("DFS Time: " + dfsTime + " ns");

        System.out.println();
    }

    public void printResults() {

        System.out.println("===== FINAL RESULTS =====");

        for (String r : results) {

            System.out.println(r);
        }
    }
}
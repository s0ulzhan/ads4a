public class Main {

    public static void main(String[] args) {

        Experiment experiment = new Experiment();

        Graph smallGraph = createGraph(10);
        Graph mediumGraph = createGraph(30);
        Graph largeGraph = createGraph(100);

        System.out.println("SMALL GRAPH:");
        smallGraph.printGraph();

        System.out.println("DIJKSTRA:");
        smallGraph.dijkstra(0);

        System.out.println();

        experiment.runTraversals(smallGraph, 0, "Small Graph (10)");
        experiment.runTraversals(mediumGraph, 0, "Medium Graph (30)");
        experiment.runTraversals(largeGraph, 0, "Large Graph (100)");

        experiment.printResults();
    }

    public static Graph createGraph(int size) {

        Graph g = new Graph();

        for (int i = 0; i < size; i++) {

            g.addVertex(new Vertex(i));
        }

        for (int i = 0; i < size - 1; i++) {

            g.addEdge(i, i + 1, 4);

            if (i + 2 < size) {

                g.addEdge(i, i + 2, 2);
            }
        }

        return g;
    }
}

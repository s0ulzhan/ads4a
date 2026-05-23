# Graph Project (BFS, DFS, Dijkstra Algorithm)

## Project Overview
This project implements a graph data structure in Java with traversal algorithms and shortest path calculation.

The project includes:
- Breadth-First Search (BFS)
- Depth-First Search (DFS)
- Dijkstra’s shortest path algorithm (BONUS TASK)
- Performance testing for different graph sizes

---

## Features
- Graph implementation using adjacency list
- Vertex and Edge classes
- Weighted edges support
- BFS traversal
- DFS traversal (recursive)
- Dijkstra’s algorithm (without priority queue)
- Performance comparison for graphs with 10, 30, and 100 vertices

---

## Bonus Task: Dijkstra’s Algorithm

### Implementation
For the bonus task, the graph was extended to support weighted edges and shortest path calculation.

### Changes made:
- Added `weight` field in `Edge` class
- Updated `addEdge(from, to, weight)` method
- Modified adjacency list to store `Edge` objects instead of integers
- Implemented `dijkstra(int start)` method using arrays and loops

### Edge class modified 
<img width="1920" height="1080" alt="2026-05-23_11-13-35" src="https://github.com/user-attachments/assets/8e06810e-d6ba-45ee-99b1-9ff50577ff7a" />

### Graph structure updated
<img width="1920" height="1080" alt="2026-05-23_11-15-55" src="https://github.com/user-attachments/assets/4aee9438-8350-4afc-bcf3-2ac93410a99c" />

<img width="1920" height="1080" alt="2026-05-23_11-16-07" src="https://github.com/user-attachments/assets/332e0af6-808a-4e23-89d1-c9e091676d3f" />

<img width="1920" height="1080" alt="2026-05-23_11-16-17" src="https://github.com/user-attachments/assets/3891bab0-6006-452a-9464-8ec146d54645" />

<img width="1920" height="1080" alt="2026-05-23_11-16-25" src="https://github.com/user-attachments/assets/18e5860f-c067-49ce-9b09-41fb4edcef3b" />

### Dijkstra algorithm implemented

<img width="1920" height="1080" alt="2026-05-23_11-18-52" src="https://github.com/user-attachments/assets/31ae6e79-d166-4adc-9e7a-d0786d67b20d" />

<img width="1920" height="1080" alt="2026-05-23_11-19-18" src="https://github.com/user-attachments/assets/f3528f8d-ffab-4a08-be09-cf031cad7d12" />

### Algorithm description
Dijkstra’s algorithm finds the shortest path from a starting vertex to all other vertices in a weighted graph.  
It repeatedly selects the unvisited vertex with the smallest known distance and updates its neighbors.

---

## Example Output

### Graph (Weighted Edges)

<img width="1920" height="1080" alt="2026-05-23_11-00-26" src="https://github.com/user-attachments/assets/5b7644e3-507f-4023-83a2-e3f1885e16c6" />


---

### Dijkstra Result

<img width="1920" height="1080" alt="2026-05-23_11-01-16" src="https://github.com/user-attachments/assets/54b9143e-e806-4b71-b582-f6c3bc15f5d7" />


---

## Project Structure

- Main.java – entry point (creates graphs and runs experiments)
- Graph.java – graph implementation (BFS, DFS, Dijkstra)
- Edge.java – weighted edge representation
- Vertex.java – vertex representation
- Experiment.java – performance testing

---

## How to Run

1. Clone the repository
2. Open project in IntelliJ IDEA
3. Run `Main.java`

---

## Notes
- Graph uses adjacency list representation
- Dijkstra implemented without priority queue (simplified version)
- Suitable for learning graph algorithms and complexity analysis

Bonus task is fully implemented using weighted edges and Dijkstra’s algorithm.

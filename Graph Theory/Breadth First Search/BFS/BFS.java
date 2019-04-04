/* Based on EspiDev's method.
 Feel free to use this in your own CP solutions.
 By Raymo111.
*/

import java.util.*;

// Breadth-first search to traverse a tree
public class BFS {
  private static int size = 5;
  private static ArrayList<Integer>[] adjList = new ArrayList[size];
  private static boolean[] visited = new boolean[size];

  public static void main(String[] args) {
    for (int i = 0; i < size; i++) {
      adjList[i] = new ArrayList<Integer>();
    }
    // Get input and connect vertices
  }

  private static void bfs(int node) {
    Queue<Integer> q = new LinkedList<Integer>();
    int curNode;
    q.offer(node); // Add node to queue
    while (!q.isEmpty()) {
      curNode = q.poll();
      visited[curNode] = true; // Mark visited
      // Action for node here
      for (int i = 0; i < adjList[curNode].size(); i++) // Add child nodes to queue
      if (!visited[adjList[curNode].get(i)]) { // Check for child node having been visited
          bfs(adjList[curNode].get(i)); // Add child node
        }
    }
  }
}

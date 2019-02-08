/* Based on EspiDev's method.
 Feel free to use this in your own CP solutions.
 By Raymo111.
*/

import java.util.*;

// Depth-first search to traverse a tree
public class DFS {
  private static int size = 5;
  private static ArrayList<Integer>[] adjList = new ArrayList[size];
  private static boolean[] visited = new boolean[size];

  public static void main(String[] args) {
    for (int i = 0; i < size; i++) {
      adjList[i] = new ArrayList<Integer>();
    }
    // TODO: Get input and connect vertices
  }

  private static void dfs(int node) {
    // TODO: Base case (when to stop) here
    visited[node] = true;
    // TODO: Action for node here
    for (int i = 0; i < adjList[node].size(); i++)
      if (!visited[adjList[node].get(i)]) {
        dfs(adjList[node].get(i));
      }
  }
}

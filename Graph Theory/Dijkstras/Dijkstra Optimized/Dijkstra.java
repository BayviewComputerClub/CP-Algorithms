
// Created in honor of Espidev and with his much needed help
import java.util.*;

// Shortest path algorithm
public class Dijkstra {
	static int size = 5, weights[] = new int[size];
	static ArrayList<Node>[] adjList = new ArrayList[size];

	public static void main(String[] args) {
		for (int i = 0; i < size; i++) {
			adjList[i] = new ArrayList<Node>();
			weights[i] = 2147483647;
		}
		// Get input and connect nodes
		dijkstra(0); // Replace 0 with the starting node
		// "And the answer will be weights[dest]" - Espidev
	}

	private static void dijkstra(int nodeID) {
		PriorityQueue<Node> q = new PriorityQueue<Node>();
		Node curNode = new Node(nodeID, 0);
		q.offer(curNode); // Add node to queue
		while (!q.isEmpty()) {
			curNode = q.poll();
			for (Node node : adjList[curNode.nodeID]) // Add child nodes to queue
				if (node.weight + curNode.weight < weights[node.nodeID]) { // Check for child node having smaller weight
					weights[node.nodeID] = node.weight + curNode.weight;
					q.offer(new Node(node.nodeID, weights[node.nodeID])); // Add child node
				}
		}
	}

 	static class Node implements Comparable<Node>{ // needs priority queue, so we need to implement a comparable to be able to sort the values
		int weight, nodeID;

		Node(int weight, int nodeID) {
			this.nodeID = nodeID;
			this.weight = weight;
		}
		public int compareTo(Node o){
			Integer.compare(weight, o.weight);
		}
		
	}
}

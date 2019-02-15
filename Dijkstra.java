
// Created in honor of Espidev and with his much needed help
import java.util.*;

// Shortest path algorithm
public class Dijkstra {
	private static int size = 5, weights[] = new int[size];
	private static ArrayList<Node>[] adjList = new ArrayList[size];
	private static Dijkstra instance = new Dijkstra(); // Required because Java is a stupid language

	public static void main(String[] args) {
		for (int i = 0; i < size; i++) {
			adjList[i] = new ArrayList<Node>();
		}
		// Get input and connect nodes
		dijkstra(0); // Replace 0 with the starting node
		// "And the answer will be weights[dest]" - Espidev
	}

	private static void dijkstra(int nodeID) {
		Queue<Node> q = new LinkedList<Node>();
		Node curNode = instance.new Node(nodeID, 0); // Required because Java is a stupid language
		q.offer(curNode); // Add node to queue
		while (!q.isEmpty()) {
			curNode = q.poll();
			for (Node node : adjList[curNode.nodeID]) // Add child nodes to queue
				if (node.weight + curNode.weight < weights[node.nodeID]) { // Check for child node having smaller weight
					weights[node.nodeID] = node.weight + curNode.weight;
					q.offer(instance.new Node(node.nodeID, weights[node.nodeID])); // Add child node
				}
		}
	}

	private class Node {
		int weight, nodeID;

		Node(int weight, int nodeID) {
			this.nodeID = nodeID;
			this.weight = weight;
		}
	}
}

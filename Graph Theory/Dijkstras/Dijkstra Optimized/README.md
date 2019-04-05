# Dijkstras Optimized

Dijkstras is a algorithm that finds the shortest path between 2 nodes in a weighted graph.

This optimized version of dijkstras can solve the normal dijkstras algorithm in O(N Log N) time, making it significantly faster than the normal one.
But this only works if the graph is not a complete graph, meaning there's less ```N - 1``` edges present, as it will also run in O(N<sup>2</sup>) time and might even run slower than the normal dijkstras.

Please look at the dijkstras under ```Dijkstra Matrix``` for the explanation of the dijkstras algorithm.

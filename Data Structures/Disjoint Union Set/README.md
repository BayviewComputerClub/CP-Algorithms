# Disjoint Union Set

The disjoint union set data structure can be build in about O(n log n) time and can answer queries in about O(1) time.

The queries is to find if any 2 nodes/sets are connected.

The disjoint union sets works by putting every node under a leader node, meaning that all the nodes under the leader are connected.

The disjoint union set contains 2 main methods.

1. ```Find(x)```
  - this method finds the parent/leader of x
  
2. ```Merge(x, y)```
  - connect the 2 nodes together, doesn't matter if the node itself is a leader
  
To make a disjoint union set, we must first make everyone their own leader.

```java
public static void makeSet(int n) {
  for(int i = 0; i <= n; i++)
    parentArray[i] = i;
}
```
Now we will make the ```find``` method

```java
public static int find(int x) {
  if(x != parentArray[x]) // if parentArray[x] is not x's parent
    parentArray[x] = find(parentArray[x]); // path compression
  return parentArray[x];    
}
```
Here we used the path compression, this makes the ```find``` method alot faster, as we don't have to go up the chain to find the leader, as we make every node we go to the leader of the node higher in the chain, making it very easy for us to find ```x```'s leader.


Now we will make the ```merge``` method

```java
public static void merge(int x, int y) {
   int xroot = find(x); // find x's leader
   int yroot = find(y); // find y's leader
   if(xroot == yroot) return; // if they are part of the same set, we don't need to merge them
   
   
   
}
```

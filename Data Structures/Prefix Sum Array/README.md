# Prefix Sum Array

The prefix sum array is a data structure that can answer a query that asks for the sum between ranges ```l``` and ```r``` in O(1) time.

Likewise, there is a suffix sum array as well, but its literally the reverse of the prefix sum array, so theres no need to explain about it.

Element at ```x``` holds the sum of all the elements before it, meaning:

```
array = {1, 2, 3, 4, 5}

psa = {1, 3, 6, 10 ,15}
             ^
             this is the sum of all the elements before it including itself, meaning 1 + 2 + 3 = 6.
             
```

To set up the array, all we have to do is add the sum of the index before it.

```java
// remember, psa always starts at index 1
for(int i = 1; i <= n; i++) {
  psa[i] = sc.nextInt();
  psa[i] += psa[i-1]; // add the sum before it
}
```

To answer queries, we just need to find the difference of the sums at the 2 indexes, namely psa[r] and psa[l-1];

```java
for(int i = 1; i <= q; i++) {
  int l = sc.nextInt(), r = sc.nextInt();
  System.out.println("Sum between ranges " + l + " " + r + " is " + (psa[r] - psa[l-1]))
}
```

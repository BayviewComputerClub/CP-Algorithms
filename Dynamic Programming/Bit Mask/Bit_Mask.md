# Bit Masks

- Bit Masks is a type of compression used on problems that have rather low bounds. It is mostly used with dynamic programming, and are used in problems where it requires to check every single possible combinaton.
- Lets say you have N Kings on a N x N chess board, we can simulate all the possible ways to place all the kings so that they don't touch each other.

## How is it Done
- As the name suggests, we use Bits to keep track of the different combinations. A bit is either 1 or 0, and several of them form a byte, kilobytes, and so on.
- Going back to the problem above, we can say a square would be 1 if a king is placed, and a 0 if its not placed. So if we place the kings like this:

```
-------------
| K | . | K |
-------------
| . | . | . |
-------------
| K | . | . |
-------------
```

- Our board would look like this in bits:

```
-------------
| 1 | 0 | 1 |
-------------
| 0 | 0 | 0 |
-------------
| 1 | 0 | 0 |
-------------
```

- which we can then change each of the rows into a number, so the numbers from top to bottom would be `5, 0, 4`, as the in binary form, the numbers would be `101, 000, 100`.
- So in essence, we have just compressed a grid into N numbers, better than having a N x N grid and checking every single one. Now we can just randomly place 1s on the grid, check the configurations, and create another state, and so on and so on.
- This is a classical example of grid compression using bit mask. 

- The things you need to know is:

- Setting a Bit:
```java
static int setBit(int n, int bit) { return n |(1 << bit); }
```
- Clearing a Bit:
```java
static int clearBit(int n, int bit) { return n & (~(1 << bit)); }
```  
- Checking a Bit:
```java
static boolean getBit(int n, int bit) { return (n & (1 << bit)) == 1;}
```  
- Toggling a Bit:
```java
static int toggleBit(int n, int bit) { return (n ^ (1 << bit));}
```
More information on bitMasks can be found in places such as:
- https://codeforces.com/blog/entry/18169
- https://www.hackerearth.com/practice/algorithms/dynamic-programming/bit-masking/tutorial/
This is a rushed summary, just to get you started on ideas, visit the sites above to learn more.

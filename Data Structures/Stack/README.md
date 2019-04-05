# Stacks

A stack is a first in last out data structure, this means whatever goes in first, comes out last, Eg.


let's push 1, 2, 3, 4, and 5 into the stack
```
|5|
|4|
|3|
|2|
|1|
---
```
lets pop the first element out:

```
    --> 5
|4|
|3|
|2|
|1|
---
```

As you can see, one was the first in, and thus its at the bottom of the stack and will be the last one out.

Lets now discuss some useful methods that the stack has, and of course, you can always search up the java documentations on stack.

```java
Stack<Integer> st = new Stack<Integer>();

st.push(x); // pushes the integer x into the stack

st.add(x); // adds the integer x into the stack

st.pop(); //retrieves and removes the element on the top of the stack.

st.isEmpty(); // returns true if the stack is empty, false otherwise

st.remove(x); // removes the element at index x, or removes the element x (depends on the way you call this method).

st.indexOf(x); // returns the index of the element x, or -1 if not present

st.peek(x); // retrieves the element on the top of the stack without removing it
```

There are plenty of more methods, but these ones are the most commonly used.

# Graphs

- A graph is a non-linear data structure that can be looked at as a collection of vertices (or nodes) potentially connected by line segments named edges.

## Challenge

- For this challenge I implemented a Graph class, which is represented by an adjacency list. It contains a set of Nodes, and Nodes have a value and a list of neighboring Node edges. In this class, there are two edges between Nodes.

## Approach & Efficiency

1. add node : time = O(1) because we didnt use loops, space = O(n) because we declared a new ArrayList.

2. add edge : time = O(1) because we didnt use loops, space = O(1) because we didnt declare any arrays.

3. get nodes : time = O(n) because we use loop , space = O(n) because we declared a HashSet.

4. get neighbors : O(1) for both time and space complexity because there is no loops or arrays.

5. size : O(1) for both time and space complexity.


## API
1. add node : this method is to add a new node to the graph.

2. add edge : this method is to add a new edge between two Nodes in the graph.

3. get nodes : this method returns a HashSet which contains all the Nodes in the graph.

4. get neighbors : this method return a list of all the Nodes that are connected to the Node we pass.

5. size : this method returns the size of the graph HashSet.


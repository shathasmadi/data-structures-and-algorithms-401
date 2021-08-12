# Trees
  A Tree is a non-linear data structure where data objects are generally organized in terms of hierarchical relationship. The structure is non-linear in the sense that, unlike Arrays, Linked Lists, Stack and Queues, data in a tree is not organized linearly. A binary tree is a recursive tree data structure where each node can have 2 children at most.

## Challenge
Binary Tree : Creating a Binary Tree class and inside it Define a method for each of the depth first traversals:

    pre order
    in order
    post order which returns an array of the values, ordered appropriately.

Binary Search Tree Create a Binary Search Tree class, This class should be a sub-class of the Binary Tree Class, with the following additional methods:
Add: takes integer as an Arguments and Return nothing; it should Add a new node with that value in the correct location in the binary search tree.
Contains: takes integer as an Argument and Returns a boolean indicating whether or not the value is in the tree at least once.

## Approach & Efficiency
Time :big O(n)
Space : big O(n)

## API
Binary Tree:
pre order: root --> left --> right
in order: left --> root --> right
post order: left --> right --> root

Binary Search Tree:
Add: takes integer as an Arguments and Return nothing; it should Add a new node with that value in the correct location in the binary search tree.
Contains: takes integer as an Argument and Returns a boolean indicating whether or not the value is in the tree at least once.

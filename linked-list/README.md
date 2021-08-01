# Singly Linked List
Singly linked list is a list contains several nodes, where each node has a value and a reference, and the reference address the next node.

## Challenge
we need to define a node class which has a value and next reference, also we need to define a linked list class with several methods to manupliate the list.

## Approach & Efficiency
insert:Adds a new node with that value to the head of the list .
Time:bigO(1)
space:bigO(1)

toString:using while loop to check all of node and Returns a string representing all the values in the Linked List
Time:bigO(n)
space:bigO(1)

includes:Indicates whether that value exists as a Node’s value somewhere within the list.
Time:bigO(n)
space:bigO(1)

## API
insert : inserts method at the head of a list

includes : checks the list for a value & returns True or False

toString : formats the string and output of a list

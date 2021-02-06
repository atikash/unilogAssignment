# unilogAssignment
Unilog Assignment for first round

Case study 2:

Implement a data structure called doubly linked list with the following node structure. Duplicate data is allowed.

class Node<T> { 
               T data;
               Node<T> previous;
               Node<T> next;
              }

Implement the following operations:

1. Add node first 		 	- Done
  
2. Add node last			- Done

3. Add node at an index		- Done
	
4. Remove first node 		- Done

5. Remove last node			- Done

6. Remove node at an index	-Done

7. Find a node in O (1)		- Done

> NOTE: With Traditional Linked List searching a element in O(1) is not possible that is one of the disadvantages of using LinkedList. to achieve this i used a map to maintain index of every distinct elements present in the list and then by using map function we can get the index of the first occurance of the element in the list.
if not found it prints 'Not Found'. to manage this map we create a new map everytime a some changes are done with list. this is just to demonstrate a way to find index of element in O(1). Using this approach increases the complexity of other operations on the list to O(n). so it is not advisable to use such methods to improve search complexity.
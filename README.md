# Spring-Sample-Code
This contains Spring Sample Code. In the sample Code contains all the related answers for the Interview Questions.


## Data Structure & Algorithms

1. What is a Data Structure?

A data structure is a method of organizing, managing, and storing data in a computer so that it can be accessed and modified efficiently. It is designed to structure relationships between different sets of data in a logical, organized manner, aiming to optimize data retrieval and modification.

2. Differentiate between file structure and storage structure.

The key difference between file structure and storage structure lies in where the data resides. A storage structure refers to data organized in the main memory (RAM) of a system, while a file structure pertains to data stored on auxiliary or secondary storage devices like hard drives, where files are organized for long-term storage.

3. When is binary search best applied?

Binary search is most effective when applied to a sorted list of elements. It works by repeatedly dividing the search interval in half. If the value of the search key is less than the item in the middle, the search continues on the lower half; otherwise, it continues on the upper half. This process repeats until the search key is found or the interval is empty.

4. What is a linked list?

A linked list is a linear data structure where each element (node) contains a reference (link) to the next element in the sequence. This forms a chain-like structure, with each node pointing to its successor, making it easy to dynamically add or remove elements.

5. How do you reference all the elements in a one-dimensional array?

To reference all the elements in a one-dimensional array, you can use a loop, such as a for loop, that iterates from index 0 to array.length - 1. During each iteration, the loop variable serves as the array subscript, allowing you to access each element in sequence.

6. In what areas are data structures applied?

Data structures are fundamental to various fields involving data manipulation. Common applications include numerical analysis, operating systems, artificial intelligence (AI), compiler design, database management systems (DBMS), computer graphics, network packet scheduling, and statistical analysis.

7. What is LIFO?

LIFO stands for Last In, First Out. It describes the principle of data access where the most recently added (last) data item is the first to be retrieved. In this system, all other data must be removed in the reverse order of their addition before accessing earlier items.

8. What is a queue?

A queue is a linear data structure that operates on a First In, First Out (FIFO) principle. Elements are inserted (enqueued) at one end, called the rear, and removed (dequeued) from the other end, called the front.

9. What is a binary tree?

A binary tree is a hierarchical data structure where each node has at most two children, referred to as the left child and the right child. Binary trees are commonly used for efficient searching, sorting, and hierarchical data representation.

10. Which data structure is used when dealing with a recursive function?

Recursive functions typically use the stack data structure. Each recursive call is stored on the call stack, and the function's return address is pushed onto the stack to ensure the program can resume execution correctly after the recursive call completes.

11. What is a stack?

A stack is a linear data structure that follows the Last In, First Out (LIFO) principle. The only accessible element is the one at the top, where data is added (pushed) or removed (popped). Each new element is placed on top of the stack, and only the most recently added item can be accessed.

12. Explain Binary Search Tree

A Binary Search Tree (BST) is a type of binary tree where each node stores a key, and the tree is structured to allow efficient searching, insertion, and deletion of data. In a BST:

- The left subtree contains nodes with keys less than the node's key.
- The right subtree contains nodes with keys greater than or equal to the node's key.
- Both the left and right subtrees must themselves be binary search trees.

This structure ensures that operations like search, insertion, and deletion can be performed in O(log n) time on average, making BSTs highly efficient for sorted data retrieval.

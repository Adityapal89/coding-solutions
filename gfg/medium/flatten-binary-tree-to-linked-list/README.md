# Flatten Binary Tree to Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a binary tree, flatten the tree into a Linked list:

- The linked list should use the same Node class where the right child pointer points to the next node in the list and the left child pointer is always null.
- The linked list nodes should be in the same order as a preorder traversal of the binary tree.

 **Examples:** 

```
Input: root[] = [1, 2, 5, 3, 4, 6]

Output: [1, 2, 3, 4, 5, 6]  
Explanation: After flattening, the tree looks like:
     1
      \
       2
        \
         3
          \
           4
            \ 
             5 
              \
               6
Here, left of each node points to NULL and right contains the next node in preorder.The inorder traversal of this flattened tree is 1 2 3 4 5 6.
```

```
Input: root[] = [1, 3, 4, 2, 5]

Output: [1, 3, 4, 2, 5] 
Explanation: After flattening, the tree looks like:
     1
      \
       3
        \
         4
          \
           2
            \ 
             5 
Here, left of each node points to NULL and right contains the next node in preorder.The inorder traversal of this flattened tree is 1 3 4 2 5.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-24T16:02:00.798Z  

```java
class Solution {
    public static void flatten(Node root) {
        // code here
        ArrayList<Node> arr = new ArrayList<>();
        Node temp = root;
        preorder(temp, arr);
        for(int i=1; i<arr.size(); i++){
            root.left = null;
            root.right = arr.get(i);
            root = root.right;
        }
        root.left = null;
        root.right = null;
        
    }
    
    public static void preorder(Node root, ArrayList<Node> arr){
        if(root == null) return;
        arr.add(root);
        preorder(root.left, arr);
        preorder(root.right, arr);
    }
    
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/flatten-binary-tree-to-linked-list/1)
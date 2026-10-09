# Balanced Tree Check

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the **root** of a binary tree, determine if it is height-balanced or not.

 **Note:**  A binary tree is considered height-balanced if the absolute difference in heights of the left and right subtrees is at most 1 for every node in the tree.

 **Examples:** 

```
Input: root = [10, 20, 30, 40, 60]

Output: true 
Explanation: The height difference between the left and right subtrees at all nodes is at most 1. Hence, the tree is balanced.
```

```
Input: root = [1, 2, 3, 4, N, N, N, 5] 

Output: false
Explanation: The height difference between the left and right subtrees at node 2 is 2, which exceeds 1. Hence, the tree is not balanced.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-09T19:47:39.124Z  

```java
class Solution {
    public boolean isBalanced(Node root) {
        // code here
        if(root == null) return true;
        int leftLevel = levels(root.left);
        int rightLevel = levels(root.right);
        if(Math.abs(leftLevel - rightLevel) > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
    
    public int levels(Node root){
        if(root == null) return 0;
        return 1+Math.max(levels(root.left), levels(root.right));
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/check-for-balanced-tree/1)
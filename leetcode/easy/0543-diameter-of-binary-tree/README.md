# Diameter of Binary Tree

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the `root` of a binary tree, return  *the length of the  **diameter**  of the tree*.

The  **diameter**  of a binary tree is the  **length**  of the longest path between any two nodes in a tree. This path may or may not pass through the `root`.

The  **length**  of a path between two nodes is represented by the number of edges between them.

 

 **Example 1:** 

```
Input: root = [1,2,3,4,5]
Output: 3
Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].

```

 **Example 2:** 

```
Input: root = [1,2]
Output: 1

```

 

 **Constraints:** 

- The number of nodes in the tree is in the range [1, 104].
- -100 <= Node.val <= 100

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 43.75%)  
**Memory:** 46.5 MB (beats 97.44%)  
**Submitted:** 2026-10-11T17:01:08.101Z  

```java
class Solution {
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        levels(root);
        return diameter;
    }
    private int levels(TreeNode node) {
        if (node == null) return 0;
        int left = levels(node.left);
        int right = levels(node.right);
        diameter = Math.max(diameter, left + right);
        return 1 + Math.max(left, right);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/diameter-of-binary-tree/)
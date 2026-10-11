# Binary Tree Right Side View

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the `root` of a binary tree, imagine yourself standing on the  **right side**  of it, return  *the values of the nodes you can see ordered from top to bottom*.

 

 **Example 1:** 

 **Input:**  root = [1,2,3,null,5,null,4]

 **Output:**  [1,3,4]

 **Explanation:** 

 **Example 2:** 

 **Input:**  root = [1,2,3,4,null,null,null,5]

 **Output:**  [1,3,4,5]

 **Explanation:** 

 **Example 3:** 

 **Input:**  root = [1,null,3]

 **Output:**  [1,3]

 **Example 4:** 

 **Input:**  root = []

 **Output:**  []

 

 **Constraints:** 

- The number of nodes in the tree is in the range [0, 100].
- -100 <= Node.val <= 100

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43.8 MB (beats 15.18%)  
**Submitted:** 2026-10-11T17:39:48.486Z  

```java
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        order(root, arr, 0);
        return arr;
    }

    public void order(TreeNode root, List<Integer> arr, int level){
        if(root == null) return;
        if(level == arr.size()) arr.add(root.val);
        order(root.right, arr, level + 1);
        order(root.left, arr, level + 1);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/binary-tree-right-side-view/)
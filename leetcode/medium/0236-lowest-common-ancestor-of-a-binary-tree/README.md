# Lowest Common Ancestor of a Binary Tree

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes `p` and `q` as the lowest node in `T` that has both `p` and `q` as descendants (where we allow  **a node to be a descendant of itself**).”

 

 **Example 1:** 

```
Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
Output: 3
Explanation: The LCA of nodes 5 and 1 is 3.

```

 **Example 2:** 

```
Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
Output: 5
Explanation: The LCA of nodes 5 and 4 is 5, since a node can be a descendant of itself according to the LCA definition.

```

 **Example 3:** 

```
Input: root = [1,2], p = 1, q = 2
Output: 1

```

 

 **Constraints:** 

- The number of nodes in the tree is in the range [2, 105].
- -109 <= Node.val <= 109
- All Node.val are unique.
- p != q
- p and q will exist in the tree.

## Solution

**Language:** Java  
**Runtime:** 18 ms (beats 15.59%)  
**Memory:** 70.3 MB (beats 5.78%)  
**Submitted:** 2026-10-17T16:28:10.057Z  

```java

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        if(root.val == p.val || root.val == q.val) return root;
        TreeNode l = lowestCommonAncestor(root.left, p, q);
        TreeNode r = lowestCommonAncestor(root.right, p, q);
        if(l != null && r != null) return root;
        return (l == null) ? r:l;
    }

    // public boolean exists(TreeNode root, int val) {
    //     if (root == null) return false;
    //     if (root.val == val) return true;
    //     return exists(root.left, val) ||exists(root.right, val);
    // }

    // public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    //     if (root == null) return null;
    //     if (root.val == p.val || root.val == q.val) {
    //         return root;
    //     }
    //     boolean leftP = exists(root.left, p.val);
    //     boolean leftQ = exists(root.left, q.val);
    //     if (leftP && leftQ) {
    //         return lowestCommonAncestor(root.left, p, q);
    //     } else if (!leftP && !leftQ) {
    //         return lowestCommonAncestor(root.right, p, q);
    //     } else {
    //         return root;
    //     }
    // }
}

```

---

[View on LeetCode](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/)
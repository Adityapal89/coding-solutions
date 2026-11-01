# Tree Boundary Traversal

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a root of a Binary Tree, return its boundary traversal in the following order:

- Left Boundary: Nodes from the root to the leftmost non-leaf node, preferring the left child over the right and excluding leaves.
- Leaf Nodes: All leaf nodes from left to right, covering every leaf in the tree.
- Reverse Right Boundary: Nodes from the root to the rightmost non-leaf node, preferring the right child over the left, excluding leaves, and added in reverse order.

 **Note:**  The root is included once, leaves are added separately to avoid repetition, and the right boundary follows traversal preference not the path from the rightmost leaf.

 **Examples:** 

```
Input: root = [1, 2, 3, 4, 5, 6, 7, N, N, 8, 9, N, N, N, N]
Output: [1, 2, 4, 8, 9, 6, 7, 3]
Explanation:

```

```
Input: root = [1, N, 2, N, 3, N, 4, N, N] 
Output: [1, 4, 3, 2]
Explanation:

Left boundary: [1] (as there is no left subtree)
Leaf nodes: [4]
Right boundary: [3, 2] (in reverse order)
Final traversal: [1, 4, 3, 2]
```

 **Constraints:** 
1 ≤ number of nodes ≤ 105
1 ≤ node->data ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-01T04:02:59.319Z  

```java
class Solution {
    public ArrayList<Integer> boundaryTraversal(Node root) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(root.data);
        if(root.left == null && root.right == null) return arr;
        leftboundary(root.left, arr);
        leafnode(root, arr);
        rightboundary(root.right, arr);
        return arr;
    }
    
    public void leftboundary(Node root, ArrayList<Integer> arr){
        if(root == null) return;
        if(root.left == null && root.right == null) return;
        arr.add(root.data);
        if(root.left != null) leftboundary(root.left, arr);
        else leftboundary(root.right, arr);
    }
    
    public void leafnode(Node root, ArrayList<Integer> arr){
        if(root == null) return;
        if(root.left == null && root.right == null) arr.add(root.data);
        leafnode(root.left, arr);
        leafnode(root.right, arr);
    }
    
    public void rightboundary(Node root, ArrayList<Integer> arr){
        if(root == null) return;
        if(root.left == null && root.right == null) return;
        if(root.right != null) rightboundary(root.right, arr);
        else rightboundary(root.left, arr);
        arr.add(root.data);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/boundary-traversal-of-binary-tree/1)
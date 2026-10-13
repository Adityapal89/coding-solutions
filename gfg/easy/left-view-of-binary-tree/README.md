# Left View of Binary Tree

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the  **root** of a binary tree. Return the left view of the binary tree. The left view of a binary tree is the set of nodes visible when the tree is viewed from the left side.

 **Note:**  If the tree is empty, return an empty list.

 **Examples :** 

```
Input: root = [1, 2, 3, 4, 5, N, N] 
 
Output:[1, 2, 4]
Explanation: From the left side of the tree, only the nodes 1, 2, and 4 are visible.

```

```
Input: root = [1, 2, 3, N, N, 4, N, N, 5, N, N]

Output: [1, 2, 4, 5]
Explanation: From the left side of the tree, only the nodes 1, 2, 4, and 5 are visible.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-13T17:12:13.059Z  

```java
/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = this.right = null;
    }
}*/

class Solution {
    public ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer> arr = new ArrayList<Integer>();
        order(root, arr, 0);
        return arr;
    }
    
    public void order(Node root, ArrayList<Integer> arr, int levels){
        if(root == null) return;
        if(levels == arr.size()){
            arr.add(root.data);
        }
        
        order(root.left, arr, levels+1);
        order(root.right, arr, levels+1);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1)
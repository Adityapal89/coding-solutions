# Max and Min in Binary Tree

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the root of a Binary Tree, find the maximum and minimum element present in the tree.

 **Examples:** 

```
Input: root[] = [2, 7, 5, N, 6, N, 9, 1, 11, 4]
 
Output: 11 1
Explanation: The maximum and minimum element in this binary tree is 11 and 1 respectively.
```

```
Input: root[] = [6, 5, 8, 2]

Output: 8 2
Explanation: The maximum and minimum element in this binary tree is 8 and 2 respectively.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-29T19:50:36.738Z  

```java
/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}*/

class Solution {
    public static int findMax(Node root) {
        // code here
        // ArrayList<Integer> arr = new ArrayList<>();
        // int max = Integer.MIN_VALUE;
        // preOrder(root,arr);
        // for(int i=0; i<arr.size(); i++){
        //     if(arr.get(i) > max){
        //         max = arr.get(i);
        //     }
        // }
        // return max;
        Node temp = root;
        if(temp == null) return Integer.MIN_VALUE;
        return Math.max(temp.data, Math.max(findMax(temp.left), findMax(temp.right)));
        
    }

    public static int findMin(Node root) {
        // code here
        // ArrayList<Integer> arr = new ArrayList<>();
        // int min = Integer.MAX_VALUE;
        // preOrder(root,arr);
        // for(int i=0; i<arr.size(); i++){
        //     if(arr.get(i) < min){
        //         min = arr.get(i);
        //     }
        // }
        // return min;
        if(root == null) return Integer.MAX_VALUE;
        return Math.min(root.data, Math.min(findMin(root.left), findMin(root.right)));
    }
    public static void preOrder(Node root, ArrayList<Integer> arr){
        if(root == null) return;
        arr.add(root.data);
        preOrder(root.left,arr);
        preOrder(root.right,arr);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/max-and-min-element-in-binary-tree/1)
# Identical Trees

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two binary trees with their root nodes  **r1**  and  **r2**, return true if both of them are  **identical**, otherwise return false.
 **Note:** Two trees are identical when they have the same data and the arrangement of the data is also same.

 **Examples:** 

```
Input: r1 = [1, 2, 3, 4], r2 = [1, 2, 3, 4]

Output: true
Explanation: Trees are identical.
```

```
Input: r1 = [1, 2, 3, 4], r2 = [1, 2, 3, N, N, 4]
 
Output: false
Explanation: Trees are not identical.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-04T19:12:26.354Z  

```java
/*
class Node{
    int data;
    Node left, right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    public boolean isIdentical(Node r1, Node r2) {
        // code here
        // ArrayList<Integer> arr1 = new ArrayList<>();
        // ArrayList<Integer> arr2 = new ArrayList<>();
        // preorder1(r1,arr1);
        // preorder2(r2,arr2);
        // if(arr1.equals(arr2)) return true;
        // return false;
        
        if(r1 == null && r2 == null) return true;
        if(r1 == null || r2 == null) return false;
        if(r1.data != r2.data) return false;
        return isIdentical(r1.left, r2.left) && isIdentical(r1.right, r2.right);
    
    }
    
    public void preorder1(Node r1, ArrayList<Integer> arr1){
        if(r1 == null) return;
        arr1.add(r1.data);
        preorder1(r1.left, arr1);
        preorder1(r1.right, arr1);
    }
    
    public void preorder2(Node r2, ArrayList<Integer> arr2){
        if(r2 == null) return;
        arr2.add(r2.data);
        preorder2(r2.left, arr2);
        preorder2(r2.right, arr2);
    }
    
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/determine-if-two-trees-are-identical/1)
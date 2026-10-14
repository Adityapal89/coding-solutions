# Fizz Buzz

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer `n`, return  *a string array* `answer` *(**1-indexed**) where* :

- answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
- answer[i] == "Fizz" if i is divisible by 3.
- answer[i] == "Buzz" if i is divisible by 5.
- answer[i] == i (as a string) if none of the above conditions are true.

 

 **Example 1:** 

```
Input: n = 3
Output: ["1","2","Fizz"]

```

 **Example 2:** 

```
Input: n = 5
Output: ["1","2","Fizz","4","Buzz"]

```

 **Example 3:** 

```
Input: n = 15
Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]

```

 

 **Constraints:** 

- 1 <= n <= 104

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 13.19%)  
**Memory:** 46.4 MB (beats 97.42%)  
**Submitted:** 2026-10-14T15:44:38.454Z  

```java
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(i%3 == 0 && i%5 == 0){
                list.add("FizzBuzz");
            }else if(i%3 == 0){
                list.add("Fizz");
            }else if(i%5 == 0){
                list.add("Buzz");
            }else{
                String val = String.valueOf(i);
                list.add(val);
            }
        }
        return list;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/fizz-buzz/)
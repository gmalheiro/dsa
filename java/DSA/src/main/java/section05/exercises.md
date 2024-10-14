# Exercises Statements


## Two Sum

### Problem Statement:

Given an array of integers `nums` and an integer `target`, return **indices** of the two numbers such that they add up to `target`.

You may assume that each input would have **exactly one solution**, and you **may not use the same element twice**.

You can return the answer in any order.

---

### Example 1:

**Input**:
- `nums = [2, 7, 11, 15]`
- `target = 9`


**Output**:
- `[0, 1]`


---

### Constraints:

- `2 <= nums.length <= 10^4`
- `-10^9 <= nums[i] <= 10^9`
- `-10^9 <= target <= 10^9`
- **Only one valid answer exists.**

---

### Follow-up:

Can you come up with an algorithm that is less than `O(n^2)` time complexity?

---

## Exercise 2
## Check Common Items in Two Arrays
### Problem Statement:

Given **two arrays**, create a function that lets a user know (returns `true` or `false`) whether these two arrays contain **any common items**.

---

### Example 1:

**Input**:
- `const array1 = ["a", "b", "c", "x"];`
- `const array2 =  ["z", "y", "i"];`

**Output**:
- `false`

**Explanation**:
There are no common items between `array1` and `array2`, so the function returns `false`.

---

### Example 2:

**Input**:
- `const array1 = ["a", "b", "c", "x"];`
- `const array2 = ["z", "y", "x"];`


**Output**:
- `true`


**Explanation**:
The two arrays have a common item, `"x"`, so the function returns `true`.

---

### Follow-up:

Can you optimize the solution to have a time complexity better than `O(n * m)` where `n` and `m` are the lengths of the two arrays, respectively?
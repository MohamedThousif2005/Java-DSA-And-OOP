<div align="center">

# 🔍 Check if Array Is Sorted and Rotated

[![LeetCode](https://img.shields.io/badge/LeetCode-1752-orange?style=for-the-badge&logo=leetcode&logoColor=white)](https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen?style=for-the-badge)
![Topics](https://img.shields.io/badge/Topics-Array-blue?style=for-the-badge)
![Acceptance](https://img.shields.io/badge/Acceptance-~58%25-yellow?style=for-the-badge)

🔗 [View on LeetCode](https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/)

</div>

---

## 📋 Problem Statement

Given an array `nums`, return `true` if the array was originally sorted in **non-decreasing order**, then rotated **some number of positions** (including zero). Otherwise, return `false`.

There may be **duplicate** elements in the original array.

**Note:** An array `A` rotated by `x` positions results in an array `B` such that:

- `A[i] == B[(i + x) % A.length]`, where `%` is the modulo operation.

---

## 🧪 Examples

### Example 1

```text
Input:  nums = [3,4,5,1,2]
Output: true

Explanation:
[1,2,3,4,5] is the original sorted array.
It can be rotated 3 positions to become [3,4,5,1,2].
```

### Example 2

```text
Input:  nums = [2,1,3,4]
Output: false

Explanation:
There is no sorted array that can be rotated to make nums.
```

### Example 3

```text
Input:  nums = [1,2,3]
Output: true

Explanation:
[1,2,3] is already sorted, so zero rotations are allowed.
```

---

## ⚙️ Constraints

| Constraint | Value |
|---|---|
| Array Length | `1 <= nums.length <= 100` |
| Element Range | `1 <= nums[i] <= 100` |

---

## 🏷️ Tags

`Array` &nbsp;&nbsp; `Easy`

---

<div align="center">

**[⬅️ Back to Problems](../README.md)**
<br/>

*Happy Coding! 🚀*

</div>

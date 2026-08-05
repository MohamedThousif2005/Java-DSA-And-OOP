<div align="center">

# 🔍 Product of Array Except Self

[![LeetCode](https://img.shields.io/badge/LeetCode-0238-orange?style=for-the-badge&logo=leetcode&logoColor=white)](https://leetcode.com/problems/product-of-array-except-self/)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-orange?style=for-the-badge)
![Topics](https://img.shields.io/badge/Topics-Array%20%7C%20Prefix%20Sum-blue?style=for-the-badge)
![Acceptance](https://img.shields.io/badge/Acceptance-~68%25-yellow?style=for-the-badge)

🔗 [View on LeetCode](https://leetcode.com/problems/product-of-array-except-self/)

</div>

---

## 📋 Problem Statement

Given an integer array `nums`, return an array `answer` such that:

- `answer[i]` is equal to the **product of all the elements** of `nums` **except** `nums[i]`.

The product of any prefix or suffix of `nums` is guaranteed to fit in a **32-bit integer**.

You must write an algorithm that runs in **O(n)** time and **without using the division operation**.

---

## 🧪 Examples

### Example 1

```text
Input:  nums = [1,2,3,4]
Output: [24,12,8,6]

Explanation:
answer[0] = 2 × 3 × 4 = 24
answer[1] = 1 × 3 × 4 = 12
answer[2] = 1 × 2 × 4 = 8
answer[3] = 1 × 2 × 3 = 6
```

### Example 2

```text
Input:  nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
```

---

## ⚙️ Constraints

| Constraint | Value |
|---|---|
| Array Length | `2 <= nums.length <= 10⁵` |
| Element Range | `-30 <= nums[i] <= 30` |
| Product Guarantee | Product of any prefix or suffix fits in a 32-bit integer |

---

## 🏷️ Tags

`Array` &nbsp;&nbsp; `Prefix Sum` &nbsp;&nbsp; `Medium`

---

<div align="center">

**[⬅️ Back to Problems](../README.md)**
<br/>

*Happy Coding! 🚀*

</div>

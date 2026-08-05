<div align="center">

# 🔍 Count Number of Distinct Integers After Reverse Operations

[![LeetCode](https://img.shields.io/badge/LeetCode-2442-orange?style=for-the-badge&logo=leetcode&logoColor=white)](https://leetcode.com/problems/count-number-of-distinct-integers-after-reverse-operations/)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-orange?style=for-the-badge)
![Topics](https://img.shields.io/badge/Topics-Array%20%7C%20Hash%20Table%20%7C%20Math-blue?style=for-the-badge)
![Acceptance](https://img.shields.io/badge/Acceptance-~78%25-yellow?style=for-the-badge)

🔗 [View on LeetCode](https://leetcode.com/problems/count-number-of-distinct-integers-after-reverse-operations/)

</div>

---

## 📋 Problem Statement

You are given an integer array `nums`.

For every integer in `nums`:

- Keep the original integer.
- Add its **digit-reversed** value to the array.

Return the **number of distinct integers** present after performing this operation on every element.

**Note:** Reversing an integer removes leading zeros.

---

## 🧪 Examples

### Example 1

```text
Input:  nums = [1,13,10,12,31]
Output: 6

Explanation:
After adding the reversed numbers:
[1,13,10,12,31,1,31,1,21,13]

The distinct integers are:
{1,10,12,13,21,31}

Hence, the answer is 6.
```

### Example 2

```text
Input:  nums = [2,2,2]
Output: 1

Explanation:
The reversed value of 2 is 2.

The array remains:
[2,2,2,2,2,2]

Only one distinct integer exists.
```

---

## ⚙️ Constraints

| Constraint | Value |
|---|---|
| Array Length | `1 <= nums.length <= 10⁵` |
| Element Range | `1 <= nums[i] <= 10⁶` |

---

## 🏷️ Tags

`Array` &nbsp;&nbsp; `Hash Table` &nbsp;&nbsp; `Math` &nbsp;&nbsp; `Medium`

---

<div align="center">

**[⬅️ Back to Problems](../README.md)**
<br/>

*Happy Coding! 🚀*

</div>

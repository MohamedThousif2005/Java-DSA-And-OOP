<div align="center">

# 🔍 Minimum Recolors to Get K Consecutive Black Blocks

[![LeetCode](https://img.shields.io/badge/LeetCode-2379-orange?style=for-the-badge&logo=leetcode&logoColor=white)](https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen?style=for-the-badge)
![Topics](https://img.shields.io/badge/Topics-String%20%7C%20Sliding%20Window-blue?style=for-the-badge)
![Acceptance](https://img.shields.io/badge/Acceptance-~69%25-yellow?style=for-the-badge)

🔗 [View on LeetCode](https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/)

</div>

---

## 📋 Problem Statement

You are given a **0-indexed** string `blocks` of length `n`, where:

- `'W'` represents a **white** block.
- `'B'` represents a **black** block.

You are also given an integer `k`.

In **one operation**, you can recolor a **white** block such that it becomes a **black** block.

Return the **minimum number of operations** needed so that there is **at least one occurrence** of `k` consecutive black blocks.

---

## 🧪 Examples

### Example 1

```text
Input:  blocks = "WBBWWBBWBW", k = 7
Output: 3

Explanation:
One way is to recolor the 0th, 3rd, and 4th blocks.
The string becomes "BBBBBBBWBW".
Now there is a substring of 7 consecutive black blocks.
```

### Example 2

```text
Input:  blocks = "WBWBBBW", k = 2
Output: 0

Explanation:
The substring "BB" already exists.
No recoloring is needed.
```

---

## ⚙️ Constraints

| Constraint | Value |
|---|---|
| String Length | `1 <= blocks.length <= 100` |
| Characters | `blocks[i]` is either `'W'` or `'B'` |
| Window Size | `1 <= k <= blocks.length` |

---

## 🏷️ Tags

`String` &nbsp;&nbsp; `Sliding Window` &nbsp;&nbsp; `Easy`

---

<div align="center">

**[⬅️ Back to Problems](../README.md)**
<br/>

*Happy Coding! 🚀*

</div>

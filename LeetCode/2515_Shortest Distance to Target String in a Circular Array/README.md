<div align="center">

# 🔍 Shortest Distance to Target String in a Circular Array

[![LeetCode](https://img.shields.io/badge/LeetCode-2515-orange?style=for-the-badge&logo=leetcode&logoColor=white)](https://leetcode.com/problems/shortest-distance-to-target-string-in-a-circular-array/)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen?style=for-the-badge)
![Topics](https://img.shields.io/badge/Topics-Array%20%7C%20String%20%7C%20Simulation-blue?style=for-the-badge)
![Acceptance](https://img.shields.io/badge/Acceptance-~59%25-yellow?style=for-the-badge)

🔗 [View on LeetCode](https://leetcode.com/problems/shortest-distance-to-target-string-in-a-circular-array/)

</div>

---

## 📋 Problem Statement

You are given a **0-indexed circular array** `words` and a string `target`.

A circular array means that the array wraps around:
- Moving forward from the last element goes to the first.
- Moving backward from the first element goes to the last.

You are also given an integer `startIndex`.

Return the **shortest distance** needed to reach any occurrence of `target` starting from `startIndex`.

If `target` does not exist in `words`, return `-1`.

---

## 🧪 Examples

### Example 1

```text
Input:  words = ["hello","i","am","leetcode","hello"],
        target = "hello",
        startIndex = 1

Output: 1

Explanation:
The nearest "hello" is at index 0.
The circular distance from index 1 to index 0 is 1.
```

### Example 2

```text
Input:  words = ["a","b","leetcode"],
        target = "leetcode",
        startIndex = 0

Output: 1
```

### Example 3

```text
Input:  words = ["i","eat","leetcode"],
        target = "ate",
        startIndex = 0

Output: -1
```

---

## ⚙️ Constraints

| Constraint | Value |
|---|---|
| Array Length | `1 <= words.length <= 100` |
| Word Length | `1 <= words[i].length <= 100` |
| Target Length | `1 <= target.length <= 100` |
| Characters | `words[i]` and `target` consist of lowercase English letters |
| Start Index | `0 <= startIndex < words.length` |

---

## 🏷️ Tags

`Array` &nbsp;&nbsp; `String` &nbsp;&nbsp; `Simulation` &nbsp;&nbsp; `Easy`

---

<div align="center">

**[⬅️ Back to Problems](../README.md)**
<br/>

*Happy Coding! 🚀*

</div>

<div align="center">

# 🔍 Binary Watch

[![LeetCode](https://img.shields.io/badge/LeetCode-0401-orange?style=for-the-badge&logo=leetcode&logoColor=white)](https://leetcode.com/problems/binary-watch/)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen?style=for-the-badge)
![Topics](https://img.shields.io/badge/Topics-Backtracking%20%7C%20Bit%20Manipulation%20%7C%20Enumeration-blue?style=for-the-badge)
![Acceptance](https://img.shields.io/badge/Acceptance-~53%25-yellow?style=for-the-badge)

🔗 [View on LeetCode](https://leetcode.com/problems/binary-watch/)

</div>

---

## 📋 Problem Statement

A **binary watch** has:

- **4 LEDs** to represent the **hours** (`0` to `11`).
- **6 LEDs** to represent the **minutes** (`0` to `59`).

Each LED represents a value:

- Hours: `8`, `4`, `2`, `1`
- Minutes: `32`, `16`, `8`, `4`, `2`, `1`

Given an integer `turnedOn`, return **all possible times** the watch could represent with exactly `turnedOn` LEDs turned on.

You may return the answer in **any order**.

---

## 🧪 Examples

### Example 1

```text
Input:  turnedOn = 1
Output: ["0:01","0:02","0:04","0:08","0:16","0:32",
         "1:00","2:00","4:00","8:00"]
```

### Example 2

```text
Input:  turnedOn = 9
Output: []
```

---

## ⚙️ Constraints

| Constraint | Value |
|---|---|
| LEDs Turned On | `0 <= turnedOn <= 10` |

---

## 🏷️ Tags

`Backtracking` &nbsp;&nbsp; `Bit Manipulation` &nbsp;&nbsp; `Enumeration` &nbsp;&nbsp; `Easy`

---

<div align="center">

**[⬅️ Back to Problems](../README.md)**
<br/>

*Happy Coding! 🚀*

</div>

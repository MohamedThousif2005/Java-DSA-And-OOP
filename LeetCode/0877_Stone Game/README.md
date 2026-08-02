<div align="center">

# 🔍 Stone Game

[![LeetCode](https://img.shields.io/badge/LeetCode-0877-orange?style=for-the-badge&logo=leetcode&logoColor=white)](https://leetcode.com/problems/stone-game/)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-orange?style=for-the-badge)
![Topics](https://img.shields.io/badge/Topics-Array%20%7C%20Math%20%7C%20Dynamic%20Programming%20%7C%20Game%20Theory-blue?style=for-the-badge)
![Acceptance](https://img.shields.io/badge/Acceptance-~69%25-yellow?style=for-the-badge)

🔗 [View on LeetCode](https://leetcode.com/problems/stone-game/)

</div>

---

## 📋 Problem Statement

Alice and Bob play a game with an **even** number of piles of stones arranged in a row.

- Alice and Bob take turns, with **Alice starting first**.
- On each turn, a player takes the **entire pile** of stones from either the **beginning** or the **end** of the row.
- The game continues until there are **no more piles**.

The player with the **most stones** wins.

Assuming both players play **optimally**, return **`true`** if Alice wins the game, or **`false`** otherwise.

---

## 🧪 Examples

### Example 1

```text
Input:  piles = [5,3,4,5]
Output: true

Explanation:
Alice starts first and can take the first 5 or the last 5.
Suppose she takes the first 5, leaving [3,4,5].
Bob then takes 5, leaving [3,4].
Alice takes 4, and Bob takes 3.
Alice ends with 9 stones, and Bob ends with 8.
So, Alice wins.
```

### Example 2

```text
Input:  piles = [3,7,2,3]
Output: true
```

---

## ⚙️ Constraints

| Constraint | Value |
|---|---|
| Number of Piles | `2 <= piles.length <= 500` |
| Length | `piles.length` is even |
| Stones per Pile | `1 <= piles[i] <= 500` |
| Total Stones | `sum(piles)` is odd |

---

## 🏷️ Tags

`Array` &nbsp;&nbsp; `Math` &nbsp;&nbsp; `Dynamic Programming` &nbsp;&nbsp; `Game Theory` &nbsp;&nbsp; `Medium`

---

<div align="center">

**[⬅️ Back to Problems](../README.md)**
<br/>

*Happy Coding! 🚀*

</div>

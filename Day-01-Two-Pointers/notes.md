# Two Pointers

## Problem 1: Two Sum II

## Idea:

Use two pointers (left and right) and move based on sum.

## Complexity:

Time: O(n)  
Space: O(1)

## Learnings:

- Works only on sorted arrays
- Move left → increase sum
- Move right → decrease sum
- Remember 1-based indexing

---

## Problem 2: Remove Duplicates from Sorted Array

### Idea:

Use two pointers:

- cm (scan pointer)
- officer (write pointer)

### Logic:

- If new element found → write it at officer position
- Move officer forward

### Complexity:

Time: O(n)  
Space: O(1)

### Key Insight:

We overwrite duplicates in-place.



## Problem 3: Skipping Duplicates

Used in:
- Two Sum (Unique Pairs)
- 3Sum
- 4Sum

After finding a valid pair:

```java
left++;
right--;

while (left < right && nums[left] == nums[left - 1]) {
    left++;
}

while (left < right && nums[right] == nums[right + 1]) {
    right--;
}
```

### Why `left - 1`?

After `left++`, compare the current element with the one just used.

Example:

```
nums = [1,2,2,2,3]

left -> 2
```

```
nums[left] == nums[left - 1]
2 == 2
```

Since they're equal, move `left` again.

### Why `right + 1`?

After `right--`, compare the current element with the one just used.

### Why `left < right`?

Without this check, pointers may cross and cause an `ArrayIndexOutOfBoundsException`.

This pattern ensures every unique pair/triplet is considered exactly once.








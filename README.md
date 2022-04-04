## Greedy Coin Making

In this short lab, you will implement a greedy algorithm that finds the optimal way of reaching a given `target` amount provided a set of coin `denominations`. The setup for the code and some test cases are provided with the starter kit. 

Recall that the general ingredients for a greedy algorithm consist of the following:
* a set *C* of candidates
* a collection *S* of selected items
* a **solution check**: does the set S provide a solution to the problem (ignoring questions of optimality)?
* a **feasibility check**: can the set S be extended to a solution to the problem?
* a **select** function which evaluates the items in *C*
* an **objective function**

Putting these pieces together, the template for a greedy algorithm is following:

```
Greedy(C : Set)
  S := []
  while not Solution(S) and C nonempty do {
    x := element of C that maximizes Select(S)
    C := C - [x]
    if Feasible(S + [x]) then S += [x]
  }
  if Solution(S) then return S else return "no sol"
```

Adapting this general template to the current problem, *C* will be the infinite collection of coins. The feasibility check will be whether or not adding a coin the growing (solution) collection *S* keeps the sum of the elements already in S below the provided `target` amount. With this in mind, here's the pseudocode:

```java
public static List<Integer> minCoins(Set<Integer> denominations, 
                             int target) {
     List<Integer> result = new ArrayList<>();
     while the sum of the result is not equal to target and 
            denominations is nonempty {
        x = max of denominations 
        remove x from the denominations set
        if (sum of result + x is <= target) then add x to result
     }
     
     if the sum of result equals the target, then return result 
     else NO_SOLUTION
}

```

Write a solution to this problem in Java and test your solution against the provided test cases. Your solution should pass the provided test cases.

### Handin

When you are ready to submit, commit your work by typing:

> git commit -am "msg"

then follow this up with a

> git push origin main

See the corresponding assignment page on canvas for details on points and grading.

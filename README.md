# StackMin
Exercise related with Stacks and Queues.

## Exercise Challenge
How would you design a stack which, in addition to push and pop, has a function min which returns the minimum element? Push, pop and min should all operate in O(1) time.

### Solution
I have used another stack in order to push the mins every time it changes. 
Doing it that way, I keep track of what the mins have been. So any time I push or pop a number I check if I have to update the mins stack.

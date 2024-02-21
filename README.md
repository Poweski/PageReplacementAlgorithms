# PageReplacementAlgorithms

### Study of page replacement algorithms.

I. Generate a random sequence of n page references

II. For the generated string, enter the number of page misses for various page replacement algorithms:
1. FIFO (we delete the page that has been in physical memory the longest)
2. OPT (optimal - we remove the page that will not be used for the longest time)
3. LRU (we remove the page that has not been referenced for the longest time)
4. approximated LRU (Last Recently Used)
5. RAND (we remove a randomly selected page)
   
### Tips:
- Carry out simulations (necessarily on the same test sequence) for a different number of frames, e.g. several (3, 5, 10)
user-supplied values. Ability to control simulation parameters required.
- You should formulate the simulation assumptions yourself: size of virtual memory (number of pages), size of physical memory
(number of frames), length (should be significant - at least 1000) and the method of generating a sequence of references to pages (necessarily
take into account the principle of local appeal).

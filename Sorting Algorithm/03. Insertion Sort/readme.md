# Insertion Sort
```
	for lastsortedindex = 0 to array.length-2:
		j = array [lastsortedindex+1]
		i = lastsortedindex
		while(i>=0 and a[i]>j):
			a[i+1] = a[i]
			i--;
		a[i+1] = j
```
- In-place algorithm
- O(n^2) time complexity
- Stable algorithm
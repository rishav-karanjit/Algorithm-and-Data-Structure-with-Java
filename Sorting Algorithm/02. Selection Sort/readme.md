# Selection Sort

```
	Input: Array a[] 
	Output: Sorted array a[]

	for lastunsortedindex = a.length-1 to 1
		max = 0
		for i = 1 to lastunsortedindex
			if (a[i]>a[max])
				max = i		
		swap(a[max],a[lastunsortedindex])
	return a
```

- Time Complexity: O(n^2)
- Less number of swap than bubble sort but still not best


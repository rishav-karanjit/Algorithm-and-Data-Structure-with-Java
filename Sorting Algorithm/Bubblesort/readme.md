# BubbleSort

```
	Input: Array a[] 
	Output: Sorted array a[]

	for lastunsortedindex = a.length-1 to 1
		for i = 0 to a.length-1
			j = i+1
			if (a[i]>a[j])
				swap(a[i],a[j])
	return a
```

- Time Complexity: O(n^2)
- The algorithm degrades quickly with increase in size


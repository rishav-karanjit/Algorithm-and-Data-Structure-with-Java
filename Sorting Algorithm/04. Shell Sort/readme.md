# Shell Sort

```
	for(gap = array.length / 2;gap>=1;gap/=2)
		for(i=gap;i<array.length;i++)
			newelement = array[i];
			j = i
			while(j>=gap && a[j-gap]>a[j])
				a[j] = a[j-gap]
				j = j - gap
			a[j] = newelement
```
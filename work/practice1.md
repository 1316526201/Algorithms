# 课程习题

## 2.1-2 

Insert-sort(A)
1 	for j <- 2 to length[A]
2 	do key <- A[j]
	►A[j]插入到已排好序的子数组A[1..j-1]中
3 	i <- j-1
4 	while i>0 and A[i]<key
5 	do A[i+1] <- A[i]
6 	i <- i-1
7 	A[i+1] <-- key 

## 2.1-3

line-search

1	for i <-- 1 to length[A]

2	if A[i]=v

3		return i

4	return NIL

## 2.2-1

$$
\Theta(n^3)
$$

## 2.2-2

1	for j <-- i to n-1

2	key = A[j]

3	if key > A[i]

4		key=A[i]

5	key=A[i]

6	exchange [A]  key


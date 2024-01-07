# ArrayAlgs
Write a class called ArrayAlgorithms.java. It should include two public static methods:
1) repetitions , which takes an array of ints and returns how many repeated numbers there are in the array. So repetitions({1, 1, 2, 3, 1, 3, 1, 4}) would return 4.

2) shiftRight , which accepts an array of integers arr and a separate integer s and shifts each element in arr s places to the right. The array should wrap around, so if an element gets shifted past the end of the array, it loops back around to the beginning. It won’t return anything, but will modify the given array.
	
	int[] a1 = {11, 34, 5, 17, 56};
	
	shiftRight(a1, 2);
  System.out.println(Arrays.toString(a1));
  // {17, 56, 11, 34, 5}



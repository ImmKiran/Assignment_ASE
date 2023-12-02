let arr = [5, 3, 9, 1, 7];

// Using the sort() method with a custom comparison function
arr.sort((a, b) => b - a);

console.log(arr); // Output will be [9, 7, 5, 3, 1]

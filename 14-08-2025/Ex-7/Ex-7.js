// Define the two objects
const obj1 = { a: 1, b: 2 };
const obj2 = { b: 3, c: 4 };

// Merge them using the spread operator
const mergedObj = { ...obj1, ...obj2 };

// Print the result to the console
console.log("Merged Object:", mergedObj);

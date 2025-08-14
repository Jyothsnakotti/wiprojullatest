// Original arrays
const arr1 = [1, 2, 3];
const arr2 = [4, 5, 6];

// Create a new array with extra values in between
const newArr = [0, ...arr1, 'middle', ...arr2, 7];

// Print the result
console.log("Combined Array:", newArr);

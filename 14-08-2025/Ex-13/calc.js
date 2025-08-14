const { multiply, divide } = require('./operations');

console.log(multiply(6, 7)); // Output: 42

try {
  console.log(divide(10, 2)); // Output: 5
  console.log(divide(10, 0)); // Should throw error
} catch (error) {
  console.error("Error:", error.message);
}

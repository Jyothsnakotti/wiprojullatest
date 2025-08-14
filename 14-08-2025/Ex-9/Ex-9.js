const numbers = [1, 2, 3];

function sum(a, b, c) {
  return a + b + c;
}

const result = sum(...numbers); // Using spread operator
document.getElementById("output").textContent = "Sum: " + result;

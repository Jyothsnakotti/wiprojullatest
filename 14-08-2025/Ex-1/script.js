// Arrow function to sum array numbers
const sumArray = numbers => numbers.reduce((acc, curr) => acc + curr, 0);

function displaySum() {
  const input = document.getElementById('numberInput').value;
  // Convert input to an array of numbers
  const numbers = input
    .split(',')
    .map(num => Number(num.trim()))
    .filter(n => !isNaN(n));

  const sum = sumArray(numbers);
  document.getElementById('result').innerText = `Sum: ${sum}`;
}

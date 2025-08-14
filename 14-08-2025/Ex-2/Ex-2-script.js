// ES6 arrow function using map() to double numbers
const doubleNumbers = numbers => numbers.map(num => num * 2);

function displayDoubles() {
  const input = document.getElementById('numberInput').value;
  
  // Convert to array of numbers, remove invalid entries
  const numbers = input
    .split(',')
    .map(num => Number(num.trim()))
    .filter(n => !isNaN(n));

  // Get doubled array
  const doubled = doubleNumbers(numbers);

  // Display result
  document.getElementById('result').innerText = `Doubled Array: [${doubled.join(', ')}]`;
}

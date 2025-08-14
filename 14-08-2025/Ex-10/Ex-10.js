
function sumNumbers(...numbers) {
  return numbers.reduce((total, num) => total + num, 0);
}


function handleSum() {
  const input = document.getElementById('numbersInput').value;
  

  const numberArray = input
    .split(',')
    .map(num => parseFloat(num.trim()))
    .filter(num => !isNaN(num)); 

  const result = sumNumbers(...numberArray);
  
  document.getElementById('result').textContent = `Sum: ${result}`;
}

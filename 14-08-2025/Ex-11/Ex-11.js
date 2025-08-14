// Function using rest operator to separate first and rest
function separateFirstRest(...args) {
  const [first, ...rest] = args;
  return {
    first: first,
    rest: rest
  };
}

// Function to handle input and display result
function handleSeparate() {
  const input = document.getElementById('inputValues').value;

  // Convert comma-separated input to array
  const values = input
    .split(',')
    .map(item => item.trim())
    .filter(item => item !== "");

  const result = separateFirstRest(...values);

  document.getElementById('output').textContent = JSON.stringify(result, null, 2);
}

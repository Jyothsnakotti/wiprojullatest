let names = ["Alice", "Jonathan", "Bob", "Christine", "Tom", "Michael", "Eva"];

let filteredNames = names
    .filter(name => name.length > 5)
    .map(name => name.toUpperCase());

console.log("Filtered Names:", filteredNames);
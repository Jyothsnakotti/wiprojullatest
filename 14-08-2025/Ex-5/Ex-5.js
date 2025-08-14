// Vehicle class
class Vehicle {
  constructor(make, model, year) {
    this.make = make;
    this.model = model;
    this.year = year;
  }

  getInfo() {
    return `Make: ${this.make}, Model: ${this.model}, Year: ${this.year}`;
  }
}

// Car class extends Vehicle
class Car extends Vehicle {
  constructor(make, model, year, numDoors) {
    super(make, model, year);
    this.numDoors = numDoors;
  }

  getInfo() {
    return `Make: ${this.make}, Model: ${this.model}, Year: ${this.year}, Doors: ${this.numDoors}`;
  }
}

function createVehicle() {
  const make = document.getElementById("make").value.trim();
  const model = document.getElementById("model").value.trim();
  const year = parseInt(document.getElementById("year").value);

  if (!make || !model || isNaN(year)) {
    document.getElementById("output").innerText = "Please fill all Vehicle fields.";
    return;
  }

  const v = new Vehicle(make, model, year);
  document.getElementById("output").innerText = v.getInfo();
}

function createCar() {
  const make = document.getElementById("make").value.trim();
  const model = document.getElementById("model").value.trim();
  const year = parseInt(document.getElementById("year").value);
  const doors = parseInt(document.getElementById("doors").value);

  if (!make || !model || isNaN(year) || isNaN(doors)) {
    document.getElementById("output").innerText = "Please fill all Car fields.";
    return;
  }

  const c = new Car(make, model, year, doors);
  document.getElementById("output").innerText = c.getInfo();
}

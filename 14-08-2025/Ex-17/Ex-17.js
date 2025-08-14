var Calculator = /** @class */ (function () {
    function Calculator() {
    }
    Calculator.prototype.add = function (a, b) {
        return a + b;
    };
    Calculator.prototype.subtract = function (a, b) {
        return a - b;
    };
    return Calculator;
}());
// Example usage:
var calc = new Calculator();
console.log(calc.add(5, 3)); // Output: 8
console.log(calc.subtract(10, 4)); // Output: 6

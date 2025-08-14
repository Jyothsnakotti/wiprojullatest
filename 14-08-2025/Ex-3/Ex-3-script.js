class Util {
  static getDate() {
    const d = new Date();
    const day = String(d.getDate()).padStart(2, '0');
    const month = String(d.getMonth() + 1).padStart(2, '0');
    const year = d.getFullYear();
    return `${day}-${month}-${year}`;
  }
  static getPIValue() {
    return Math.PI;
  }
  static convertC2F(c) {
    return (c * 9/5) + 32;
  }
  static getFibonacci(n) {
    const fib = [];
    for (let i = 0; i < n; i++) {
      if (i === 0) fib.push(0);
      else if (i === 1) fib.push(1);
      else fib.push(fib[i - 1] + fib[i - 2]);
    }
    return fib;
  }
}
function showDate() {
  document.getElementById('dateResult').innerText = "Today's Date: " + Util.getDate();
}
function showPI() {
  document.getElementById('piResult').innerText = "Value of PI: " + Util.getPIValue();
}

function convertTemperature() {
  const val = document.getElementById('celsiusInput').value;
  if (val === "") {
    document.getElementById('conversionResult').innerText = "Please enter a value.";
    return;
  }
  const c = Number(val);
  const f = Util.convertC2F(c);
  document.getElementById('conversionResult').innerText = `${c}°C = ${f.toFixed(2)}°F`;
}

function showFibonacci() {
  const val = document.getElementById('fibInput').value;
  if (val === "" || Number(val) <= 0) {
    document.getElementById('fibResult').innerText = "Please enter a positive integer.";
    return;
  }
  const n = Number(val);
  const series = Util.getFibonacci(n);
  document.getElementById('fibResult').innerText = `First ${n} numbers: [${series.join(', ')}]`;
}

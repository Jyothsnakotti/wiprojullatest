// Define the enum with exact names and values
enum HttpSatusCode {
  OK = 200,
  NOTFOUND = 404,
  ACCESSDENIED = 403,
  INTERNALERRO = 500
}

// Example usage of the enum
function getStatusMessage(status: HttpSatusCode): string {
  switch (status) {
    case HttpSatusCode.OK:
      return "Success";
    case HttpSatusCode.NOTFOUND:
      return "Not Found";
    case HttpSatusCode.ACCESSDENIED:
      return "Access Denied";
    case HttpSatusCode.INTERNALERRO:
      return "Internal Server Error";
    default:
      return "Unknown Status";
  }
}

// Test the enum and function
const code = HttpSatusCode.NOTFOUND;
console.log(`Status Code: ${code}, Message: ${getStatusMessage(code)}`);

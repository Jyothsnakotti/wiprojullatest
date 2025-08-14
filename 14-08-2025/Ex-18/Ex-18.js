// Define the enum with exact names and values
var HttpSatusCode;
(function (HttpSatusCode) {
    HttpSatusCode[HttpSatusCode["OK"] = 200] = "OK";
    HttpSatusCode[HttpSatusCode["NOTFOUND"] = 404] = "NOTFOUND";
    HttpSatusCode[HttpSatusCode["ACCESSDENIED"] = 403] = "ACCESSDENIED";
    HttpSatusCode[HttpSatusCode["INTERNALERRO"] = 500] = "INTERNALERRO";
})(HttpSatusCode || (HttpSatusCode = {}));
// Example usage of the enum
function getStatusMessage(status) {
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
var code = HttpSatusCode.NOTFOUND;
console.log("Status Code: ".concat(code, ", Message: ").concat(getStatusMessage(code)));

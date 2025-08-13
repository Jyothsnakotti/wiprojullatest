// Global scope variables
var globalVar = "I am a var variable (global scope)";
let globalLet = "I am a let variable (global scope)";
const globalConst = "I am a const variable (global scope)";

console.log("Global var:", globalVar);
console.log("Global let:", globalLet);
console.log("Global const:", globalConst);

function testScope() {
    if (true) {
        var functionScoped = "I am function scoped (var)";
        let blockScopedLet = "I am block scoped (let)";
        const blockScopedConst = "I am block scoped (const)";

        console.log("Inside block - var:", functionScoped);
        console.log("Inside block - let:", blockScopedLet);
        console.log("Inside block - const:", blockScopedConst);
    }

    // var is accessible here because it's function scoped
    console.log("Outside block (inside function) - var:", functionScoped);

    // let and const cause error if accessed outside their block
    // Uncommenting next two lines will cause ReferenceError
    // console.log(blockScopedLet);
    // console.log(blockScopedConst);
}

// Call the function
testScope();

// Redeclaration test
var globalVar = "var can be re-declared";
console.log(globalVar);

let globalLetReassign = "let can be reassigned";
// let globalLetReassign = "This will cause error"; // ❌ redeclaration not allowed
globalLetReassign = "let reassigned value";
console.log(globalLetReassign);

const constantValue = "const cannot be reassigned";
// constantValue = "This will cause error"; // ❌ cannot reassign const
console.log(constantValue);

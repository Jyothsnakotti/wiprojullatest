function pair<T, U>(first: T, second: U): [T, U] {
    return [first, second];
}
const example = pair<number, string>(42, "hello");
console.log(example);  

// 3. The given input is a string of multiple words with a single space between each of them. Abbreviate the name and return the name initials.

 const input = "George Raymond Richard Martin";
//  output :- "GRRM";

let arr = input.split(" ").map(word => word[0]).join(".");
console.log(arr);
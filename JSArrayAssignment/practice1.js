let name = "Ritik";
const username = new String(' Roshan');

// console.log(name[0]);
// console.log(username.__proto__);
// console.log(name.length);
// console.log(username.length);
// console.log(name.toUpperCase());
// console.log(name + username);
// console.log(`java is leaarn by ${name} to the ${username}`);
// console.log(name.charAt(4));
// console.log(name.indexOf("t"));

// const newstirng = name.substring(0,5);
// console.log(newstirng);
// const newstirngone = name.slice(-4,2);
// console.log(newstirngone);

// const url = 'https://localhost:3306//ritik%20Chourasiya'
// console.log(url.replace('%20','-'));
// console.log(url.includes('https'));

// const score = 85;
// const newscore = new Number(75);

// console.log( typeof(newscore.toString()));

const arr = [1,2,3,4,5,6];

// arr.push(7)
// arr.pop()
// arr.unshift(9)
// arr.shift()
// console.log(arr.join())

// const arr1 = arr.slice(0,3)

// console.log(arr1)
// console.log("B",arr)

// const arr2 = arr.splice(0,3)
// console.log(arr1)
// console.log(arr2)

// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++Array++++++++++++++++++++++++++++++++++++++++++++++++
const marbale_heros =["spider","Iron","pinkman"]

const dc_heros = ["Batman","shakti","baduuk"]
// marbale_heros.push(dc_heros);

// console.log(marbale_heros);

//      const newheros =  marbale_heros.concat(dc_heros);
// console.log(newheros);
// const all = [...dc_heros,...marbale_heros];  +++++++++++++++Seprators
// console.log(all)

// const num = [1,2,3,[4,5,6],7,[8,9,[10,11,12]]]

// console.log(num.flat(Infinity));

// console.log(Array.isArray("Ritik"))
// console.log(Array.from("Ritik"))


// let sc1 = 100
// let sc2 = 200
// let sc3 = 300

// console.log(Array.of(sc1,sc2,sc3));

// +++++++++++++++++++++++++++++++++++++++++++++++Objects+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
const sym = Symbol["key1"]
const jsUser = {name:"Ritik",age:24,isLogdin:false,"Gmail":"Ritikchourasiya80@gmail.com",[sym]:"myKey"};

// console.log(jsUser.isLogdin)
// console.log(jsUser["Gmail"])
// console.log(jsUser["age"])
// console.log(typeof(jsUser[sym]))

// jsUser.name = "Ronit";  ++++++ update kardiya ek single entitiy ko 
// console.log(jsUser.name)

// Object.freeze(jsUser); +++++++++++++++++ ferrz kar diya pure ob jesct ko usne 


// ++++++++++++++++++++++++++++++++++++++++++++++++++Object {Litreal} Function ke sath+++++++++++++++++++++++++++++++++++++++++
//  jsUser.greeting = function(){
//     console.log("Hello marbales");
//  }

//  jsUser.greetingTwo = function(){
//     console.log(`Hello marbales ${this.name} and ${this.Gmail}`);
//  }

//  jsUser.greeting();
//  jsUser.greetingTwo();

// +++++++++++++++++++++++++++++++++++++++++++++++++++++++Object {singleTon} Function ke sath+++++++++++++++++++++++++

// const tinderUser = new Object()    ye ek singleton object hai 
 const tinderUser = {}            //   ye ek non-single ton object hai baki koi difference nahi hai 

 tinderUser.id = "123abc"
 tinderUser.name = "Hitesh BHai"
 tinderUser.isLogdin = false 

//  console.log(tinderUser);

const regularUser = {name:"Ritik",
    city: {
        Indore :{
            house : "7/9",
            Area : "nehru nagar"
        }
    }
}

// console.log(regularUser.city.Indore.house)

const obj1 = {1:"a",2:"b"}
const obj2 = {3:"c",4:"d"}

// const obj3 = {obj1,obj2}      xxxxx

// // const obj3 = Object.assign({},obj1,obj2)        ek tarika 

// const obj3 =  {...obj1,...obj2}      ek axha tari ka hai ye concatinate karnae ka 

// console.log(obj3)


// const user = [{
//     name:"ritik"
// },
// {
//     name:"Ronit"
// },
// {
//     age:25
// }
// ]

// console.log(user[0].name)


// console.log(Object.keys(tinderUser));
// console.log(Object.values(tinderUser));            sari key and value ko exxses karne lke liye hai 
// console.log(Object.entries(tinderUser));


// console.log(tinderUser.hasOwnProperty(name))

// setTimeout(function (){
//     console.log("Hello Saby")
// },2000);

setTimeout(()=>{
    console.log("Hello ScriptJava")
},3000)
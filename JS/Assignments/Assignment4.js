// Q1: create a prog that generates a random number rep a dic roll
let dice = Math.floor(Math.random() * 6) + 1;
console.log("----Roll A Dice: Ctrl+R ----");
console.log(`You rolled: ${dice}`);

// Q2: create a object rep a car that stores the folloeing properties of the car:name,model,color
let car ={
    nm: "BMW",
    model: "BMW iX",
    color: "Oxny Black"
};
console.log(car.nm);

// Q3: create an obj person with their name ,age and city
let Person ={
    nm : "John Doe",
    age: 45,
    city: "Berlin"
};
Person.city = "New York";
console.log(`City changed to:${Person.city}`);
Person.country = "United States";
console.log(Person);
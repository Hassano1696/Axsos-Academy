var crustType = ["handtossed", "deepdish"]
var sauceType = ["marinara", "traditional"]
var cheeses = ["mozarilla", "feta"]
var toppings = ["onion", "mushrooms", "pepperoni", "sausage", "olives"]
function pizzaOven(crustType, sauceType, cheeses, toppings) {
    var pizza = {};
    pizza.crustType = crustType;
    pizza.sauceType = sauceType;
    pizza.cheeses = cheeses;
    pizza.toppings = toppings;
    return pizza;
}
var randomProperty = function randomProperty(crustType, sauceType, cheeses, toppings) {
    var r1 = crustType[Math.floor(crustType.length * Math.random())];
    var r2 = sauceType[Math.floor(sauceType.length * Math.random())];
    var r3 = cheeses[Math.floor(cheeses.length * Math.random())];
    var r4 = toppings[Math.floor(toppings.length * Math.random())];
    var r5 = toppings[Math.floor(toppings.length * Math.random())];
    var r6=[r4,r5];
    return pizzaOven(r1, r2, r3, r6)
}
var s1=pizzaOven("deepdish","traditional","mozarilla",["pepperoni","sausage"]);  //first pizza
console.log(s1);
var s2=pizzaOven("handtossed","marinara",["mozarilla","feta"],["olives","mushrooms","onion"]); //second pizza
console.log(s2);
var s3=pizzaOven("handtossed","marinara","feta","onion");  //third pizza
console.log(s3);
var s4=pizzaOven("handtossed","marinara","feta","pepperoni");  //fourth pizza
console.log(s4);


x = randomProperty(crustType, sauceType, cheeses, toppings); // random pizza
console.log( x);


//Always Hungry
function alwaysHungry(arr) {
    var arrnew = [];
    for (var i = 0; i <= arr.length; i++) {
        if (arr[i] == 'food') {
            arrnew.push(arr[i]);

        }
    }
    if (arrnew.length == 0) {
        console.log('Im Hungry')

    }
    else {
        console.log('Yummy');
    }
}
alwaysHungry([3.14, 15, "pie", true, 22]);


//High pass filter

function highPass(arr, cutoff) {
    var filteredArr = [];
    for (var i = 0; i <= arr.length; i++) {
        if (arr[i] > cutoff) {
            filteredArr.push(arr[i])
        }
    }
    return filteredArr;
}
var result = highPass([6, 8, 3, 10, -2, 5, 9], 5);
console.log(result);

//Better than average
function betterThanAverage(arr) {
    var sum = 0;
    var count = 0;
    for (var i = 0; i <= arr.length - 1; i++) {
        sum += arr[i];
        var average = sum / arr.length;
    }
    for (var i = 0; i <= arr.length - 1; i++) {
        if (arr[i] > average) {
            count++;
        }
    }
    return count;
}
var result = betterThanAverage([6, 8, 3, 10, -2, 5, 9]);
console.log(result); // we expect back 4
// Reverse Array
function reverse(arr) {
    var arrnew = [];
    for (var i = arr.length - 1; i >= 0; i--) {
        arrnew.push(arr[i]);

    }
    arr = arrnew;




    return arr;
}

var result = reverse(["a", "b", "c", "d", "e"]);
console.log(result); // we expect back ["e", "d", "c", "b", "a"]

//Fib Array
function fibonacciArray(n) {

    var fibArr = [0, 1];
    for (var i=2;i<=n-1;i++){
        fibArr.push(fibArr[i-1]+fibArr[i-2])
    }
    
    return fibArr;
}
   
var result = fibonacciArray(10);
console.log(result); // we expect back [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]copy

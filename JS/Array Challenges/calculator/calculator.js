var displayNum = "";
var storedNum = "";
var operation = 0;
var queuedOperation = 0;




function clr() {
    var display = document.getElementById('display');
    display.innerHTML = '0';
    storedNum = 0;
    queuedOperation = 0;
}

function press(num) {
    var display = document.getElementById("display");
    if ((display.innerHTML == '') && num == 0) {
        return num;
    }

    else {
        display.innerHTML += num;
    }
}
function insertDecimal(dec) {
    var display = document.getElementById("display");
    display.innerHTML += dec;
    console.log(display.innerHTML)
}
function setOP(command) {
    var display = document.getElementById("display"),
        displayNum = display.innerHTML;
    evalDisplay = eval(displayNum),
        evalStored = eval(storedNum);
        if (queuedOperation == 0) {
            storedNum = display.innerHTML;
        }

    if (command == '/') {
        operation = 1;
    }

    else if (command == '+') {
        operation = 2;
    }
    else if (command == '-') {
        operation = 3;
    }
    else if (command == 'x') {
        operation = 4;
    }
    queuedOperation=operation;
    display.innerHTML = '';
}

function calculate() {
    var display = document.getElementById("display");
    displayNum = display.innerHTML;
    var evalDisplay =eval(displayNum),
        evalStored = eval(storedNum);
    if (operation == 1) {
        displayNum = evalStored / evalDisplay;
    }
    else if (operation == 2) {
        displayNum = evalStored + evalDisplay;
    }
    else if (operation == 3) {
        displayNum = evalStored - evalDisplay;
    }
    else if (operation == 4) {
        displayNum = evalStored * evalDisplay;
    }

    display.innerHTML = displayNum;
    console.log(display.innerHTML)
    operation = 0;
    queuedOperation = 0;
    displayNum = "";
    storedNum = "";

}

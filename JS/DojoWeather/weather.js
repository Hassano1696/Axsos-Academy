console.log('page loaded');
var Cookies = document.querySelector("button")
function remov() {
    Cookies.parentElement.remove()
}

var Temperature = document.querySelector(".max")
var Temperature1 = document.querySelector(".min")
function f2c(temp) {

    var emp = 5/9 *(temp-32)
    return Math.floor(emp);
}

function c2f(temp) {
    var emp=(9/5*temp)+32
    return  Math.floor(emp);

}



function Switchtemp(element) {

    for (let i = 1; i <= 8; i++) {
        var tempval=document.querySelector(".temp"+i); //word
        var a=tempval.innerText; //value  
        if (element.value == ("°C")) {
            tempval.innerText = f2c(a);
        }
        else {
            tempval.innerText = c2f(a);
        }
    }
}
/*((temp *50)-32)*0.5556*/
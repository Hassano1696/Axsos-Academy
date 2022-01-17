console.log("page loaded...");

var element1=document.querySelector(".card-list-item1");
var element2=document.querySelector(".card-list-item2");
function remove1(){
    element1.remove();
}
function remove2(){
    element2.remove();
}

var newname = document.querySelector("#name");
function changename(){
    var a = prompt("What name would you like me to call you?" );
    newname.innerText = a;
}
var count1=2;
var count2=418;
var requests=document.querySelector(".badge1");
var connections=document.querySelector(".badge");
function change(){
    count1--;
    count2++;
    requests.innerText = count1;
    connections.innerText = count2;
}
function change2(){
    count1--;
    requests.innerText = count1;
}
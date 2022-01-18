var like=[9, 12, 9];
var posts= [
    document.querySelector("#firstpost"),
    document.querySelector("#secondpost"),
    document.querySelector("#thirdpost")
];
function liking(id){
    like[id]++;
    posts[id].innerHTML=like[id]; 
}


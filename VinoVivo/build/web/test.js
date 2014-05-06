
var btn = document.getElementById("btnsend");
var msg = document.getElementById("textmsg");

function writeToScreen(message) {
    output.innerHTML += message + "<br>";
}
function sendText(json) {
    writeToScreen('<span style="color: red;">sending text2:</span> ' + json);
    //console.log("sending text: " + json);
    //websocket.send(json);
}
btn.addEventListener("click", function() {
    sendText(msg.value);
}, false);


//function send() {
//     sendText(msg.value);
//}
//btn.addEventListener("click", send, false);
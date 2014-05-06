//var wsUri = "ws://"+ document.location.host+document.location.pathname+"endpoint";
var wsUri = "ws://localhost:8080/VinoVivo/endpoint";
var websocket = new WebSocket(wsUri);

websocket.onopen = function(evt) {
    onOpen(evt);
};
websocket.onmessage = function(evt) {
    onMessage(evt);
};
websocket.onclose = function(evt) {
    onClose(evt);
};
websocket.onerror = function(evt) {
    onError(evt);
};

var output = document.getElementById("output");
//output.addEventListener("click", sendText('message'), false);

var btn = document.getElementById("btnsend");
var msg = document.getElementById("textmsg");
btn.addEventListener("click", sendText(msg.value), false);

function onError(evt) {
    writeToScreen('<span style="color: red;">ERROR:</span> ' + evt.data + " " + document.location.host + document.location.pathname);
}

function writeToScreen(message) {
    output.innerHTML += message + "<br>";
}

function onOpen() {
    //writeToScreen("Connected to " + wsUri + msg.innerHTML);
}

function onMessage(evt) {
    writeToScreen('<span style="color: red;">received:</span> ');
    //console.log("received: " + evt.data);
    //drawImageText(evt.data);
}

function sendText(json) {
    writeToScreen('<span style="color: red;">sending text2:</span> ' + json);
    //console.log("sending text: " + json);
    //websocket.send(json);
}
var wsUri = "ws://"+ document.location.host+document.location.pathname+"endpoint";
var websocket = new WebSocket(wsUri);

websocket.onerror = function(evt) { onError(evt); };
websocket.onmessage = function(evt) { onMessage(evt); };
websocket.onopen = function(evt) { onOpen(evt); };

var output = document.getElementById("output");
output.addEventListener("onclick", sendText('message'), false);

function onError(evt) {
    writeToScreen('<span style="color: red;">ERROR:</span> ' + evt.data+" "+document.location.host+document.location.pathname);
}

function writeToScreen(message) {
    output.innerHTML += message + "<br>";
}

function onOpen() {
    writeToScreen("Connected to " + wsUri);
}

function sendText(json) {
    writeToScreen('<span style="color: red;">sending text2:</span> ' + json);
    console.log("sending text: " + json);
    //websocket.send(json);
}
                
function onMessage(evt) {
    writeToScreen('<span style="color: red;">received:</span> ');
    //console.log("received: " + evt.data);
    //drawImageText(evt.data);
}
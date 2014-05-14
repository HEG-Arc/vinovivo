
/*
 var vinApp = angular.module('vinApp', []);
 vinApp.controller('vinsCtrl', function($scope) {
 function vins($scope, tab) {
 $scope.vins = [{nom: "Vin1"}, {nom: "Vin2"}, {nom: "Vin3"}];
 //alert($scope.vins);
 }
 function lala(){
 var c = [{nom: "Vin1"}, {nom: "Vin2"}, {nom: "Vin3"},{nom: "Vin4"}];
 vins(c);
 }
 //lala();
 var websocket; //WebSocket
 var wsUri = "ws://192.168.1.54:8080/VinoVivo/endpoint"; //Hostname
 
 //function connect() {
 if (!window.WebSocket) {
 alert("Votre navigateur ne supporte pas l'application");
 return false;
 } else {
 websocket = new WebSocket(wsUri);
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
 
 function onError(evt) {
 output.innerHTML += "Error<br>";
 }
 
 function onClose(evt) {
 output.innerHTML += "Close<br>";
 }
 
 function writeToScreen(message) {
 output.innerHTML += message + "<br>";
 }
 
 function onOpen(evt) {
 //Ouverture du websocket
 output.innerHTML += "Connected<br>";
 //Envoi au serveur qu'on s'est connecté
 websocket.send("init");
 }
 function onMessage(message) {
 //Réception d'un message venant du serveur
 var jsonToString = JSON.parse(message.data);
 tabVins = jsonToString.vins;
 vins($scope, tabVins);
 //lala.innerHTML += tabVins;
 for (i = 0; i < tabVins.length; i++) {
 output.innerHTML += tabVins[i].nom + "<br>";
 }
 console.log("received: " + message.data);
 //drawImageText(evt.data);
 }
 
 var output = document.getElementById("output");
 
 
 //function getVins2($scope, json) {
 // Initialisation du tableau répertoires
 // $scope.vins = json; //[{nom: "Vin1"}, {nom: "Vin2"}, {nom: "Vin3"}];
 //$scope.vins = tab;
 // }
 
 var btnTes = document.getElementById("btnTest");
 btnTes.addEventListener("click", function() {
 onOpen();
 }, false);
 }
 function test(json) {
 alert(json);
 }
 function sendText(json) {
 writeToScreen('<span style="color: red;">sending text2:</span> ' + json);
 //console.log("sending text: " + json);
 //websocket.send(json);
 }
 
 //}
 // connect();
 });
 
 //window.addEventListener("load", connect, false);*/
//var vinApp = angular.module('vinApp', []);
vinApp.factory('MyService', function($q, $rootScope) {
    return function(error) {

        // Create our own promise!
        var deferred = $q.defer();
        
        //WebSocket
        var wsUrl = "ws://157.26.114.140:8080/VinoVivo/endpoint";
        var ws = new WebSocket(wsUrl);
        
        ws.onopen = function() {
            console.log("connection established ...");
            ws.send("init");
        };
        ws.onmessage = function(event) {
            console.log("message : "+event.data);
            //Réception d'un message venant du serveur
            var jsonToString = JSON.parse(event.data);
            tabVins = jsonToString.vins;
            //On force à Angular de mettre à jour le scope
            $rootScope.$apply(function() {
                if (!error) {
                    // We'll just accept the value returned here.
                    deferred.resolve(tabVins);
                } else {
                    // But if there was an error condition, we could also listen for it:
                    deferred.reject(error);
                }
            });
        };
        // return the promise
        return deferred.promise;
    };
});
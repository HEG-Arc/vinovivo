vinApp.controller('vinsCtrl', function($scope, MyService) {
    // Call our service and respond on promise resolution
    //MyService(true)
    console.log("vinsCtrl");
    MyService()
            .then(function success(name) {
                $scope.vins = name;
            }, function error(name) {
                $scope.vins = "Well, shoot-darn. It broke.";
            });
});

vinApp.controller('vinsListCtrl', function($scope) {
    console.log("vinsListCtrl");
});
vinApp.controller('VinDetailCtrl', function($scope, $routeParams) {
    // Call our service and respond on promise resolution
    console.log("VinDetailCtrl");
    if ($routeParams.vinId) {
        $scope.vin = $scope.vins[$routeParams.vinId];
    } else {
        $scope.vin = "";
    }
});

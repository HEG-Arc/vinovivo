var vinApp = angular.module('vinApp', ['ngRoute']);

vinApp.config(['$routeProvider',
    function($routeProvider) {
        $routeProvider.
                when('/vins', {
                    templateUrl: 'pages/vins.html',
                    controller: 'vinsListCtrl'
                }).
                when('/home', {
                    templateUrl: 'pages/evenements.html',
                    controller: 'vinsListCtrl'
                }).
                when('/vins/:vinId', {
                    templateUrl: 'pages/vinNote.html',
                    controller: 'VinDetailCtrl'
                }).
                otherwise({
                    redirectTo: '/vins'
                });
    }]);


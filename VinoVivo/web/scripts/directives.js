var vinApp = angular.module('vinApp', []);
vinApp.directive('customButton', function () {
  return {
    restrict: 'A', //signifie customButton = attribut
    replace: true,
    transclude: true,
    template: '<a href="" class="myawesomebutton" ng-transclude>' +
                '<i class="icon-ok-sign"></i>' +
              '</a>',
    link: function (scope, element, attrs) {
      // DOM manipulation/events here!
    }
  };
});
angular.module('hello', [])
  .controller('home', function($scope) {
    $scope.greeting = {id: 'Sanchit', content: 'Hello Sanchit!'}
})
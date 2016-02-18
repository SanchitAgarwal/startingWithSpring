angular.module('hello', [])
  .controller('home', function($scope,$http) {
	  var self = $scope;
	  $http.get('/resource/').success(function(data) {
			  self.greeting = data;
			  });
    $scope.greeting = {id: 'Sanchit', content: 'Hello Sanchit!'}
})
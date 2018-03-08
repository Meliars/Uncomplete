angular.module('app', []).
config(['$sceDelegateProvider', function($sceDelegateProvider) {
        // We must whitelist the JSONP endpoint that we are using to show that we trust it
        $sceDelegateProvider.resourceUrlWhitelist([
            'self',
            'https://angularjs.org/**'
        ]);
    }])
.controller('ctrl', ['$scope', '$http',
    function($scope, $http) {
        $scope.method = "POST";
        $scope.url = 'User.json';

        $scope.name = null;
        $scope.surname = null;
        $scope.project = null;
        $scope.group = null

            $scope.fetch = function () {

                $http({method: $scope.method, url: $scope.url,
                    data:{name: $scope.name, surname: $scope.surname, project: $scope.project, group: $scope.group},
                    headers: {'Content-Type': 'application/json'}}).

                then(function(response) {
                    $scope.name = response.name;
                    $scope.surname = response.surname;
                    $scope.project = response.project;
                    $scope.group = response.group;
                }, function(err) {
                    console.error('Damn, something went wrong!!', err);
                });
            };

        $scope.updateModel = function(method, url) {
            $scope.method = method;
            $scope.url = url;
        };
    }]);

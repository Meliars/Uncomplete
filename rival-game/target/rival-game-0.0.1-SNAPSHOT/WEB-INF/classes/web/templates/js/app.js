var vm = angular.module('app', []).controller('RegisterController', function ($http, $scope) {
    var vm = this;
    $scope.passInputMessage='dd';

    $scope.changePassInputValue=function ($scope) {
        $scope.passInputMessage = this;
        $scope.passInputMessage='hasła się nie zgadzają';

    };

    $scope.changedPassInputValue=function () {

        return $scope.passInputMessage;
    };

    vm.addUser=function (characters) {

        if (characters.password === characters.rePassword) {
            $http({
                method: 'POST',
                url: 'api/user',
                data: characters
            })
        } else {
            changePassInputValue($scope.passInputMessage);
            changedPassInputValue();


        }

    }


});





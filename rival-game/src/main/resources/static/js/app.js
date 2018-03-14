var vm = angular.module('app', []).controller('RegisterController', function ($http) {
    var vm = this;
    vm.addUser=function (characters) {
        $http({
            method: 'POST',
            url: 'api/user',
            data: characters
        })

    }

    
});





var numAdderPlugin = {
    addTwoNumbers: function(num1, num2, successCallback, errorCallback) {
        cordova.exec(
    successCallback, // success callback function
    errorCallback, // error callback function
    'NumAdder', // name of the native java class
    'addTwoNumbers', // name of the action to performed
    [{
        "num1" : num1,
        "num2" : num2
    }]  // and this array of custom arguments to create our entry
        );
    }
};
module.exports = numAdderPlugin;

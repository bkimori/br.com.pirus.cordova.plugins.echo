module.exports.Echo = function(pInputString, successCallback, errorCallback) {
  cordova.exec(successCallback, errorCallback, "Echo", "echo", pInputString);
};
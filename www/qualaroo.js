var exec = require("cordova/exec");
var QualarooSdk = {
    initSdk: function(apiKey) {
        exec(null, null, "QualarooSdk", "init", [apiKey]);
    },
    showSurvey: function(alias) {
        exec(null, null, "QualarooSdk", "showSurvey", [alias])
    },
    setUserId: function(userId) {
        exec(null, null, "QualarooSdk", "setUserId", [userId])
    },
    setUserProperty: function(key, value) {
        exec(null, null, "QualarooSdk", "setUserProperty", [key, value])
    },
    removeUserProperty: function(key) {
      exec(null, null, "QualarooSdk", "removeUserProperty", [key])  
    },
    setPreferredLanguage: function(iso2Language) {
      exec(null, null, "QualarooSdk", "setPreferredLanguage", [iso2Language])  
    }
};
module.exports = QualarooSdk;
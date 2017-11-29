[![](https://github.com/qualaroo/AndroidSDK/blob/master/img/logo-dark.png?raw=true)](https://qualaroo.com/)

# QualarooSDK for Cordova

Qualaroo helps companies identify and capitalize on mobile visitor revenue opportunities.

## Requirements
In order to integrate the Qualaroo SDK into a 3rd-party app, the app must satisfy the following requirements:

### Android
- Minimum deployment target set to Android 4.0.3 or later

### iOS
- make sure Always Embed Swift Standard Libraries in your Build Options is set to true

## Installation
`cordova plugin add com.qualaroo.cordova`

## Usage
#### Initialize the Client
In order to be able to use Qualaroo SDK you need to to initialize it first.

`QualarooSdk.init("<your_api_key_here">
`
#### Display survey with a given alias.
The survey will be displayed if all conditions configured in your dashboard are met.

`QualarooSdk.showSurvey("survey_alias")`

#### Set user properties
```
//Set unique user id
QualarooSdk.setUserId("HAL_9000");
//Set user property "name" to "Hal"
QualarooSdk.setUserProperty("name", "Hal");
//remove property "name"
QualarooSdk.removeUserProperty("name");
```
#### Set preferred language
You can set preferred language that you want to use when displaying surveys.

`QualarooSdk.setPreferredLanguage("fr")`

Language that you provide should be an ISO 639-1 compatible language code (two lowercase letters)
[![](https://github.com/qualaroo/AndroidSDK/blob/master/img/logo-dark.png?raw=true)](https://qualaroo.com/)

# Qualaroo SDK for Ionic Cordova Apps

Qualaroo helps companies identify and capitalize on mobile visitor revenue opportunities.

## Requirements
In order to integrate the Qualaroo SDK into a 3rd-party app, the app must satisfy the following requirements:

### Android
- Minimum deployment target set to Android 4.0.3 or later
- compileSdkVersion set to 31 or later

### iOS
- make sure Always Embed Swift Standard Libraries in your Build Options is set to true

## Installation
```
ionic cordova plugin add https://github.com/qualaroo/cordova-mobile-sdk
npm install ionic-cordova-qualaroo
```

`npm install @awesome-cordova-plugins/core` (If not install)

## Usage
#### Initialize the Client
In order to be able to use Qualaroo SDK you need to to initialize it first.

```
import { IonicCordovaQualaroo } from 'node_modules/ionic-cordova-qualaroo/ngx'

constructor(private ionicCordovaQualaroo:IonicCordovaQualaroo) {}

ionViewDidEnter(){
    this.ionicCordovaQualaroo.initSdk("<your_api_key_here">")
  }
  
  
  // app.module.ts
import { IonicCordovaQualaroo } from 'node_modules/ionic-cordova-qualaroo/ngx'

...

@NgModule({
  ...

  providers: [
    ...
    IonicCordovaQualaroo
    ...
  ]
  ...
})
export class AppModule { }
```
#### Display survey with a given alias.
The survey will be displayed if all conditions configured in your dashboard are met.

`this.ionicCordovaQualaroo.showSurvey("survey_alias")`

#### Set user properties
```
//Set unique user id
this.ionicCordovaQualaroo.setUserId("HAL_9000");
//Set user property "name" to "Hal"
this.ionicCordovaQualaroo.setUserProperty("name", "Hal");
//remove property "name"
this.ionicCordovaQualaroo.removeUserProperty("name");
```
#### Set preferred language
You can set preferred language that you want to use when displaying surveys.

`this.ionicCordovaQualaroo.setPreferredLanguage("fr")`

Language that you provide should be an ISO 639-1 compatible language code (two lowercase letters)

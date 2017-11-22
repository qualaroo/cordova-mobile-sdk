//
//  Qualaroo.h
//  CordovaLibApp
//
//  Created by Mihály Papp on 22/11/2017.
//

#import <Cordova/CDV.h>
#import <Foundation/Foundation.h>

@interface QualarooPlugin : CDVPlugin

- (void)init:(CDVInvokedUrlCommand *)command;
- (void)showSurvey:(CDVInvokedUrlCommand *)command;
- (void)setUserId:(CDVInvokedUrlCommand *)command;
- (void)setUserProperty:(CDVInvokedUrlCommand *)command;
- (void)removeUserProperty:(CDVInvokedUrlCommand *)command;
- (void)setPreferredLanguage:(CDVInvokedUrlCommand *)command;

@end

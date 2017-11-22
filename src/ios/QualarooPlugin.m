//
//  Qualaroo.m
//  CordovaLibApp
//
//  Created by Mihály Papp on 22/11/2017.
//

#import "QualarooPlugin.h"
#import <Qualaroo/Qualaroo.h>

@implementation QualarooPlugin

- (void)init:(CDVInvokedUrlCommand *)command {
  NSString *apiKey = [command.arguments objectAtIndex:0];
  [Qualaroo.shared configureWithApiKey:apiKey autotracking:false];
}
- (void)showSurvey:(CDVInvokedUrlCommand *)command {
  NSString *alias = [command.arguments objectAtIndex:0];
  [Qualaroo.shared showSurveyWith:alias on:nil];
}

- (void)removeUserProperty:(CDVInvokedUrlCommand *)command {
  NSString *propertyKey = [command.arguments objectAtIndex:0];
  return [Qualaroo.shared removeUserProperty:propertyKey];
}
- (void)setUserProperty:(CDVInvokedUrlCommand *)command {
  NSString *key = [command.arguments objectAtIndex:0];
  NSString *property = [command.arguments objectAtIndex:1];
  [Qualaroo.shared addUserProperty:key withValue:property];
}

- (void)setUserId:(CDVInvokedUrlCommand *)command {
  NSString *userId = [command.arguments objectAtIndex:0];
  [Qualaroo.shared setUserID:userId];
}

- (void)setPreferredLanguage:(CDVInvokedUrlCommand *)command {
  NSString *language = [command.arguments objectAtIndex:0];
  [Qualaroo.shared setPreferredSurveysLanguage:language error:nil];
}

@end

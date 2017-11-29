package com.qualaroo.cordova;

import android.support.annotation.Nullable;

import com.qualaroo.Qualaroo;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

public class QualarooPlugin extends CordovaPlugin {

    private enum Action {
        INIT("init"),
        SHOW_SURVEY("showSurvey"),
        SET_USER_ID("setUserId"),
        SET_USER_PROPERTY("setUserProperty"),
        REMOVE_USER_PROPERTY("removeUserProperty"),
        SET_PREFERRED_LANGUAGE("setPreferredLanguage");

        private String actionName;
        Action(String actionName) {
            this.actionName = actionName;
        }

        @Nullable static Action fromName(String name) {
            for (Action action : values()) {
                if (action.actionName.equals(name)) {
                    return action;
                }
            }
            return null;
        }
    }
    
    @Override
    public boolean execute(String action, JSONArray jsonArray, CallbackContext callbackContext) throws JSONException {
        Action qualarooAction = Action.fromName(action);
        if (qualarooAction == null) {
            return false;
        }
        switch (qualarooAction) {
            case INIT:
                initializeQualarooSdk(jsonArray);
                break;
            case SHOW_SURVEY:
                showSurvey(jsonArray);
                break;
            case SET_USER_ID:
                setUserId(jsonArray);
                break;
            case SET_USER_PROPERTY:
                setUserProperty(jsonArray);
                break;
            case REMOVE_USER_PROPERTY:
                removeUserProperty(jsonArray);
                break;
            case SET_PREFERRED_LANGUAGE:
                setPreferredLanguage(jsonArray);
                break;
        }
        return true;
    }

    private void initializeQualarooSdk(JSONArray jsonArray) throws JSONException {
        Qualaroo.initializeWith(cordova.getActivity().getApplicationContext())
                .setApiKey(jsonArray.getString(0))
                .init();
    }

    private void showSurvey(JSONArray jsonArray) throws JSONException {
        Qualaroo.getInstance().showSurvey(jsonArray.getString(0));
    }

    private void setUserId(JSONArray jsonArray) throws JSONException {
        Qualaroo.getInstance().setUserId(jsonArray.getString(0));
    }

    private void setUserProperty(JSONArray jsonArray) throws JSONException {
        Qualaroo.getInstance().setUserProperty(jsonArray.getString(0), jsonArray.getString(1));
    }

    private void removeUserProperty(JSONArray jsonArray) throws JSONException {
        Qualaroo.getInstance().removeUserProperty(jsonArray.getString(0));
    }

    private void setPreferredLanguage(JSONArray jsonArray) throws JSONException {
        Qualaroo.getInstance().setPreferredLanguage(jsonArray.getString(0));
    }
}
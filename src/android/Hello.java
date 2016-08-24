package com.example.plugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;
import android.os.SystemClock;

public class Hello extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

            int timeInMillis = data.getInt(0);
            SystemClock.sleep(timeInMillis);
            callbackContext.success(message);

            return true;

    }
}

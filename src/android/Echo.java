package br.com.pirus.cordova.plugins.echo;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Echo extends CordovaPlugin {
  public static final String ACTION_ECHO = "echo";
  
  @Override
  public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
    if(ACTION_ECHO.equals(action)) {
      JSONObject jsonObject = args.getJSONObject(0);
      
      String message = "Plugin retornou isto: " + jsonObject.getString("texto");
      
      callbackContext.success(message);
      
      return true;
    }
    
    callbackContext.error("Erro na execução do plugin!");
    
    return false;
  }
}
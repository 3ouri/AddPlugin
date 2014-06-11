package com.eska.plugin;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class NumAdder extends CordovaPlugin {

	public static final String ACTION_ADD_TWO_NUMBERS = "addTwoNumbers";

	@Override
	public boolean execute(String action, JSONArray args,
			CallbackContext callbackContext) throws JSONException {
		try {
			if (ACTION_ADD_TWO_NUMBERS.equals(action)) {
				JSONObject arg_object = args.getJSONObject(0);
				
				int number1 = arg_object.getInt("num1");
				int number2 = arg_object.getInt("num2");
				int sum = number1 + number2;
				
				System.out.println("Sum operation successfully done!");
				System.out.println(number1 + " + " + number2 + " = " + sum);
					
				callbackContext.success();
				return true;
			}
			callbackContext.error("Invalid action");
			return false;
		} catch (Exception e) {
			System.err.println("Exception: " + e.getMessage());
			callbackContext.error(e.getMessage());
			return false;
		}
	}
}

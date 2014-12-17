package com.coolweather.app.application;

import android.app.Application;
import android.content.Context;
import android.util.Log;

/**
 * @author xinyuncz.Tomson
 * @version ：
 * 2014-12-16 下午9:59:51
 */
public class CoolWeatherApplication extends Application {

	private static Context context;
	public void onCreate() {
		context = getApplicationContext();
		float xdpi = getResources().getDisplayMetrics().xdpi;
		float ydpi = getResources().getDisplayMetrics().ydpi;
		Log.v("CoolWeatherApplication","xdpi is "+xdpi);
		Log.v("CoolWeatherApplication","ydpi is "+ydpi);
	};
	
	public static Context getContext() {
		return context;
	}
}

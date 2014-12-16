package com.coolweather.app.application;

import android.app.Application;
import android.content.Context;

/**
 * @author xinyuncz.Tomson
 * @version ：
 * 2014-12-16 下午9:59:51
 */
public class CoolWeatherApplication extends Application {

	private static Context context;
	public void onCreate() {
		context = getApplicationContext();
	};
	
	public static Context getContext() {
		return context;
	}
}

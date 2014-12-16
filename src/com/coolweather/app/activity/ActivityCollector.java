package com.coolweather.app.activity;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;


/**
 * @author xinyuncz.Tomson
 * @version ：
 * 2014-12-16 下午11:27:31
 */
public class ActivityCollector {

	public static List<Activity> activities = new ArrayList<Activity>();
	
	public static void addActivity(Activity activity){
		activities.add(activity);
	}
	
	public static void finishAll(){
		for (Activity activity : activities) {
			if (!activity.isFinishing()) {
				activity.finish();
			}
		}
	}
}

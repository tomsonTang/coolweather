package com.coolweather.app.activity;

import com.coolweather.app.util.LogUtil;

import android.app.Activity;
import android.os.Bundle;

/**
 * @author xinyuncz.Tomson
 * @version ：
 * 2014-12-16 下午11:30:32
 */
public class BaseActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		LogUtil.v(this.getClass().getSimpleName(),this.getClass().getSimpleName()+":  onCreate");
		ActivityCollector.addActivity(this);
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		LogUtil.v(this.getClass().getSimpleName(),this.getClass().getSimpleName()+":  onDestroy");
		ActivityCollector.finishAll();
	}
}

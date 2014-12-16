package com.coolweather.app.util;

/**
 * @author xinyuncz.Tomson
 * @version ：
 * 2014-12-16 下午9:55:00
 */
public interface HttpCallbackListener {
	public abstract void onFinish(String response);
	public abstract void OnError(Exception e);
}

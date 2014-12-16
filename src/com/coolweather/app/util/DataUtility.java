package com.coolweather.app.util;

import android.text.TextUtils;

import com.coolweather.app.application.CoolWeatherApplication;
import com.coolweather.app.db.CoolWeatherDB;
import com.coolweather.app.model.City;
import com.coolweather.app.model.County;
import com.coolweather.app.model.Province;


/**
 * @author xinyuncz.Tomson
 * @version ：
 * 2014-12-16 下午11:34:31
 */
public class DataUtility {
	
	private static CoolWeatherDB coolWeatherDB;
	
	static{
		coolWeatherDB = CoolWeatherDB.getInstance(CoolWeatherApplication.getContext());
	}
	/**
	 * 解析和处理服务器返回的省级数据
	 * @param response
	 * @return
	 */
	public synchronized static boolean handleProvincesResponse(String response){
		if (!TextUtils.isEmpty(response)) {
			String [] allProvinces = response.split(",");
			if (allProvinces != null && allProvinces.length >0) {
				for (String p : allProvinces) {
					String[] array = p.split("\\|");
					Province province = new Province();
					province.setProvinceCode(array[0]);
					province.setProvinceName(array[1]);
					coolWeatherDB.saveProvince(province);
				}
				return true;
			}
		}
		return false;
	}
	/**
	 * 解析和处理服务器返回的市级数据
	 * @param response
	 * @param provinceId
	 * @return
	 */
	public synchronized static boolean handleCitirsResponse(String response,int provinceId){
		if (!TextUtils.isEmpty(response)) {
			String [] allCityies = response.split(",");
			if (allCityies != null && allCityies.length >0) {
				for (String c : allCityies) {
					String[] array = c.split("\\|");
					City city = new City();
					city.setCityCode(array[0]);
					city.setCityName(array[1]);
					city.setProvinceId(provinceId);
					coolWeatherDB.saveCity(city);
				}
				return true;
			}
		}
		return false;
	}
	/**
	 * 解析和处理服务器返回的县级数据
	 * @param response
	 * @param cityId
	 * @return
	 */
	public synchronized static boolean handleCountiesResponse(String response,int cityId){
		if (!TextUtils.isEmpty(response)) {
			String [] allCounty = response.split(",");
			if (allCounty != null && allCounty.length >0) {
				for (String c : allCounty) {
					String[] array = c.split("\\|");
					County county = new County();
					county.setCountyCode(array[0]);
					county.setCountyName(array[1]);
					county.setCityId(cityId);
					coolWeatherDB.saveCounty(county);
				}
				return true;
			}
		}
		return false;
	}
}

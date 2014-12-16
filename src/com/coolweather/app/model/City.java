package com.coolweather.app.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author xinyuncz.Tomson
 * @version ：
 * 2014-12-16 下午8:52:12
 */
public class City implements Parcelable{

	private int id;
	private String cityName;
	private String cityCode;
	private int provinceId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public int getProvinceId() {
		return provinceId;
	}
	public void setProvinceId(int provinceId) {
		this.provinceId = provinceId;
	}
	
	//实现可Parcelable化
	
	@Override
	public int describeContents() {
		return 0;
	}
	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeInt(id);
		dest.writeString(cityName);
		dest.writeString(cityCode);
		dest.writeInt(provinceId);
	}
	public static final Parcelable.Creator<City> CREATOR = new Parcelable.Creator<City>() {

		@Override
		public City createFromParcel(Parcel source) {
			City city = new City();
			city.id = source.readInt();
			city.cityName = source.readString();
			city.cityCode = source.readString();
			city.provinceId = source.readInt();
			return city;
		}

		@Override
		public City[] newArray(int size) {
			return new City[size];
		}
	};
	
}

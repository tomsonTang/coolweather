package com.coolweather.app.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author xinyuncz.Tomson
 * @version ：
 * 2014-12-16 下午8:53:39
 */
public class County implements Parcelable{

	private int id;
	private String countyName;
	private String countyCode;
	private int cityId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountyName() {
		return countyName;
	}
	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}
	public String getCountyCode() {
		return countyCode;
	}
	public void setCountyCode(String countyCode) {
		this.countyCode = countyCode;
	}
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	
	//实现可Parcelable化
	
	@Override
	public int describeContents() {
		return 0;
	}
	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeInt(id);
		dest.writeString(countyName);
		dest.writeString(countyCode);
		dest.writeInt(cityId);
	}
	
	public static final Parcelable.Creator<County> CREATOR = new Parcelable.Creator<County>() {

		@Override
		public County createFromParcel(Parcel source) {
			County county = new County();
			county.id = source.readInt();
			county.countyName = source.readString();
			county.countyCode = source.readString();
			county.cityId = source.readInt();
			return county;
		}

		@Override
		public County[] newArray(int size) {
			return new County[size];
		}
	};
}

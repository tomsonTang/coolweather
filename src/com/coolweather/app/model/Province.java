package com.coolweather.app.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author xinyuncz.Tomson
 * @version ：
 * 2014-12-16 下午8:50:46
 */
public class Province implements Parcelable{

	private int id;
	private String provinceName;
	private String provinceCode;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProvinceName() {
		return provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	public String getProvinceCode() {
		return provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}
	
	//实现Parcelabel化
	
	@Override
	public int describeContents() {
		return 0;
	}
	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeInt(id);
		dest.writeString(provinceName);
		dest.writeString(provinceCode);
	}
	public static final Parcelable.Creator<Province> CREATOR = new Parcelable.Creator<Province>() {

		@Override
		public Province createFromParcel(Parcel source) {
			Province province = new Province();
			province.id = source.readInt();
			province.provinceName = source.readString();
			province.provinceCode = source.readString();
			return province;
		}

		@Override
		public Province[] newArray(int size) {
			return new Province[size];
		}
	};
}

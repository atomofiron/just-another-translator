package ru.atomofiron.translator.Utils.Retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DetectResponse {

	@SerializedName("code")
	@Expose
	private Integer code;
	@SerializedName("lang")
	@Expose
	private String lang;

	public Integer getCode() {
		return code;
	}

	public String getLang() {
		return lang;
	}


}
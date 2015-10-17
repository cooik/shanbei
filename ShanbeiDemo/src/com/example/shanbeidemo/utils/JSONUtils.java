package com.example.shanbeidemo.utils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONUtils {
	/**
	 * ��json�л�ȡ�ַ���ֵ�� ������ֶβ����ڻ�ֵΪNULL�򷵻ظ�����Ĭ��ֵ
	 * 
	 * @param json
	 *            ��Ҫ������JSONObject
	 * @param key
	 *            ��Ҫ������key
	 * @param defaultValue
	 *            key�����ڻ���ΪNULLʱ���ص�Ĭ��ֵ
	 * @return String
	 * @throws org.json.JSONException
	 */
	public static String getString(JSONObject json, String key,
			String defaultValue) throws JSONException {

		if (json == null || json.isNull(key)) {
			return defaultValue;
		}

		return json.getString(key);
	}

	/**
	 * ��json�л�ȡ����ֵ�� ������ֶβ������򷵻ظ�����Ĭ��ֵ
	 * 
	 * @param json
	 *            ��Ҫ������JSONObject
	 * @param key
	 *            ��Ҫ������key
	 * @param defaultValue
	 *            key�����ڻ���ΪNULLʱ���ص�Ĭ��ֵ
	 * @return int
	 * @throws org.json.JSONException
	 */
	public static int getInt(JSONObject json, String key, int defaultValue) {
		if (json.isNull(key)) {
			return defaultValue;
		}
		try {
			return json.getInt(key);
		} catch (JSONException e) {
			return defaultValue;
		}
	}

	/**
	 * ��json�л�ȡdoubleֵ�� ������ֶβ������򷵻ظ�����Ĭ��ֵ
	 * 
	 * @param json
	 *            ��Ҫ������JSONObject
	 * @param key
	 *            ��Ҫ������key
	 * @param defaultValue
	 *            key�����ڻ���ΪNULLʱ���ص�Ĭ��ֵ
	 * @return double
	 * @throws org.json.JSONException
	 */
	public static double getDouble(JSONObject json, String key,
			double defaultValue) {
		if (json.isNull(key)) {
			return defaultValue;
		}
		try {
			return json.getDouble(key);
		} catch (JSONException e) {
			return defaultValue;
		}
	}

	/**
	 * ��json�л�ȡ����ֵ�� ������ֶβ������򷵻ظ�����Ĭ��ֵ
	 * 
	 * @param json
	 *            ��Ҫ������JSONObject
	 * @param key
	 *            ��Ҫ������key
	 * @param defaultValue
	 *            key�����ڻ���ΪNULLʱ���ص�Ĭ��ֵ
	 * @return boolean
	 * @throws org.json.JSONException
	 */
	public static boolean getBoolean(JSONObject json, String key,
			boolean defaultValue) throws JSONException {
		if (json.isNull(key)) {
			return defaultValue;
		}

		return json.getBoolean(key);
	}

	/**
	 * ��json�л�ȡlongֵ�� ������ֶβ������򷵻ظ�����Ĭ��ֵ
	 * 
	 * @param json
	 *            ��Ҫ������JSONObject
	 * @param key
	 *            ��Ҫ������key
	 * @param defaultValue
	 *            key�����ڻ���ΪNULLʱ���ص�Ĭ��ֵ
	 * @return long
	 * @throws org.json.JSONException
	 */
	public static long getLong(JSONObject json, String key, long defaultValue)
			throws JSONException {
		if (json.isNull(key)) {
			return defaultValue;
		}
		return json.getLong(key);
	}

	/**
	 * ��json�л�ȡJSONArray�� ������ֶβ������򷵻�null
	 * 
	 * @param json
	 *            ��Ҫ������JSONObject
	 * @param key
	 *            ��Ҫ������key
	 * @return JSONArray
	 * @throws org.json.JSONException
	 */
	public static JSONArray getJSONArray(JSONObject json, String key)
			throws JSONException {
		if (json == null || json.isNull(key)) {
			return null;
		}
		return json.getJSONArray(key);
	}

	/**
	 * ��json�л�ȡJSONObject�� ������ֶβ������򷵻�null
	 * 
	 * @param json
	 *            ��Ҫ������JSONObject
	 * @param key
	 *            ��Ҫ������key
	 * @return JSONObject
	 * @throws org.json.JSONException
	 */
	public static JSONObject getJSONObject(JSONObject json, String key)
			throws JSONException {
		if (json == null || json.isNull(key)) {
			return null;
		}
		return json.getJSONObject(key);
	}
}

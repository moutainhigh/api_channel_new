/**
 * Copyright(c) 2018 sunyur.com, All Rights Reserved.
 * Project: common
 * Author: houzi
 * Createdate: 9:33:45 AM
 */
package com.sunyur.api.channel.common.httpclient;


import java.util.*;

import org.apache.http.*;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.sunyur.api.channel.common.base.ModelResult;
import com.sunyur.api.channel.common.util.SYAPIUtils;


/**
 * @Description:
 * @author houzi
 * @date May 28, 2019 9:33:45 AM
 */
public class ApiHttpClient {

	private final static Logger LOGGER_INFO = LoggerFactory.getLogger(ApiHttpClient.class);
	private final static Logger LOGGER_ERROR = LoggerFactory.getLogger(ApiHttpClient.class);

	private static String APP_KEY;
	private static String APP_SECRET;

//	private static String APP_ID = "110548089";


	private static class InnerClass {

		private static ApiHttpClient INSTANCE = new ApiHttpClient();
	}

	public static ApiHttpClient getInstance(String appKey, String appSecret) {
		APP_KEY = appKey;
		APP_SECRET = appSecret;
		return InnerClass.INSTANCE;
	}

	/**
	 * @param httpClient
	 * @param baseUrl
	 * @param cityHttp
	 * @param requestBody
	 * @param httpMethod
	 * @param responseType
	 * @return
	 * @throws Exception
	 * @Description:POST请求
	 * @author houzi
	 * @date May 28, 2019 4:50:38 PM
	 */
	@SuppressWarnings({"rawtypes", "unchecked"})
	public ModelResult execPost(HttpClient httpClient, String baseUrl, String path, String requestBody) throws Exception {
		LOGGER_INFO.info("execPost path [{}],requestBody [{}]", path, requestBody);
		ModelResult result = new ModelResult();
		HttpPost httpPost = new HttpPost(baseUrl + path);
		httpPost.setEntity(new StringEntity(requestBody, "UTF-8"));
		httpPost.addHeader("X-Ca-Key", APP_KEY);
		httpPost.addHeader("X-Ca-AppId", APP_KEY);

		httpPost.addHeader("X-Ca-Timestamp", String.valueOf(System.currentTimeMillis()));
		httpPost.addHeader("Content-Type", "application/json;charset=UTF-8");
		Map<String, String> headers = new HashMap<>();
		for (Header header : httpPost.getAllHeaders()) {
			headers.put(header.getName(), header.getValue());
		}
		String sign = SYAPIUtils.sign(APP_SECRET, "POST", path, headers, requestBody);
		httpPost.addHeader("X-Ca-Signature", sign);
		HttpResponse httpResponse = httpClient.execute(httpPost);
		if (httpResponse.getStatusLine().getStatusCode() == 200) {
			String responseBody = EntityUtils.toString(httpResponse.getEntity(), "UTF-8");
			result = JSON.parseObject(responseBody, ModelResult.class);
			result.setContent(result.getContent());
			return result;
		} else {
			result.setErrorMessage(String.valueOf(httpResponse.getStatusLine().getStatusCode()), "request is fail");
			LOGGER_ERROR.error("execPost result is {}", JSON.toJSONString(httpResponse));
		}
		return result;
	}

	/**
	 * @param httpClient
	 * @param baseUrl
	 * @param cityHttp
	 * @param requestBody
	 * @param httpMethod
	 * @param responseType
	 * @return
	 * @throws Exception
	 * @Description:get请求
	 * @author houzi
	 * @date May 28, 2019 5:08:00 PM
	 */
	@SuppressWarnings({"rawtypes", "unchecked"})
	public ModelResult execGet(HttpClient httpClient, String baseUrl, String path, String requestBody) throws Exception {
		HttpGet http = new HttpGet(baseUrl + path);
		ModelResult result = new ModelResult();
		http.addHeader("X-Ca-Key", APP_KEY);
		http.addHeader("X-Ca-AppId", APP_KEY);

		http.addHeader("X-Ca-Timestamp", String.valueOf(new Date().getTime()));
		http.addHeader("Content-Type", "application/json;charset=UTF-8");
		Map<String, String> headers = new HashMap<>();
		for (Header header : http.getAllHeaders()) {
			headers.put(header.getName(), header.getValue());
		}
		String sign = SYAPIUtils.sign(APP_SECRET, "GET", path, headers, requestBody);
		http.addHeader("X-Ca-Signature", sign);
		HttpResponse httpResponse = httpClient.execute(http);
		if (httpResponse.getStatusLine().getStatusCode() == 200) {
			String responseBody = EntityUtils.toString(httpResponse.getEntity(), "UTF-8");
			result = JSON.parseObject(responseBody, ModelResult.class);
			result.setContent(result.getContent());
			return result;
		} else {
			result.setErrorMessage(String.valueOf(httpResponse.getStatusLine().getStatusCode()), "request is fail");
			LOGGER_ERROR.error("execGet result is {}", JSON.toJSONString(httpResponse));
		}
		return null;
	}


	private static List setHttpParams(Map<String, String> paramMap) {
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		Set<Map.Entry<String, String>> set = paramMap.entrySet();
		for (Map.Entry<String, String> entry : set) {
			formparams.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
		}
		return formparams;
	}

}

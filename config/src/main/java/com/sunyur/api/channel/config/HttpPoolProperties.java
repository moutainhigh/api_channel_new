/**
 * Copyright(c) 2018 sunyur.com, All Rights Reserved.
 * Project: config
 * Author: houzi
 * Createdate: 4:27:33 PM
 */
package com.sunyur.api.channel.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:http连接池配置属性
 * @author houzi
 * @date May 20, 2019 4:27:33 PM
 */
@Configuration
public class HttpPoolProperties {
	@Value("${http.maxTotal}")
	private Integer maxTotal;
	@Value("${http.defaultMaxPerRoute}")
	private Integer defaultMaxPerRoute;
	@Value("${http.connectTimeout}")
	private Integer connectTimeout;
	@Value("${http.connectionRequestTimeout}")
	private Integer connectionRequestTimeout;
	@Value("${http.socketTimeout}")
	private Integer socketTimeout;
	@Value("${http.validateAfterInactivity}")
	private Integer validateAfterInactivity;

	public Integer getMaxTotal() {
		return maxTotal;
	}
	public void setMaxTotal(Integer maxTotal) {
		this.maxTotal = maxTotal;
	}
	public Integer getDefaultMaxPerRoute() {
		return defaultMaxPerRoute;
	}
	public void setDefaultMaxPerRoute(Integer defaultMaxPerRoute) {
		this.defaultMaxPerRoute = defaultMaxPerRoute;
	}
	public Integer getConnectTimeout() {
		return connectTimeout;
	}
	public void setConnectTimeout(Integer connectTimeout) {
		this.connectTimeout = connectTimeout;
	}
	public Integer getConnectionRequestTimeout() {
		return connectionRequestTimeout;
	}
	public void setConnectionRequestTimeout(Integer connectionRequestTimeout) {
		this.connectionRequestTimeout = connectionRequestTimeout;
	}
	public Integer getSocketTimeout() {
		return socketTimeout;
	}
	public void setSocketTimeout(Integer socketTimeout) {
		this.socketTimeout = socketTimeout;
	}
	public Integer getValidateAfterInactivity() {
		return validateAfterInactivity;
	}
	public void setValidateAfterInactivity(Integer validateAfterInactivity) {
		this.validateAfterInactivity = validateAfterInactivity;
	}
}

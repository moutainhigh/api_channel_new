package com.sunyur.api.channel.model.purchase;

import java.io.Serializable;

/**
 * <p>Copyright(c) 2019 Sunyur.com, All Rights Reserved.<p>
 *
 * <p>description  :  purchase apply file</p>
 * <p>className    :  ApiFileModel </p>
 * <p>create time  :  2019-08-28 11:38</p>
 * <p>@version     :  1.0</p>
 *
 * @author <p>     :  Gauler</p>
 **/
public class ApiFileModel implements Serializable {

	private static final long serialVersionUID = 2018703662691409192L;

	private String name;

	private String size;

	private String url;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}

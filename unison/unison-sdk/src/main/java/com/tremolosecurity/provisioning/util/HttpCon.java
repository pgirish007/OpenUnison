/*******************************************************************************
 * Copyright 2015, 2016 Tremolo Security, Inc.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.tremolosecurity.provisioning.util;

import org.apache.http.HttpConnection;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.conn.BasicHttpClientConnectionManager;

public class HttpCon {
	
	
	
	BasicHttpClientConnectionManager bcm;
	CloseableHttpClient http;
	
	public HttpCon() {
		
	}
	
	public HttpCon(CloseableHttpClient http,BasicHttpClientConnectionManager bcm) {
		this.http = http;
		this.bcm = bcm;
	}
	
	public BasicHttpClientConnectionManager getBcm() {
		return bcm;
	}
	public void setBcm(BasicHttpClientConnectionManager bcm) {
		this.bcm = bcm;
	}
	public CloseableHttpClient getHttp() {
		return http;
	}
	public void setHttp(CloseableHttpClient http) {
		this.http = http;
	}
	
	
}

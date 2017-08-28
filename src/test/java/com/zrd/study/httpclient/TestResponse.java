package com.zrd.study.httpclient;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.HttpVersion;
import org.apache.http.message.BasicHttpResponse;
import org.junit.Test;

public class TestResponse {
	@Test
	public void testCookie(){
		HttpResponse resp = new BasicHttpResponse(HttpVersion.HTTP_1_1, HttpStatus.SC_OK, "成功");
		resp.addHeader("Set-Cookie", "a1=1;b1=2;c1=4");
		resp.addHeader("Set-Cookie", "a2=1;b2=2;c2=4");
		
		resp.addHeader("Set-Cookie1", "a2=1;b2=2;c2=4");
		resp.addHeader("Set-Cookie1", "a2=1;b2=2;c2=4");
		
		for(Header h: resp.getAllHeaders()){
			System.out.println(h);
		}
	}
}

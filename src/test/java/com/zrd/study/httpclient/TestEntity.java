package com.zrd.study.httpclient;

import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

public class TestEntity {
	@Test
	public void test() throws IOException{
		StringEntity entity = new StringEntity("信息", ContentType.create("text/plain", Charset.forName("utf-8")));
		entity.setChunked(true);
		System.out.println(entity.getContent());
		System.out.println(entity.getContentType());
		System.out.println(EntityUtils.toString(entity, "utf-8"));
	}
}

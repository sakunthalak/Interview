package com.qa.util;

import java.io.IOException;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class VerifyallLinksinPage {
	
//		
//	public static verifyeachlink(String alllinks) {
//		for(WebElement t:alllinks) {
//			System.out.println(t);
//			String url=t.getAttribute("href");
//			verifyURLStatus(url);
//			
//		}
	

	public static void verifyURLStatus(String URL) throws ClientProtocolException, IOException
	{
		HttpClient client=HttpClientBuilder.create().build();
		HttpGet request=new HttpGet(URL);
		HttpResponse response=client.execute(request);
	if(response.getStatusLine().getStatusCode()==200)//==200 for valid links
		{
			System.out.println("Name of the valid link is ="+URL);
		System.out.println(response.getStatusLine().getStatusCode());
		}

}}

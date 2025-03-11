package org.login;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	
	public static void main(String[] args)  {
		String s = "dadd is and dadd and is";
		Map<Character, Integer> m = new LinkedHashMap();
		for(int i=0; i<s.length(); i++){
		char x = s.charAt(i);
		if(m.containsKey(x)){
			Integer y = m.get(x);
			m.put(x, y+1);
		}
		else{
			m.put(x, 1);
		}
		}
		
		System.out.println(m);
		System.out.println("Hi I am Developer");
		System.out.println("Developer Developed Payment Module");
		System.out.println("It is working fine");
		System.out.println("I am Tester");
		System.out.println("Testing Work Complted");

		
	}

}

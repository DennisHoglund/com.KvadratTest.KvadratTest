package com.KvadratTest.KvadratTest;

import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;
import org.sikuli.script.*;



public class LoginPage {

	
	private Screen _s;
	private String NPath = "C:\\Users\\Dennis\\AppData\\Roaming\\Spotify\\spotify.exe";
	private String test = "Git test";

	public LoginPage()
	{
		Screen s = new Screen();
		this._s = s;
	}

	public Boolean ValidUser(String user, String password)
	{
		
		
		try
			{
				

				App.open(NPath);
				_s.wait("imgs/UserSpotify.png", 10);
				_s.type(user);
				_s.click("imgs/PasswordSpotify.png", 0);
				_s.type(password);
				_s.click("imgs/LoginSpotify.png", 0);
				_s.wait("imgs/ValiduserSpotify.png", 10); 
				_s.click("imgs/FileSpotifyClient.png"); 
				_s.wait("imgs/LogoutUserSpotify.png", 5);
				_s.click("imgs/LogoutUserSpotify.png"); 
				//_s.click("imgs/ExitLogin.png");
				return true;
				
				
			}
				catch(FindFailed e)
				
			{
			e.printStackTrace();
			}
		return false;
	}

	public Boolean InvalidUser(String user, String password)
	{
		
		
		try
			{
					

				App.open(NPath);
				_s.wait("imgs/UserSpotify.png", 10);
				_s.type(user);
				_s.click("imgs/PasswordSpotify.png", 0);
				_s.type(password);
				_s.click("imgs/LoginSpotify.png", 0);
				_s.wait("imgs/InvalidUserSpotify.png", 10); 
				_s.click("imgs/UserSpotify.png");
				_s.type("a", Key.CTRL);
				_s.type(Key.BACKSPACE);
				_s.click("imgs/ExitLogin.png");
				return true;
				
			}
				catch(FindFailed e)
				
			{
			e.printStackTrace();
			}
		return false;
		
	}
	
	public MainPage LoginUser(String user, String password)
	{
		try
		{
			MainPage mp = new MainPage();
			App.open(NPath);
			_s.wait("imgs/UserSpotify.png", 10);
			_s.type(user);
			_s.click("imgs/PasswordSpotify.png", 0);
			_s.type(password);
			_s.click("imgs/LoginSpotify.png", 0);
		
			return mp;
		}
		catch(FindFailed e)
		
	{
	e.printStackTrace();
	}
		return null;
	}
	
}

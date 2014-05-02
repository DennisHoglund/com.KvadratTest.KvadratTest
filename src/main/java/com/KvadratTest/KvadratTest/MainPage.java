package com.KvadratTest.KvadratTest;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;

public class MainPage {

	private Screen _s;

	public MainPage()
	{
		Screen s = new Screen();
		this._s = s;
	}
	
	
	public Boolean SearchSong()
	{
		try
		{
		    
			_s.wait("imgs/SearchSpotify.png", 15);
			_s.click("imgs/SearchSpotify.png", 0);
			_s.type("ya mama" + Key.ENTER);
			_s.click("imgs/MaximizeWindow.png", 0);
			_s.wait("imgs/SearchResultSpotify.png", 16);
			_s.doubleClick("imgs/SearchResultSpotify.png", 0);
			_s.click("imgs/MinimizeWindow.png", 0);
			_s.click("imgs/FileSpotifyClient.png", 0);
			_s.wait("imgs/LogoutUserSpotify.png", 5);
			_s.click("imgs/LogoutUserSpotify.png"); 
			
			return true;
		}
			catch(FindFailed e)
		{
		e.printStackTrace();
		}
		
		return null;
		
	}
	
	//SearchArtistSong.png
	public Boolean SearchArtist()
	{
		try
		{
		    
			_s.wait("imgs/SearchSpotify.png", 15);
			_s.click("imgs/SearchSpotify.png", 0);
			_s.type("rolling stones" + Key.ENTER);
			//_s.click("imgs/MaximizeWindow.png", 0);
			//_s.wait("imgs/SearchArtistSong.png", 5);
			_s.click("imgs/FileSpotifyClient.png", 0);
			_s.wait("imgs/LogoutUserSpotify.png", 5);
			_s.click("imgs/LogoutUserSpotify.png"); 
			
			return true;
		}
			catch(FindFailed e)
		{
		e.printStackTrace();
		}
		
		return null;
		
	}
	
	
}


package gui.controller;

import gui.model.countryRoads;
import gui.view.countryRoadsFrame;

public class GUIController
{
	private countryRoads myHome;
	private countryRoadsFrame appFrame;
	
	public GUIController()
	{
		myHome = new countryRoads();
		
		appFrame = new countryRoadsFrame(this);
	}
	
	public void start()
	{
		
	}
}

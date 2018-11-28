package gui.view;

import java.awt.Color;

import javax.swing.JFrame;
import gui.controller.GUIController;

public class countryRoadsFrame extends JFrame
{
	private GUIController appController;
	private countryRoadsPanel appPanel;
	
	public countryRoadsFrame(GUIController appController)
	{
		super();//have to add the super every time you make a frame.
		this.appController = appController;
		this.appPanel = new countryRoadsPanel(appController);
		
		setupFrame();
	}
	
	private void setupFrame() //sets up the actual frame. Have to add these four every time.
	{
		this.setContentPane(appPanel);
		this.setSize(800, 800);
		this.setTitle("Country Roads");
		this.setResizable(true);
		this.setVisible(true);
	}
}

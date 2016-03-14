package de.yoda.harvesterclone.controller;

import de.yoda.harvesterclone.HarvesterClone;
import de.yoda.harvesterclone.controller.viewcontroller.ViewController;

/**
 * Created by YoDa on 09.03.16.
 */
public class MainController
{

	private static MainController INSTANCE;
	private HarvesterClone game;
	private ViewController viewController;

	private MainController()
	{

	}

	public static MainController get()
	{
		if(INSTANCE == null)
		{
			INSTANCE = new MainController();
		}
		return INSTANCE;
	}

	public void setGame(HarvesterClone game)
	{
		this.game = game;
	}

	public HarvesterClone getGame()
	{
		return this.game;
	}

	public void setViewController(ViewController viewController)
	{
		this.viewController = viewController;
		this.game.setView(viewController.getView());
	}

	public ViewController getViewController()
	{
		return this.viewController;
	}
}

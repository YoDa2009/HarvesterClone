package de.yoda.harvesterclone;

import com.badlogic.gdx.*;
import de.yoda.harvesterclone.controller.MainController;
import de.yoda.harvesterclone.controller.view.View;
import de.yoda.harvesterclone.controller.viewcontroller.ViewController;
import de.yoda.harvesterclone.controller.viewcontroller.menu.MainMenuController;
import de.yoda.harvesterclone.view.game.GameScreenImpl;
import de.yoda.harvesterclone.view.menu.MainMenuScreenImpl;

public class HarvesterCloneImpl extends Game implements HarvesterClone
{
	InputMultiplexer multiplexer = new InputMultiplexer();

	MainMenuScreenImpl mainMenu;
	private boolean isDeveloper;

	public HarvesterCloneImpl(boolean isDeveloper)
	{
		this.isDeveloper = isDeveloper;
	}

	@Override
	public void create ()
	{
		MainController.get().setGame(this);
		Gdx.input.setInputProcessor(multiplexer);
		MainMenuController mainMenuController = new MainMenuController();
		MainMenuScreenImpl mainMenuScreen = new MainMenuScreenImpl(mainMenuController);
		mainMenuController.setView(mainMenuScreen);
		MainController.get().setViewController(mainMenuController);
	}

	@Override
	public void render ()
	{
		super.render();
	}

	@Override
	public void setView(View screen)
	{
		super.setScreen((Screen)screen);
	}

	@Override
	public void exitGame()
	{
		Gdx.app.exit();
	}

	@Override
	public GameScreenImpl getNewGameView(ViewController controller)
	{
		return new GameScreenImpl(controller);
	}

	@Override
	public void startGame()
	{

	}

	@Override
	public float getDeltaTime()
	{
		return Gdx.graphics.getDeltaTime();
	}
}

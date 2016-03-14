package de.yoda.harvesterclone.controller.viewcontroller.menu;

import de.yoda.harvesterclone.controller.MainController;
import de.yoda.harvesterclone.controller.handler.Handler;
import de.yoda.harvesterclone.controller.view.game.GameView;
import de.yoda.harvesterclone.controller.view.menu.MainMenuView;
import de.yoda.harvesterclone.controller.viewcontroller.ViewController;
import de.yoda.harvesterclone.controller.viewcontroller.game.GameController;
import de.yoda.harvesterclone.model.Log;

/**
 * Created by yoda on 09.03.16.
 */
public class MainMenuController extends ViewController
{


	public MainMenuController()
	{

	}

	@Override
	public void initView()
	{
		MainMenuView mainMenuView = (MainMenuView)this.view;
		mainMenuView.addExitButtonHandler(new Handler() {
			@Override
			public void doSomething()
			{
				MainController.get().getGame().exitGame();
			}
		});

		mainMenuView.addStartButtonHandler(new Handler() {
			@Override
			public void doSomething()
			{
				Log.get().log("Tapped Start");
				GameController controller = new GameController();
				GameView newGameView = MainController.get().getGame().getNewGameView(controller);
				controller.setView(newGameView);
				MainController.get().setViewController(controller);
			}
		});
	}

}

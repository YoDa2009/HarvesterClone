package de.yoda.harvesterclone;

import de.yoda.harvesterclone.controller.view.View;
import de.yoda.harvesterclone.controller.viewcontroller.ViewController;
import de.yoda.harvesterclone.view.game.GameScreenImpl;

/**
 * Created by YoDa on 09.03.16.
 */
public interface HarvesterClone
{
	void setView(View Screen);

	void exitGame();

	GameScreenImpl getNewGameView(ViewController controller);

	void startGame();

	float getDeltaTime();
}

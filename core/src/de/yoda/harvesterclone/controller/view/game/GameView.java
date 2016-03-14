package de.yoda.harvesterclone.controller.view.game;

import de.yoda.harvesterclone.controller.handler.MouseKeyboardHandler;
import de.yoda.harvesterclone.controller.view.View;
import de.yoda.harvesterclone.model.player.Move;

/**
 * Created by yoda on 10.03.16.
 */
public interface GameView extends View
{

	void setMouseKeyHandler(MouseKeyboardHandler mouseKeyboardHandler);

	void setPlayerMove(Move up);
}

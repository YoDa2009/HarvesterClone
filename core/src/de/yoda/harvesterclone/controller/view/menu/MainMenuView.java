package de.yoda.harvesterclone.controller.view.menu;

import de.yoda.harvesterclone.controller.handler.Handler;
import de.yoda.harvesterclone.controller.view.View;

/**
 * Created by YoDa on 08.03.16.
 */
public interface MainMenuView extends View
{


	void addStartButtonHandler(Handler handler);

	void addEditorButtonHandler(Handler handler);

	void addExitButtonHandler(Handler handler);

	void removeStartButtonHandler();

	void removeEditorButtonHandler();

	void removeExitButtonHandler();
}

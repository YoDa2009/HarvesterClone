package de.yoda.harvesterclone.controller.handler;

/**
 * Created by yoda on 10.03.16.
 */
public interface KeyHandler
{
	public boolean keyDown(int keycode);

	public boolean keyUp(int keycode);

	public boolean keyTyped(char character);
}

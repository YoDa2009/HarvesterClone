package de.yoda.harvesterclone.controller.handler;

/**
 * Created by yoda on 10.03.16.
 */
public interface MouseHandler
{
	public boolean touchDown(int screenX, int screenY, int pointer, int button);

	public boolean touchUp(int screenX, int screenY, int pointer, int button);

	public boolean touchDragged(int screenX, int screenY, int pointer);

	public boolean mouseMoved(int screenX, int screenY);

	public boolean scrolled(int amount);
}

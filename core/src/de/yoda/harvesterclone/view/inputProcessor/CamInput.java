package de.yoda.harvesterclone.view.inputProcessor;

import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.scenes.scene2d.Stage;
import de.yoda.harvesterclone.model.Log;

/**
 * Created by YoDa on 02.03.16.
 */
public class CamInput implements InputProcessor
{
	private final Stage stage;
	OrthographicCamera cam;

	public CamInput(Stage stage)
	{
		this.stage = stage ;
		this.cam = (OrthographicCamera) stage.getCamera();
	}

	@Override
	public boolean keyDown(int keycode)
	{
		switch (keycode)
		{
			case 19:
//				cam.translate(0, 50);
				break;
			case 20:
//				cam.translate(0, -50);
				break;
			case 21:
//				cam.translate(-50, 0);
				break;
			case 22:
//				cam.translate(+50, 0);
				break;
			case 72:
				cam.zoom = cam.zoom -0.10f;
				break;
			case 73:
				cam.zoom = cam.zoom +0.10f;
				break;
		}
		return true;
	}

	@Override
	public boolean keyUp(int keycode)
	{
		return false;
	}

	@Override
	public boolean keyTyped(char character)
	{
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button)
	{
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button)
	{
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer)
	{
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY)
	{
		return false;
	}

	@Override
	public boolean scrolled(int amount)
	{
		return false;
	}
}

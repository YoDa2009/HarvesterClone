package de.yoda.harvesterclone.view.mapeditor;

import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.g2d.Batch;
import de.yoda.harvesterclone.view.abstractscreen.AbstractScreen;

/**
 * Created by YoDa on 08.03.16.
 */
public class Mapeditor extends AbstractScreen implements InputProcessor
{
	private int width = 1024;
	private int height = 768;

	public Mapeditor()
	{
		super(null);
		this.multiplexer.addProcessor(this);
	}

	@Override
	protected void renderLayer5(float delta, Batch batch)
	{
		for(int i = 0; i<this.width; i++)
		{
			for(int j = 0; j<this.height; j++)
			{

			}
		}
	}

	@Override
	protected void renderLayer4(float delta, Batch batch)
	{

	}

	@Override
	protected void renderLayer3(float delta, Batch batch)
	{

	}

	@Override
	protected void renderLayer2(float delta, Batch batch)
	{

	}

	@Override
	protected void renderLayer1(float delta, Batch batch)
	{

	}

	@Override
	protected void renderBackground(float delta, Batch batch)
	{

	}

	@Override
	public boolean keyDown(int keycode)
	{
		return false;
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

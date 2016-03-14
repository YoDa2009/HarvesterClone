package de.yoda.harvesterclone.view.menu;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import de.yoda.harvesterclone.controller.handler.Handler;
import de.yoda.harvesterclone.model.Log;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by YoDa on 01.03.16.
 */
public class Button implements InputProcessor
{
	private final String text;
	private final int x;
	private final int y;
	private final float width;
	private final float height;
	private final float posWidth;
	private final float posHeight;
	private final int calculatedY;
	private BitmapFont font;
	private ArrayList<Handler> handlerList = new ArrayList<Handler>();

	public Button(String text, int x, int y)
	{
		InputMultiplexer inputProcessor = (InputMultiplexer) Gdx.input.getInputProcessor();
		inputProcessor.addProcessor(this);
		this.text = text;
		this.x = x;
		this.y = y;
		this.font = new BitmapFont();
		this.font.setColor(Color.GOLD);
		GlyphLayout layout = new GlyphLayout();
		layout.setText(font,text);
		this.width = layout.width;
		this.height = layout.height;
		this.calculatedY =  Gdx.graphics.getHeight() - y;
		this.posWidth = width + x;
		this.posHeight = Gdx.graphics.getHeight() - y +height;

	}

	public void addHandler(Handler handler)
	{
		this.handlerList.add(handler);
	}

	public void removeHandler()
	{

	}

	public void render(Batch batch)
	{
		Color oldColor = batch.getColor();
		this.font.draw(batch,this.text, this.x, this.y);
		batch.setColor(oldColor);
	}

	@Override
	public boolean keyDown(int keycode)
	{
		//Exit on Esc
		if(keycode == 131)
		{
			Gdx.app.exit();
		}
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
		if(screenX > this.x &&
		   screenX < this.posWidth &&
		   screenY > this.calculatedY &&
			screenY < this.posHeight)
		{
			for (Handler handler : this.handlerList)
			{
				handler.doSomething();
			}

			return true;
		}
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

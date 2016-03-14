package de.yoda.harvesterclone.view.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import de.yoda.harvesterclone.controller.handler.MouseKeyboardHandler;
import de.yoda.harvesterclone.controller.view.game.GameView;
import de.yoda.harvesterclone.controller.viewcontroller.ViewController;
import de.yoda.harvesterclone.controller.viewcontroller.game.GameController;
import de.yoda.harvesterclone.model.Log;
import de.yoda.harvesterclone.model.player.Move;
import de.yoda.harvesterclone.view.abstractscreen.AbstractScreen;
import de.yoda.harvesterclone.view.textures.GroundTextures;
import de.yoda.harvesterclone.view.textures.character.MainCharacter;

/**
 * Created by yoda on 10.03.16.
 */
public class GameScreenImpl extends AbstractScreen implements GameView, InputProcessor
{

	private final GroundTextures groundTextures;
	private final MainCharacter mainCharacter;
	private MouseKeyboardHandler mouseKeyboardHandler = new MouseKeyboardHandler() {};

	public GameScreenImpl(ViewController controller)
	{
		super(controller);
		this.groundTextures = new GroundTextures();
		this.mainCharacter = new MainCharacter();
		this.multiplexer.addProcessor(this);
	}

	@Override
	protected void renderLayer5(float delta, Batch batch)
	{

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
		keyHandling();
		TextureRegion keyFrame = mainCharacter.getAnimation().getKeyFrame(delta, true);
		float playerPosX = getController().getPlayerPosX();
		float playerPosY = getController().getPlayerPosY();
		batch.draw(keyFrame,
				   playerPosX,
				   playerPosY);
		this.cam.position.x = playerPosX;
		this.cam.position.y = playerPosY;
		this.cam.update();
	}

	private void keyHandling()
	{
		if(Gdx.input.isKeyPressed(Input.Keys.UP))
		{
			getController().movePlayer(Move.UP);
			this.mainCharacter.setMove(Move.UP);
		}
		else if(Gdx.input.isKeyPressed(Input.Keys.DOWN))
		{
			getController().movePlayer(Move.DOWN);
			this.mainCharacter.setMove(Move.DOWN);
		}
		else if(Gdx.input.isKeyPressed(Input.Keys.LEFT))
		{
			getController().movePlayer(Move.LEFT);
			this.mainCharacter.setMove(Move.LEFT);
		}
		else if(Gdx.input.isKeyPressed(Input.Keys.RIGHT))
		{
			getController().movePlayer(Move.RIGHT);
			this.mainCharacter.setMove(Move.RIGHT);
		}
		else
		{
			getController().movePlayer(Move.STANDING);
			this.mainCharacter.setMove(Move.STANDING);
		}
	}

	@Override
	protected void renderBackground(float delta, Batch batch)
	{
		for(int i=0; i<getController().getMapWidth(); i++)
		{
			for(int j=0; j<getController().getMapHeight(); j++)
			{



				batch.draw(groundTextures.getRegionByString(getController().getMapTexture(i, j)), i * 32, j * 32);
			}
		}
	}

	public GameController getController()
	{
		return (GameController)this.controller;
	}

	@Override
	public void setMouseKeyHandler(MouseKeyboardHandler mouseKeyboardHandler)
	{
		this.mouseKeyboardHandler = mouseKeyboardHandler;
	}

	@Override
	public boolean keyDown(int keycode)
	{
		Log.get().log(keycode+"");
		return this.mouseKeyboardHandler.keyDown(keycode);
	}

	@Override
	public boolean keyUp(int keycode)
	{
		return this.mouseKeyboardHandler.keyUp(keycode);
	}

	@Override
	public boolean keyTyped(char character)
	{
		return this.mouseKeyboardHandler.keyTyped(character);
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button)
	{
		return this.mouseKeyboardHandler.touchDown(screenX,screenY,pointer,button);
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button)
	{
		return this.mouseKeyboardHandler.touchUp(screenX,screenY,pointer,button);
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer)
	{
		return this.mouseKeyboardHandler.touchDragged(screenX,screenY,pointer);
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY)
	{
		return this.mouseKeyboardHandler.mouseMoved(screenX,screenY);
	}

	@Override
	public boolean scrolled(int amount)
	{
		return this.mouseKeyboardHandler.scrolled(amount);
	}

	@Override
	public void setPlayerMove(Move move)
	{
		this.mainCharacter.setMove(move);
	}
}

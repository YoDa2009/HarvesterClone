package de.yoda.harvesterclone.controller.viewcontroller.game;

import android.os.Looper;
import com.badlogic.gdx.Input;
import de.yoda.harvesterclone.controller.MainController;
import de.yoda.harvesterclone.controller.handler.MouseKeyboardHandler;
import de.yoda.harvesterclone.controller.view.game.GameView;
import de.yoda.harvesterclone.controller.viewcontroller.ViewController;
import de.yoda.harvesterclone.model.Log;
import de.yoda.harvesterclone.model.map.Map;
import de.yoda.harvesterclone.model.player.Move;
import de.yoda.harvesterclone.model.player.Player;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static de.yoda.harvesterclone.model.player.Move.*;

/**
 * Created by yoda on 10.03.16.
 */
public class GameController extends ViewController
{
	private Map map;
	private Player player;

	public GameController()
	{
		this.loadMap();

	}

	@Override
	public void initView()
	{
	}

	public void loadMap()
	{
		this.map = new Map(250, 250);
		this.map.addGrassFieldsToMap();
		this.player = new Player();
		this.map.getField(100,100).setPlayer(player);

	}

	public String getMapTexture(int x, int y)
	{
		return this.map.getField(x, y).getTextureString();
	}

	public int getMapHeight()
	{
		return this.map.getHeight();
	}

	public int getMapWidth()
	{
		return this.map.getWidth();
	}

	public GameView getGameView()
	{
		return (GameView) view;
	}


	public float getPlayerPosX()
	{
		return player.getPositionX();
	}

	public float getPlayerPosY()
	{
		return player.getPositionY();
	}

	public Object getPlayerMove()
	{
		return player.getMove();
	}

	public void movePlayer(Move move)
	{
		switch (move)
		{
			case UP:
				player.moveUp();
				break;
			case DOWN:
				player.moveDown();
				break;
			case RIGHT:
				player.moveRight();
				break;
			case LEFT:
				player.moveLeft();
				break;
		}
	}
}

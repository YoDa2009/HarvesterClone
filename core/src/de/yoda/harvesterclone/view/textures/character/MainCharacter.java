package de.yoda.harvesterclone.view.textures.character;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import de.yoda.harvesterclone.model.player.Move;


/**
 * Created by yoda on 10.03.16.
 */
public class MainCharacter extends Actor
{

	private final Animation animationUp;
	private final Animation animationDown;
	private final Animation animationLeft;
	private final Animation animationRight;
	private final Animation animationStandUp;
	private final Animation animationStandDown;
	private final Animation animationStandLeft;
	private final Animation animationStandRight;
	TextureAtlas atlas;
	Move move = Move.STANDING;
	Move lastMove = Move.DOWN;
	private float stateTime = 0;

	public MainCharacter()
	{
		FileHandle internal = Gdx.files.internal("android/assets/character/main.pack");
		this.atlas = new TextureAtlas(internal);
		animationUp = new Animation(0.15f,atlas.findRegions("up"), Animation.PlayMode.NORMAL);
		animationDown = new Animation(0.15f,atlas.findRegions("down"), Animation.PlayMode.NORMAL);
		animationLeft = new Animation(0.15f,atlas.findRegions("left"), Animation.PlayMode.NORMAL);
		animationRight = new Animation(0.15f,atlas.findRegions("right"), Animation.PlayMode.NORMAL);
		animationStandUp = new Animation(0.15f,atlas.findRegions("up").first());
		animationStandDown = new Animation(0.15f,atlas.findRegions("down").first());
		animationStandLeft = new Animation(0.15f,atlas.findRegions("left").first());
		animationStandRight = new Animation(0.15f,atlas.findRegions("right").first());

	}
	public Animation getAnimtionUp()
	{
		return animationUp;
	}

	public Animation getAnimtionDown()
	{
		return animationDown;
	}
	public Animation getAnimtionLeft()
	{
		return animationLeft;
	}
	public Animation getAnimtionRight()
	{
		return animationRight;
	}

	public Animation getAnimation()
	{
		switch (move)
		{
			case DOWN:
				return animationDown;
			case LEFT:
				return animationLeft;
			case RIGHT:
				return animationRight;
			case UP:
				return  animationUp;
			case STANDING:
				return getStandingAnimation();
		}
		return animationDown;
	}

	private Animation getStandingAnimation()
	{
		switch (lastMove)
		{
			case DOWN:
				return animationStandDown;
			case LEFT:
				return animationStandLeft;
			case RIGHT:
				return animationStandRight;
			case UP:
				return  animationStandUp;
		}
		return animationStandDown;
	}

	public void setMove(Move move)
	{
		if(move != Move.STANDING)
		{
			this.lastMove = this.move;
		}
		this.move = move;
	}

	public Move getMove()
	{
		return move;
	}


}

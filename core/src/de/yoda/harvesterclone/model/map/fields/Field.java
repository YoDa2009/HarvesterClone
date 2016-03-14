package de.yoda.harvesterclone.model.map.fields;

import de.yoda.harvesterclone.model.player.Player;

/**
 * Created by YoDa on 08.03.16.
 */
public abstract class Field
{
	public boolean walkable;
	public boolean moveable;
	public Player player;

	public Field nextFieldUp;
	public Field nextFieldLeft;
	public Field nextFieldRight;
	public Field nextFieldDown;

	public Field()
	{
		this.walkable = true;
		this.moveable = false;
	}

	public Field(boolean walkable, boolean moveable)
	{
		this.walkable = walkable;
		this.moveable = moveable;
	}

	public abstract String getTextureString();

	public Player getPlayer()
	{
		return this.player;
	}

	public void setPlayer(Player player)
	{
//		if(this.player != null)
//		{
//			if(this.player.getCurrentField() != null)
//			{
//				this.player.getCurrentField().setPlayer(null);
//			}
//		}
//		this.player.setCurrentField(this);
		this.player = player;
	}

	public Field getNextFieldUp()
	{
		return nextFieldUp;
	}

	public void setNextFieldUp(Field nextFieldUp)
	{
		this.nextFieldUp = nextFieldUp;
	}

	public Field getNextFieldLeft()
	{
		return nextFieldLeft;
	}

	public void setNextFieldLeft(Field nextFieldLeft)
	{
		this.nextFieldLeft = nextFieldLeft;
	}

	public Field getNextFieldRight()
	{
		return nextFieldRight;
	}

	public void setNextFieldRight(Field nextFieldRight)
	{
		this.nextFieldRight = nextFieldRight;
	}

	public Field getNextFieldDown()
	{
		return nextFieldDown;
	}

	public void setNextFieldDown(Field nextFieldDown)
	{
		this.nextFieldDown = nextFieldDown;
	}
}

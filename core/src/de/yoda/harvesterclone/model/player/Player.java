package de.yoda.harvesterclone.model.player;


import de.yoda.harvesterclone.model.map.fields.Field;

/**
 * Created by yoda on 28.02.16.
 */
public class Player
{
	private Move move;
	private float positionX = 16f;
	private float positionY = 16f;
	private Field currentField;

	public Player()
	{
		this.move = Move.STANDING;
	}

	public void setMove(Move move)
	{
		this.move = move;
	}

	public Move getMove()
	{
		return this.move;
	}

	public float getPositionX()
	{
		return positionX;
	}

	public void setPositionX(float positionX)
	{
		this.positionX = positionX;
	}

	public float getPositionY()
	{
		return positionY;
	}

	public void setPositionY(float positionY)
	{
		this.positionY = positionY;
	}

	public void moveLeft()
	{
		this.move = Move.LEFT;
		this.positionX -=4;
	}
	public void moveRight()
	{
		this.move = Move.RIGHT;
		this.positionX +=4;
	}
	public void moveDown()
	{
		this.move = Move.DOWN;
		this.positionY -=4;
	}
	public void moveUp()
	{
		this.move = Move.UP;
		this.positionY +=4;
	}

	public Field getCurrentField()
	{
		return this.currentField;
	}

	public void setCurrentField(Field currentField)
	{
		this.currentField = currentField;
	}
}

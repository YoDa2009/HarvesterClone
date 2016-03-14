package de.yoda.harvesterclone.model.map;

import de.yoda.harvesterclone.model.map.fields.Empty;
import de.yoda.harvesterclone.model.map.fields.Field;
import de.yoda.harvesterclone.model.map.fields.Grass;
import org.json.JSONObject;

/**
 * Created by YoDa on 08.03.16.
 */
public class Map
{
	Field[][] fields;
	private int width;
	private int height;

	public Map(int width, int height)
	{
		this.width = width;
		this.height = height;
		this.fields = new Field[this.width][this.height];

	}

	public Map(int width, int height,JSONObject mapJSON)
	{
		this.width = width;
		this.height = height;
		this.fields = new Field[this.width][this.height];

	}

	public void addEmptyFieldsToMap()
	{
		for(int i = 0; i< width; i++)
		{
			for(int j = 0; j< height; j++)
			{
				fields[i][j] = new Empty();
			}
		}
	}

	public void addGrassFieldsToMap()
	{
		for(int i = 0; i< width; i++)
		{
			for(int j = 0; j< height; j++)
			{
				fields[i][j] = new Grass();
			}
		}
	}

	public Field[][] getFields()
	{
		return this.fields;
	}

	public void setFields(Field[][] fields)
	{
		this.fields = fields;
	}

	public Field getField(int x, int y)
	{
		return fields[x][y];
	}

	public int getWidth()
	{
		return width;
	}

	public void setWidth(int width)
	{
		this.width = width;
	}

	public int getHeight()
	{
		return height;
	}

	public void setHeight(int height)
	{
		this.height = height;
	}
}

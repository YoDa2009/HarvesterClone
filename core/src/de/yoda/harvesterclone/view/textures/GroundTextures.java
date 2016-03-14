package de.yoda.harvesterclone.view.textures;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g3d.particles.influencers.RegionInfluencer;

import java.util.Random;

/**
 * Created by YoDa on 01.03.16.
 */
public class GroundTextures
{
	TextureAtlas atlas;

	public GroundTextures()
	{
		FileHandle internal = Gdx.files.internal("android/assets/ground/ground.pack");
		this.atlas = new TextureAtlas(internal);
	}

	public TextureAtlas.AtlasRegion getGrass()
	{
		return this.atlas.findRegion("grass");
	}
	public TextureAtlas.AtlasRegion getFlower()
	{
		return this.atlas.findRegion("flower");
	}

	public TextureAtlas.AtlasRegion getRegionByString(String name)
	{
		return this.atlas.findRegion(name);
	}

}

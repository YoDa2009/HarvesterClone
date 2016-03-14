package de.yoda.harvesterclone.view.abstractscreen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import de.yoda.harvesterclone.HarvesterCloneImpl;
import de.yoda.harvesterclone.controller.viewcontroller.ViewController;
import de.yoda.harvesterclone.model.Log;
import de.yoda.harvesterclone.view.inputProcessor.CamInput;

/**
 * Created by YoDa on 01.03.16.
 */
public abstract class AbstractScreen implements Screen
{
	public ViewController controller;
	public boolean isMenu;
	public InputMultiplexer multiplexer;
	public Stage stage;
	public OrthographicCamera cam;
	public AbstractScreen previousScreen;
	public ScreenViewport viewport;
	BitmapFont logFont = new BitmapFont();
	CamInput camInput;
	private float delta;


	public AbstractScreen(ViewController controller)
	{
		this.controller = controller;
		this.multiplexer = (InputMultiplexer) Gdx.input.getInputProcessor();
//		this.multiplexer.clear();
		this.cam = new OrthographicCamera(1024,768);
		this.viewport = new ScreenViewport(cam);
		SpriteBatch batch = new SpriteBatch();
		this.stage = new Stage(this.viewport,batch);
		this.logFont.setColor(Color.GRAY);
		this.logFont.getData().setScale(0.9f,0.5f);
	}

	@Override
	public void show()
	{
		Log.get().log("SHOW:" + this.toString());
		if(!isMenu)
		{
			this.camInput = new CamInput(this.stage);
			this.multiplexer.addProcessor(this.camInput);
		}
	}

	@Override
	public void render(float delta)
	{
		this.delta += delta;
		Gdx.gl.glClearColor( Color.GRAY.r, Color.GRAY.g, Color.GRAY.b, Color.GRAY.a );
		Batch batch = null;
		if(this.stage != null)
		{
			batch = this.stage.getBatch();
		}
		this.cam.update();
		this.stage.draw();
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.setColor(Color.GRAY);
		renderBackground(delta,batch);
		renderLayer1(this.delta,batch);
		renderLayer2(this.delta,batch);
		renderLayer3(this.delta,batch);
		renderLayer4(this.delta,batch);
		renderLayer5(this.delta,batch);
		renderLog(this.delta,batch);
		batch.end();
	}

	private void renderLog(float delta, Batch batch)
	{
		logFont.draw(batch, Log.get().getLog(),0f+(cam.position.x*cam.zoom -(cam.viewportWidth /2)*cam.zoom),((cam.position.y* cam.zoom)+(cam.viewportHeight /2)*cam.zoom) );
	}


	protected abstract void renderLayer5(float delta, Batch batch);

	protected abstract void renderLayer4(float delta, Batch batch);

	protected abstract void renderLayer3(float delta, Batch batch);

	protected abstract void renderLayer2(float delta, Batch batch);

	protected abstract void renderLayer1(float delta, Batch batch);

	protected abstract void renderBackground(float delta, Batch batch);

	@Override
	public void resize(int width, int height)
	{

	}

	@Override
	public void pause()
	{
		Log.get().log("Pause:"+this.toString());
	}

	@Override
	public void resume()
	{

	}

	@Override
	public void hide()
	{
		Log.get().log("Hide:"+this.toString());
		this.stage.getBatch().flush();
		this.stage.clear();
	}

	@Override
	public void dispose()
	{
		this.stage.dispose();
	}
}

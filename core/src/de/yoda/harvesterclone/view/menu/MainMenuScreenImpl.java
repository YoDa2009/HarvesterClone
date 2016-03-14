package de.yoda.harvesterclone.view.menu;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.Batch;
import de.yoda.harvesterclone.controller.handler.Handler;
import de.yoda.harvesterclone.controller.view.menu.MainMenuView;
import de.yoda.harvesterclone.controller.viewcontroller.ViewController;
import de.yoda.harvesterclone.view.abstractscreen.AbstractScreen;
import de.yoda.harvesterclone.view.textures.GroundTextures;

/**
 * Created by YoDa on 28.02.16.
 */
public class MainMenuScreenImpl extends AbstractScreen implements MainMenuView
{
	private Button startButton;
	private Button exitButton;
	private GroundTextures textures;
	private Button editorButton;

	public MainMenuScreenImpl(ViewController controller)
	{
		super(controller);
		this.isMenu = true;
		this.textures = new GroundTextures();
		this.startButton = new Button("Start Game", 10,120);
		this.editorButton = new Button("Map Editor", 10,100);
		this.exitButton = new Button("Exit Game", 10,80);
	}


	@Override
	public void show()
	{

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
		this.startButton.render(batch);
		this.exitButton.render(batch);
	}

	@Override
	protected void renderBackground(float delta, Batch batch)
	{
		for(int i = 0; i <= 1024;i +=32)
		{
			for (int j = 0; j <= 768; j += 32)
			{
				batch.draw(this.textures.getGrass(), i, j);
			}
		}
	}

	@Override
	public void resize(int width, int height)
	{

	}

	@Override
	public void pause()
	{

	}

	@Override
	public void resume()
	{

	}

	@Override
	public void hide()
	{
		super.hide();
	}

	@Override
	public void dispose()
	{

	}

	@Override
	public void addStartButtonHandler(Handler handler)
	{
		this.startButton.addHandler(handler);
	}
	@Override
	public void addEditorButtonHandler(Handler handler)
	{
		this.editorButton.addHandler(handler);
	}
	@Override
	public void addExitButtonHandler(Handler handler)
	{
		this.exitButton.addHandler(handler);
	}

	@Override
	public void removeStartButtonHandler()
	{
		this.startButton.removeHandler();
	}
	@Override
	public void removeEditorButtonHandler()
	{
		this.editorButton.removeHandler();
	}
	@Override
	public void removeExitButtonHandler()
	{
		this.exitButton.removeHandler();
	}

}

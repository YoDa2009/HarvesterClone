package de.yoda.harvesterclone.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import de.yoda.harvesterclone.HarvesterCloneImpl;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.fullscreen = false;
		config.resizable = false;
//		config.x = 1024;
//		config.y = 768;
		config.width = 1024;
		config.height = 768;


		new LwjglApplication(new HarvesterCloneImpl(true), config);
	}
}

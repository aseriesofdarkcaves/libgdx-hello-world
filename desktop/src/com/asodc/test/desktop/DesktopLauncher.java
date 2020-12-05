package com.asodc.test.desktop;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.asodc.test.LibgdxHelloWorld;

/**
 * So this is the main entry point for launching the Desktop app.
 */
public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		LwjglApplication myApp = new LwjglApplication(new LibgdxHelloWorld(), config);

		// messing about
		myApp.setLogLevel(Application.LOG_DEBUG);
		myApp.debug("DEBUG", "The application should now be running...");
	}
}

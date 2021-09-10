package com.asodc.test.desktop;

import com.asodc.test.LibgdxHelloWorld;
import com.badlogic.gdx.Application;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

/**
 * So this is the main entry point for launching the Desktop app.
 */
public class DesktopLauncher {
    public static void main(String[] arg) {
        // ***** LwjglApplicationConfiguration *****
        // this is the auto-generated code...
        // this class doesn't offer anything other than the default constructor - probably ok
        // I'm getting the feeling writing libgdx client code is a lesson in unlearning most things I thought I knew...
        // I suppose you only need a reference to this if you're going to change it?
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

        // fields are public so I assume the idea is to manipulate them...

        // fairly self-explanitory
//		config.addIcon();

        // returns an array of the supported display modes
//		Graphics.DisplayMode[] displayModes = config.getDisplayModes();
        // the returned object is static, so should probably be doing this?
//        Graphics.DisplayMode[] displayModes = LwjglApplicationConfiguration.getDisplayModes();

        // gets the currently configured display mode
//		Graphics.DisplayMode displayMode = config.getDesktopDisplayMode();
        // the returned object is static, so should probably be doing this?
//        Graphics.DisplayMode displayMode = LwjglApplicationConfiguration.getDesktopDisplayMode();

        // makes sense that you would plop one of the display modes from above in here
        // I guess the idea is to allow a user to configure the application?
//        config.setFromDisplayMode(displayMode);

        // ***** LwjglApplication *****
        // The auto-generated code didn't initialise an object reference
        // I just did it to access the fields/methods
        // actually the fields in this class seem to use encapsulation
        LwjglApplication myApp = new LwjglApplication(new LibgdxHelloWorld(), config);

        // do various things
        myApp.setLogLevel(Application.LOG_DEBUG);
        myApp.debug("DEBUG", "The application should now be running...");
        myApp.getGraphics().setTitle("LibgdxHelloWorld");
    }
}

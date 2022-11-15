package it.unibo.mvc;

import java.io.File;


/**
 * Application controller. Performs the I/O.
 */
public class Controller {

    public static String HOME = System.getProperty("user.home");
    public static String SEP = System.getProperty("file.separator");

    private File current;

    public Controller(){
        this.current = new File(HOME + SEP + "output.txt");
    }


    public void setCurrentFile (File f) {
        this.current = f;
    }

}

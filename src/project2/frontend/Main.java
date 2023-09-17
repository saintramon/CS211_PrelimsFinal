package project2.frontend;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * @author ROXAS, LACANILAO, JASMIN, TANK
 * @version 1.00 (16 September 2023)
 * Template for object Main.
 * This class contains the main graphical user-interface of the program
 */
public class Main {
    private final Resources resources = new Resources();

    /**
     * Main entry point of the program.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Main main;
        try {
            main = new Main();
            main.run(); // runs backend code
            new LoginForm(); // invokes login form components
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
        } // end of try-catch
    } // end of main method

    /**
     * Invokes the backend code.
     */
    private void run() {
        resources.loadFonts();
        // TODO: Supporting methods/code.
    } // end of run method
} // end of class Main
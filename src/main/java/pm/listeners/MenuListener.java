package pm.listeners;

import ucd.comp2011j.engine.MenuCommands;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
This class is used to control the keys that need to be pressed in the menu screen, about screen and score screen
 */
public class MenuListener implements MenuCommands, KeyListener {
    private boolean ifNewGame; //enter the game screen
    private boolean ifAbout; // enter the about screen
    private boolean ifHighScore; // enter the score screen
    private boolean ifExit; // save and exit the game
    private boolean ifMenu; // return to the menu screen


    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyChar() == 'n' || e.getKeyChar() == 'N') {
            ifNewGame = true;
        } else if (e.getKeyChar() == 'a' || e.getKeyChar() == 'A') {
            ifAbout = true;
        } else if (e.getKeyChar() == 'h' || e.getKeyChar() == 'H') {
            ifHighScore = true;
        } else if (e.getKeyChar() == 'x' || e.getKeyChar() == 'X') {
            ifExit = true;
        }
        if (e.getKeyChar() == 'm' || e.getKeyChar() == 'M') {
            ifMenu = true;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public boolean hasPressedNewGame() {
        return ifNewGame;
    }

    @Override
    public boolean hasPressedAboutScreen() {
        return ifAbout;
    }

    @Override
    public boolean hasPressedHighScoreScreen() {
        return ifHighScore;
    }

    @Override
    public boolean hasPressedExit() {
        return ifExit;
    }

    @Override
    public boolean hasPressedMenu() {
        return ifMenu;
    }

    @Override
    public void resetKeyPresses() {
        ifNewGame = false;
        ifAbout = false;
        ifHighScore = false;
        ifExit = false;
        ifMenu = false;
    }
}

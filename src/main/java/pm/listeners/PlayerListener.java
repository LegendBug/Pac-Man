package pm.listeners;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
This class is used to control the keys that need to be pressed in the game screen
 */
public class PlayerListener implements KeyListener {
    private boolean ifUp; // control the player to move up
    private boolean ifDown; // control the player to move down
    private boolean ifRight; // control the player to move right
    private boolean ifLeft; // control the player to move left
    private boolean ifPause; // control game pause or start
    private boolean ifSkip; // control to skip the current level

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyChar() == 'p' || e.getKeyChar() == 'P') {
            ifPause = true;
        }
        if (e.getKeyChar() == 's' || e.getKeyChar() == 'S') {
            ifSkip = true;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_UP -> ifUp = true;
            case KeyEvent.VK_DOWN -> ifDown = true;
            case KeyEvent.VK_RIGHT -> ifRight = true;
            case KeyEvent.VK_LEFT -> ifLeft = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_UP -> ifUp = false;
            case KeyEvent.VK_DOWN -> ifDown = false;
            case KeyEvent.VK_RIGHT -> ifRight = false;
            case KeyEvent.VK_LEFT -> ifLeft = false;
        }
    }

    public boolean isPressingUp() {
        return ifUp;
    }

    public boolean isPressingDown() {
        return ifDown;
    }

    public boolean isPressingRight() {
        return ifRight;
    }

    public boolean isPressingLeft() {
        return ifLeft;
    }

    public boolean hasPressedPause() {
        return ifPause;
    }

    public boolean hasPressedSkip() {
        return ifSkip;
    }

    public void resetPause() {
        ifPause = false;
    }

    public void resetSkip() {
        ifSkip = false;
    }
}

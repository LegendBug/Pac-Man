package pm;

import pm.listeners.MenuListener;
import pm.listeners.PlayerListener;
import pm.models.PacManGame;
import pm.states.AboutScreen;
import pm.states.GameScreen;
import pm.states.MenuScreen;
import pm.states.ScoreScreen;
import pm.tools.TextReader;
import ucd.comp2011j.engine.GameManager;
import ucd.comp2011j.engine.ScoreKeeper;

import javax.swing.*;
import java.awt.*;

/**
 * Initialize the game window and start the game
 */
public class ApplicationStart {
    public static void main(String[] args) {
        JFrame window = new JFrame("Pac-Man Game");
        PlayerListener playerListener = new PlayerListener();
        MenuListener menuListener = new MenuListener();
        window.addKeyListener(playerListener);
        window.addKeyListener(menuListener);
        PacManGame game = new PacManGame(playerListener);
        MenuScreen menuScreen = new MenuScreen();
        AboutScreen aboutScreen = new AboutScreen();
        ScoreKeeper scoreKeeper = new ScoreKeeper("src/main/resources/scores.txt");
        ScoreScreen scoreScreen = new ScoreScreen(scoreKeeper);
        GameScreen gameScreen = new GameScreen(game);

        GameManager manager = new GameManager(game, window, menuListener, menuScreen, aboutScreen, scoreScreen, gameScreen, scoreKeeper);

        window.setVisible(true);
        Insets insets = window.getInsets(); // Get the values of the window border
        window.setSize(PacManGame.SCREEN_WIDTH + insets.left + insets.right,
                PacManGame.SCREEN_HEIGHT + insets.top + insets.bottom);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setResizable(false);

        manager.run();
    }
}

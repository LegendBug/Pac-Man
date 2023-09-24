package pm.states;

import pm.models.PacManGame;
import pm.tools.GraphPainter;

import javax.swing.*;
import java.awt.*;

/**
 * This class is used to draw components on menu screen
 */
public class MenuScreen extends JPanel {

    private void drawString(Graphics g) {
        // title
        GraphPainter.drawString(g, "Pac-Man", "Showcard Gothic", 1, 120, Color.WHITE, 1,
                new Rectangle(PacManGame.SCREEN_WIDTH / 3 - 2, PacManGame.SCREEN_HEIGHT * 200 / 960 - 2, PacManGame.SCREEN_WIDTH / 3, PacManGame.SCREEN_HEIGHT * 100 / 960));
        GraphPainter.drawString(g, "Pac-Man", "Showcard Gothic", 1, 120, Color.WHITE, 1,
                new Rectangle(PacManGame.SCREEN_WIDTH / 3 + 4, PacManGame.SCREEN_HEIGHT * 200 / 960 + 4, PacManGame.SCREEN_WIDTH / 3, PacManGame.SCREEN_HEIGHT * 100 / 960));
        GraphPainter.drawString(g, "Pac-Man", "Showcard Gothic", 1, 120, new Color(255, 130, 0), 1,
                new Rectangle(PacManGame.SCREEN_WIDTH / 3, PacManGame.SCREEN_HEIGHT * 200 / 960, PacManGame.SCREEN_WIDTH / 3, PacManGame.SCREEN_HEIGHT * 100 / 960));
        // options
        GraphPainter.drawString(g, "New Game ('N')", "Courier New", 1, 45, Color.WHITE, 0,
                new Rectangle(PacManGame.SCREEN_WIDTH / 3, PacManGame.SCREEN_HEIGHT * 400 / 960, PacManGame.SCREEN_WIDTH / 3, PacManGame.SCREEN_HEIGHT * 80 / 960));
        GraphPainter.drawString(g, "Help ('A')", "Courier New", 1, 45, Color.WHITE, 0,
                new Rectangle(PacManGame.SCREEN_WIDTH / 3, PacManGame.SCREEN_HEIGHT * 480 / 960, PacManGame.SCREEN_WIDTH / 3, PacManGame.SCREEN_HEIGHT * 80 / 960));
        GraphPainter.drawString(g, "Top10 ('H')", "Courier New", 1,50, Color.WHITE, 0,
                new Rectangle(PacManGame.SCREEN_WIDTH / 3, PacManGame.SCREEN_HEIGHT * 560 / 960, PacManGame.SCREEN_WIDTH / 3, PacManGame.SCREEN_HEIGHT * 80 / 960));
        GraphPainter.drawString(g, "Exit ('X')", "Courier New", 1, 45, Color.WHITE, 0,
                new Rectangle(PacManGame.SCREEN_WIDTH / 3, PacManGame.SCREEN_HEIGHT * 640 / 960, PacManGame.SCREEN_WIDTH / 3, PacManGame.SCREEN_HEIGHT * 80 / 960));
    }

    private void drawBackground(Graphics g) {
        // background
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, PacManGame.SCREEN_WIDTH, PacManGame.SCREEN_HEIGHT);
        // title box
        g.setColor(new Color(255, 140, 80));
        g.fillOval(PacManGame.SCREEN_WIDTH / 7, PacManGame.SCREEN_HEIGHT * 125 / 960, 40, 40);
        g.fillOval(PacManGame.SCREEN_WIDTH * 6 / 7 - 40, PacManGame.SCREEN_HEIGHT * 125 / 960, 40, 40);
        g.fillOval(PacManGame.SCREEN_WIDTH / 7, PacManGame.SCREEN_HEIGHT * 125 / 960 + 160, 40, 40);
        g.fillOval(PacManGame.SCREEN_WIDTH * 6 / 7 - 40, PacManGame.SCREEN_HEIGHT * 125 / 960 + 160, 40, 40);
        g.fillRect(PacManGame.SCREEN_WIDTH / 7, PacManGame.SCREEN_HEIGHT * 125 / 960 + 20, PacManGame.SCREEN_WIDTH * 5 / 7, PacManGame.SCREEN_HEIGHT * 200 / 960 - 40);
        g.fillRect(PacManGame.SCREEN_WIDTH / 7 + 20, PacManGame.SCREEN_HEIGHT * 125 / 960, PacManGame.SCREEN_WIDTH * 5 / 7 - 40, PacManGame.SCREEN_HEIGHT * 200 / 960);
    }

    public void paintComponent(Graphics g) {
        drawBackground(g);
        drawString(g);
    }
}
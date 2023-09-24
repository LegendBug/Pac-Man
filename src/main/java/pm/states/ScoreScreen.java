package pm.states;


import pm.models.PacManGame;
import pm.tools.GraphPainter;
import ucd.comp2011j.engine.Score;
import ucd.comp2011j.engine.ScoreKeeper;

import javax.swing.*;
import java.awt.*;

public class ScoreScreen extends JPanel {
    private final ScoreKeeper scoreKeeper;
    private Score[] scores;

    public ScoreScreen(ScoreKeeper scoreKeeper) {
        this.scoreKeeper = scoreKeeper;
        scores = scoreKeeper.getScores();
    }

    private void drawBackground(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, PacManGame.SCREEN_WIDTH, PacManGame.SCREEN_HEIGHT);
    }

    private void drawString(Graphics g) {
        GraphPainter.drawString(g, "Pac-Man Top 10 Players", "Courier New", 1, 45, Color.RED, 1,
                new Rectangle(PacManGame.SCREEN_WIDTH / 3, PacManGame.SCREEN_HEIGHT * 100 / 960, PacManGame.SCREEN_WIDTH / 3, PacManGame.SCREEN_HEIGHT * 80 / 960));
        scores = scoreKeeper.getScores();
        for (int i = 0; i < 10; i++) {
            Score score = scores[i];
            GraphPainter.drawString(g, score.getName(), "Courier New", 1, 45, Color.WHITE, 0,
                    new Rectangle(PacManGame.SCREEN_WIDTH * 250 / 960, PacManGame.SCREEN_HEIGHT * 50 * i / 960 + 200,PacManGame.SCREEN_WIDTH / 6, PacManGame.SCREEN_HEIGHT * 80 / 960));
            GraphPainter.drawString(g, score.getScore() + "", "Courier New", 1, 45, Color.WHITE, 2,
                    new Rectangle(PacManGame.SCREEN_WIDTH * 550 / 960, PacManGame.SCREEN_HEIGHT * 50 * i / 960 + 200,PacManGame.SCREEN_WIDTH / 6, PacManGame.SCREEN_HEIGHT * 80 / 960));
        GraphPainter.drawString(g, "Press 'M' to return to the Main Menu", "Courier New", 1, 30, Color.WHITE, 1,
                new Rectangle(PacManGame.SCREEN_WIDTH / 3, PacManGame.SCREEN_HEIGHT * 750 / 960, PacManGame.SCREEN_WIDTH / 3, PacManGame.SCREEN_HEIGHT * 80 / 960));
        }
    }

    public void paintComponent(Graphics g) {
        drawBackground(g);
        drawString(g);
    }
}

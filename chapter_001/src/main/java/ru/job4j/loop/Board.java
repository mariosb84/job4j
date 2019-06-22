package ru.job4j.loop;
/**
 * Board.
 */
public class Board {
    /**
     * Build a chessboard.
     * @param  width - shirina  , height - visota.
     * @return lines.
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // condition check what to write space or X
                // Above in the assignment, we defined the pattern when it is necessary to affix X
                if ((i + j) % 2 == 0) {
                    screen.append("x");
                } else {
                    screen.append(" ");
                }
            }
            // add newline translation.
            screen.append(ln);
        }
        return screen.toString();
    }
}
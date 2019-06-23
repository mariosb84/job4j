package ru.job4j.loop;
/**
 * Pyramid.
 */
public class Paint {
    /**
     * Build the pyramid on the right.
     * @param  height - visota.
     * @return lines.
     */
    public String rightTrl(int height) {
        // Result buffer.
        StringBuilder screen = new StringBuilder();
        // width will be equal to height.
        int width = height;
        // outer loop moves in rows.
        for (int row = 0; row != height; row++) {
            // inner loop determines the position of the cell in the row.
            for (int column = 0; column != width; column++) {
                // if the string is equal to the cell, then draw a daw.
                // in this case, the line determines how many checkboxes will be in the line.
                if (row >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            // add line feed.
            screen.append(System.lineSeparator());
        }
        // We get the result.
        return screen.toString();
    }
    /**
     * Build the pyramid on the left.
     * @param  height - visota.
     * @return lines.
     */
    public String leftTrl(int height) {
        StringBuilder screen = new StringBuilder();
        int width = height;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != width; column++) {
                if (row >= width - column - 1) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
    /**
     * Build the whole pyramid.
     * @param  height - visota.
     * @return lines.
     */
    public String pyramid(int height) {
        StringBuilder screen = new StringBuilder();
        int width = 2 * height - 1;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != width; column++) {
                if (row >= height - column - 1 && row + height - 1 >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}
public final class Board {

    private static Square[][] squares = new Square[3][3];

    public static void buildBoard() {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                squares[r][c] = new Square();
            }
        }
    }

    public static String showState() {
        StringBuilder sb = new StringBuilder();

        sb.append("+---+---+---+\n");
        for (int r = 0; r < 3; r++) {
            sb.append("|");
            for (int c = 0; c < 3; c++) {
                if (!squares[r][c].getIsOccupied()) {
                    sb.append("   |");
                } else {
                    sb.append(" ");
                    sb.append(squares[r][c].toString());
                    sb.append(" |");
                }
            }
            sb.append("\n+---+---+---+\n");
        }

        return sb.toString();
    }
}

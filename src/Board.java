public final class Board {

    private static char[][] squares = new char[3][3];

    private Board() { }

    public static boolean updateState(int r, int c, char token) {
        if (isSquareOccupied(r, c)) {
            return false;
        }
        squares[r][c] = token;
        return true;
    }

    public static void display() {
        System.out.println("+---+---+---+");
        for (int r = 0; r < 3; r++) {
            System.out.print("|");
            for (int c = 0; c < 3; c++) {
                if (!isSquareOccupied(r, c)) {
                    System.out.print("   |");
                } else {
                    System.out.printf(" %c |", squares[r][c]);
                }
            }
            System.out.println("");
            System.out.println("+---+---+---+");
        }
    }

    public static boolean isOver() {
        if (checkHorizontal() || checkVertical() || checkDiagonal()) {
            return true;
        }
        return false;
    }

    private static boolean isSquareOccupied(int r, int c) {
        if (squares[r][c] == '\u0000') {
            return false;
        }
        return true;
    }

    private static boolean checkHorizontal() {
        for (int r = 0; r < 3; r++) {
            if (squares[r][0] == squares[r][1] && squares[r][0] == squares[r][2]) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkVertical() {
        for (int c = 0; c < 3; c++) {
            if (squares[0][c] == squares[1][c] && squares[0][c] == squares[2][c]) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkDiagonal() {
        if (squares[0][0] == squares[1][1] && squares[0][0] == squares[2][2] ||
                squares[0][2] == squares[1][1] && squares[0][2] == squares[2][1]) {
            return true;
        }
        return false;
    }
}

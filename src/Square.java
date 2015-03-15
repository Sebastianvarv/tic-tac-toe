public class Square {

    private char token;
    private boolean isOccupied = false;

    public Square() {
        super();
    }

    public Square(char token) {
        this.token = token;
        this.isOccupied = true;
    }

    public boolean getIsOccupied() {
        return isOccupied;
    }

    public String toString() {
        return Character.toString(token);
    }
}
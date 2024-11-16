package src.Pieces;

public abstract class Piece {

    private String color;

    protected Piece(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void goTo(Integer endX, Integer endY) {
    }
}

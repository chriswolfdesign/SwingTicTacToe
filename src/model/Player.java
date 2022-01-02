package model;

public enum Player {
    X("X"),
    O("O"),
    NONE(" ");

    private final String label;

    private Player(String label) {
        this.label = label;
    }

    public String getRepresentation() {
        return this.label;
    }
}

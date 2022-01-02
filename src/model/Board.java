package model;

import settings.BoardSettings;

public class Board {
    private final Player[][] tiles;

    public Board() {
        this.tiles = new Player[BoardSettings.BOARD_SIZE][BoardSettings.BOARD_SIZE];

        initializeTiles();
    }

    private void initializeTiles() {
        for (int i = 0; i < BoardSettings.BOARD_SIZE; i++) {
            for (int j = 0; j < BoardSettings.BOARD_SIZE; j++) {
                this.tiles[i][j] = Player.NONE;
            }
        }
    }

    public int emptySquares() {
        int counter = 0;
        for (int i = 0; i < BoardSettings.BOARD_SIZE; i++) {
            for (int j = 0; j < BoardSettings.BOARD_SIZE; j++) {
                if (tiles[i][j] == Player.NONE) {
                    counter++;
                }
            }
        }

        return counter;
    }

    public void setPlayerAt(int row, int col, Player player) {
        this.tiles[row][col] = player;
    }

    public Player getPlayerAt(int row, int col) {
        return this.tiles[row][col];
    }
}

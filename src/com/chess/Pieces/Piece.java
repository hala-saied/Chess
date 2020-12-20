package com.chess.Pieces;

public abstract class Piece {
    private final int black = 0;
    private final int white = 1;
    private final int color; // 0 for black, 1 for white
    private int x;
    private int y;// Position
    private boolean isFirstMove;

    public Piece(int x, int y, final int color, boolean isFirstMove){
        this.x = x;
        this.y = y;
        this.color = color;
        this.isFirstMove = isFirstMove;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public boolean isFirstMove() {
        return isFirstMove;
    }

    // TODO add isValidMove, move body

    public abstract boolean isValidMove(int xPos, int yPos);
    public abstract void move(int xPos, int yPos);

    public void removePiece(Piece piece) //
    {
        this.x = -1;
        this.y = -1;
    }
}

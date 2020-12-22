package com.chess.Game;

import com.chess.Pieces.Piece;

public class Spot {
    private final int x;
    private final int y;
    private boolean empty;
    private Piece piece;

    public Spot(final int x, final int y)
    {
        this.x = x;
        this.y = y;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public boolean isEmpty()
    {
        return empty;
    }
    public void insertPiece(Piece piece)
    {
        empty = false;
        this.piece = piece;
    }
    public void removePiece()
    {
        empty = true;
        piece = null;
    }
    public Piece getPiece()
    {
        return piece;
    }
}

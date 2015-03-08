/*
 * Copyright (c) 2008-2014 Maxifier Ltd. All Rights Reserved.
 */
package tetris;

import java.util.List;

/**
 * GameState
 *
 * @author Nikita Glashenko (nikita.glashenko@maxifier.com) (2014-11-22 17:31)
 */
public class GameState {
    private final Board board;
    private final List<Tetrimino> nextTetriminoes;
    private final TetriminoWithPosition fallingTetrimino;

    public GameState(Board board, TetriminoWithPosition fallingTetrimino, List<Tetrimino> nextTetriminoes) {
        this.board = board;
        this.nextTetriminoes = nextTetriminoes;
        this.fallingTetrimino = fallingTetrimino;
    }

    public Board getBoard() {
        return board;
    }

    public List<Tetrimino> getNextTetriminoes() {
        return nextTetriminoes;
    }

    public TetriminoWithPosition getFallingTetrimino() {
        return fallingTetrimino;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GameState gameState = (GameState) o;

        if (!board.equals(gameState.board)) return false;
        if (fallingTetrimino != null ? !fallingTetrimino.equals(gameState.fallingTetrimino) : gameState.fallingTetrimino != null)
            return false;
        if (!nextTetriminoes.equals(gameState.nextTetriminoes)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = board.hashCode();
        result = 31 * result + nextTetriminoes.hashCode();
        result = 31 * result + (fallingTetrimino != null ? fallingTetrimino.hashCode() : 0);
        return result;
    }
}
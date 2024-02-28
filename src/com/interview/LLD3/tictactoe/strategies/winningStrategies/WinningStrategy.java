package com.interview.LLD3.tictactoe.strategies.winningStrategies;


import com.interview.LLD3.tictactoe.models.Board;
import com.interview.LLD3.tictactoe.models.Move;

public interface WinningStrategy {
    boolean checkWinner(Board board, Move finalMove);

    void handleUndo(Board board, Move lastMove);
}

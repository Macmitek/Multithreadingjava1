package com.interview.LLD3.tictactoe.strategies.botPlayingStrategies;



import com.interview.LLD3.tictactoe.models.Board;
import com.interview.LLD3.tictactoe.models.Cell;
import com.interview.LLD3.tictactoe.models.CellState;
import com.interview.LLD3.tictactoe.models.Move;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Move makeMove(Board board) {
        for (List<Cell> row : board.getBoard()) {
            for (Cell cell: row) {
                if (cell.getCellState().equals(CellState.EMPTY)) {
                    return new Move(cell, null);
                }
            }
        }
        return null;
    }
}

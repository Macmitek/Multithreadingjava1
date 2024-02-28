package com.interview.LLD3.tictactoe.strategies.botPlayingStrategies;


import com.interview.LLD3.tictactoe.models.Board;
import com.interview.LLD3.tictactoe.models.Move;

public interface BotPlayingStrategy {
    Move makeMove(Board board);
}

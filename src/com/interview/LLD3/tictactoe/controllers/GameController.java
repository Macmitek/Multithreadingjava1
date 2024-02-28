package com.interview.LLD3.tictactoe.controllers;

import com.interview.LLD3.tictactoe.exceptions.DuplicateSymbolException;
import com.interview.LLD3.tictactoe.exceptions.MoreThanOneBotException;
import com.interview.LLD3.tictactoe.exceptions.PlayersCountDimensionMismatchException;
import com.interview.LLD3.tictactoe.models.Game;
import com.interview.LLD3.tictactoe.models.GameState;
import com.interview.LLD3.tictactoe.models.Player;
import com.interview.LLD3.tictactoe.strategies.winningStrategies.WinningStrategy;

import java.util.List;

public class GameController {
    public Game createGame(int size, List<Player> players, List<WinningStrategy> winningStrategies) throws DuplicateSymbolException, PlayersCountDimensionMismatchException, MoreThanOneBotException {
        return Game.getBuilder()
                .setSize(size)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();

    }
    public void startGame(Game game) {

    }

    public void displayBoard(Game game) {
        game.displayBoard();
    }

    public void makeMove(Game game) {
        game.makeMove();
    }

    public void undo(Game game) {
        game.undo();
    }

    public GameState checkState(Game game) {
        return game.getState();
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }
}

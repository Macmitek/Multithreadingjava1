package com.interview.LLD3.tictactoe;

import com.interview.LLD3.tictactoe.controllers.GameController;
import com.interview.LLD3.tictactoe.exceptions.DuplicateSymbolException;
import com.interview.LLD3.tictactoe.exceptions.MoreThanOneBotException;
import com.interview.LLD3.tictactoe.exceptions.PlayersCountDimensionMismatchException;
import com.interview.LLD3.tictactoe.models.*;
import com.interview.LLD3.tictactoe.strategies.winningStrategies.ColumnWinningStrategy;
import com.interview.LLD3.tictactoe.strategies.winningStrategies.DiagonalWinningStrategy;
import com.interview.LLD3.tictactoe.strategies.winningStrategies.RowWinningStrategy;
import com.interview.LLD3.tictactoe.strategies.winningStrategies.WinningStrategy;

import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws DuplicateSymbolException, PlayersCountDimensionMismatchException, MoreThanOneBotException {
        GameController gameController = new GameController();

        Scanner scanner = new Scanner (System.in);
        int size = 3;
        List<Player> players = List.of(
                new Player(1L, "Mitesh", new Symbol('X'), PlayerType.HUMAN),
                new Bot(2L, "AI", new Symbol('O'), BotDifficultyLevel.HARD)
        );

        List<WinningStrategy> winningStrategies = List.of(new RowWinningStrategy(), new ColumnWinningStrategy(), new DiagonalWinningStrategy());
        Game game = gameController.createGame(size, players, winningStrategies);

        System.out.println("Game is starting");
        gameController.startGame(game);

        while(gameController.checkState(game).equals(GameState.IN_PROGRESS)) {
            gameController.displayBoard(game);

            System.out.println("Do you want to undo? (y/n)");
            String undoInput = scanner.next();
            if(undoInput.equalsIgnoreCase("y")) {
                gameController.undo(game);
                continue;
            }

            gameController.makeMove(game);
        }
        gameController.displayBoard(game);
        if (gameController.checkState(game).equals(GameState.DRAW)) {
            System.out.println("Game has drawn");
        } else {
            System.out.println("Game has finished and the winner is: " + gameController.getWinner(game).getName());
        }
    }
}

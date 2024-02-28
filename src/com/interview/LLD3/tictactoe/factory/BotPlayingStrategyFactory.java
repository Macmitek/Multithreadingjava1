package com.interview.LLD3.tictactoe.factory;


import com.interview.LLD3.tictactoe.models.BotDifficultyLevel;
import com.interview.LLD3.tictactoe.strategies.botPlayingStrategies.BotPlayingStrategy;
import com.interview.LLD3.tictactoe.strategies.botPlayingStrategies.EasyBotPlayingStrategy;
import com.interview.LLD3.tictactoe.strategies.botPlayingStrategies.HardBotPlayingStrategy;
import com.interview.LLD3.tictactoe.strategies.botPlayingStrategies.MediumBotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategyUsingDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        return switch (botDifficultyLevel) {
            case EASY -> new EasyBotPlayingStrategy();
            case MEDIUM -> new MediumBotPlayingStrategy();
            case HARD -> new HardBotPlayingStrategy();
        };
    }
}

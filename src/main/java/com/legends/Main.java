package com.legends;

import com.legends.game.Game;
import com.legends.game.QuitGameException;
import com.legends.io.ConsoleInput;
import com.legends.io.ConsoleOutput;

public class Main {
    public static void main(String[] args) {
        try {
            Game game = new Game(new ConsoleInput(), new ConsoleOutput());
            game.init();
            game.start();
        } catch (QuitGameException e) {
            System.out.println("\n" + e.getMessage());
            System.out.println("Goodbye!");
        }
    }
}

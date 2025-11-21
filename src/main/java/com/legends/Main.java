package com.legends;

import com.legends.game.Game;
import com.legends.io.ConsoleInput;
import com.legends.io.ConsoleOutput;

public class Main {
    public static void main(String[] args) {
        Game game = new Game(new ConsoleInput(), new ConsoleOutput());
        game.init();
        game.start();
    }
}

package com.legends.io;

import java.util.Scanner;
import com.legends.game.QuitGameException;

public class ConsoleInput implements Input {
    private Scanner scanner;

    public ConsoleInput() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public String readLine() {
        String line = scanner.nextLine();
        if (line != null && line.trim().equalsIgnoreCase("q")) {
            throw new QuitGameException("Player quit the game.");
        }
        return line;
    }
}

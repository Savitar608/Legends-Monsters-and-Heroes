package com.legends.io;

public class ConsoleOutput implements Output {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    @Override
    public void print(Object s) {
        System.out.print(s);
    }

    @Override
    public void println(Object s) {
        System.out.println(s);
    }

    @Override
    public void println() {
        System.out.println();
    }

    @Override
    public void printError(Object s) {
        System.err.println(s);
    }

    @Override
    public void printlnGreen(Object s) {
        System.out.println(ANSI_GREEN + s + ANSI_RESET);
    }

    @Override
    public void printlnRed(Object s) {
        System.out.println(ANSI_RED + s + ANSI_RESET);
    }
}

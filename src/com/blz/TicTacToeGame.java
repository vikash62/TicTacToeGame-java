package com.blz;

import java.util.Scanner;

public class TicTacToeGame {
    public static char inputUser;
    public static char inputC;

    public static void main(String[] args) {
        char[] board = new char[10];
        for (int i = 1; i < 10; i++) {
            board[i] = ' ';
        }
        char inputUser = input();
        if (inputUser == 'X') {
            inputC = 'O';
        } else {
            inputC = 'X';
        }
    }

    public static char input() {
        System.out.println("Please enter your input in X / O");
        Scanner in = new Scanner(System.in);
        char inputU = in.next().charAt(0);
        return inputU;
    }
}
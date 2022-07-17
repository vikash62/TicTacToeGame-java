package com.blz;

import java.util.Scanner;

public class TicTacToeGame {
    public static char inputUser;
    public static char inputC;
    public static char[] board = new char[10];

    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            board[i] = ' ';
        }
        inputUser = input();
        if (inputUser == 'X') {
            inputC = 'O';
        } else {
            inputC = 'X';
        }
        TicTacToeGame.showBoard();
        TicTacToeGame.uSelection();
        TicTacToeGame.showBoard();
    }

    public static char input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your input in X / O");
        char inputU = in.next().charAt(0);
        return inputU;
    }

    public static void showBoard() {
        System.out.println("TicTacToe Board");
        System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
        System.out.println("---------");
        System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println("---------");
        System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
    }

    public static void uSelection() {
        System.out.println("Please enter the index from 1 to 9 to make the move");
        Scanner in1 = new Scanner(System.in);
        int select = in1.nextInt();
        for (int i = 1; i < 10; i++) {
            if (board[select] == ' ') {
                board[select] = inputUser;
            }
        }
    }
}
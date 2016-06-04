package com.company;

import java.util.Scanner;

public class Main {

    static char[][] labyrinth;

    static boolean moveThroughTheLabyrinth(int row, int column) {
        if (labyrinth[row][column] == '!') return true;

        labyrinth[row][column] = '.';
        if (row - 1 >= 0 && (labyrinth[row-1][column] == ' ' || labyrinth[row-1][column] == '!')) {
            return moveThroughTheLabyrinth(row - 1, column);
        }
        if (column + 1 < labyrinth[row].length && (labyrinth[row][column+1] == ' ' || labyrinth[row][column+1] == '!')) {
            return moveThroughTheLabyrinth(row, column + 1);
        }
        if (row + 1 < labyrinth.length && (labyrinth[row + 1][column] == ' ' || labyrinth[row + 1][column] == '!')) {
            return moveThroughTheLabyrinth(row + 1, column);
        }
        if (column - 1 >= 0 && (labyrinth[row][column - 1] == ' ' || labyrinth[row][column - 1] == '!')) {
            return moveThroughTheLabyrinth(row, column - 1);
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int verticalSize = scanner.nextInt();
        int horizontalSize = scanner.nextInt();
        scanner.nextLine();

        labyrinth = new char[verticalSize][horizontalSize];

        for (int i = 0; i < verticalSize; i++) {
            labyrinth[i] = scanner.nextLine().toCharArray();
        }

        if (moveThroughTheLabyrinth(0, 0)) {
            System.out.println("The treasure was found!");
        } else {
            System.out.println("The treasure wan't found :(");
        }

        for (int i = 0; i < verticalSize; i++) {
            for (int j = 0; j < horizontalSize; j++) {
                System.out.print(labyrinth[i][j]);
            }
            System.out.println();
        }
    }
}
//  ## !
//#  # #
//## # #
//##   #
//######

//
// ###
// # #
// ###

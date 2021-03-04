package rocks.zipcodewilmington.tictactoe;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Arrays;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    char x = 'X';
    char o = 'O';
    char hold;
    /*String threeX = "XXX";
    String threeO = "OOO";*/
    String winner = "";
    public Board(Character[][] matrix) {
        //X wins rows
        if (matrix[0][0] == hold && matrix[0][1] == hold && matrix[0][2] == hold) {
            if (hold == x) {
                winner = winner.concat("X");
            } else if(hold == o) {
                winner = winner.concat("O");
            }
        } else if (matrix[1][0] == hold && matrix[1][1] == hold && matrix[1][2] == hold) {
            if (hold == x) {
                winner = winner.concat("X");
            } else if(hold == o) {
                winner = winner.concat("O");
            }
        } else if (matrix[2][0] == hold && matrix[2][1] == hold && matrix[2][2] == hold) {
            if (hold == x) {
                winner = winner.concat("X");
            } else if(hold == o) {
                winner = winner.concat("O");
            }
        }
        //X wins columns
        else if (matrix[0][0] == hold && matrix[1][0] == hold && matrix[2][0] == hold) {
            if (hold == x) {
                winner = winner.concat("X");
            } else if(hold == o) {
                winner = winner.concat("O");
            }
        } else if (matrix[0][1] == hold && matrix[1][1] == hold && matrix[2][1] == hold) {
            if (hold == x) {
                winner = winner.concat("X");
            } else if(hold == o) {
                winner = winner.concat("O");
            }
        } else if (matrix[0][2] == hold && matrix[1][2] == hold && matrix[2][2] == hold) {
            if (hold == x) {
                winner = winner.concat("X");
            } else if(hold == o) {
                winner = winner.concat("O");
            }
        }
        //X wins diagonal
        else if (matrix[0][0] == hold && matrix[1][1] == hold && matrix[2][2] == hold) {
            if (hold == x) {
                winner = winner.concat("X");
            } else if(hold == o) {
                winner = winner.concat("O");
            }
        }else if (matrix[0][2] == hold && matrix[1][1] == hold && matrix[2][0] == hold) {
            if (hold == x) {
                winner = winner.concat("X");
            } else if(hold == o) {
                winner = winner.concat("O");
            }
        }
        //catches Ties
        else {
            winner = winner.concat("Tie");
        }
    }
    /*public Board(Character[][] matrix) {
        StringBuilder rowOne = new StringBuilder();
        rowOne = rowOne.append(matrix[0][0]).append(matrix[0][1]).append(matrix[0][2]);
        rowOneStr = rowOne.toString();
        switch (rowOneStr) {

        }
    }*/

    public Boolean isInFavorOfX() {
        boolean xWins = false;
        if (winner.equals("X")) {
            xWins = true;
        }
        return xWins;
    }

    public Boolean isInFavorOfO() {
        Boolean oWins = false;
        if (winner.equals("O")) {
            oWins = true;
        }
        return oWins;
    }

    public Boolean isTie() {
        Boolean tieGame = false;
        if (winner.equals("Tie")) {
            tieGame = true;
            winner = "";
        }
        return tieGame;
    }

    public String getWinner() {
        String whoWins = winner;
        System.out.println(whoWins);
        return whoWins;
    }

}

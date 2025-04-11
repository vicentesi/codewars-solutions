package org.example._4kyu.connectfour;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConnectFour {
  
    private static String[][] board;
    private final static Map<String, Integer> positions = new HashMap<>() {{
      put("A", 0);
      put("B", 1);
      put("C", 2);
      put("D", 3);
      put("E", 4);
      put("F", 5);
      put("G", 6);
    }};
    private static int[] lastMove;
    private static String winner;
  
    public static String whoIsWinner(List<String> piecesPositionList) {
      board = new String[6][7];
      lastMove = new int[2];
      winner = "Draw";
      
      while (piecesPositionList.size() > 0) {
        
        String move = piecesPositionList.remove(0);
        addMove(move);
        
        if (checkWinner()) {
          return winner;
        }
      }

      return winner;
    }
    
    public static void addMove(String move) {
      String[] mv = move.split("_");
      String letter = mv[0];
      String color = mv[1];
      
      int col = positions.get(letter);
      int row = 5;
      
      while (row > 0 && board[row][col] != null) {
        row--;
      }
      
      board[row][col] = color;
      lastMove[0] = row;
      lastMove[1] = col;
    }
  
    public static boolean checkWinner() {
      return checkH() || checkV() || checkD();
    }
    
    public static boolean checkH() {
      int row = lastMove[0];
      int col = lastMove[1];
      int consecutives = 1;      
      int i = 0;
      
      while(i < 7-1) {
        if (board[row][i] != null && board[row][i+1] != null && board[row][i].equals(board[row][i+1])) {
          consecutives++;
        } else {
          consecutives = 1;
        }

        i++;

        if (consecutives == 4) {
          winner = board[row][col];
          return true;
        }
      }
      
      return false;
    };
      
    public static boolean checkV() {
      int row = lastMove[0];
      int col = lastMove[1];
      int consecutives = 1;      
      int i = 0;
      
      while(i < 6-1) {
        if (board[i][col] != null && board[i+1][col] != null && board[i][col].equals(board[i+1][col])) {
          consecutives++;
        } else {
          consecutives = 1;
        }

        i++;

        if (consecutives == 4) {
          winner = board[row][col];
          return true;
        }
      }
      return false;
    };
  
    public static boolean checkD() {      
      // UL
      int lastX = lastMove[0];
      int lastY = lastMove[1];
      int consecutives = 1;
      
      while(lastX > 0 && lastY > 0) {
        lastX--;
        lastY--;
      }

      while(lastX < 6-1 && lastY < 7-1) {
        if (board[lastX][lastY] != null && board[lastX+1][lastY+1] != null 
            && board[lastX][lastY].equals(board[lastX+1][lastY+1])) {
          consecutives++;

          if (consecutives == 4) {
            winner = board[lastMove[0]][lastMove[1]];
            return true;
          }
        } else {
          consecutives = 1;
        }
        lastX++;
        lastY++;
      }

      // DL
      lastX = lastMove[0];
      lastY = lastMove[1];
      consecutives = 1;
      while(lastX < 6-1 && lastY > 0) {
        lastX++;
        lastY--;
      }

      while(lastX > 0 && lastY < 7-1) {          
        if (board[lastX][lastY] != null && board[lastX-1][lastY+1] != null
            && board[lastX][lastY].equals(board[lastX-1][lastY+1])) {
          consecutives++;

          if (consecutives == 4) {
            winner = board[lastMove[0]][lastMove[1]];
            return true;
          }
        } else {
          consecutives = 1;
        }
        lastX--;
        lastY++;
      }
      
      return false;
    }
}

/*
 * Connect Four
Take a look at wiki description of Connect Four game:

Wiki Connect Four

The grid is 6 row by 7 columns, those being named from A to G.

You will receive a list of strings showing the order of the pieces which dropped in columns:

List<String> myList = new ArrayList<String>(Arrays.asList(
    "A_Red",
    "B_Yellow",
    "A_Red",
    "B_Yellow",
    "A_Red",
    "B_Yellow",
    "G_Red",
    "B_Yellow"
));
The list may contain up to 42 moves and shows the order the players are playing.

The first player who connects four items of the same color is the winner.

You should return "Yellow", "Red" or "Draw" accordingly.


 */
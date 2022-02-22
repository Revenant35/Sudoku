package Game;

import static java.lang.Math.ceil;

public class GameBoard {

    // The only attribute of GameBoard is a 9x9 array of integers assigned from the constructor
    private final int[][] board;

    // Constructor for the GameBoard object, takes a 9x9 array of integers as an input
    public GameBoard(int[][] board){
        this.board = board;
    }


    // Recursively solves the board with back-stepping
    //  returns true if the algorithm solved the board successfully
    //  returns false if the board was unsolvable, leaves the board unchanged
    public boolean solve(){
        // Get the Position of the next 0 index
        Position index = find_next_square();

        // If index == null, there are no more 0 indices
        if(index == null) {
            return true;
        }

        // Set the variables x and y to index.x and index.y respectively
        int x = index.getX();
        int y = index.getY();

        // Try values from 1 - 10 in the unfilled position
        //  if it works, we move to the next position recursively
        //  if all values of i fail, we step back to the last valid board
        for(int i = 1; i < 10; i++) {
            board[x][y] = i;
            if(this.check_input(x, y)) {
                if(solve()) {
                    return true;
                }
            }
            board[x][y] = 0;
        }
        return false;
    }


    // Gets the Position of the next square with value 0
    //  returns a position if such a square exists
    //  returns null otherwise
    private Position find_next_square(){
        for(int x = 0; x < 9; x++){
            for(int y = 0; y < 9; y++){
                if (this.board[x][y] == 0){
                   return new Position(x, y);
                }
            }
        }
        return null;
    }


    // Checks if the square around the (x,y) values are valid
    private boolean check_square(int x, int y){

        /* Square matrix is of the form:
          [ (0,0), (1,0), (2,0) ]
          [ (0,1), (1,1), (2,1) ]
          [ (0,2), (1,2), (2,2) ]
         */
        int square_x = (int) ceil((x - 2.0) / 3.0);
        int square_y = (int) ceil((y-2.0)/3.0);

        for(int index_y = 3*square_y; index_y < 3+3*square_y; index_y++){
            for(int index_x = 3*square_x; index_x < 3+3*square_x; index_x++){
                if((index_x != x && index_y != y) && board[x][y] == board[index_x][index_y] && board[index_x][index_y] != 0)
                    return false;
            }
        }

        return true;
    }


    // Checks if the row, column, and square around the (x,y) values are valid
    private boolean check_input(int x, int y){
        for(int index = 0; index < 9; index++){
            if (this.board[x][y] == this.board[index][y] && index != x){
                return false;
            }
            if(this.board[x][y] == this.board[x][index] && index != y) {
                return false;
            }
        }

        return (check_square(x, y));
    }


    // Checks if every position on the board is valid using check_input(i,j)
    public boolean is_valid(){
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++){
                if(!check_input(i, j)) {
                    return false;
                }
            }
        }
        return true;
    }


    // Checks if the board is_valid and there are no squares set to 0
    public boolean is_solved(){
        return is_valid() && find_next_square() == null;
    }


    // Prints the contents of the board
    public void print_board(){
        for(int i = 0; i < 9; i++){
            System.out.print("[  ");
            for(int j = 0; j < 9; j++){
                if(board[i][j] == 0){
                    System.out.print(" ");
                }
                else {
                    System.out.printf("%d", board[i][j]);
                }
                System.out.print("  ");
            }
            System.out.println("]");
        }
    }

}

package Game;

public class Position {

    // The x and y component of the position
    private final int x, y;

    // Constructor for the class, if an invalid position is passed in (i.e. 10 or -1)
    //  we will set the component equal to -1
    public Position(int x, int y){
        this.x = is_valid(x)? x : -1;
        this.y = is_valid(y)? y : -1;
        if(x == -1 || y == -1){
            System.err.println("ERROR: INVALID POSITION");
        }
    }


    // Determines if the component is valid (i.e. less than 9 and greater than or equal to 0)
    private boolean is_valid(int coordinate){
        return coordinate >= 0 && coordinate < 9;
    }

    // Returns the X component of the Position
    public int getX() {
        return x;
    }

    // Returns the Y component of the Position
    public int getY() {
        return y;
    }
}

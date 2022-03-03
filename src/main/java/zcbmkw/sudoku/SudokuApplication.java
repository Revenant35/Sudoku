package zcbmkw.sudoku;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SudokuApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SudokuApplication.class.getResource("board-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 900, 600);
        stage.setTitle("Sudoku");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
//        int[][] array = {{1, 0, 0, 8, 0, 0, 0, 0, 0},
//                         {0, 0, 0, 0, 0, 0, 7, 0, 0},
//                         {0, 0, 5, 0, 0, 4, 0, 0, 0},
//                         {0, 0, 0, 0, 0, 0, 0, 0, 0},
//                         {0, 0, 0, 0, 0, 0, 0, 3, 0},
//                         {0, 0, 0, 0, 2, 0, 0, 0, 0},
//                         {0, 0, 0, 0, 0, 0, 0, 0, 0},
//                         {0, 0, 2, 0, 0, 0, 0, 0, 0},
//                         {0, 0, 0, 9, 0, 0, 0, 0, 0}};
//        GameBoard board = new GameBoard(array);
//        board.print_board();
//        board.solve();
//        if(!board.is_solved()){
//            System.err.println("ERROR: FAILED TO SOLVE BOARD");
//        } else {
//            board.print_board();
//        }
//        System.exit(0);
    }
}
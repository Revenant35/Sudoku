package zcbmkw.sudoku;

import Game.GameBoard;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
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
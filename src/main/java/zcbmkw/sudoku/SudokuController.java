package zcbmkw.sudoku;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;

public class SudokuController implements Initializable {
    @FXML
    private GridPane boardPane;
    private final int board_size;

    public SudokuController(){
        this.board_size = 9;
    }

    public void initialize(URL url, ResourceBundle rb){
        boardPane.prefHeight(600);
        boardPane.prefWidth(600);
        for(int i = 0; i < board_size; i++){
            for(int j = 0; j < board_size; j++){
                boardPane.add(new Label("0"), i, j);
            }
        }
    }


}
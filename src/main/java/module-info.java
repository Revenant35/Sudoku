module zcbmkw.sudoku {
    requires javafx.controls;
    requires javafx.fxml;


    opens zcbmkw.sudoku to javafx.fxml;
    exports zcbmkw.sudoku;
}
module com.example.javadesktopsudoku {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javadesktopsudoku to javafx.fxml;
    exports com.example.javadesktopsudoku;
}
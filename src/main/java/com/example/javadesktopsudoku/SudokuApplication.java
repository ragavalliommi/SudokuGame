package com.example.javadesktopsudoku;

import com.example.javadesktopsudoku.userinterface.*;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class SudokuApplication extends Application {

    private IUserInterfaceContract.View uiImpl;

    @Override
    public void start(Stage stage) throws IOException {
        uiImpl = new UserInterfaceImpl(stage);
        try{
            SudokuBuildLogic.build(uiImpl);
        }catch(IOException e){
            e.printStackTrace();
            throw e;
        }
    }

    public static void main(String[] args) {
        launch();
    }
}
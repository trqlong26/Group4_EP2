package com.aptech.hotel_management;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Font.loadFont(getClass().getResourceAsStream("../../../../resources/style/font/Poppins-Regular.ttf"), 16);
        Font.loadFont(getClass().getResourceAsStream("../../../../resources/style/font/Poppins-Bold.ttf"), 16);
        Font.loadFont(getClass().getResourceAsStream("../../../../resources/style/font/Poppins-Italic.ttf"), 16);
        Parent root = FXMLLoader.load(getClass().getResource("/view/login.fxml"));
        primaryStage.setTitle("Hotel Management System");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

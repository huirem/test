
//package scenegraphdemo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TestFx extends Application {
    @Override
    public void start(Stage stage) {
        Group r = new Group();
        //Scene s = new Scene(r);
        Scene s = new Scene(r, 500, 500, Color.WHITESMOKE); //颜色不对
        stage.setTitle("value");
        stage.setScene(s);
        stage.centerOnScreen();

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
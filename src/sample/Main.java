package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import sun.rmi.runtime.Log;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        System.out.println("Variables");

        // variables
        int age = 16;
        System.out.println("age: ");
        System.out.println(age);

        double pi = 3.14;
        System.out.println("PI: ");
        System.out.println(pi);

        char grade = 'A';
        System.out.println("Grade: ");
        System.out.println(grade);

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 400, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

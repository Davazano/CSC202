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
        // variables
        String Message = "Welcome to CSC 202 Labs";
        System.out.println(Message);

        String Name = "Dave";

        int Age = 45;

        String Sentence ="My name is ".concat("Adam");
        System.out.println(Sentence);

        String AgeSentence = "I am ".concat(String.valueOf(Age)).concat(" years old");
        System.out.println(AgeSentence);

        String NameSentence = "My name is ".concat(Name);
        System.out.println(NameSentence);

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 400, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

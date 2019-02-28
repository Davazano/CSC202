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
        int a = 100;
        System.out.println("a: ");
        System.out.println(a);

        int b = 200;
        System.out.println("b: ");
        System.out.println(b);

        /*
        // Addition
        int sum = b + a;
        System.out.println("sum: b + a");
        System.out.println(sum);

        // Subtraction
        int diff = b - a;
        System.out.println("diff: b - a =");
        System.out.println(diff);

        // Multiplication
        int mult = b * a;
        System.out.println("mult: b * a =");
        System.out.println(mult);

        // Division
        int div = b / a;
        System.out.println("div: b / a =");
        System.out.println(div);

        // Modulus
        int mod = b % a;
        System.out.println("mod: b % a =");
        System.out.println(mod);
*/
        // Increment
        int inc = ++b;
        System.out.println("inc: ++b =");
        System.out.println(inc);
/*
        // Decrement
        int dec = --b;
        System.out.println("dec: --b =");
        System.out.println(dec);
        */

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 400, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

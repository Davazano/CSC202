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
        Animal dog = new Animal();
        //dog.Type = "Mammal";

        Cat[] cats = new Cat[5];

        cats[0] = new Cat();
        cats[0].Type = "Black Cat";

        cats[1] = new Cat();
        cats[1].Type = "White Cat";

        cats[2] = new Cat();
        cats[2].Type = "Brown Cat";


        cats[3] = new Cat();
        cats[3].Type = "Brown and White Cat";

        //Creating a Text object
        Text text = new Text();

        //Setting font to the text
        text.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));

        //setting the position of the text
        text.setX(50);
        text.setY(130);


       //text.setText(book1.getTitle() + " " +book1.getPrice().toString() + " " +book1.getAuthor());
        text.setText(cats[0].Type);

        String [] fruits = {"Apple", "Banana", "Guava", "Orange"};

        for( String fruit : fruits ) {
            System.out.print( fruit );
            System.out.print(",");
        }



        Group root = new Group(text);
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 400, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

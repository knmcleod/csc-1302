/**
Programmer: Kerra McLeod
Program: 11-19
Date: 12/5/2020
Description: Moves two cars in opposite directions at different heights
*/
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.SequentialTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.image.ImageView;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Group;
public class MovingCarKM extends Application
{
   /**
      creates and moves cars
      @param Stage primaryStage
   */
   public void start(Stage primaryStage)
   {
      System.out.println("Programmer: Kerra McLeod \nThis program will move two cars in opposite directions at different heights");
      Group root = new Group();
      Scene scene1 = new Scene(root,900,600);
      
      ImageView car1 = new ImageView("car1.jpg");
      car1.setLayoutX(700);
      car1.setLayoutY(50);
      car1.setFitWidth(350);
      car1.setPreserveRatio(true);
      car1.setSmooth(true);
      Timeline tm1 = new Timeline();
      tm1.setCycleCount(Timeline.INDEFINITE);
      KeyFrame moveCar1 = new KeyFrame(Duration.millis(10000),
      new KeyValue(car1.translateXProperty(), -1050));
      tm1.getKeyFrames().add(moveCar1);
      tm1.play();
      
      ImageView car2 = new ImageView("car2.jpg");
      car2.setLayoutX(0);
      car2.setLayoutY(350);
      car2.setFitWidth(350);
      car2.setPreserveRatio(true);
      car2.setSmooth(true);
      Timeline tm2 = new Timeline();
      tm2.setCycleCount(Timeline.INDEFINITE);
      KeyFrame moveCar2 = new KeyFrame(Duration.millis(10000),
      new KeyValue(car2.translateXProperty(), 1050));
      tm2.getKeyFrames().add(moveCar2);
      tm2.play();
      root.getChildren().addAll(car1,car2);
      
      primaryStage.setScene(scene1);
      primaryStage.setTitle("Moving Cars Program");
      primaryStage.show();
      
   }
}
/**
Programmer: Kerra McLeod
Program: 11-24
Date: 12/5/2020
Description: prompts user with textfield for (x,y) center points and a radius, then draws a circle based off it.
*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Circle;
import javafx.geometry.Insets;
public class DrawCircleKM extends Application
{
   /**
      starts stage
      @param Stage stage1
   */
   public void start(Stage stage1)
   {
      System.out.println("Programmer: Kerra McLeod \nThis program will prompt user with textfield for (x,y) center points and a radius, then draws a circle based off it.");
      Pane root = createRootPane();
      Scene scene1 = new Scene(root);
      stage1.setScene(scene1);
      stage1.setTitle("Draw Circle");
      stage1.show();
   }
   /**
      creates textfields and circle
   */
   private Pane createRootPane()
   {
      Label xLabel = new Label("Enter X value: ");
      TextField xCord = new TextField("" + 0);
      
      Label yLabel = new Label("Enter Y value: ");
      TextField yCord = new TextField("" + 0);
      
      Label rLabel = new Label("Enter radius value: ");
      TextField r = new TextField("" + 0);
      
      Button draw = new Button("Draw");
      
      Insets inset = new Insets(100);
      BorderPane bPane = new BorderPane();
      bPane.setMinSize(500,500);
      Pane pane = new VBox(xLabel, xCord, yLabel, yCord, rLabel, r);
      bPane.setTop(pane);
      bPane.setCenter(draw);
      Insets insetButton = new Insets(10);
      BorderPane.setMargin(draw,insetButton);
      Pane filler = new Pane();
      filler.setMinSize(200,200);
      bPane.setBottom(filler);
      BorderPane.setMargin(filler,inset);
      
      draw.setOnAction(
         event ->
         {
            int xCoord = Integer.parseInt(xCord.getText());
            int yCoord = Integer.parseInt(yCord.getText());
            int radius = Integer.parseInt(r.getText());
            if(xCoord < 0 || xCoord > 150)
            {
               xCoord = 0;
               xCord.setText("");
            }
            if(yCoord < 0 || yCoord > 150)
            {
               yCoord = 0;
               yCord.setText("");
            }
            if(radius < 0 || radius > 50)
            {
               radius = 50;
               r.setText("");
            }
            Circle ball = new Circle(xCoord,yCoord,radius);
            Pane ballPane = new Pane(ball);
            ballPane.setMinSize(200,200);
            bPane.setBottom(ballPane);
            BorderPane.setMargin(ballPane,inset);
         
         });
      return bPane;
   
   }
}
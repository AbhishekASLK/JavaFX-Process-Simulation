import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class Options {

    static Scene optionsScene;

    static void openOptionScene(Stage primaryStage, Scene mainScene) {
        // Create an ImageView to display the background image
        ImageView backgroundView2 = new ImageView("./src/options.png");

        // ======================= OPTION 1 ============================
        Image nextSceneImage = new Image("./src/play-btn.png",60,60,true,true); // Change the file path as needed
        ImageView nextSceneImageView = new ImageView(nextSceneImage);

        Button nextButton = new Button();
        nextButton.setGraphic(nextSceneImageView);
        nextButton.setStyle("-fx-background-color: transparent; -fx-border-width: 0;");
        nextButton.setOnAction(e->HDD.openHDDScene(primaryStage,mainScene));

        HBox bottomRightButton = new HBox(nextButton);
        bottomRightButton.setTranslateX(850); 
        bottomRightButton.setTranslateY(170); 

        // ======================= OPTION 2 ============================
        Image nextSceneImage2 = new Image("./src/play-btn.png",60,60,true,true); // Change the file path as needed
        ImageView nextSceneImageView2 = new ImageView(nextSceneImage2);

        Button nextButton2 = new Button();
        nextButton2.setGraphic(nextSceneImageView2);
        nextButton2.setStyle("-fx-background-color: transparent; -fx-border-width: 0;");
        nextButton2.setOnAction(e->HDDVM.openHDDVMScene(primaryStage,mainScene));

        HBox bottomRightButton2 = new HBox(nextButton2);
        bottomRightButton2.setTranslateX(850); 
        bottomRightButton2.setTranslateY(380); 

        // ======================= Back Button ============================
        
        // Create an ImageView for the onClick event
        Image previousSceneImage = new Image("./src/back-btn.png",60,60,true,true); // Change the file path as needed
        ImageView previousSceneImageView = new ImageView(previousSceneImage);

        Button backtButton = new Button();
        backtButton.setGraphic(previousSceneImageView);
        backtButton.setStyle("-fx-background-color: transparent; -fx-border-width: 0;");
        backtButton.setOnAction(e->primaryStage.setScene(mainScene));
        
        // Create an HBox to hold the newSceneImageView and position it in the bottom right
        HBox bottomLeft = new HBox(backtButton);
        bottomLeft.setTranslateX(100);
        bottomLeft.setTranslateY(540); 

        StackPane root = new StackPane();
        root.getChildren().addAll(backgroundView2,bottomLeft,bottomRightButton,bottomRightButton2);

        Scene optionsScene = new Scene(root,1092, 614);
        primaryStage.setScene(optionsScene);
        primaryStage.show();

    }
}

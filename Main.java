import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public Scene mainScene;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Process Simulation");
        // Create an ImageView to display the background image
        ImageView backgroundView = new ImageView("./src/background.png");

        // Create an ImageView for the onClick event
        Image nextSceneImage = new Image("./src/next-btn.png", 60, 60, true, true); // Change the file path as needed
        ImageView nextSceneImageView = new ImageView(nextSceneImage);

        Button bt = new Button();
        bt.setGraphic(nextSceneImageView);
        bt.setStyle("-fx-background-color: transparent; -fx-border-width: 0;");
        bt.setOnAction(e -> Options.openOptionScene(primaryStage, mainScene));

        // Create an HBox to hold the newSceneImageView and position it in the bottom
        // right
        HBox bottomRight = new HBox(bt);
        bottomRight.setTranslateX(1000);
        bottomRight.setTranslateY(540);

        StackPane root = new StackPane();
        root.getChildren().addAll(backgroundView, bottomRight);

        mainScene = new Scene(root, 1092, 614);
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }

}

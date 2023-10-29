import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class HDDToRAM {

    static Scene HDDToRAM;

    static void openHDDToRAMScene(Stage primaryStage, Scene mainScene) {

        // =============================== animation ===========================
        Text movingText = new Text("1010101011");
        movingText.setFill(Color.BLUE);
        movingText.setStyle("-fx-font-size: 16;");

        // button ka proble
        // movingText.setMouseTransparent(false);

        // Create an HBox to contain the text
        HBox hbox = new HBox(movingText);
        hbox.setSpacing(10); // Adjust spacing as needed

        // Create a TranslateTransition
        TranslateTransition translateTransition = new TranslateTransition();

        // Set the duration for the transition
        translateTransition.setDuration(Duration.seconds(10));

        // Set the node for the transition
        translateTransition.setNode(hbox);

        // Set the initial position to the left
        hbox.setTranslateX(900); // Start off-screen on the left
        hbox.setTranslateY(420); // Start off-screen on the left

        // Set the target position to the right
        translateTransition.setToX(350); // Move to the right
        translateTransition.setToY(230); // Move to the right

        // Play the animation
        translateTransition.play();
        // =====================UPPAR===============

        // Create an ImageView to display the background image
        ImageView backgroundView3 = new ImageView("./src/fourth-bg.png");

        // ======================= Back Button ============================

        // Create an ImageView for the onClick event
        Image previousSceneImage = new Image("./src/back-btn.png", 60, 60, true, true); // Change the file path as
                                                                                        // needed
        ImageView previousSceneImageView = new ImageView(previousSceneImage);

        Button backtButton = new Button();
        backtButton.setGraphic(previousSceneImageView);
        backtButton.setStyle("-fx-background-color: transparent; -fx-border-width: 0;");
        backtButton.setOnAction(e -> HDD.openHDDScene(primaryStage, mainScene));

        // Create an HBox to hold the newSceneImageView and position it in the bottom
        // right
        HBox bottomLeft = new HBox(backtButton);
        bottomLeft.setTranslateX(100);
        bottomLeft.setTranslateY(540);

        StackPane root = new StackPane();
        root.getChildren().addAll(backgroundView3, bottomLeft, hbox);
        Scene HDDToRAM = new Scene(root, 1092, 614);
        primaryStage.setScene(HDDToRAM);
        primaryStage.show();

    }
}

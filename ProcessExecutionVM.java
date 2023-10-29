import javafx.animation.TranslateTransition;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class ProcessExecutionVM {

    static Scene ProcessExecutionVM;

    static void openProcessExecutionVMScene(Stage primaryStage, Scene mainScene) {
        // =========================== Animation =============================
        // =========== Animation ===========================
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
        // ===================================================
        // =====================================================================
        // Create an ImageView to display the background image
        ImageView backgroundView5 = new ImageView("./src/process-vm.png");
        // ======================= Next Button ============================
        // Image nextSceneImage = new Image("./src/next-btn.png",60,60,true,true); //
        // Change the file path as needed
        // ImageView nextSceneImageView = new ImageView(nextSceneImage);

        // Button nextButton = new Button();
        // nextButton.setGraphic(nextSceneImageView);
        // nextButton.setStyle("-fx-background-color: transparent; -fx-border-width:
        // 0;");
        // nextButton.setOnAction(e->primaryStage.setScene(optionsScene));

        // HBox bottomRightButton = new HBox(nextButton);
        // bottomRightButton.setTranslateX(1000);
        // bottomRightButton.setTranslateY(540);

        // ======================= Back Button ============================

        // Create an ImageView for the onClick event
        Image previousSceneImage = new Image("./src/back-btn.png", 60, 60, true, true); // Change the file path as
                                                                                        // needed
        ImageView previousSceneImageView = new ImageView(previousSceneImage);

        Button backtButton = new Button();
        backtButton.setGraphic(previousSceneImageView);
        backtButton.setStyle("-fx-background-color: transparent; -fx-border-width: 0;");
        backtButton.setOnAction(e -> HDDVM.openHDDVMScene(primaryStage, mainScene));

        // backtButton.setOnAction(e->primaryStage.setScene(optionsScene));

        // Create an HBox to hold the newSceneImageView and position it in the bottom
        // right
        HBox bottomLeft = new HBox(backtButton);
        bottomLeft.setTranslateX(100);
        bottomLeft.setTranslateY(540);

        StackPane root = new StackPane();
        root.getChildren().addAll(backgroundView5, bottomLeft, hbox);
        Scene ProcessExecutionVM = new Scene(root, 1092, 614);
        primaryStage.setScene(ProcessExecutionVM);
        primaryStage.show();

    }
}

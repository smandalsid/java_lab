import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

   private Stage stage;
   private final TextField txtMass = new TextField();
   private final TextField txtHeight = new TextField();
   private final Button btnCalc = new Button("Calculate BMI");

   @Override//from w ww. j  a  v  a2 s .  c  o m
   public void start(Stage stage) throws Exception {
      this.stage = stage;

      VBox vbox = new VBox(10);

      Label lblTitle = new Label("BMI Calculator");
      lblTitle.setFont(Font.font(18));
      vbox.getChildren().add(lblTitle);

      vbox.getChildren().add(new Label("Your mass (kg):"));
      vbox.getChildren().add(txtMass);

      vbox.getChildren().add(new Label("Your height (cm):"));
      vbox.getChildren().add(txtHeight);

      vbox.getChildren().add(btnCalc);

      btnCalc.setOnAction(new EventHandler<ActionEvent>() {
         @Override
         public void handle(ActionEvent ev) {
            double mass;
            double height;
            try {
               mass = Double.parseDouble(txtMass.getText());
               height = Double.parseDouble(txtHeight.getText());
            } catch (NumberFormatException e) {
               showMessage("Check your input.", "Error in number input");
               return;
            }
            double result = calculateBMI(mass, height);
            showMessage("Your BMI is: " + (Math.round(result * 100.0) / 100.0), "Your BMI result");
         }
      });

      Scene scene = new Scene(new Group(vbox));
      stage.setTitle("JavaFX BMI Calculator");
      stage.setScene(scene);
      stage.sizeToScene();
      stage.show();
   }

   protected double calculateBMI(double mass, double height) {
      return mass / Math.pow(height / 100.0, 2.0);
   }

   public static void main(String[] args) {
      Application.launch(args);
   }

   public void showMessage(final String message, final String title) {
      final Stage dialog = new Stage(StageStyle.UTILITY);
      dialog.setTitle(title);
      dialog.setResizable(false);
      dialog.initModality(Modality.WINDOW_MODAL);
      dialog.initOwner(this.stage);

      VBox vbox = new VBox(2);
      HBox pane = new HBox(10);

      dialog.setScene(new Scene(vbox));
      vbox.setAlignment(Pos.CENTER);

      vbox.getChildren().add(pane);
      pane.getChildren().add(new Label(message));
      Button btn = new Button("OK");
      btn.setOnAction(new EventHandler<ActionEvent>() {
         @Override
         public void handle(ActionEvent e) {
            dialog.close();
         }
      });
      pane.getChildren().add(btn);
      dialog.showAndWait();
   }
}

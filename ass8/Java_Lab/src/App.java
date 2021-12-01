import javafx.stage.Stage;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.collections.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import java.io.*;
import javafx.scene.layout.*;
import javafx.event.*;
import javafx.scene.input.*;
import javafx.scene.transform.Scale;
import javafx.scene.text.*;
import javafx.geometry.*;
import java.util.*;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.stage.Modality;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primarystage) {

        try {
            primarystage.setTitle("Registration Form");

            ScrollBar scroll1 = new ScrollBar();
            scroll1.setMin(0);
            scroll1.setMax(200);
            scroll1.setValue(110);
            scroll1.setOrientation(Orientation.VERTICAL);
            scroll1.setUnitIncrement(12);
            scroll1.setBlockIncrement(10); 

            ScrollBar scroll2 = new ScrollBar();

            
            GridPane grid = new GridPane();

            MenuBar menubar = new MenuBar();
            Menu pagesmenu = new Menu("Pages");
            MenuItem pagesmenu1 = new MenuItem("Home");
            MenuItem pagesmenu2 = new MenuItem("User");
            MenuItem pagesmenu3 = new MenuItem("Admin");
            Menu moremenu = new Menu("More");
            MenuItem moremenu1 = new MenuItem("Contact");
            MenuItem moremenu2 = new MenuItem("About");
            MenuItem moremenu3 = new MenuItem("Exit");
            moremenu.getItems().addAll(moremenu1, moremenu2, moremenu3);

            grid.add(menubar, 0, 0);

            pagesmenu.getItems().addAll(pagesmenu1, pagesmenu2, pagesmenu3);
            menubar.getMenus().addAll(pagesmenu, moremenu);

            grid.add(scroll1, 3, 0, 1, 10);
            grid.add(scroll2, 0, 9, 2, 1);
            grid.setAlignment(Pos.CENTER);
            grid.setHgap(10);
            grid.setVgap(10);
            grid.setPadding(new Insets(25, 25, 25, 25));

            Text scenetitle = new Text("Welcome");
            scenetitle.setFont(Font.font("Ubuntu", FontWeight.BOLD, 24));
            grid.add(scenetitle, 0, 1, 2, 1);

            Menu m = new Menu("Menu");
            MenuItem m1 = new MenuItem("menu item 1");
            MenuItem m2 = new MenuItem("menu item 2");
            MenuItem m3 = new MenuItem("menu item 3");
            m.getItems().add(m1);
            m.getItems().add(m2);
            m.getItems().add(m3);

            Label userName = new Label("User Name:");
            userName.setFont(Font.font("Ubuntu", FontWeight.NORMAL, 16));
            grid.add(userName, 0, 2);

            Tooltip t1 = new Tooltip("Enter username here...");
            TextField userTextField = new TextField();
            userTextField.setTooltip(t1);
            grid.add(userTextField, 1, 2);

            Label pw = new Label("Password:");
            pw.setFont(Font.font("Ubuntu", FontWeight.NORMAL, 16));
            grid.add(pw, 0, 3);

            Tooltip t2 = new Tooltip("Enter password here...");
            PasswordField pwBox = new PasswordField();
            pwBox.setTooltip(t2);
            grid.add(pwBox, 1, 3);

            ToggleGroup tg1 = new ToggleGroup();
            RadioButton r1 = new RadioButton("Male");
            r1.setFont(Font.font("Ubuntu", FontWeight.NORMAL, 14));
            RadioButton r2 = new RadioButton("Female");
            r2.setFont(Font.font("Ubuntu", FontWeight.NORMAL, 14));
            RadioButton r3 = new RadioButton("Other");
            r3.setFont(Font.font("Ubuntu", FontWeight.NORMAL, 14));
            r1.setToggleGroup(tg1);
            r2.setToggleGroup(tg1);
            r3.setToggleGroup(tg1);
            Label gen = new Label("Gender: ");
            gen.setFont(Font.font("Ubuntu", FontWeight.NORMAL, 16));
            grid.add(gen, 0, 4);
            grid.add(r1, 1, 4);
            grid.add(r2, 1, 5);
            grid.add(r3, 1, 6);

            FileInputStream fin = new FileInputStream("./lib/image.jpg");
            Image i = new Image(fin);
            ImageView iv = new ImageView(i);
            Tooltip t3 = new Tooltip("Click to register");
            Button btn = new Button("Sign in", iv);
            btn.setTooltip(t3);
            HBox hbBtn = new HBox(10);
            hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
            hbBtn.getChildren().add(btn);
            grid.add(hbBtn, 1, 7);

            final Text actiontarget = new Text();
            grid.add(actiontarget, 1, 8);

            btn.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent e) {
                    actiontarget.setFill(Color.GREEN);
                    actiontarget.setText("Sign in button pressed");
                }
            });

            Scene scene1 = new Scene(grid, 395, 330);
            primarystage.setScene(scene1);

            primarystage.show();

        } catch (Exception e) {

        }

    }
}

package application;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.control.*;
import javafx.scene.image.*;
import java.io.*;
import javafx.scene.layout.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.text.*;
import javafx.scene.control.Tooltip;

public class DA_8 extends Application {

    public void start(Stage primarystage) throws Exception {
        try {
            primarystage.setTitle("TEST");

            GridPane grid = new GridPane();

            ScrollBar scroll_bar1 = new ScrollBar();
            scroll_bar1.setMin(0);
            scroll_bar1.setMax(200);
            scroll_bar1.setValue(110);
            scroll_bar1.setOrientation(Orientation.VERTICAL);
            scroll_bar1.setUnitIncrement(12);
            scroll_bar1.setBlockIncrement(10);
            ScrollBar scroll_bar2 = new ScrollBar();

            MenuBar menubar = new MenuBar();
            Menu menu1 = new Menu("Pages");
            MenuItem pagesmenu1 = new MenuItem("Home");
            MenuItem pagesmenu2 = new MenuItem("Account");
            menu1.getItems().addAll(pagesmenu1, pagesmenu2);

            Menu menu2 = new Menu("More");
            MenuItem moremenu1 = new MenuItem("Contact");
            MenuItem moremenu2 = new MenuItem("About");
            MenuItem moremenu3 = new MenuItem("Exit");
            menu2.getItems().addAll(moremenu1, moremenu2, moremenu3);

            Menu quit = new Menu("Quit");
            MenuItem exit = new MenuItem("Exit from the application");
            exit.setOnAction(actionEvent -> Platform.exit());
            quit.getItems().add(exit);

            menubar.getMenus().addAll(menu1, menu2, quit);

            BorderPane root = new BorderPane();
            root.setTop(menubar);

            grid.add(scroll_bar1, 3, 1, 1, 24);
            grid.add(scroll_bar2, 0, 24, 2, 5);
            grid.setAlignment(Pos.CENTER);
            grid.setHgap(10);
            grid.setVgap(10);
            grid.setPadding(new Insets(25, 25, 25, 25));

            Label userName = new Label("Name");
            grid.add(userName, 0, 2);

            Tooltip t1 = new Tooltip("Enter name..");
            TextField userTextField = new TextField();
            userTextField.setTooltip(t1);
            grid.add(userTextField, 1, 2);

            Label pw = new Label("Registration Number");
            grid.add(pw, 0, 6);

            Tooltip t2 = new Tooltip("Enter registration number..");
            TextField pwBox = new TextField();
            pwBox.setTooltip(t2);
            grid.add(pwBox, 1, 6);

            ToggleGroup tg1 = new ToggleGroup();
            RadioButton r1 = new RadioButton("Gujrat");
            RadioButton r2 = new RadioButton("Tamil Nadu");
            RadioButton r3 = new RadioButton("Sydney");
            RadioButton r4 = new RadioButton("Delhi");
            r1.setToggleGroup(tg1);
            r2.setToggleGroup(tg1);
            r3.setToggleGroup(tg1);
            r4.setToggleGroup(tg1);
            Label gen = new Label("QUESTION: Choose the odd one out");
            grid.add(gen, 0, 10);
            grid.add(r1, 0, 14);
            grid.add(r2, 0, 16);
            grid.add(r3, 0, 18);
            grid.add(r4, 0, 20);

            FileInputStream fin = new FileInputStream("C:\\Users\\ALPANA SINGH\\Desktop\\alpana\\wallpapers\\aa.jpg");
            Image i = new Image(fin);
            ImageView iv = new ImageView(i);
            Tooltip t3 = new Tooltip("Click to submit");
            Button btn = new Button("Finish", iv);
            btn.setTooltip(t3);
            HBox hbBtn = new HBox(2);
            hbBtn.setAlignment(Pos.BOTTOM_CENTER);
            hbBtn.getChildren().add(btn);
            grid.add(hbBtn, 1, 23);

            final Text actiontarget = new Text();
            grid.add(actiontarget, 1, 26);

            btn.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent e) {
                    actiontarget.setFill(Color.GREEN);
                    actiontarget.setText("Submitted successfully");
                }
            });

            Scene scene1 = new Scene(grid, 600, 600);
            primarystage.setScene(scene1);
            VBox layout1 = new VBox();
            layout1.setAlignment(Pos.CENTER);
            VBox vbox = new VBox(root, layout1);
            Scene scene = new Scene(vbox, 600, 600);
            Label label1 = new Label("Press next to enter the test");
            Label label2 = new Label("Time given : 10 min");
            Button button = new Button("Next");
            button.setOnAction(e -> primarystage.setScene(scene1));
            layout1.getChildren().addAll(label1, label2, button);
            primarystage.setScene(scene);
            primarystage.show();

        } catch (Exception e) {
        }
    }

    public static void main(String... args) {
        launch(args);
    }
}

package application;
	
import javafx.application.Application;
import javafx.event.*;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Main extends Application {
	private String username="dinesh";
	private String userpass="password";
	@Override
	public void start(Stage primaryStage) {
		try {
			books book=new books();
			bookextend boo=new bookextend();
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Menu menu=new Menu("Menu");
			MenuItem m1=new MenuItem("View book");
			Menu m2=new Menu("Loan book");
			Menu m3=new Menu("Retrun book");
			menu.getItems().addAll(m1,m2,m3);
			MenuItem sm1=new MenuItem("Chemistry");
			MenuItem sm2=new MenuItem("Biology");
			MenuItem sm3=new MenuItem("Physics");
			MenuItem rm1=new MenuItem("Chemistry");
			MenuItem rm2=new MenuItem("Biology");
			MenuItem rm3=new MenuItem("Physics");
			m2.getItems().addAll(sm1,sm2,sm3);
			m3.getItems().addAll(rm1,rm2,rm3);
			Menu about=new Menu("about");
			Menu help=new Menu("help");
			MenuBar mbar=new MenuBar();
			mbar.getMenus().addAll(menu,about,help);
			BorderPane root = new BorderPane();
			root.setTop(mbar);
			Font font=new Font("Verdana",15);
			Label name=new Label("Enter the user name");
			name.setFont(font);
			name.setTextFill(Color.WHITE);
			TextField text1=new TextField();
			text1.setMaxWidth(150);
			Label text2=new Label("Enter the password");
			text2.setTextFill(Color.WHITE);
			text2.setFont(font);
			PasswordField pass=new PasswordField();
			pass.setMaxWidth(150);
			VBox vert=new VBox();
			vert.setSpacing(10);
			Button btn=new Button("submit");
			 Image img = new Image("E:\\college\\JAVA PROGRAM\\Library mangement\\src\\login_back.png");
		      BackgroundImage bimg = new BackgroundImage(img,
		                                                   BackgroundRepeat.NO_REPEAT,
		                                                   BackgroundRepeat.NO_REPEAT,
		                                                   BackgroundPosition.DEFAULT,
		                                                   BackgroundSize.DEFAULT);
		      Background ground=new Background(bimg);
			vert.getChildren().addAll(name,text1,text2,pass,btn);
			vert.setAlignment(Pos.CENTER);
			vert.setBackground(ground);
			Scene scene = new Scene(root);
			m1.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					ListView<String> list1=new ListView<String>(book.chem);
					ListView<String> list2=new ListView<String>(book.bio);
					ListView<String> list3=new ListView<String>(book.phy);
					root.getChildren().addAll(list1,list2,list3);
					VBox book_page=new VBox(mbar,list1,list2,list3);
					Scene scene1=new Scene(book_page);
					primaryStage.setScene(scene1);
					primaryStage.setFullScreen(true);
					primaryStage.show();
				}
				
			});
			sm1.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					book.add();
				}			
			});
			sm2.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					book.biology();
				}			
			});
			sm3.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					book.physic();
				}			
			});
			rm1.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					boo.physic();
				}			
			});
			rm2.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					boo.physic();
				}			
			});
			rm3.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					boo.physic();
				}			
			});
			btn.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					String name=text1.getText();
					String password=pass.getText().toString();
					if(username.equals(name) && userpass.equals(password)) {
						primaryStage.setScene(scene);
						primaryStage.setFullScreen(true);
						primaryStage.show();
					}else {
						Label wrong=new Label("Enter the correct user name and pssword");
						vert.getChildren().add(wrong);
					}
				}
				
			});
			Scene login=new Scene(vert);
			primaryStage.setScene(login);
			primaryStage.setHeight(400);
			primaryStage.setWidth(500);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

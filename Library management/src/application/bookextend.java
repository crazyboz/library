package application;

import javafx.event.*;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class bookextend extends books implements inter{		
		void add() {
			Font font=new Font("Verdana",15);
			Label name=new Label("Enter the book name");
			name.setFont(font);
			name.setTextFill(Color.BLACK);
			TextField text1=new TextField();
			text1.setMaxWidth(150);
			Label text2=new Label("Enter the student name");
			text2.setTextFill(Color.BLACK);
			text2.setFont(font);
			TextField pass=new TextField();
			pass.setMaxWidth(150);
			Button btn1=new Button("submit");
			VBox bet=new VBox();
			bet.setSpacing(15);
			bet.getChildren().addAll(name,text1,text2,pass,btn1);
			bet.setAlignment(Pos.CENTER);
			Scene scene1=new Scene(bet,300,300);
			Stage stage1=new Stage();
			stage1.setScene(scene1);
			btn1.setOnAction(new EventHandler<ActionEvent>() {
				int count=0,y=0;
				@Override
				public void handle(ActionEvent event) {
					for(String list:chem1){
						if(text1.getText().equals(list)) {
							y=count+1;
							break;
						}
						count++;
					}
					if(y==0) {
						Label name1=new Label("no books available");
						bet.getChildren().add(name1);
						Scene scene1=new Scene(bet,300,300);
						stage1.setScene(scene1);
						stage1.show();
					}else {
						for(int i=0;i<4;i++) {
							if(i==(y-1))
							{
								if(achem[i]!=0)
								{
									Label name1=new Label("Succes fully added");
									bet.getChildren().add(name1);
									Scene scene1=new Scene(bet,300,300);
									stage1.setScene(scene1);
									stage1.show();
									achem[i]--;
									break;
								}
							}
						}
					}
				}
			});
			stage1.setFullScreen(true);
			stage1.show();
		}

		
		void biology() {
			Font font=new Font("Verdana",15);
			Label name=new Label("Enter the book name");
			name.setFont(font);
			name.setTextFill(Color.BLACK);
			TextField text1=new TextField();
			text1.setMaxWidth(150);
			Label text2=new Label("Enter the student name");
			text2.setTextFill(Color.BLACK);
			text2.setFont(font);
			TextField pass=new TextField();
			pass.setMaxWidth(150);
			Button btn1=new Button("submit");
			VBox bet=new VBox();
			bet.setSpacing(15);
			bet.getChildren().addAll(name,text1,text2,pass,btn1);
			bet.setAlignment(Pos.CENTER);
			Scene scene1=new Scene(bet,300,300);
			Stage stage1=new Stage();
			stage1.setScene(scene1);
			
			btn1.setOnAction(new EventHandler<ActionEvent>() {
				int count=0,x=0,y=0;
				@Override
				public void handle(ActionEvent event) {
					for(String list:chem1){
						if(text1.getText().equals(list)) {
							y=count+1;
							break;
						}
						count++;
					}
					if(y==0) {
						Label name1=new Label("no books available");
						bet.getChildren().add(name1);
						Scene scene=new Scene(bet,300,300);
						stage1.setScene(scene1);
						stage1.show();
					}else {
						for(int i=0;i<3;i++) {
							if(i==(y-1))
							{
								if(abio[i]!=0)
								{
									Label name1=new Label("Succes fully added");
									bet.getChildren().add(name1);
									Scene scene=new Scene(bet,300,300);
									stage1.setScene(scene);
									stage1.show();
									abio[i]--;
									break;
								}
							}
						}
					}
				}
			});
			stage1.setFullScreen(true);
			stage1.show();
		}

		
		void physic() {
			Font font=new Font("Verdana",15);
			Label name=new Label("Enter the book name");
			name.setFont(font);
			name.setTextFill(Color.BLACK);
			TextField text1=new TextField();
			text1.setMaxWidth(150);
			Label text2=new Label("Enter the student name");
			text2.setTextFill(Color.BLACK);
			text2.setFont(font);
			TextField pass=new TextField();
			pass.setMaxWidth(150);
			Button btn1=new Button("submit");
			VBox bet=new VBox();
			bet.setSpacing(15);
			bet.getChildren().addAll(name,text1,text2,pass,btn1);
			bet.setAlignment(Pos.CENTER);
			Scene scene1=new Scene(bet,300,300);
			Stage stage1=new Stage();
			stage1.setScene(scene1);
			
			btn1.setOnAction(new EventHandler<ActionEvent>() {
				int count=0,x=0,y=0;
				@Override
				public void handle(ActionEvent event) {
					for(String list:phy1){
						if(text1.getText().equals(list)) {
							y=count+1;
							break;
						}
						count++;
					}
					if(y==0) {
						Label name1=new Label("no books available");
						bet.getChildren().add(name1);
						Scene scene=new Scene(bet,300,300);
						stage1.setScene(scene);
						stage1.show();
					}else {
						for(int i=0;i<4;i++) {
							if(i==(y-1))
							{
								if(aphy[i]!=0)
								{
									Label name1=new Label("Succes fully added");
									bet.getChildren().add(name1);
									Scene scene=new Scene(bet,300,300);
									stage1.setScene(scene);
									stage1.show();
									aphy[i]--;
									break;
								}
							}
						}
					}
				}
			});
			stage1.setFullScreen(true);
			stage1.show();
		}

}

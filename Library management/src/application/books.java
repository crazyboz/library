package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.*;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class books {
	ObservableList<String> chem=FXCollections.observableArrayList("Organic chemistry","Inorganic chemistry","Polymer chemistry");
	int achem[]= {5,7,4,8};
	String chem1[]= {"Organic chemistry","Inorganic chemistry","Polymer chemistry"};
	int aphy[]= {5,7,4,8};
	String phy1[]= {"mechanics","Dynamics","Astro Physics","Electromagnetism"};
	String bio1[]= {"zoology","botany","medical science"};
	int abio[]= {5,7,4};
	ObservableList<String> bio=FXCollections.observableArrayList("zoology","botany","medical science");
	ObservableList<String> phy=FXCollections.observableArrayList("mechanics","Dynamics","Astro Physics","Electromagnetism");
	


	
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
		VBox vet=new VBox();
		vet.setSpacing(15);
		vet.getChildren().addAll(name,text1,text2,pass,btn1);
		vet.setAlignment(Pos.CENTER);
		Scene scene=new Scene(vet,300,300);
		Stage stage=new Stage();
		stage.setScene(scene);
		
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
					vet.getChildren().add(name1);
					Scene scene=new Scene(vet,300,300);
					stage.setScene(scene);
					stage.show();
				}else {
					for(int i=0;i<4;i++) {
						if(i==(y-1))
						{
							if(achem[i]!=0)
							{
								Label name1=new Label("Succes fully added");
								vet.getChildren().add(name1);
								Scene scene=new Scene(vet,300,300);
								stage.setScene(scene);
								stage.show();
								achem[i]--;
								break;
							}
						}
					}
				}
			}
		});
		stage.setFullScreen(true);
		stage.show();
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
		VBox vet=new VBox();
		vet.setSpacing(15);
		vet.getChildren().addAll(name,text1,text2,pass,btn1);
		vet.setAlignment(Pos.CENTER);
		Scene scene=new Scene(vet,300,300);
		Stage stage=new Stage();
		stage.setScene(scene);
		
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
					vet.getChildren().add(name1);
					Scene scene=new Scene(vet,300,300);
					stage.setScene(scene);
					stage.show();
				}else {
					for(int i=0;i<3;i++) {
						if(i==(y-1))
						{
							if(abio[i]!=0)
							{
								Label name1=new Label("Succes fully added");
								vet.getChildren().add(name1);
								Scene scene=new Scene(vet,300,300);
								stage.setScene(scene);
								stage.show();
								abio[i]--;
								break;
							}
						}
					}
				}
			}
		});
		stage.setFullScreen(true);
		stage.show();
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
		VBox vet=new VBox();
		vet.setSpacing(15);
		vet.getChildren().addAll(name,text1,text2,pass,btn1);
		vet.setAlignment(Pos.CENTER);
		Scene scene=new Scene(vet,300,300);
		Stage stage=new Stage();
		stage.setScene(scene);
		
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			int count=0,y=0;
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
					vet.getChildren().add(name1);
					Scene scene=new Scene(vet,300,300);
					stage.setScene(scene);
					stage.show();
				}else {
					for(int i=0;i<4;i++) {
						if(i==(y-1))
						{
							if(aphy[i]!=0)
							{
								Label name1=new Label("Succes fully added");
								vet.getChildren().add(name1);
								Scene scene=new Scene(vet,300,300);
								stage.setScene(scene);
								stage.show();
								aphy[i]--;
								break;
							}
						}
					}
				}
			}
		});
		stage.setFullScreen(true);
		stage.show();
	}
}

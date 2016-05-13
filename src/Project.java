

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Project extends Application{

	BorderPane mainPane;
	GridPane pane;
	Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,dot,clear,clearAll,add,sub,mul,div,equal,sign,percent;
	Label screen;
	String input="";
	
	
	@Override
	public void start(Stage stage) throws Exception {
		
		createButtons();
		addButtons();
		binding();
		styling();
		handle();
					
				
					
					 Scene scene = new Scene(mainPane,350,550);
					 stage.setTitle("Calculator");
					 stage.setScene(scene);
					 stage.show();		
					
	 
}

	
void createButtons()
	{
		screen = new Label();

		 b0 = new Button("0");
		 b1 = new Button("1");
		 b2 = new Button("2");
		 b3 = new Button("3");
		 b4 = new Button("4");
		 b5 = new Button("5");
		 b6 = new Button("6");
		 b7 = new Button("7");			
		 b8 = new Button("8");
		 b9 = new Button("9");
		 dot = new Button(".");
		 clear = new Button("DEL");
		 clearAll = new Button("C");
		 add = new Button("+");
		 sub = new Button("-");
		 mul = new Button("X");
		 div = new Button("/");
		 equal = new Button("=");
		 percent = new Button("%");
		 sign = new Button("+/-");
	
	}

void addButtons()
{
	pane = new GridPane();
	// First Row
	       pane.add(clearAll, 0, 0);
	       pane.add(sign, 1, 0);
	       pane.add(percent, 2, 0);
	       pane.add(clear, 3, 0);
	// Second Row
	       pane.add(b7, 0, 1);
	       pane.add(b8, 1, 1);
	       pane.add(b9, 2, 1);
	       pane.add(div, 3, 1);
	// Third Row
	       pane.add(b4, 0, 2);
	       pane.add(b5, 1, 2);
	       pane.add(b6, 2, 2);
	       pane.add(mul, 3, 2);
	// Fourth Row
			pane.add(b1, 0, 3);
			pane.add(b2, 1, 3);
			pane.add(b3, 2, 3);
			pane.add(sub, 3, 3);
	// Fifth Row
			pane.add(b0, 0, 4 );
			pane.add(dot, 1, 4);
			pane.add(equal, 2, 4);
			pane.add(add, 3, 4);
			
			mainPane = new BorderPane();
			mainPane.setBottom(pane);
			mainPane.setTop(screen);
}
void binding()
	{
	                
		 pane.prefWidthProperty().bind(mainPane.widthProperty().divide(0.8));
		 pane.prefHeightProperty().bind(mainPane.heightProperty().divide(1.3));
		 screen.prefWidthProperty().bind(mainPane.widthProperty());
		 screen.prefHeightProperty().bind(mainPane.heightProperty().divide(40));
		 
		 
					b0.prefHeightProperty().bind(pane.heightProperty());
					b1.prefHeightProperty().bind(pane.heightProperty());
					b2.prefHeightProperty().bind(pane.heightProperty());
					b3.prefHeightProperty().bind(pane.heightProperty());
					b4.prefHeightProperty().bind(pane.heightProperty());
					b5.prefHeightProperty().bind(pane.heightProperty());
					b6.prefHeightProperty().bind(pane.heightProperty());
					b7.prefHeightProperty().bind(pane.heightProperty());
					b8.prefHeightProperty().bind(pane.heightProperty());
					b9.prefHeightProperty().bind(pane.heightProperty());
					add.prefHeightProperty().bind(pane.heightProperty());
					sub.prefHeightProperty().bind(pane.heightProperty());
					mul.prefHeightProperty().bind(pane.heightProperty());
					div.prefHeightProperty().bind(pane.heightProperty());
					equal.prefHeightProperty().bind(pane.heightProperty());
					dot.prefHeightProperty().bind(pane.heightProperty());
					clear.prefHeightProperty().bind(pane.heightProperty());
					clearAll.prefHeightProperty().bind(pane.heightProperty());
					percent.prefHeightProperty().bind(pane.heightProperty());
					sign.prefHeightProperty().bind(pane.heightProperty());
					
					    b0.prefWidthProperty().bind(pane.widthProperty());
						b1.prefWidthProperty().bind(pane.widthProperty());
						b2.prefWidthProperty().bind(pane.widthProperty());
						b3.prefWidthProperty().bind(pane.widthProperty());
						b4.prefWidthProperty().bind(pane.widthProperty());
						b5.prefWidthProperty().bind(pane.widthProperty());
						b6.prefWidthProperty().bind(pane.widthProperty());
						b7.prefWidthProperty().bind(pane.widthProperty());
						b8.prefWidthProperty().bind(pane.widthProperty());
						b9.prefWidthProperty().bind(pane.widthProperty());
						add.prefWidthProperty().bind(pane.widthProperty());
						sub.prefWidthProperty().bind(pane.widthProperty());
						mul.prefWidthProperty().bind(pane.widthProperty());
						div.prefWidthProperty().bind(pane.widthProperty());
						equal.prefWidthProperty().bind(pane.widthProperty());
						dot.prefWidthProperty().bind(pane.widthProperty());
						clear.prefWidthProperty().bind(pane.widthProperty());
						clearAll.prefWidthProperty().bind(pane.widthProperty());
						percent.prefWidthProperty().bind(pane.widthProperty());
						sign.prefWidthProperty().bind(pane.widthProperty());
					
						
						
	}
	
void styling()
{
		b0.setStyle("-fx-base: #ffffff; -fx-text-fill: black;");
		b1.setStyle("-fx-base: #ffffff; -fx-text-fill: black;");
		b2.setStyle("-fx-base: #ffffff; -fx-text-fill: black;");
		b3.setStyle("-fx-base: #ffffff; -fx-text-fill: black;");
		b4.setStyle("-fx-base: #ffffff; -fx-text-fill: black;");
		b5.setStyle("-fx-base: #ffffff; -fx-text-fill: black;");
		b6.setStyle("-fx-base: #ffffff; -fx-text-fill: black;");
		b7.setStyle("-fx-base: #ffffff; -fx-text-fill: black;");
		b8.setStyle("-fx-base: #ffffff; -fx-text-fill: black;");
		b9.setStyle("-fx-base: #ffffff; -fx-text-fill: black;");
		clear.setStyle("-fx-base: #ffffff; -fx-text-fill: black;");
		clearAll.setStyle("-fx-base: #ffffff; -fx-text-fill: black;");
		sign.setStyle("-fx-base: #ffffff; -fx-text-fill: black;");
		percent.setStyle("-fx-base: #ffffff; -fx-text-fill: black;");
		dot.setStyle("-fx-base: #ffffff; -fx-text-fill: black;");
		
		add.setStyle("-fx-base: #f7f7f7; -fx-text-fill: #ef820b;");
		sub.setStyle("-fx-base: #f7f7f7; -fx-text-fill: #ef820b;");
		mul.setStyle("-fx-base: #f7f7f7; -fx-text-fill: #ef820b;");
		div.setStyle("-fx-base: #f7f7f7; -fx-text-fill: #ef820b;");
		equal.setStyle("-fx-base: #ef820b; -fx-text-fill: white;");
		
		
				
	}
	
void handle()
{
		b0.setOnAction(e -> { input+="0";  screen.setText(input);});
		b1.setOnAction(e -> {  input+="1";  screen.setText(input);});
		b2.setOnAction(e -> { input+="2";  screen.setText(input);});
		b3.setOnAction(e -> {  input+="3";  screen.setText(input);});
		b4.setOnAction(e -> {  input+="4";  screen.setText(input);});
		b5.setOnAction(e -> {  input+="5";  screen.setText(input);});
		b6.setOnAction(e -> {  input+="6";  screen.setText(input);});
		b7.setOnAction(e -> {  input+="7";  screen.setText(input);});
		b8.setOnAction(e -> {  input+="8";  screen.setText(input);});
		b9.setOnAction(e -> {  input+="9";  screen.setText(input);});
		dot.setOnAction(e -> { input+="."; screen.setText(input); });
		add.setOnAction(e -> { input+="+"; screen.setText(input); });
		sub.setOnAction(e -> { input+="-"; screen.setText(input); });
		mul.setOnAction(e -> { input+="*"; screen.setText(input); });
		div.setOnAction(e -> { input+="/"; screen.setText(input); });
		percent.setOnAction(e -> { input+="%"; screen.setText(input);});
		equal.setOnAction(e -> { /*calculation_code*/  });
		clearAll.setOnAction(e -> { screen.setText("");  input="";});
		clear.setOnAction(e -> {
			input = screen.getText().substring(0,screen.getText().length()-1) ;
			screen.setText(input);
		});
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}

import javafx.application.Application;
import javafx.stage.Stage;

public class GUI extends Application {

	public static void main (String []args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage){
		// Set the stage title
		primaryStage.setTitle("My First GUI Application");
		
		// Show the window
		primaryStage.show();
		
	}

}

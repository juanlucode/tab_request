
import es.com.blogspot.juanlucode.TabRequest;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.scene.layout.VBox;

public class SampleTab extends Application {

	@Override
	public void start(Stage primaryStage) {
        
        VBox vBox = new VBox();
		primaryStage.setScene(new Scene(vBox));
		
		TabPane tabPane = new TabPane();
		vBox.getChildren().add(tabPane);
		
		
		TabRequest tabRequest = new TabRequest("VAL");
		tabPane.getTabs().add(tabRequest);
		
		primaryStage.setTitle("ejemplo");
		primaryStage.setWidth(300);
		primaryStage.setHeight(200);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}

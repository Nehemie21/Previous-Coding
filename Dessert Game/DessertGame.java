import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import java.util.Random;

// Nehemie Pluviose

public class DessertGame extends Application {

	private int score = 0;
	
    @Override
    public void start(final Stage stage) {
        // Step 1 & 2
        BorderPane borderPane = new BorderPane();
        Scene scene = new Scene(borderPane, 640, 480);
       stage.setTitle("Dessert in the Desert JavaFX Game");
        
       
		 
        // Step 3
        Label scoreLabel = new Label("Score: 0");
        borderPane.setTop(scoreLabel);
        BorderPane.setAlignment(scoreLabel, Pos.TOP_LEFT);

        Button exitButton = new Button("Exit");
        exitButton.requestFocus();
        exitButton.setOnAction(event -> {
            Platform.exit();
        });
        borderPane.setBottom(exitButton);
        BorderPane.setAlignment(exitButton, Pos.BOTTOM_RIGHT);
        
        // Step 4
        Pane pane = new Pane();
        borderPane.setCenter(pane);
        BorderPane.setAlignment(pane, Pos.CENTER);

        // TODO: Step 5-8
        VBox box = new VBox();
		box.setSpacing(8);
		box.setPadding(new Insets(16));
				

        Random rand = new Random();
    	Button[] button = new Button[8];
    		
		button[0] = new Button("Dessert");
	
		for(int i = 1; i < button.length; i++)
		{
			button[i] = new Button("Desert");
		}

		randomizeButtonPositions(rand, button);

		
    	for(int i = 0; i < button.length; i++)
		{
		
    		if(!box.getChildren().contains(button[i]))
    			box.getChildren().add(button[i]); 

		}
    	

    	
    	
		button[0].setOnAction( var ->
		{
			score++;
			scoreLabel.setText("Score: " + score);
			button[0].requestFocus();

		});
		
		for(int i = 1; i < button.length; i++)
		{
			button[i].setOnAction( var ->
			{
				score--;
				scoreLabel.setText("Score: " + score);
				button[1].requestFocus();

			});
		}
	
		
    pane.getChildren().addAll(button);
	
        stage.setScene(scene);
        stage.show();
    }

    private void randomizeButtonPositions(Random rand
    		, Button[] but)
    {
    	
    	rand = new Random();
    	for(int i = 0; i< but.length; i++)
    	{
    		but[i].setLayoutX(rand.nextInt(600));
    		but[i].setLayoutY(rand.nextInt(400));
    		
    	}
    }
    public static void main(String[] args) {
        Application.launch();
       
    }
}
//import java.util.Random;
//
//import javafx.application.Application;
//import javafx.application.Platform;
//import javafx.geometry.Insets;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.layout.BorderPane;
//import javafx.scene.layout.Pane;
//import javafx.scene.layout.VBox;
//import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.application.Platform;
import javafx.embed.swing.SwingNode;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.ScrollPane;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Random;
import java.util.zip.DataFormatException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

import java.util.ArrayList;
import java.util.List;

	public class RestaurantReceipt extends Application{

	private ArrayList<MenuInterface> list;
	private int xLayout = 0;
	private int yLayout = 0;
	
	public RestaurantReceipt() throws FileNotFoundException, IOException, DataFormatException {
			
			MenuDataReader test = new MenuDataReader();
			//File fileMovies = new File("C:\\Users\\Nehemie\\Downloads\\movies.csv");
			
			Reader inputFileReader = new StringReader("C:\\Users\\Nehemie\\Downloads\\movies.csv");
			list = (ArrayList<MenuInterface>) test.readDataSet(inputFileReader);
			
	}
	
	private int items = 0;
	
    public void start(final Stage stage) throws FileNotFoundException, IOException, DataFormatException {
        // Step 1 & 2
    	//Group root = new Group();
        BorderPane borderPane = new BorderPane();
        //Parent jf = new JFrame();
        Scene scene = new Scene(borderPane, 600, 400);
       // Scene scene2 = new Scene(root);
       stage.setTitle("Dessert in the Desert JavaFX Game");
       
      //  SwingNode swingNode = new SwingNode();
       RestaurantReceipt rest = new RestaurantReceipt();
              	
       	
        // Step 3
        Label scoreLabel = new Label("Items: 0");
        borderPane.setTop(scoreLabel);
        BorderPane.setAlignment(scoreLabel, Pos .TOP_LEFT);

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
		
	
//		ScrollPane scroller = new ScrollPane(box);
//		scroller.set
//		 ScrollBar s = new ScrollBar(box);  
//	        StackPane root = new StackPane();  
//	        root.getChildren().add(s); 
	        
	        
		
//        JTextArea textArea = new JTextArea(20, 20);  
//        JScrollPane scrollableTextArea = new JScrollPane(scoreLabel);  
//        scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
//        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
  
        //frame.getContentPane().add(scrollableTextArea);  
//		JTextArea textArea = new JTextArea(5, 30);
//		JScrollPane scrollPane = new JScrollPane(textArea);
//		scrollPane.setPreferredSize(new Dimension(450, 110));
//		textArea.add(scrollPane, BorderLayout.CENTER);

        Random rand = new Random();
        
    	Button[] button = new Button[rest.list.size()];
    	
    	int n = 0;
		for(int i = 0; i < button.length; i++)
		{
			
			String arg = "Item " + (n+1) + ": ";
			
			button[i] = new Button(arg);
			n++;

			//button[i].set
			//System.out.println(button[i].);
		}
		

		for(int i = 0; i < button.length; i++)
		{
			//this.yLayout += 1;

		}
		placeButtonPositions(button);
		JPanel panel = new JPanel();
	       JList<Button> list = new JList<Button>(button);
	  	 	JScrollPane scroll = new JScrollPane(list,
	  	 			JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
	  	 			JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	  	 	panel.add(scroll);

//		button[0] = dessert;
//		button[1] = desert1;
//		button[2] = desert2;
//		button[3] = desert3;
//		button[4] = desert4;
//		button[5] = desert5;
//		button[6] = desert6;
//		button[7] = desert7;

		//randomizeButtonPositions(rand, button);

		for(int i = 0; i < button.length; i++)
		{
		
		if(!box.getChildren().contains(button[i]))
		{
			box.getChildren().add(button[i]);

		}

		}
		
		for(int i = 0; i < button.length; i++)
		{
			button[i].setOnAction(var ->
			{
				items++;
				scoreLabel.setText("Items: " + items);
				
					});
			
		}

		button[0].setOnAction(var ->
		{
			items++;
			scoreLabel.setText("Items: " + items);
			
				});
    
    
    	
//		dessert.setOnAction( var ->
//		{
//			score++;
//			scoreLabel.setText("Score: " + score);
//			randomizeButtonPositions(rand, button);
//		    dessert.requestFocus();
//
//		});
		
		
		
      //  swingNode.setContent(panel);

    pane.getChildren().addAll(button);
   // pane.getChildren().add(swingNode);
    
    //    	borderPane.setLayoutX(rand.nextDouble() % 601);
//    	borderPane.setLayoutY(rand.nextDouble() % 401);
  
    
    
        stage.setScene(scene);
        
      //  ScrollPane scroll = new ScrollPane();
//        JPanel panel = new JPanel();
//        JList<Button> list = new JList<Button>(button);
//   	 	JScrollPane scroll = new JScrollPane(list,
//   	 			JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
//   	 			JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//   	 	panel.add(scroll);
        
   	 	
//        ScrollBar s1 = new ScrollBar(); 
//        s1.setOrientation(Orientation.VERTICAL);
//        scroll.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
//        ScrollBar s2 = new ScrollBar(); 
//        s2.setOrientation(Orientation.HORIZONTAL);
//
            //StackPane root = new StackPane(pane);  
          //  borderPane.addEventFilter(scroll);
           // borderPane.getChildren().add(s2);
            
            stage.show();

        
    }
    
    
    
    private static void createAndShowGUI() {  
    	  
        // Create and set up the window.  
        final JFrame frame = new JFrame("Scroll Pane Example");  
  
        // Display the window.  
        frame.setSize(500, 500);  
        frame.setVisible(true);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
  
        // set flow layout for the frame  
        frame.getContentPane().setLayout(new FlowLayout());  
  
        JTextArea textArea = new JTextArea(20, 20);  
        JScrollPane scrollableTextArea = new JScrollPane(textArea);  
        scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
  
        frame.getContentPane().add(scrollableTextArea);  
    }  

    private void placeButtonPositions(Button[] but)
    {

    	
    	for(int i = 0; i< but.length; i++)
    	{
    		
    		but[i].setLayoutX(this.xLayout);
    		but[i].setLayoutY(this.yLayout = this.yLayout + 30);
    		
    	}
    }
    public static void main(String[] args) {
       
    	Application.launch();
//    	launch(args);
//    	  javax.swing.SwingUtilities.invokeLater(new Runnable() {  
//    		  
//              public void run() {  
//                  createAndShowGUI();  
//              }  
//          });  
    }

}

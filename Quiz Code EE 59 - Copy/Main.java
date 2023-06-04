package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.*;
import javafx.scene.control.Label;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.paint.Color;
import java.io.FileInputStream;
import java.util.Properties;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
		
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		String Msg= timestamp +"\n";
		//System.out.println(dtf.format(now));  

        Gui gui = new Gui();
        Pane root = new Pane();
        MenuBar mb = new MenuBar();
        mb.setPrefWidth(2160);

        GridPane EdgeUI = gui.createUI();

		
		Menu Level= new Menu("Select level");
		Menu Data = new Menu("Add Game Data");
		Menu Game = new Menu("Play Game");
		
		MenuItem m111 = new MenuItem("Level 1");
		MenuItem m112 = new MenuItem("Level 2");
		MenuItem m113 = new MenuItem("Level 3");
		
		
		MenuItem m221 = new MenuItem("Step 1: Add Vertex");
        MenuItem m222 = new MenuItem("Delete Vertex");
        MenuItem m223 = new MenuItem("Modify Vertex");
		MenuItem m224 = new MenuItem("Step 2: Add Edge");
        MenuItem m225 = new MenuItem("Delete Edge");
        MenuItem m226 = new MenuItem("Modify Edge");
		MenuItem m227  = new MenuItem("Step 3: Display Graph");

        MenuItem m331 = new MenuItem("Enter Your Path");
		MenuItem m332 = new MenuItem("Get Correct Path");
		MenuItem m333 = new MenuItem("Save Result");
        


        // add menu items to menu

		
		
		Level.getItems().addAll(m111,m112,m113);
		Data.getItems().addAll(m221,m222,m223,m224,m225,m226,m227);
		Game.getItems().addAll(m331,m332,m333);
		

        // add menu to menu Bar
		mb.getMenus().add(Level);
		mb.getMenus().add(Data);
		mb.getMenus().add(Game);


        VBox vb = new VBox(mb);

        EventHandler<ActionEvent> event = e -> {
            Pane NodeUI = new Pane();
			if(e.getSource() == m111){
                NodeUI = gui.createUI();
                gui.addNodeUIControls((GridPane) NodeUI,"Add Level 1");
            }
			if(e.getSource() == m112){
                NodeUI = gui.createUI();
                gui.addNodeUIControls((GridPane) NodeUI,"Add Level 1");
            }
			if(e.getSource() == m113){
                NodeUI = gui.createUI();
                gui.addNodeUIControls((GridPane) NodeUI,"Add Level 1");
            }
			
            if(e.getSource() == m221)
            {
                NodeUI = gui.createUI();
                gui.addNodeUIControls((GridPane) NodeUI,"Add Node");
            }
            
            if(e.getSource() == m222){
                NodeUI = gui.createUI();
                gui.addSearchUI((GridPane) NodeUI,"Delete Node");
            }
            if(e.getSource() == m223){
                NodeUI = gui.createUI();
                gui.addNodeUIControls((GridPane) NodeUI,"Modify Node");
            }
            if(e.getSource() == m224){
                NodeUI = gui.createUI();
                gui.addEdgeUIControls((GridPane) NodeUI,"Add Edge");
            }

            if(e.getSource() == m225){
                NodeUI = gui.createUI();
                gui.addSearchEdgeUI((GridPane) NodeUI,"Delete Edge");
            }
            if(e.getSource() == m226){
                NodeUI = gui.createUI();
                gui.addEdgeUIControls((GridPane) NodeUI,"Modify Edge");
            }
			
			if(e.getSource() == m227){
                gui.GraphGui(NodeUI);
            }
			
            if(e.getSource() == m331){
                NodeUI = gui.createUI();
                gui.addyourpath((GridPane) NodeUI,"Enter Your Path");
            }
			if(e.getSource() == m332)
			{
                NodeUI = gui.createUI();
                gui.addSearchEdgeUI((GridPane) NodeUI,"Get Path");
            }
			
            if(e.getSource() == m333){
                NodeUI = gui.createUI();
                gui.addImportUI((GridPane) NodeUI,"Export");
            }

            


            Group newRoot = new Group();
			Label bb = new Label("This is a label");
			newRoot.getChildren().add(bb);
           // newRoot.getChildren().addAll(NodeUI,vb,bb);
			
			

            primaryStage.setTitle("Dijkstra Game Test");
			
            primaryStage.setScene(new Scene(newRoot, 600, 520));
            primaryStage.show();

        };

        m111.setOnAction(event);
		m112.setOnAction(event);
		m113.setOnAction(event);
		
		m221.setOnAction(event);
        m222.setOnAction(event);
        m223.setOnAction(event);
        m224.setOnAction(event);
        m225.setOnAction(event);
        m226.setOnAction(event);
        m227.setOnAction(event);
		
        m331.setOnAction(event);
        m332.setOnAction(event);
        m333.setOnAction(event);
   
       // Label bb = new Label("This is a label");
		//bb.setFont(new Font("Arial", 24));
		
		GridPane gridpane = new GridPane();
		gridpane.setPadding(new Insets(5));
		gridpane.setHgap(10);
		gridpane.setVgap(10);
       //////
	    	 
	 Msg=Msg+(System.getProperty("user.name"))+"\n";
	 Msg=Msg+(System.getProperty("user.home"))+"\n";
	 Msg=Msg+(System.getProperty("user.dir"))+"\n";
	 Msg=Msg+(System.getProperty("os.version"))+"\n";
	 Msg=Msg+(System.getProperty("os.name"))+"\n";
	 Msg=Msg+(System.getProperty("os.arch"))+"\n";
   	 Msg=Msg+(System.getProperty("java.specification.version"))+"\n";
	 Msg=Msg+(System.getProperty("java.vm.version"))+"\n";
	 Msg=Msg+(System.getProperty("java.class.path"))+"\n";
	 Msg=Msg+(System.getProperty("java.compiler"))+"\n";
	 Msg=Msg+(System.getProperty("java.vendor.url"))+"\n";

///
	 System.out.println(Msg);
     InetAddress ip;
    try {
            
        ip = InetAddress.getLocalHost();
        //System.out.println("Current IP address : " + ip.getHostAddress());
        Msg=Msg+ip.getHostAddress()+"\n";
        NetworkInterface network = NetworkInterface.getByInetAddress(ip);
            
        byte[] mac = network.getHardwareAddress();
            
       // System.out.print("Current MAC address : ");
            
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mac.length; i++) {
            sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));		
        }
		Msg=Msg+sb.toString();
        System.out.println(Msg );
            
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
			
		} catch (SocketException e){
				
			e.printStackTrace();
				
		}
    
	   
	   /////
		Label label = new Label(Msg);
		label.setTextFill(Color.web("#0076a3"));
		GridPane.setHalignment(label, HPos.CENTER);
		gridpane.add(label, 5, 5);
		//Scene scene = new Scene(bb, 200, 100);
		//root.getChildren().add(bb);
           // newRoot.getChildren().addAll(NodeUI,vb,bb);
        root.getChildren().addAll(EdgeUI,vb);
		root.getChildren().add(gridpane);
		

        primaryStage.setTitle("Dijkstra Game - OOP Quiz EE 59                       .");
        primaryStage.setScene(new Scene(root, 600, 520));
		
		
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
       
		
    }
}

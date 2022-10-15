package dad.buscaryreemplazar;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarYReemplazar extends Application{
	
	private TextField buscarText, reemplazarText;
	private Button buscarButton, reemplazarButton, reempTodoButton, cerrarButton, ayudaButton; 
	private Label mayMinLabel, expRegLabel, buscAtrasLabel, resResLabel;
	private Label buscarLabel, reemplazarLabel;
	private CheckBox mayMinCheck, expRegCheck, buscAtrasCheck, resResCheck;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
			
		buscarText = new TextField();
		
		reemplazarText = new TextField();
		
		buscarLabel = new Label();
		buscarLabel.setText("Buscar: ");
		buscarLabel.setMinHeight(34);
		buscarLabel.setAlignment(Pos.CENTER_LEFT);

		reemplazarLabel = new Label();
		reemplazarLabel.setText("Reemplazar con: ");
		reemplazarLabel.setAlignment(Pos.CENTER_LEFT);
		
		mayMinCheck = new CheckBox();
		expRegCheck = new CheckBox();
		buscAtrasCheck = new CheckBox();
		resResCheck = new CheckBox();

		
		mayMinLabel = new Label();
		mayMinLabel.setText("Mayúsculas y minúsculas");
		mayMinLabel.setPadding(new Insets(0, 5, 0, 5));
		
		expRegLabel = new Label();
		expRegLabel.setText("Expresión regular");
		expRegLabel.setPadding(new Insets(0, 5, 0, 5));

		buscAtrasLabel = new Label();
		buscAtrasLabel.setText("Buscar hacia atrás");
		buscAtrasLabel.setPadding(new Insets(0, 5, 0, 5));

		resResLabel = new Label();
		resResLabel.setText("Resaltar resultados");
		resResLabel.setPadding(new Insets(0, 5, 0, 5));

		
		GridPane gp = new GridPane();
		gp.setPadding(new Insets(5));
		gp.setHgap(0);
		gp.setVgap(5);
		gp.addRow(0, buscarText);
		gp.addRow(1, reemplazarText);
		gp.addRow(2, mayMinCheck, mayMinLabel, buscAtrasCheck, buscAtrasLabel);
		gp.addRow(3, expRegCheck, expRegLabel, resResCheck, resResLabel);
		gp.setAlignment(Pos.TOP_CENTER);
		
		ColumnConstraints[] cols = { new ColumnConstraints(), new ColumnConstraints(), new ColumnConstraints() };
		gp.getColumnConstraints().setAll(cols);
		cols[0].setHalignment(HPos.RIGHT);
		cols[0].setHgrow(Priority.NEVER);
		cols[0].setMinWidth(Control.USE_PREF_SIZE);
		cols[1].setHgrow(Priority.ALWAYS);

		GridPane.setColumnSpan(buscarText, 200);
		GridPane.setColumnSpan(reemplazarText, 200);
		
		buscarButton = new Button("Buscar");
		buscarButton.setMinWidth(120);
		
		reemplazarButton = new Button("Reemplazar");
		reemplazarButton.setMinWidth(120);
		
		reempTodoButton = new Button("Reemplazar todo");
		reempTodoButton.setMinWidth(120);
		
		cerrarButton = new Button("Cerrar");
		cerrarButton.setMinWidth(120);
		
		ayudaButton = new Button("Ayuda");
		ayudaButton.setMinWidth(120);
		
		VBox buttonsPanel = new VBox();
		buttonsPanel.setAlignment(Pos.TOP_RIGHT);
		buttonsPanel.getChildren().addAll(buscarButton, reemplazarButton, reempTodoButton, cerrarButton, ayudaButton);
		buttonsPanel.setFillWidth(false);
		buttonsPanel.setSpacing(5);
		buttonsPanel.setPadding(new Insets(5, 5, 0, 0));
		
		VBox labelPanel = new VBox();
		labelPanel.setAlignment(Pos.TOP_LEFT);
		labelPanel.getChildren().addAll(buscarLabel, reemplazarLabel);
		labelPanel.setFillWidth(false);
		labelPanel.setSpacing(5);
		labelPanel.setPadding(new Insets(0, 0, 0, 5));

		
		HBox root = new HBox(5, labelPanel, gp, buttonsPanel);
		root.setAlignment(Pos.CENTER);
		
		primaryStage.setTitle("Buscar y Reemplazar");
		primaryStage.setScene(new Scene(root, 560, 220));
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}

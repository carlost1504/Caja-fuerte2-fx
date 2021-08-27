package ui;

import control.CajaFuerte_Inicio;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		CajaFuerte_Inicio cajaFuerte=new CajaFuerte_Inicio();
		cajaFuerte.show();
		
	}

}

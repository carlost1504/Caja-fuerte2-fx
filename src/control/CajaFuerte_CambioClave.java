package control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CajaFuerte_CambioClave extends Stage {

	//component UI
    private TextField n1_tx;
    private TextField n2_tx;
    private TextField n3_tx;
    private TextField n4_tx;
    private TextField n5_tx;
    private TextField n6_tx;
    private TextField NewN1_tx;
    private TextField NewN2_tx;
    private TextField NewN3_tx;
    private TextField NewN4_tx;
    private TextField NewN5_tx;
    private TextField NewN6_tx;
    private Button cambioClave;
    private Button salirApp;
    
    public CajaFuerte_CambioClave() {
    	try {
			FXMLLoader loader=new FXMLLoader(getClass().getResource("CajaFuerte_CambioClave.fxml"));
    		Parent root=loader.load();
    		
    		//add controls
    		n1_tx = (TextField) loader.getNamespace().get("n1_tx");
    		n2_tx = (TextField) loader.getNamespace().get("n2_tx");
    		n3_tx = (TextField) loader.getNamespace().get("n3_tx");
    		n4_tx = (TextField) loader.getNamespace().get("n4_tx");
    		n5_tx = (TextField) loader.getNamespace().get("n5_tx");
    		n6_tx = (TextField) loader.getNamespace().get("n6_tx");
    		NewN1_tx = (TextField) loader.getNamespace().get("NewN1_tx");
    		NewN2_tx = (TextField) loader.getNamespace().get("NewN2_tx");
    		NewN3_tx = (TextField) loader.getNamespace().get("NewN3_tx");
    		NewN4_tx = (TextField) loader.getNamespace().get("NewN4_tx");
    		NewN5_tx = (TextField) loader.getNamespace().get("NewN5_tx");
    		NewN6_tx = (TextField) loader.getNamespace().get("NewN6_tx");
    		cambioClave = (Button) loader.getNamespace().get("cambioClave");
    		salirApp = (Button) loader.getNamespace().get("salirApp");
    		
    		
    		
    		//proyecteScene
    		Scene scene=new Scene(root,600,400);
    		setScene(scene);
    		//bt
    		EnterCajaText();
    		exit();
    		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	
    }
    
    public void EnterCajaText() {
    	System.out.print("aquivoyu");
    	
		char n1= n1_tx.getText().charAt(0);
		char n2= n2_tx.getText().charAt(0);
		char n3= n3_tx.getText().charAt(0);
		char n4= n4_tx.getText().charAt(0);
		char n5= n5_tx.getText().charAt(0);
		char n6= n6_tx.getText().charAt(0);
		String passwore1 ="";
		passwore1 = (""+n1+n2+n3+n4+n5+n6);
		char n1_1= NewN1_tx.getText().charAt(0);
		char n1_2= NewN2_tx.getText().charAt(0);
		char n1_3= NewN3_tx.getText().charAt(0);
		char n1_4= NewN4_tx.getText().charAt(0);
		char n1_5= NewN5_tx.getText().charAt(0);
		char n1_6= NewN6_tx.getText().charAt(0);
		//String passwore1_new ="";
		//passwore1_new = (""+n1+n2+n3+n4+n5+n6);
		System.out.println("clave dijit"+ passwore1);
		System.out.println("clave ACTUAL"+ password.Clave);
		if(passwore1.equals(password.Clave)) {
			System.out.println("entro btt efe");
			cambioClave.setOnAction(Event->{
				CajaFuerte_Inicio p=new CajaFuerte_Inicio();
				password.Clave=(""+n1_1+n1_2+n1_3+n1_4+n1_5+n1_6);
				System.out.println(password.Clave);
				p.show();
				
				
			});
		}else System.out.println("clave erronea");
    }
    
    public void exit() {
		
    	salirApp.setOnAction(event->{
			System.exit(0);
		});
	}

}
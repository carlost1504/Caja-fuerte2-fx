package control;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CajaFuerte_Inicio extends Stage {

    
    private TextField n1_tx; 
    private TextField n2_tx;    
    private TextField n3_tx;   
    private TextField n4_tx;   
    private TextField n5_tx;    
    private TextField n6_tx;      
    private Button EnterToBox;  
    public String Clave;
    

    public CajaFuerte_Inicio() {
    	try {
    		FXMLLoader loader=new FXMLLoader(getClass().getResource("CajaFuerte_Inicio.fxml"));
    		Parent root=loader.load();
    		EnterToBox=(Button)loader.getNamespace().get("EnterFolder");
    		n1_tx = (TextField) loader.getNamespace().get("n1_tx");
    		n2_tx = (TextField) loader.getNamespace().get("n2_tx");
    		n3_tx = (TextField) loader.getNamespace().get("n3_tx");
    		n4_tx = (TextField) loader.getNamespace().get("n4_tx");
    		n5_tx = (TextField) loader.getNamespace().get("n5_tx");
    		n6_tx = (TextField) loader.getNamespace().get("n6_tx");
    		
    		
    		Scene scene=new Scene(root,600,400);
    		setScene(scene);
    		buttonEnter();
    		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
    
    
    
    
    public void inicialite() {
    	Clave=""+"123456";
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
		System.out.println("clave dijit"+ passwore1);
		System.out.println("clave ACTUAL"+ password.Clave);
		if(passwore1.equals(password.Clave)) {
			
			EnterToBox.setOnAction(Event->{
				CajaFuerte_Text p=new CajaFuerte_Text();
				p.show();
				
				
			});
		}else System.out.println("clave erronea");
    }
    
    public void buttonEnter() {
    	EnterToBox.setOnAction(Event->{
    		EnterCajaText();
    		System.out.println(0);
		});
    }
    
    
   

}
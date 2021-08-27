package control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class CajaFuerte_Text extends Stage {

	//component UI
    private TextArea textSeguro;
    private Button CambiarClave1;
    private Button guardarysalir;
    
    
    public CajaFuerte_Text() {
    	try {
			FXMLLoader loaderTesor=new FXMLLoader(getClass().getResource("CajaFuerte_Text.fxml"));
    		Parent root=loaderTesor.load();
    		
    		textSeguro = (TextArea) loaderTesor.getNamespace().get("exitBtt");
    		CambiarClave1 = (Button) loaderTesor.getNamespace().get("CambiarClave1");
    		guardarysalir = (Button) loaderTesor.getNamespace().get("guardarysalir");
    		
    		
    		Scene scene=new Scene(root,600,400);
    		setScene(scene);
    		
    		cambioClave();
    		exit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }
    
    public void cambioClave() {
		
    	CambiarClave1.setOnAction(event->{
    		CajaFuerte_CambioClave p=new CajaFuerte_CambioClave();
			p.show();
    	});
	}
    
    public void exit() {
		
    	guardarysalir.setOnAction(event->{
			System.exit(0);
		});
	}

}

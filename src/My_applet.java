import java.applet.Applet;
import java.awt.Label;
import java.awt.TextField;


public class My_applet extends Applet{
	

	TextField username=new TextField("enter username",20);
	Label usernamelable=new Label("Enter username");
	
	
	public void init(){
		add(usernamelable);
		add(username);
		
	}
	
	public void Changetext(String text){
		usernamelable.setText(text);
	}

}

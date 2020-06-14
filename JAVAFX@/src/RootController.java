
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class RootController implements Initializable {

	@FXML private Button btn1; //@FXML 어노테이션으로 3개의 멤버변수를 사용할 수 있게 의존성 주입.
	@FXML private Button btn2;
	@FXML private Button btn3;

	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
      btn1.setOnAction(new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent event) {//첫번째 버튼 클릭시 호출
			handleBtn1Action(event);
		}    	  
      });//익명객체 문법으로 첫번째 이벤트 등록	=>RootController$1.class
      
      btn3.setOnAction(event -> handleBtn3Action(event));//람다식으로 3번째 버튼 이벤트등록
	}
	
	public void handleBtn1Action(ActionEvent event) {
		System.out.println("버튼 1을 클릭함.");
	}
	
    public void handleBtn2Action(ActionEvent event) {
    	System.out.println("두번째 버튼 클릭함");
    }
    
    public void handleBtn3Action(ActionEvent event) {
    	System.out.println("3번째 버튼 클릭함");
    }
}



















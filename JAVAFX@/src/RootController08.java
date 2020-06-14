
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public class RootController08 implements Initializable {

	@FXML private AnchorPane root;
	@FXML private Circle circle;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		circle.centerXProperty().bind(Bindings.divide(root.widthProperty(),2));
		//원의 x 중심좌표를 연산
		circle.centerYProperty().bind(Bindings.divide(root.heightProperty(),2));
/* 1.윈도우 창의 크기가 변경되더라도 항상 화면 정중앙에 원을 그린다.루트 레이아웃의 폭과 높이를 원의 중심과 바인
 * 딩(묶음->묶어서 연결. 이름을 어떤 속성과 연결 짓는 과정을 말함.)하기 위해서 1/2 연산을 해야 하므로 
 * Bindings.divide()메서드를 사용 		
 */
	}
}












import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

public class RootController07 implements Initializable {

	@FXML private TextArea textArea1;
	@FXML private TextArea textArea2;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Bindings.bindBidirectional(textArea1.textProperty(),textArea2.textProperty());
/* 1.양방향 바인딩이 가능하다. 바인딩이란 하나의 속성이 변경되면 자동으로 다른 속성도 함께 묶어져서 연관되어
 * 변경되는 것을 말한다.
 * 결국 한쪽의 TextArea 내용을 입력했을 때 다른 쪽 TextArea에도 동일 내용이 자동 입력된다. 반대도 가능하다.
 * 물론,한쪽 입력박스 내용을 지우면 다른 쪽 입력박스 내용도 함께 지워진다.		
 */
	}
}

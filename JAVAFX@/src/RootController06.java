
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.text.Font;

public class RootController06 implements Initializable {

	@FXML private Label label;
	@FXML private Slider slider;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		slider.valueProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable,
					Number oldValue, Number newValue) {
				label.setFont(new Font(newValue.doubleValue()));//라벨에 새로운 글꼴 크기를
				//설정=>슬라이더가 변경되면 라벨 글자크기가 변경된다.
			}//슬라이더가 변경되었을때 호출			
		});//슬라이더 이벤트 등록을 익명객체문법으로 처리
	}
}





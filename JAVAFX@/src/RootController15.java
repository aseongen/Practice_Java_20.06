import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

public class RootController15 implements Initializable {
	@FXML private TextArea textArea;

	@Override
	public void initialize(URL location, ResourceBundle arg1) {
	}

//새로 만들기
	public void handleNew(ActionEvent event) {
		textArea.appendText("New\n");// TextArea에 추가, 기존 내용을 유지한채로 추가\n으로 줄바꿈
	}
	//열기
	public void handleOpen(ActionEvent event) {
		textArea.appendText("Open\n");
	}
	//저장
	public void handleSave(ActionEvent event) {
		textArea.appendText("Save\n");
	}
	//끝내기
	public void handleExit(ActionEvent event) {
        Platform.exit();
	}
}

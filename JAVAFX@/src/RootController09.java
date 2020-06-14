
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class RootController09 implements Initializable {

	@FXML private CheckBox chk1;//의존성 주입
	@FXML private CheckBox chk2;//CheckBox는 네모 버튼을 만들고 복수개를 선택가능하게 한다.
	@FXML private ImageView checkImageView;
	@FXML private ToggleGroup group;
	@FXML private ImageView radioImageView;
	@FXML private Button btnExit;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
			@Override
			public void changed(ObservableValue<? extends Toggle> obj, 
					Toggle oldValue, Toggle newValue) {
			 Image image=new Image(getClass().getResource(
					 "images/"+newValue.getUserData().toString()+".png").toString());
			 radioImageView.setImage(image);
			 //해당 이미지 뷰 영역에 출력되게 설정
			}//라디오 버튼 선택 변경시 호출. newValue에 마지막으로 선택된 라디오 버튼이 대입.
			//newValue.getUserData()메서드로 root_09.xml에 설정된 userData속성값을 가져옴.
		});//익명클래스
	}
	
	//체크박스 버튼 클릭시 호출되는 메서드
	public void handleChkAction(ActionEvent e) {
		if(chk1.isSelected() == true && chk2.isSelected()) {//==true가 생략됨.
			//두개의 체크박스 모두 선택된 경우 실행
			checkImageView.setImage(new Image(
				getClass().getResource("images/geek-glasses-hair.gif").toString()));			
		}else if(chk1.isSelected()) {
			checkImageView.setImage(new Image(
				getClass().getResource("images/geek-glasses.gif").toString()));
		}else if(chk2.isSelected()) {
			checkImageView.setImage(new Image(
					getClass().getResource("images/geek-hair.gif").toString()));
		}else {
			checkImageView.setImage(new Image(
					getClass().getResource("images/geek.gif").toString()));
		}//if else if
	}
	
	public void handleBtnExitAction(ActionEvent event) {
       Platform.exit();//윈도우 창 종료		
	}
}

















import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class RootController10 implements Initializable {

	@FXML private TextField txtTitle;//의존성 주입
	@FXML private PasswordField txtPassword;
	@FXML private ComboBox<String> comboPublic;
	@FXML private DatePicker dateExit;//DatePicker는 날짜 선택 컨트롤
	@FXML private TextArea txtContent;
	//TextArea는 한줄이상 입력박스
	
	@Override
	public void initialize(URL location, ResourceBundle res) {
	}
	
	//등록버튼 클릭시 호출
	public void handleBtnRegAction(ActionEvent e) {
		String title=txtTitle.getText();//제목
		System.out.println("title : "+title);
		
		String password=txtPassword.getText();//비번
        System.out.println("password : "+password);
        
        String strPublic = comboPublic.getValue();//콤보박스 목록아이템
        System.out.println("public : "+strPublic);
        
        LocalDate localDate = dateExit.getValue();//날짜
        if(localDate != null) {
        	System.out.println("선택날짜 : "+localDate.toString());//문자열로 출력
        }
        
        String content = txtContent.getText();//내용
        System.out.println("내용 : "+content);
 	}
	
	//취소 버튼 클릭시 호출
	public void handleBtnCancelAction(ActionEvent e) {
		Platform.exit();//윈도우 창 닫기
	}
}



















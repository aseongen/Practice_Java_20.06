

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class RootController11 implements Initializable {

	@FXML private ListView<String> listView;
	@FXML private TableView<Phone> tableView;	
	@FXML private ImageView imageView;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		listView.setItems(FXCollections.observableArrayList(
			"갤럭시S1", "갤럭시S2", "갤럭시S3", "갤럭시S4", "갤럭시S5", "갤럭시S6", "갤럭시S7"
		));//리스트 뷰에 항목을 추가
		listView.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {//selectedIndexProperty 리스트 뷰에서 선택된 행의 인덱스 번호값을 얻는다.
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {//리스트 뷰 항목을 선택하면 호출
				tableView.getSelectionModel().select(newValue.intValue());//newValue.intValue() 로 선택된 인덱스 번호값을 기본타입 int로 변경해서 해당 테이블 뷰 행을 선택하게하고
				tableView.scrollTo(newValue.intValue());//스크롤 되게 한다.
			}
		});//익명클래스 => RootController11$1.class
		
		ObservableList phoneList = FXCollections.observableArrayList(
		    new Phone("갤럭시S1", "phone01.png"),
		    new Phone("갤럭시S2", "phone02.png"),
		    new Phone("갤럭시S3", "phone03.png"),
		    new Phone("갤럭시S4", "phone04.png"),
		    new Phone("갤럭시S5", "phone05.png"),
		    new Phone("갤럭시S6", "phone06.png"),
		    new Phone("갤럭시S7", "phone07.png")
		);//테이블 뷰 행에 데이터를 주기 위해 ObservableList에 Phone모델 객체를 위와 같이 저장
		
		TableColumn tcSmartPhone = tableView.getColumns().get(0);//테이블 뷰의 첫번째 컬럼을 얻는다. 첫번째 컬럼 인덱스 번호가 0
		tcSmartPhone.setCellValueFactory(
			new PropertyValueFactory("smartPhone") //Phone클래스 모델 속성명 smartPhone(멤버변수명)을 이용해서 모델 속성값을 첫번째 테이블 컬럼값 으로 셋팅한다. 
		);
		tcSmartPhone.setStyle("-fx-alignment: CENTER;");//JAVA FX CSS를 적용해서 중앙정렬시킨다.
		
		TableColumn tcImage = tableView.getColumns().get(1);//테이블 뷰의 두번째 컬럼을 얻는다. 두번째 컬럼 인덱스 번호는 1
		tcImage.setCellValueFactory(
			new PropertyValueFactory("image") //Phone클래스 모델 속성명 image(멤버변수명)을 이용해서 모델 속성값을 두번째 테이블 컬럼값으로 셋팅한다.
	    );
		tcImage.setStyle("-fx-alignment: CENTER;");
		
		tableView.setItems(phoneList);//테이블 뷰 행에 phoneList를 추가한다.
		
		tableView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Phone>() {//selectedItemProperty는 테이블 뷰의 선택된 행의 Phone모델 객체를 얻는다.
			@Override
			public void changed(ObservableValue<? extends Phone> observable, Phone oldValue, Phone newValue) {//테이블 뷰의 행이 선택되어 지면 호출
				if(newValue!=null) {
					imageView.setImage(new Image(getClass().getResource("images/" + newValue.getImage()).toString()));//newValue.getImage().toString()
					//을 선택된 행의 image컬럼 값 폰 이미지 파일명을 문자열로 읽어들인다.읽어들인 폰 이미지 파일명으로 Image객체를 생성하여 ImageView에 해당폰 이미지를 설정해서 출력되게 한다.
				}
			}
		});//익명객체
	}
	
	public void handleBtnOkAction(ActionEvent e) {//확인 버튼을 클릭하면 호출
		String item = listView.getSelectionModel().getSelectedItem();//리스트 뷰 선택항목을 구함.
		System.out.println("ListView 스마트폰: " + item);//선택항목을 이클립스 콘솔에 출력
		
		Phone phone = tableView.getSelectionModel().getSelectedItem();//테이블 뷰 선택항목을 구함.
		System.out.println("TableView 스마트폰: " + phone.getSmartPhone());//스마트 폰명을 콘솔에 출력
		System.out.println("TableView 이미지: " + phone.getImage());//이미지 파일명을 콘솔에 출력
	}
	
	public void handleBtnCancelAction(ActionEvent e) {//취소 버튼을 클릭하면 호출
		Platform.exit();//윈도우 창 닫기
	}

}

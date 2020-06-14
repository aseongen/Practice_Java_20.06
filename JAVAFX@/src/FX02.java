
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class FX02 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		//무대는 한 번에 하나의 장면(Scene)을 가질수 있다.
		VBox root=new VBox();//VBox 컨테이너(레이아웃)은 컴포넌트(컨트롤,ui객체)를 수직으로 배치
		root.setPrefWidth(380);//레이아웃 너비
		root.setPrefHeight(150);//VBox 높이
		root.setAlignment(Pos.CENTER);//컨트롤 중앙정렬
		root.setSpacing(20);//컨트롤 수직간격
		
        Label label = new Label();//라벨 컨트롤은 설명을 덧붙일때 사용
        label.setText("Hello, Java FX");//라벨위 문자 설정
        label.setFont(new Font(50));//글자크기 글꼴설정
        
        Button button = new Button();
        button.setText("확인");//버튼위 캡션문자열 설정
        button.setOnAction(event -> Platform.exit());//버튼 이벤트를 람다식으로 처리
        //확인 버튼 클릭하면 윈도우 창 종료
        
        root.getChildren().add(label);//VBox에 자식노드로 라벨 추가
        root.getChildren().add(button);//레이아웃에 버튼추가
        
        Scene scene = new Scene(root);//레이아웃으로 장면 객체 생성
        primaryStage.setTitle("프로그램적 Fx");
        primaryStage.setScene(scene);//무대위에 장면을 올림
        primaryStage.show();//무대 윈도우 보여주기
	}
	public static void main(String[] args) {
       launch(args);//start() 호출
	}
}

















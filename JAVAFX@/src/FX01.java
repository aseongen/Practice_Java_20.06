
import javafx.application.Application;
import javafx.stage.Stage;

public class FX01 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		//Stage는 무대를 뜻함.
		primaryStage.show();//무대위에 윈도우 화면 보여주기
	}
	public static void main(String[] args) {
     launch(args);//메인 Application을 생성하고, 윈도우를 생성하기 위한 start()를 호출
	}
}

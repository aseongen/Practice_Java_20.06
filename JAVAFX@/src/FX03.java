
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FX03 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("root_15.xml"));
		//xml파일을 읽어들임.
		Scene scene = new Scene(root);//장면객체 생성
		
        primaryStage.setTitle("FXML 레이아웃");//윈도우 제목설정
        primaryStage.setScene(scene);//무대위 장면 설정
        primaryStage.show();//무대 윈도우 보기
	}
	public static void main(String[] args) {
       launch(args);
	}
}






import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class RootController12 implements Initializable {

	@FXML private MediaView mediaView;
	@FXML private ImageView imageView;
	@FXML private Button btnPlay;
	@FXML private Button btnPause;
	@FXML private Button btnStop;
	
	private boolean endOfMedia;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
      //미디어 객체 생성
	  //Media media = new Media(getClass().getResource("media/video.m4v").toString());
     Media media = new Media(getClass().getResource("media/audio.wav").toString());
	  
	  //미디어 플레이어 생성 및 미디어 뷰에 설정
	  MediaPlayer mediaPlayer = new MediaPlayer(media);
	  mediaView.setMediaPlayer(mediaPlayer);
	  
	  //미디어 준비 상태가 되면 실행할 Runnable 설정
	  mediaPlayer.setOnReady(new Runnable() {
		@Override
		public void run() {
			btnPlay.setDisable(false); btnPause.setDisable(true);
			btnStop.setDisable(true);
			if(mediaPlayer.isAutoPlay()) {
				mediaView.setVisible(false);
			}
		}//재생 버튼 활성화, 멈춤/중지 비활성화		  
	  });//익명객체
	  
	  mediaPlayer.setOnPlaying(()->{//재생일때
		  btnPlay.setDisable(true); btnPause.setDisable(false);
		  btnStop.setDisable(false);
	  });//재생 비활성화, 멈춤/중지는 활성화
	  
	  mediaPlayer.setOnPaused(()->{//일시 정지(멈춤)
		  btnPlay.setDisable(false); btnPause.setDisable(true);
		  btnStop.setDisable(false);
	  });//재생/중지 활성화, 멈춤이 비활성화
	  
	  mediaPlayer.setOnEndOfMedia(()->{//미디어 소스가 모두 재생했을때
		  endOfMedia=true;
		  btnPlay.setDisable(false); btnPause.setDisable(true);
		  btnStop.setDisable(true);
	  });//재생 활성화, 멈춤/중지 비활성화
	  
      mediaPlayer.setOnStopped(()->{//중지일때
    	  mediaPlayer.seek(mediaPlayer.getStartTime());//재생 위치 처음으로 돌린다.
    	  btnPlay.setDisable(false); btnPause.setDisable(true);
		  btnStop.setDisable(true);
      });//재생 활성화, 멈춤/중지 비활성화
      
      //재생버튼 액션이벤트 처리
      btnPlay.setOnAction(event -> {
    	  if(endOfMedia) {
    		  mediaPlayer.stop();//재생 중지
              mediaPlayer.seek(mediaPlayer.getStartTime());//재생위치 처음으로 돌림    		  
    	  }
    	  mediaPlayer.play();//미디어 재생
    	  endOfMedia = false;
      });
      btnPause.setOnAction(event->mediaPlayer.pause());//미디어 일시정지
      btnStop.setOnAction(event -> mediaPlayer.stop());//미디어 중지      
	}
}

























import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

public class RootController13 implements Initializable {

	@FXML private MediaView mediaView;
	@FXML private ImageView imageView;
	@FXML private Button btnPlay;
	@FXML private Button btnPause;
	@FXML private Button btnStop;
	
	@FXML private Label labelTime;	
	@FXML private Slider sliderVolume;
	@FXML private ProgressBar progressBar;
	@FXML private ProgressIndicator progressIndicator;
	
	private boolean endOfMedia;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//미디어 객체 생성
		Media media = new Media(getClass().getResource("media/video.mp4").toString());
		//Media media = new Media(getClass().getResource("media/audio.wav").toString());
		
		//미디어 플레이어 생성 및 미디어 뷰에 설정
		MediaPlayer mediaPlayer = new MediaPlayer(media);
		mediaView.setMediaPlayer(mediaPlayer);
	
		//해당 상태가 되면 실행할 Runnable 설정
		mediaPlayer.setOnReady(new Runnable() {//미디어 준비 상태가 될때 실행
			@Override
			public void run() {
				mediaPlayer.currentTimeProperty().addListener(new ChangeListener<Duration>() {
					@Override
					public void changed(ObservableValue<? extends Duration> observable, Duration oldValue, Duration newValue) {
						double progress = mediaPlayer.getCurrentTime().toSeconds() / mediaPlayer.getTotalDuration().toSeconds();
						//현재 재생시간을 전체 재생 시간으로 나눈 값을 현재 진행 정도로 설정.
						progressBar.setProgress(progress);
						progressIndicator.setProgress(progress);
						labelTime.setText(
							(int)mediaPlayer.getCurrentTime().toSeconds()+"/"+
							(int)mediaPlayer.getTotalDuration().toSeconds()+" sec");	//현재 재생시간을 전체 재생 시간으로 나눈 값을 현재 진행 정도로 표시
					}
				});

				btnPlay.setDisable(false); btnPause.setDisable(true); btnStop.setDisable(true);
				if(mediaPlayer.isAutoPlay()) {mediaView.setVisible(false);}
			}//재생 활성화, 멈춤/중지 비활성화
		});
		
		mediaPlayer.setOnPlaying(()->{//재생일때
			btnPlay.setDisable(true); btnPause.setDisable(false); btnStop.setDisable(false);
		});//재생 버튼은 비활성화, 멈춤과 중지는 활성화
		mediaPlayer.setOnPaused(()->{//멈춤일때
			btnPlay.setDisable(false); btnPause.setDisable(true); btnStop.setDisable(false);
		});//재생,중지 활성화, 멈춤 비활성화
		mediaPlayer.setOnEndOfMedia(()->{//미디어 소스가 모두 재생했을때의 상태
			progressBar.setProgress(1.0);//수평 막대 컨트롤 진행 정도를 1로 설정
			progressIndicator.setProgress(1.0);//원형 막대 컨트롤 진행 정도를 1로 설정			
			endOfMedia = true;
			btnPlay.setDisable(false); btnPause.setDisable(true); btnStop.setDisable(true);
		});//재생 활성화, 멈춤/중지 비활성화
		mediaPlayer.setOnStopped(()->{//중지일때
			btnPlay.setDisable(false); btnPause.setDisable(true); btnStop.setDisable(true);
		});//재생 활성화, 멈춤/중지 비활성화
		
		//볼륨설정
		sliderVolume.valueProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				mediaPlayer.setVolume(sliderVolume.getValue() / 100.0);
			}
		});
		sliderVolume.setValue(50.0);//슬라이더 초기값 50
		
		//버튼 이벤트 처리
		btnPlay.setOnAction(event->{
			if(endOfMedia) { 
				mediaPlayer.stop();//재생 중지
				mediaPlayer.seek(mediaPlayer.getStartTime());//재생 시간을 처음으로 돌림
			}
			mediaPlayer.play();//미디어 재생
			endOfMedia = false;
		});
		btnPause.setOnAction(event->mediaPlayer.pause());//미디어 일시정지
		btnStop.setOnAction(event->mediaPlayer.stop());//미디어 중지
	}

}

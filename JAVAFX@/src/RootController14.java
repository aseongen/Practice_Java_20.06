
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;

public class RootController14 implements Initializable {

	@FXML private PieChart pieChart;
	@FXML private BarChart barChart;
	@FXML private AreaChart areaChart;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		pieChart.setData(FXCollections.observableArrayList(
				new PieChart.Data("AWT",10),
				new PieChart.Data("Swing",30),
				new PieChart.Data("SWT",25),
				new PieChart.Data("JavaFX",35)
		));//파이차트에 데이터 추가
		
		XYChart.Series series1 = new XYChart.Series();//시리즈 1 생성
		series1.setName("남자");//시리즈 1이름 설정
		series1.setData(FXCollections.observableArrayList(
                new XYChart.Data("2015",70),
                new XYChart.Data("2016",40),
                new XYChart.Data("2017",50),
                new XYChart.Data("2018",30)
		));//시리즈 1에 데이터 셋팅
		
		XYChart.Series series2 = new XYChart.Series();//시리즈2 생성
		series2.setName("여자");//시리즈 2이름 설정
		series2.setData(FXCollections.observableArrayList(
                new XYChart.Data("2015",30),
                new XYChart.Data("2016",60),
                new XYChart.Data("2017",50),
                new XYChart.Data("2018",60)
		));	//시리즈 2에 데이터 셋팅
		barChart.getData().add(series1);//BarChart에 시리즈 1추가
		barChart.getData().add(series2);//BarChart에 시리즈 2추가
		
		XYChart.Series series3 = new XYChart.Series();//시리즈3 생성
		series3.setName("평균온도");//시리즈 3이름 설정
		series3.setData(FXCollections.observableArrayList(
                new XYChart.Data("2015",13),
                new XYChart.Data("2016",6),
                new XYChart.Data("2017",22),
                new XYChart.Data("2018",19)
		));	//시리즈 3에 데이터 셋팅
		areaChart.getData().add(series3);//AreaChart 시리즈 3추가
	}
}











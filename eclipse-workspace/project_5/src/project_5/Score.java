package project_5;

public class Score{
	private int data3;//score
	private String data4;//subject name
	Score(){}
	Score(String d4, int d3){
		d4=data4;
		d3=data3;
	}
	int getData3() { return data3; }
	String getData4() { return data4; }

	void show() {
		System.out.println("subject name:" + getData4()+" subject score :"+ getData3());
	}
}


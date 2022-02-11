
package bb;

public class Score{
	private int d3;//score
	private String d4;//subject name
	public Score(){}
	public Score(String d4, int d3){
		super();
		this.d4=d4;
		this.d3=d3;
	}
	protected int getData3() { return d3; }//private인 아이 데려올 함수1
	protected String getData4() { return d4; }//private인 아이 데려올 함수1
	protected void show() {
		System.out.println("subject name:" + getData4()+" subject score :"+ getData3() + "\n");
	}
}

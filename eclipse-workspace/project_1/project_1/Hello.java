package project_1;
import bb.*; //두개 이상의 패키지 사용 위해서 다른 패키지에서 Score 클래스 만들고 import

class Person extends Score{//상속 inheritance
private String data1;//data1=person name //encapsulation 
Person(){}//디폴트 생성자1
Person(String d1, String d3, int d4) {  //생성자2
	super(d3, d4); //부모의 private data를 super을 통해 데려옴
	data1 = d1;
	}
String getData1() { return data1; } //name을 데려올 함수
public int get3() {
	return super.getData3();
}//부모 점수 데이터 데려올 get 함수 
public String get4() {
	return super.getData4();
}//부모 과목명 데이터 데려올 get 함수
protected void show(){
	System.out.print("name : " + getData1());//부모함수 protected void show() 에 오버라이딩(polymorphism)
}
void showScore() {
		System.out.print(" | subject name:" + get4()+"  | subject score :"+ get3() + "\n");
}
}
public class Hello {
public static void main(String[] args) {
Person std1 = new Person("Mike","Java",40);
Person std2 = new Person("Mama","Data Structure",100);
Person std3 = new Person("Man","English",90);
System.out.println(); std1.show();
System.out.println(); std1.showScore();
System.out.println(); std2.show();
System.out.println(); std2.showScore();
System.out.println(); std3.show();
System.out.println(); std3.showScore();

}
}

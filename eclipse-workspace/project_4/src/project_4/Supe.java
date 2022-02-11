package project_4;
class Parent {
private int dataA;
Parent(){}
Parent(int dataA) {
this.dataA = dataA;
}
void printParent() {
System.out.println("I am parent");
}
}
class Child extends Parent {
private int dataB;
Child(){}
Child(int dataA, int dataB) {
super(dataA);
this.dataB = dataB;
}
void printChild() {
System.out.println("I am child");
}
}
public class Supe {
public static void main(String[] args) {
Child c = new Child();
c.printParent();
c.printChild();
}
}
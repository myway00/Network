package kr.ac.sogang;
public class hello{
	static void Vatest(int ...v) {
		System.out.println("number of arguments:"+v.length);
		for(int i=0;i<v.length;i++)
			System.out.println("arg"+i+":"+v[i]);
	}

	static void Vatest(String msg, int...v) {
		System.out.println("msg:"+msg);
		System.out.println("number of arguments:"+v.length);
		for(int i=0;i<v.length;i++)
			System.out.println("arg"+i+":"+v[i]);
	}

public static void main(String[] args) 
{
Vatest("hello",2,3);
System.out.println("-----------------");
Vatest(2,4,6,8);
System.out.println("-----------------");
Vatest();
System.out.println("-----------------");
}
}


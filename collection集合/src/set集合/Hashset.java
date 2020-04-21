package set集合;
import java.util.*;
//存储在HashSet或者HashMap中的元素需要重写HashCode方法和equals方法

public class Hashset {

	public static void main(String[] args) {
		Set s=new HashSet();//无序，不可重复
		s.add(1);
		s.add(1);
		s.add(4);
		s.add(3);
		Employee E1=new Employee("100","里约");
		Employee E2=new Employee("101","花旗");
		s.add(E1);//添加元素
		s.add(E2);
		System.out.println(E1.hashCode());
		System.out.println(E2.hashCode());
		Iterator I=s.iterator();
		while(I.hasNext()) {
			Object O=I.next();
			System.out.println(O);
		}
		
		

	}

}

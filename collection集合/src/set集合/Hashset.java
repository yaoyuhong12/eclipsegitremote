package set����;
import java.util.*;
//�洢��HashSet����HashMap�е�Ԫ����Ҫ��дHashCode������equals����

public class Hashset {

	public static void main(String[] args) {
		Set s=new HashSet();//���򣬲����ظ�
		s.add(1);
		s.add(1);
		s.add(4);
		s.add(3);
		Employee E1=new Employee("100","��Լ");
		Employee E2=new Employee("101","����");
		s.add(E1);//���Ԫ��
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

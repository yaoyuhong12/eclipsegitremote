package collection����;
import java.util.*;
//remove��contains��������Ҫ�����е�Ԫ����дequals����
public class collection {

	public static void main(String[] args) {
	Collection c=new LinkedList();
	Integer I=new Integer(8);
	c.add(I);
	c.add(2); //Collectionֻ�ܴ洢����Ԫ�أ��洢����Ϊ������
	c.add(100);
	c.add("����" );
Customer C=new Customer("����",105);
c.add(C);
Customer D=new Customer("����",105);
c.add(D);
c.remove(C);//ɾ�������е�Ԫ��

System.out.println(c.contains(D));//C��D����һ����������Ҫ��дequals����

	System.out.println(c.size());
	Iterator it=c.iterator();
	while(it.hasNext())
	{   Object O= it.next();
		System.out.println(O);
		
	
	}
	
/*for(Iterator i=c.iterator();i.hasNext();) {
	Object O=i.next();
	it.remove();//ͨ��������ɾ��
		System.out.println(O);
	}
	*/
	
	}
	
	
	

}

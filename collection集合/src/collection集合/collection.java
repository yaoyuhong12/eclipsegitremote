package collection集合;
import java.util.*;
//remove和contains方法都需要集合中的元素重写equals方法
public class collection {

	public static void main(String[] args) {
	Collection c=new LinkedList();
	Integer I=new Integer(8);
	c.add(I);
	c.add(2); //Collection只能存储单个元素，存储类型为引用型
	c.add(100);
	c.add("李四" );
Customer C=new Customer("张三",105);
c.add(C);
Customer D=new Customer("张三",105);
c.add(D);
c.remove(C);//删除集合中的元素

System.out.println(c.contains(D));//C和D内容一样，所以需要重写equals方法

	System.out.println(c.size());
	Iterator it=c.iterator();
	while(it.hasNext())
	{   Object O= it.next();
		System.out.println(O);
		
	
	}
	
/*for(Iterator i=c.iterator();i.hasNext();) {
	Object O=i.next();
	it.remove();//通过迭代器删除
		System.out.println(O);
	}
	*/
	
	}
	
	
	

}

package set集合;

public class Employee {
	String no;
	String name;
	Employee(String no,String name){
		this.no=no;
		this.name=name;
	}
	//重写toString方法
public String toString() {
	return"员工编号:"+no+"员工姓名:"+name;
}
//重写equals方法
public boolean equals(Object o) {
	if(this==o)
		return true;
	if(o instanceof Employee) {
		Employee E=(Employee)o;
		if(E.name.equals(this.name)&&E.no.equals(this.no))
			return true;
	}
	return false;
}
	//重写hashCode方法
public int hashCode() {
	return no.hashCode();
}
	
}

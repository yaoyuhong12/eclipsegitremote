package set����;

public class Employee {
	String no;
	String name;
	Employee(String no,String name){
		this.no=no;
		this.name=name;
	}
	//��дtoString����
public String toString() {
	return"Ա�����:"+no+"Ա������:"+name;
}
//��дequals����
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
	//��дhashCode����
public int hashCode() {
	return no.hashCode();
}
	
}

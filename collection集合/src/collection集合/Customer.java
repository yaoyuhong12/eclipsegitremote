package collection����;

public class Customer {
	int no;
    String name;
	Customer(String name,int no){
		this.name=name;
		this.no=no;
	}
	public 	String toString() {
		return"�˿͵�����:"+name+" "+"�˿�����:"+no;
	}
	public boolean equals(Object O) {
		if(this==O)
			{
			return true;
			}
		if(O instanceof Customer) 
		{
			Customer C1=(Customer)O; 
		
		if(this.no==C1.no&&C1.name.equals(this.name))
			{
			return true;
			}
		}
		return false;
	}
}

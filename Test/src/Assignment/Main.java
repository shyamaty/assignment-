package Assignment;
class Emp{
String name;
int id;
double sal;
String add;

public Emp(String name, int id, double sal, String add) {
	super();
	this.name = name;
	this.id = id;
	this.sal = sal;
	this.add = add;
}

@Override
public String toString() {
	return "Employee info are \n"
			+ "Name =" + name +"\n"
			+"Id=" + id +"\n" 
			+"Sal=" + sal  +"\n"
			+"Adress=" + add +"\n";
}

}



public class Main {
public static void main(String[] args) {
	Emp emp=new Emp("Shyama", 1,20000, "borivali");
	System.out.println(emp.toString());
}
}

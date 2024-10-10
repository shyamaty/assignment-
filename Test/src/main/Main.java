package main;
import emp.*;
import manager.*;
public class Main {
public static void main(String[] args) {
	Emp emp= new Emp();
	System.out.println(emp.calSal(2000));
	Manager manager=new  Manager();
	System.out.println(manager.calSal(20000, 1000));
}
}

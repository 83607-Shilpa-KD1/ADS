package Q1;

public class test {
	
	public static void main(String args[])
	{
		List l1= new List();
		l1.addFirst(10);
		l1.addFirst(20);
		l1.addLast(10);
		l1.addLast(20);
		l1.deleteFirst();
		l1.deleteLast();
		l1.display();
	}
}

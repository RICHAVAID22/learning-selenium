package package1;

public class Book implements Printable {
  //it can implement multiple interfaces
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
		System.out.println("book is printed");
		
	}

	@Override
	public void testmethod() {
		// TODO Auto-generated method stub
		
		System.out.println("Testmethod of printable interface");
		
		
	}

}
//every method is public Abstract
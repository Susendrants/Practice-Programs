package Interface;

public class Visa implements Country{

	@Override
	public void usa() {
		System.out.println("New York");
		
	}

	@Override
	public void uk() {
		System.out.println("London");
		
	}

	@Override
	public void canada() {
		System.out.println("Torento");
		
	}
	
	public void Australia()
	{
		System.out.println("Sydney");
	}

}

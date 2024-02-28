package Mobile;

public  class Redmi implements Mobile {
	private String UI;
	public Redmi(String UI)
	{
		
		this.UI=UI;
	}
	public String getUI() 
	{
		System.out.println(UI);
		return UI;
	}
    public  void Themes()
    {
    	System.out.println("Redmi themes");
    }

	public void camera() {
		System.out.println("MI Camera");
		
	}

	public void contacts() {
		
		System.out.println("MI contacts");
	}

	public void ringtones() {
		System.out.println("MI Tones");
		
	}

	public void OS() {
		System.out.println("Android");
	}
    
  
}

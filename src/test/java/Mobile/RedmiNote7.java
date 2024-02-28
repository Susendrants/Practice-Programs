package Mobile;

public class RedmiNote7 extends Redmi {
	public String colour;
	
	public RedmiNote7(String UI,String colour)
	{
	      super(UI);
	}
	
  public static void main(String[] args) {
      RedmiNote7 mi=new RedmiNote7("MIUI 12","Black");
	  mi.getUI();
	  mi.camera();
	  mi.OS();
	  mi.storage();
	  mi.Themes();
	     
}

  public void storage()
	{
		System.out.println("64GB");
	}
@Override
public void camera() {
	// TODO Auto-generated method stub
	super.camera();
	System.out.println("upgraded with Sony sensors");
}

@Override
public void OS() {
	
	super.OS();
     System.out.println("10");
}

@Override
public void Themes() {
	System.out.println("MI  Themes");
}
}

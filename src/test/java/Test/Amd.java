package Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class Amd {
	@Test
	public void closeBrowser() throws IOException
	{
		Runtime rt = Runtime.getRuntime();
		rt.exec("taskkill /im chrome.exe /f /t");
	}
	
	@Test
	public void taskManager() throws IOException, InterruptedException
	{
		try {
		Process rt = Runtime.getRuntime().exec("taskmgr.exe");
		rt.waitFor();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Test
	public void scanner()
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a'&& s.charAt(i)<='z')
			{
				System.out.print(s.charAt(i));
			}
		}
	}
	
	@Test
	public void vo()
	{
		String s="susee";
		//char[] st = s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u')
			{
				System.out.print("@");
			}
			else
			{
				System.out.print(s.charAt(i));
			}
		}
	}
	
	@Test
	public void sort()
	{
		String []s= {"mailan","dhawan","susee"};
		TreeSet set=new TreeSet();
		for(int i=0;i<s.length;i++)
		{
			set.add(s[i]);
		}
		System.out.println(set);
	}
	
	@Test
	public void robo() throws AWTException
	{
		Robot rb=new Robot();
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_ESCAPE);
		
		
	}
	
}

package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Collection.ArraylistTest;

public class ClassTest {
   @Test
	public void Occurance()
	{
		 String s="welcome";
	       for(int i=0;i<s.length();i++)
	       {
	           int count=0;
	           for(int j=0;j<s.length();j++)
	           {
	               if(s.charAt(i)==s.charAt(j))
	               {
	                   if(i>j)
	                   {
	                       break;
	                   }
	                   else
	                   {
	                       count++;
	                   }
	               }
	            }
	            if(count>=1)
	               {
	                   System.out.print(s.charAt(i)+""+count);
	               }
	       }
	}
   
   @Test
   public void minMaxNum()
   {
	   int []a={4,5,3,2,7,1};
	   for (int i=0;i<a.length;i++)
	   {
	   for(int j=i+1;j<a.length;j++)
	   {
	   if(a[i]>a[j])
	   {
	   int temp=a[i];
	   a[i]=a[j];
	   a[j]=temp;
	   }
	   }
	   }
	   System.out.println("The minimum number is "+a[0]);
	   System.out.println("The maximum number is "+a[a.length-1]);
   }
   
   @Test
   public void occuranceMap()
   {
	   String s="welcome";
	   LinkedHashMap<Character,Integer> map=new LinkedHashMap<Character,Integer>();
	   for(int i=0;i<s.length();i++)
	   {
	   if(map.containsKey(s.charAt(i)))
	   {
	   map.put(s.charAt(i), map.get(s.charAt(i))+1);
	   }
	   else
	   {
	   map.put(s.charAt(i),1);
	   }
	   }
	   for(Entry<Character, Integer> m: map.entrySet())
	   {
	   if(m.getValue()>=1)
	   {
	   System.out.println(m.getKey()+""+m.getValue());
	   }
	   }
   }

   @Test
   public void unique()
   {
	   String s="Selenium";
	   for(int i=0;i<s.length();i++)
       {
           int count=0;
           for(int j=0;j<s.length();j++)
           {
               if(s.charAt(i)==s.charAt(j))
               {
                   if(i>j)
                   {
                       break;
                   }
                   else
                   {
                       count++;
                   }
               }
            }
            if(count>=1)
               {
                   System.out.print(s.charAt(i));
               }
       }
	   
   }
   
  @Test
  public void reverse()
  {
	  String s="I Love India";
	    String s1=s.replaceAll(" ","");
	    for(int i=0,j=s1.length()-1; i<s.length(); i++)
	    {
	        if(s.charAt(i)!=' ')
	        {
	            System.out.print(s1.charAt(j--));
	        }
	        else
	        {
	            System.out.print(s.charAt(i));
	        }
	        
	    }
  }
  
  @Test
  public void reverseEachWord()
  {
	  String s="my name is kiren";
	  String []s1=s.split(" ");
	  for(int i=0; i<s1.length; i++)
	    {
	       String m=s1[i];
	       for(int j=m.length()-1;j>=0;j--)
	         {
	          System.out.print(m.charAt(j));
	         }
	       System.out.print(" ");
	        
	    }
  }
  @Test
	public void addArray()
	{
		int []a= {1,2,3,9};
		int []b= {2,4,6};
		int []c=new int[b.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i]+b[i];
		}
		c[c.length-1]=b[b.length-1];
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
	}

  @Test
  public void pattern()
  {
	  int n=3;
	  for(int i=0;i<n;i++)
	  {
		  for(int j=0;j<n-i;j++)
		  {
			  System.out.print(" ");
		  }
	 
	      for(int k=0;k<=i;k++)
	      {
		      System.out.print(k+1+" ");
	      }
	      for(int l=i-1;l>=0;l--)
	      {
	    	  System.out.print(l+1+" ");
	      }
	      System.out.println();
	  }
  }
  
  @Test
  public void sumOfArray()
  {
	  int [] a= {4,5,6,2,3};
	  int [] b= {2,3,3,4};
	  int length=a.length;
	  if(a.length<b.length)
	  {
		  length=b.length;
	  }
	  for(int i=0;i<length;i++)
	  {
		  try 
		  {
		  System.out.println(a[i]+b[i]);
		  }
		  catch (Exception e) {
			  if(a.length<b.length)
			  {
				  System.out.println(b[i]);
			  }
			  else
			  {
				  System.out.println(a[i]);
			  }
		}
		  
	  }
  }
  
  @Test
  public void occWithPosition()
  {
	  int[] a={10,20,30,10,20,50,10};
	 for(int i=0;i<a.length;i++)
	  {
		  int count=0;
		  for(int j=0;j<a.length;j++)
		  {
			  if(a[i]==a[j])
			  {
				  count++;
				  
			  }
		  }
		  if(count>1)
		  {
			  System.out.println(a[i]+" is repeated in position "+i);
		  }
	  }
  }
  
  @Test
  public void printNumContain1()
  {
	  int[]a={11,22,33,41,55,61,77,81};
	  for(int i=0;i<a.length;i++)
	  {
		  if(a[i]%10==1)
		  {
			  System.out.println(a[i]);
		  }
	  }
  }
  
  @Test
  public void pattern1()
  {
	  int n=5;
	  char ch='A';
	  for (int i=1;i<=n;i++)
	  {
		  for(int j=1;j<=i;j++)
		  {
			  System.out.print(ch+" ");
		  }ch++;
		  System.out.println();
	  }
  }
  
  @Test
  public void spchar1()
  {
  	String s="dus@g%bb76*";
  	String s1=s.replaceAll("[^a-zA-Z]", "");
  	
  	int count=s1.length()-1;
  	for(int i=0;i<s.length();i++)
  	{
  		if(s.charAt(i)>='a'&&s.charAt(i)<='z')
  		{
  			System.out.print(s1.charAt(count--));
  		}
  		else
  		{
  			System.out.print(s.charAt(i));
  		}
  	}
  	
  }

  @Test
  public void swapEachWords ()
  {
  	String s= "I am from bangalore";
  	String[] st = s.split(" ");
  	for(int i=0;i<st.length;i++)
  	{
  		String tem=st[0];
  		for(int j=1;j<st.length;j++)
  		{
  			st[j-1]=st[j];
  			System.out.print(st[j]+" ");
  		}
  		st[st.length-1]=tem;
  		System.out.println(st[st.length-1]);
  		
  	}
  }


  @Test
  public void occInNextLine()
  {
	  String s="aaabbcaabbcc";
	  for(int i=0;i<s.length()-1;i++){
		  if(s.charAt(i)==s.charAt(i+1))
		  {
			  System.out.print(s.charAt(i));
		  }
		  else
		  {
			  System.out.println(s.charAt(i));
		  }
		}
	 System.out.println(s.charAt(s.length()-1)); 
	  }
  
  @Test
  public void firstSecondMini()
  {
	  int [] a={1,2,1,3,7,9};
	    int fmin=a[0];
	    int smin=a[0];
	    for( int i=0;i<a.length;i++)
	    {
	    	if(a[i]<=fmin)
	    	{
	    		if(a[i]!=fmin)
	    		{
	    			smin=fmin;
	    		}
	    		fmin=a[i];
	    	}
	    	else if(smin==fmin || a[i]<smin)
	    	{
	    		smin=a[i];
	    	}
	    }
	    System.out.println(fmin);
	    System.out.println(smin);
  }
  
  @Test
  public void lastPositionOfRepeatedNum()
  {
	  int []a= {4,8,7,8,9,1,8,7,7};
	  for(int i=0;i<a.length;i++)
	  {
		 for(int j=0;j<a.length;j++)
		  {
			  if(a[i]==a[j])
			  {
				  if(i<j)
				  {
					 System.out.print("The number "+a[i]+" is repeating at ");
					  System.out.println(j+1);
					  break;
				  }
			  }
		  }
	  }
  }
  
  @Test
  public void lastPositionOfRepeatedNumWithMap()
  {
	  int []a= {3,1,2,3,1,1,3,7,4};
	//  LinkedHashMap<Integer,Integer>map=new LinkedHashMap<Integer, Integer>();
	  ArrayList list=new ArrayList();
	  for(int i=0;i<a.length;i++)
	  {
		  if(list.contains(a[i]))
		  {
			System.out.println(a[i]+" is repeating at "+(i+1));
		  }
		  else
		  {
			  list.add(a[i]);
		  }
		 
     }	 
  }
  
  
  @Test
  public void similarData()
  {
	  int []a= {2,3,4,5,6};
	  int []b= {1,2,3,4,5,6,7,8};
	  
	  for(int i=0;i<a.length;i++)
	  {
		  for(int j=0;j<b.length;j++)
		  {
			  if(a[i]==b[j])
			  {
				  System.out.println(a[i]);
			  }
		  }
	  }
  }
  
  @Test
  public void patternTest()
  {
	  int n=5;
	  for(int i=1;i<=n;i++)
	  {
		  for(int j=i;j<=n;j++)
		  {
			  System.out.print(" ");
		  }
		  for(int k=1;k<=i;k++)
		  {
			  System.out.print("* ");
		  }
		  System.out.println();
	  }
  }
  
  @Test
  public void occ0()
  {
	  int []a={6,0,4,0,0,7,0};
	  int l=a.length-1;
	  int[]b=new int[a.length];
	  for(int i=a.length-1;i>=0;i--)
	  {
		      if(a[i]!=0) {
			  b[l--]=a[i];
		 }
  	  }  
	 for(int c:b)
	 {
		 System.out.println(c);
	 }
	 
	  }
	  
	  /*
	  ArrayList<Integer> arr= new ArrayList<Integer>();
	  
	  for(int i=0;i<a.length;i++)
	  {
		  if(a[i]==0)
		  {
			  arr.add(a[i]);
		  }
	  }
	  for(int i=0;i<a.length;i++)
	  {
		  if(a[i]!=0)
		  {
			  arr.add(a[i]);
		  }
	  }
	  
	  System.out.println(arr);
	  
  }*/

  @Test
  public void occnum()
  {
	  String s="aabbcab";
	  int count=1;
	  for(int i=0;i<s.length()-1;i++)
	  {
		  if(s.charAt(i)==s.charAt(i+1))
		  {
			  count++;
		  }
		  else
		  {
			  System.out.print(s.charAt(i)+""+count);
			  count=1;
		  }
	  }
	  System.out.println(s.charAt(s.length()-1)+""+count);
  }
  
  @Test
  public void testnum()
  {
	  String s="abcdasbcderacd";
	  LinkedHashMap<Character,Integer>map=new LinkedHashMap<Character,Integer>();
	  for(int i=0;i<s.length();i++)
	  {
	  if(map.containsKey(s.charAt(i)))
	  {
	  map.put(s.charAt(i),map.get(s.charAt(i))+1);
	  }
	  else{
	  map.put(s.charAt(i),1);
	  }
	  }
	  for(Entry<Character,Integer>m:map.entrySet())
	  {
	  if(m.getValue()>=1)
	  {
	  System.out.println(m.getKey()+"----"+m.getValue());
	  }
	  }
  }
  
  
  @Test
  public  void main()
  {
  String s="tekion234inter52view54";
  String[] st=s.split("[a-zA-Z]");
  for(int i=st.length-1;i>=0;i--)
  {
	 
  if(st[i]=="")
  {}
  else
  {
  System.out.print(st[i]+",");
  }
  }
  }
  @Test
  public  void main1()
  {
  String s="tekion234inter52view54";
  String st1=s.replaceAll("[a-zA-Z]",",");//,,,,,,234,,,,,52,,,,54
  String[] st = st1.split(",");//{234 52 54}
 
  for(int i=st.length-1;i>=0;i--)
  {
	 
  if(st[i]!="")
  { System.out.print(st[i]+",");}
 
  }
  }
  
  @Test
  public void sumOfNumInString()
  {
	 String s="test123num45";
	 String[] st = s.split("[a-zA-Z]");
	 int s1=0;
	 for(int i=0;i<st.length;i++)
	 {
		 if(st[i]!="")
		 {
			int a = Integer.parseInt(st[i]);
			 s1=s1+a;
		 }
	 }
	 
	 System.out.println(s1);
  }
  @Test
  public void o9()
  {
	  String s="susendran";
	  for(int i=0;i<s.length();i++)
	  {
		  System.out.print(s.charAt(i));
		  for(int j=0;j<=i;j++)
		  {
			  System.out.print(" ");
		  }
	  }
  }
  
  @Test
  public void longestPalindrome()
  {
	  String s="ayamalayalamkayak"; //ayamalayalamkayak
	  String s1="";
	  String s2="";
	  int len=0;
	  for(int i=0;i<s.length();i++)
	  {
		  s1=s1+s.charAt(i);
		  for(int j=i+1;j<s.length();j++)
		  {
			  s1=s1+s.charAt(j);
			  String rev="";
			  for(int k=s1.length()-1;k>=0;k--)
			  {
				  rev=rev+s1.charAt(k);
			  }
			  if(s1.equals(rev) && s1.length()>len )
			  {
				  s2=s1;
				  len=s2.length();
			  }
		  }
		  s1="";
	  }
	  System.out.println(s2);
	  System.out.println(len);
  }
  
  
  @Test
  public void combination()
  {
	  int []a= {2,4,1,9,7,3};
	  for(int i=0;i<a.length;i++)
	  {
		  for(int j=i+1;j<a.length;j++)
		  {
			  if(a[i]+a[j]==10)
			  {
				  System.out.println(i+" and "+j);
			  }
		  }
	  }
  }
  
  @Test
  public void occOfSubString()
  {
	  String s="abcdeab";
	  String s1="";
	  String s2="";
	  int len=0;
	  for(int i=0;i<s.length();i++)
	  {
		  s1=s1+s.charAt(i);
		  for(int j=i+1;j<s.length();j++)
		  {
			  s1=s1+s.charAt(j);
			  String rev="";
			  for(int k=s1.length()-1;k>=0;k--)
			  {
				  rev=rev+s1.charAt(k);
				  if(rev.equals(s1)&&s1.length()<len)
				  {
					  s2=s1;
					  len=s2.length();
				  }
			  }
		  }
		  s1="";
	  }
	  System.out.println(s2);
	  System.out.println(len);
  }
  
  @Test
  public void upperToLowerCase()
  {
	  String s="SusEnDraN";
	  String s1="";
	  for(int i=0;i<s.length();i++)
	  {
		  if(s.charAt(i)>='A' && s.charAt(i)<='Z')
		  {
			 s1= s1+s.toLowerCase().charAt(i);
		  }
		  else
		  {
			s1=s1+  s.toUpperCase().charAt(i);
		  }
	  }
	  System.out.println(s1);
  }
  
  @Test 
  public void countOfChar()
  {
	  String s="susendran  TS";
	 char[] w = s.toCharArray();
	  int count=0;
	  for(char a:w)
	  {
		  if(a!=' ')
		  count++;
	  }
	  System.out.println(count);
  }
  
  
  @Test
  public void inti()
  {
	  String s="12345";
	 int i= Integer.parseInt(s);
  }
  @Test
  public void intii()
  {
	  String s="12345";
	char[] c = s.toCharArray();
	int n=0;
	for(int i=0;i<c.length;i++)
	{
		n=n*10+(c[i]-48);
	}
	System.out.println(n);
	}
  
  
  
  
  @Test
  public void reverse1()
  {
	 String s="Susendran Ts";
	 String[] s1 = s.split(" ");
	 for(int i=s1.length-1;i>=0;i--)
	 {
		 System.out.print(s1[i]+" ");
	 }
	 
	 
  }
  @Test
  public void reverse11()
  {
	  String s="Susendran Ts";
  
  for(int i=s.length()-1;i>=0;i--)
	 {
		 System.out.print(s.charAt(i));
	 }
  
}
  
  @Test
  public void spaceName()
  {
	  String s="Susendran";
	  for(int i=0;i<s.length();i++)
	  {
		  System.out.print(s.charAt(i));
		  for(int j=0;j<=i;j++)
		  {
			  System.out.print(" ");
		  }
	  }
	 
  }

  @Test
  public void perfectRotation()
  {
	 String s="I am from chennai";
	 String[] s1= s.split(" ");
	 
	 for(int i=0;i<s1.length;i++)
	 {
		 String tem=s1[0];
		 for(int j=1;j<s1.length;j++)
		 {
			 s1[j-1]=s1[j];
			 System.out.print(s1[j]+" ");
		 }
		 System.out.println(s1[s1.length-1]=tem);
	 }
  }
  @Test
  public void windowHandle(WebDriver driver,String exp )
  {
	  Set<String> win = driver.getWindowHandles();
	  for(String w:win)
	  {
		 String act = driver.switchTo().window(w).getTitle();
		 if(act.equals(exp))
		 {
			 driver.switchTo().window(w);
		 }
	  }
  }
  
//  aaabbaccddeeff
  
  @Test
  public void occ3()
  {
	  String s="aaabbaccddeeff";
	  for(int i=0;i<s.length()-1;i++)
	  {
		  if(s.charAt(i)==s.charAt(i+1))
		  {
			  System.out.print(s.charAt(i));
		  }
		  else
		  {
			  System.out.println(s.charAt(i));
		  }
	  }  
	  System.out.println(s.charAt(s.length()-1));
  }
  
  @Test
  public void revApha()
  {
	  String s="o9#sol^ut#io$n&s";
	 String s1= s.replaceAll("[^a-zA-Z0-9]", "");
	 int c=s1.length()-1;
	 for(int i=0;i<s.length();i++)
	 {
		 if(s.charAt(i)>='a'&& s.charAt(i)<='z' ||s.charAt(i)>='A'&& s.charAt(i)<='Z'||s.charAt(i)>='0'&& s.charAt(i)<='9') {
			 System.out.print(s1.charAt(c--));
		 }
		 else
		 {
			 System.out.print(s.charAt(i));
		 }
	 }
  }
  
  @Test
  public void printOdd()
  {
	  int [] a= {33,12,49,2,7};
	   ArrayList<Integer> b=new  ArrayList<Integer>();
	  for(int i=0;i<a.length;i++)
	  {
		  if(a[i]%2!=0)
		  {
			  b.add(a[i]);
		  }
	  }
	  System.out.println(b);
	  	  
  }
    
  @Test
  public void firstOccChar()
  {
	 String s="O9 solutions";
	 String s1= s.toLowerCase();
	 boolean flag1=true;
	 boolean flag2=true;
	 for(int i=0;i<s1.length();i++)
	 {
		 int count=0;
		 for(int j=0;j<s.length();j++)
		 {
			 if(s1.charAt(i)==s1.charAt(j))
			 {
				 if(i>j)
				 {
					 break;
				 }
				 else {
					 count++;
				 }
			 }
		 }
		 if(count>1 && flag1==true)
		 {
			 System.out.println(s1.charAt(i)+" is the first  repeating character");
			 flag1=false;
		
		 }
		 if(count==1 && flag2==true)
		 {
			 System.out.println(s1.charAt(i)+" is the first non repeating character");
			 flag2=false;
			
		 }
		
	 }
	 
	 
  }
  
  @Test
  public void oddArray()
  {
		int [] a={33,12,49,2,7};
		ArrayList<Integer> arr=new ArrayList<Integer> ();
		int count=0;
		for(int i=0;i<a.length;i++)
		{
		    if(a[i]%2!=0)
		    {
		        arr.add(a[i]);
		        count++;
		    }
		    
		}
		Object [] b=new Object [count];
		b=arr.toArray();
		for(int i=0;i<b.length;i++)
		{
		   
		    System.out.println(b[i]);
		}
  }
  
  @Test
  public void sustringProb()
  {
	  String s="ABCDEFGABEF";
	  String s2="";
	  int count=0;
	  for(int i=0;i<=s.length();i++)
	  {
		
		  for(int j=i+1;j<=s.length();j++)
		  {
			String s1= s.substring(i, j);
			if(count<s1.length())
			{
				count=s1.length();
				s2=s1;
			}
		  }
	  }
	  System.out.println(count);
	  System.out.println(s2);
  }
  
 
  @Test
	public void m4()
	{
		String s="ABCDEFGABEF";
		String s1[]=s.split("");
		String larg="";
		int length=0;
		int larglength=0;
		
		HashMap<Object,Integer> map1=new HashMap<Object, Integer>();
		HashMap<Object,Integer> map2=new HashMap<Object, Integer>();

		for(int i=0; i<s1.length; i++)
		{
			for(int j=i; j<s1.length; j++)
			{
				if(larg.contains(s1[j]))
				{
					map2.put(larg, length);
					if(length>larglength)
					{
						larglength=length;
					}
					map1.clear();
				}
				else
				{
					larg=larg+s1[j];
					length=larg.length();
					map1.put(larg, length);
				}
			}
			larg="";
		}
		
		for(Entry<Object, Integer> en : map2.entrySet())
		{
			if(en.getValue()==larglength)
			{
				System.out.println(en.getKey()+" with length "+en.getValue());
			}
		}
	}
  
  @Test
	public void largestSubstrWithOutVowels2()
	{
		String s="ABDFGTEFSIHFTLKGMIYFGJHD";
		int largestlength=0;
		String larg="";
		
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')
			{
				larg="";
			}
			else
			{
				larg=larg+s.charAt(i);
				if(larg.length()>=largestlength)
				{
					largestlength=larg.length();
					map.put(larg, larg.length());
				}
			}
		}
		
		for(Entry<String, Integer> en : map.entrySet())
		{
			if(en.getValue()==largestlength)
				System.out.println(en.getKey()+" is the largest substring without Vowels is having length of "+en.getValue());
		}
	}
  
  @Test
  public void consOcc()
  {
	  String s="GeeksForGeeks";
	  for(int i=0;i<s.length()-1;i++)
	  {
		 if(s.charAt(i)==s.charAt(i+1))
		 {
			 System.out.println(s.charAt(i));
			
		 }
	  }
  }
  @Test
  public void addNuminstr()
  {
	  String s="9#09abcd@300xyz3000";
	  String []s1 = s.split("[^0-9]");
	  int a=0;
	  for(int i=0;i<s1.length;i++)
	  {
		  if(s1[i]!="")
		  {
			  
			 int b= Integer.parseInt(s1[i]);
			 a=a+b;
		  }
	  }
	  
	  System.out.println(a);
	  
  }
  @Test
  public void maxSubString()
  {
	  String s="susendran";
	  String out="";
	  for(int i=0;i<s.length();i++)
	  {
		  for(int j=s.length();j>=i+1;j--)
		  {
			  String str=s.substring(i,j);
			  HashSet set=new HashSet();
			  for(int k=0;k<str.length();k++)
			  {
				  set.add(str.charAt(k));
			  }
			  if(str.length()==set.size())
			  {
				  if(str.length()>out.length())
				  {
					  out=str;
				  }
				  
			  }
		  }
	  }
	  System.out.println(out);
  }
  
  @Test
  public void longestSubStringWithoutVowels()
  {
	  String s="susendran";
	  String f="";
	  for(int i=0;i<s.length();i++)
	  {
		  for(int j=s.length();j>=i+1;j--)
		  {
			  String str= s.substring(i, j);
			  if(!str.contains("a")&&!str.contains("e")&&!str.contains("i")&&!str.contains("o")&&!str.contains("u"))
			  {
				if(f.length()<str.length())
				{
					f=str;
				}
			  }
		  }
	  }
	  System.out.println(f);
  }
  
  @Test
  public void arraydiff()
  {
	  int [] a= {1,2,3,4,5};
	  int [] b= {2,4,6,8};
	  
	  for(int i=0;i<a.length;i++)
	  {
		  for(int j=0;j<b.length;j++)
		  {
			  if(a[i]==b[j])
			  {
				  System.out.println(a[i]);
			  }
		  }
	  }
  }
  @Test
  public void occ20()
  {
	  int [] a= {5,6,7,5,3,6,2,7,1};
	  
	  for(int i=0;i<a.length;i++)
	  {
		  int count=0;
		  for(int j=0;j<a.length;j++)
		  {
			  if(a[i]==a[j])
			  {
				  if(i>j)
				  {
					  break;
				  }else
				  {
					  count++;
				  }
			  }
		  }
		  if(count>=1)
		  {
			  System.out.println(a[i]+" "+count);
			
		  }
	  }
  }
  @Test
  public void removeCon()
  {
	  String s="geeksforgeeks";
	  int count=1;
      for(int i=0;i<s.length()-1;i++)
      {
    	  
    	  if(s.charAt(i)==s.charAt(i+1))
    	  {
    		  count++;
    	  }
    	  else
    	  {
    		 if(count==1)
    		 {
    			 System.out.print(s.charAt(i));
    		 }
    		  count=1;
    	  }
      }
      if(count==1)
	  System.out.print(s.charAt(s.length()-1));
	  
  }
  
  @Test
  public static void isomorphic()
  {
	  String s1="egga";
	  String s2="addd";
	  if(s1.length()==s2.length())
	  {
	 ArrayList a1 = occ(s1);
	 ArrayList a2= occ(s2);
	 System.out.println(a1);
	 System.out.println(a2);
	
	if(a1.equals(a2))
	{
		System.out.println("isomorphic");
	}
	else
	{
		System.out.println("not a isomorphic");
	}
	 
	  } 
  }
  @Test
  public static ArrayList occ(String s)
  {
	 // String s="ball";
	  ArrayList a1=new ArrayList();
	  
	  LinkedHashMap<Character, Integer> map=new LinkedHashMap<Character, Integer>();
	  for(int i=0;i<s.length();i++)
	  {
		 if(map.containsKey(s.charAt(i)))
		 {
			 map.put(s.charAt(i),  map.get(s.charAt(i))+1);
		 }else
		 {
			 map.put(s.charAt(i), 1);
		 }
	  }
	  for(Entry<Character,Integer> m:map.entrySet())
	  {
		  a1.add(m.getValue());
	  }
	  
	 return a1;
}
  
  @Test
  public void mergeArray()
  {
	  int a[]= {2,3,5,7};
	  int b[]= {1,3,4,5,78,9};
	  int c[]= new int[a.length+b.length];
	  for(int i=0;i<a.length;i++)
	  {
		  c[i]=a[i];
	  }
	  for(int i=0;i<b.length;i++)
	  {
		  c[a.length+i]=b[i];
	  }
	  Arrays.sort(c);
	  for(int i=0;i<c.length;i++)
	  {
		  System.out.println(c[i]);
	  }
	  
  }
  @Test
  public void patternTekion()
  {
//	      A
//      A B C
//    A B C D E
//  A B C D E F G
//    A B C D E
//      A B C
//        A
	  
	  int row=4;
	  //int al=64;
	 
	  for(int i=0;i<=row;i++)
	  {
		  char ch='A';
		  for(int j=1;j<=row-i;j++)
		  {
			  System.out.print(" ");
		  }
		  for(int k=1;k<=i*2-1;k++)
		  {
			  System.out.print(ch++);
		  }
		  System.out.println();
	  }
	  for(int i=row-1;i>0;i--)
	  {
		  char ch='A';
		  for(int j=1;j<=row-i;j++)
		  {
			  System.out.print(" ");
		  }
		  for(int k=1;k<=i*2-1;k++)
		  {
			  System.out.print(ch++);
		  }
		  System.out.println();
	  }
	  
  }
  @Test
  public void occPosition()
  {
	  String s="susendrants";
	  LinkedHashMap<Character,Integer>map=new LinkedHashMap<Character, Integer>();
	  for(int i=0;i<s.length();i++)
	  {
		  if(map.containsKey(s.charAt(i)))
		  {
			  map.put(s.charAt(i), map.get(s.charAt(i))+1);
			  System.out.println(s.charAt(i)+" is repeating in "+(i+1)+" position");
		  }
		  else
		  {
			  map.put(s.charAt(i), 1);
		  }
	  }
	  for(Entry<Character, Integer>m: map.entrySet())
	  {
		  if(m.getValue()>=1)
		  {
			  System.out.println(m.getKey()+" "+m.getValue()+" times");
		  }
	  }
  }
  
  @Test
  public void lastRepChar()
  {
	  String s="Automation for clouds";
	 String s1= s.replaceAll(" ", "");
	 LinkedHashMap<Character, Integer>map=new LinkedHashMap<Character, Integer>();
	 for(int i=0;i<s1.length();i++)
	 {
		if( map.containsKey(s1.charAt(i)))
		 {
			 map.put(s1.charAt(i), map.get(s1.charAt(i))+1);
			  System.out.println(s1.charAt(i)+" is repeating in "+(i+1)+" position");
		  }
		  else
		  {
			  map.put(s1.charAt(i), 1);
		  }
	  }
	  for(Entry<Character, Integer>m: map.entrySet())
	  {
		  if(m.getValue()>=1)
		  {
			  System.out.println(m.getKey()+" "+m.getValue()+" times");
		  }
		 }
	 }
  
  @Test
  public void patternDiamond()
  {
	  int n=5;
	 for(int i=0;i<=n;i++)
	 {
		 char ch='A';
		 for(int j=i;j<=n;j++)
		 {
			 System.out.print(" ");
		 }
		 for(int k=1;k<=i;k++)
		 {
			 if(i%2!=0)
			 {
				 System.out.print(ch++ +" ");
			 }
			 
		 }
		 System.out.println();
		
	 }
	 System.out.println();
	 for(int i=n;i>=0;i--)
	 {
		 char ch='A';
		 for(int j=i;j<=n;j++)
		 {
			 System.out.print(" ");
		 }
		 for(int k=1;k<=i;k++)
		 {
			 if(i%2!=0)
			 {
				 System.out.print(ch++ +" ");
			 }
		 }
		 System.out.println();
	 }
	  
  }
  @Test
  public void combination1()
  {
	  int [] a= {1,3,7,9,5,6,5,2,7,8,1};//1,9  7,3  5,5  2,8
	  HashMap<Integer, Integer>map=new HashMap<Integer, Integer>();
	  for(int i=0;i<a.length;i++)
	  {
		  for(int j=i+1;j<a.length;j++)
		  {
			  if(a[i]+a[j]==10)
			  {
				  map.put(a[i], a[j]);
			  }
		  }
	  }
     for(Entry<Integer, Integer>m:map.entrySet())
     {
    		 System.out.println(m.getKey()+","+m.getValue());
     }
  }

  
  @Test
  public void test2()
	{
		int a[]= {2,4,1,9,7,3};
		
	//	HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==1)
			{
				if(a[i]+a[i+1]==10)
				{
					System.out.print(i+" ");
					System.out.println(i+1);
				}
			}
			
		}
	}
  @Test
  public void removechar()
  {
	  String s="a2@25%b6";
	  String[]s1= s.split("[^0-9]");
	  int len=0;
	  for(int i=0;i<s1.length;i++)
	  {
		  if(s1[i]!="")
		  {
			 len=len+ Integer.parseInt(s1[i]);
		  }
	  }
    System.out.println(len);
  }
  }
  
  



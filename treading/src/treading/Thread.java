import java.util.*;
class second implements Runnable
{
	public int x;
	public second(int x)
	{
		this.x=x;
	}
	public void run()
		{
		System.out.println("second thread:square of the number is"+x*x);
	}
}
class third implements Runnable
{
	public int x;
	public third(int x) {
		this.x=x;
	}
	public void run()
	{
		System.out.println("Third thread:cube of the number is"+x*x*x);
		System.out.println();
	}
}
class first extends Thread
{
public void run() 
{
	int num=0;
	Random r=new Random();
	try
	{
		for(int i=0;i<5;i++)
		{
			num=r.nextInt(10);
			System.out.println("first thread generated number is"+num);
			Thread t2=new Thread(new second(num));
			t2.start();
			Thread t3=new Thread(new third(num));
			t3.start();
			Thread.sleep(1000);
		}
	}
catch(Exception e)
	{
	System.out.println(e.getMessage());
	}
}	
}
public class Thread 
{
	public static void main(String[] args) 
	{
		first a=new first();
		a.start();
	}
}

public class MyRunnable implements Runnable {
private int count;

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		for(int c=1;c<=50;c++){
			System.out.println(name +"."+ ++count);
			
		}
	}
		public static void main(String[]args)

	{
			MyRunnable mr = new MyRunnable();
			Thread t1 = new Thread(mr,"Alfa");
			Thread t2 = new Thread(mr,"Beta");
			Thread t3 = new Thread(mr,"Gama");
			t1.start();
			t2.start();
			t3.start();
			
	}
			
	}
//When there are multiple threads running at the same time then there is probablity of data loss above code's op also contains data loss 

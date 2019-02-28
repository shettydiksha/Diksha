
public class SyncDemo implements Runnable {

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		display(name);
		
	}

	private  void display(String name) {
		System.out.println(name + "entered display..");
		//System.out.print("[");
		synchronized (this) {
			
		}
		try {
			System.out.print("[");
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print(name);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("]");
	}
	public static void main(String[] args) {
		SyncDemo sd = new SyncDemo();
		Thread t1 = new Thread(sd,"Alfa");
		Thread t2 = new Thread(sd,"Beta");
		Thread t3 = new Thread(sd,"Gama");
		
		t1.start();
		t2.start();
		t3.start();
	}
		
	}

	


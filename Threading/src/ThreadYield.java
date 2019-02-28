
public class ThreadYield {
	static class Hello extends Thread {
		@Override
		public void run() {
			synchronized (this) {
				
			
			while (true) {
				System.out.println("Hello");
				yield();
			}
			}

			// try {
			// sleep(1);con
			// }catch(InterruptedException e){}
		}
	}

	static class World extends Thread {
		@Override
		public void run() {
			while (true) {
				System.out.println("World");
				yield();
			}
			// try {
			// sleep(1);
			// }catch(InterruptedException e){}

		}
	}

	public static void main(String[] args) {

		Hello h = new Hello();
		World w = new World();
		h.start();
		w.start();
	}
}

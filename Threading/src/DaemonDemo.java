
public class DaemonDemo extends Thread {
	private int limit;

	public DaemonDemo(String name, int limit) {
		super(name);
		this.limit = limit;

	}

	@Override
	public void run() {
		String name = currentThread().getName();
		for (int c = 1; c <= limit; c++)
			System.out.println(name + "." + c);

	}

	public static void main(String[] args) {
		DaemonDemo d1 = new DaemonDemo("Alfa", 25);
		DaemonDemo d2 = new DaemonDemo("Beta", 50);
		DaemonDemo d3 = new DaemonDemo("Gama", 100);
		DaemonDemo d4 = new DaemonDemo("d", 1000);
		d4.setDaemon(true);
		d1.start();
		d2.start();
		d3.start();
		d4.start();
	}

}

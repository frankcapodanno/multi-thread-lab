package click.capodanno.lab;

public class StartLab {

	public static void main(String[] args) {
		System.out.println("lab startet...");

		for (int i = 0; i <= 10; i++) {

			RunnableDemo r = new RunnableDemo("Thread-" + i);
			r.start();

		}

	}

}

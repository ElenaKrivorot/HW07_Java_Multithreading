package by.krivorot.hw07.multithreading;

public class ArrayLogic implements Runnable {
	private int number;
	private Array mas;

	public ArrayLogic(int number, Array mas) {
		this.number = number;
		this.mas = mas;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {

			mas.getLock().lock();
			mas.add(number);
			mas.getLock().unlock();

		}
	}
}

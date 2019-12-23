package by.krivorot.hw07.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Array {
	private int[][] mas;
	private  Lock lock;

	public Array(int size) {
		this.mas = new int[size][size];
		this.lock = new ReentrantLock();
	}

	public int[][] getMas() {
		return mas;
	}

	public void setMas(int[][] mas) {
		this.mas = mas;
	}

	public Lock getLock() {
		return lock;
	}

	public void setLock(Lock lock) {
		this.lock = lock;
	}

	public void add(int number) {
		int i;
		int j;

		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[0].length; j++) {
				if (i == j && mas[i][j] == 0) {
					mas[i][j] = number;
					System.out.printf("%2d %2d %2d", i, j, number);
					System.out.println();	
					return;
				}
			}			
		}
	}

	public void print() {
		int i;
		int j;

		for (i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[0].length; j++) {
				System.out.printf("%2d", mas[i][j]);
			}
			System.out.println();
		}
	}
}

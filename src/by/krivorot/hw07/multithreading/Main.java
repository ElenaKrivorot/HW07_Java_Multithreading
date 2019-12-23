package by.krivorot.hw07.multithreading;

public class Main {

	public static void main(String[] args) {
		int size = 1000;

		Array mas = new Array(size);

		ArrayLogic l1 = new ArrayLogic(1, mas);
		ArrayLogic l2 = new ArrayLogic(2, mas);
		ArrayLogic l3 = new ArrayLogic(3, mas);
		ArrayLogic l4 = new ArrayLogic(4, mas);

		Thread th1 = new Thread(l1);
		Thread th2 = new Thread(l2);
		Thread th3 = new Thread(l3);
		Thread th4 = new Thread(l4);

		th1.start();
		th2.start();
		th3.start();
		th4.start();

	}

}

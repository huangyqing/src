package ����ģʽ;

public class MultiThreadSingleton {
	private static MultiThreadSingleton instance = null;
	private static Object lock = new Object();  // �����
	private MultiThreadSingleton() {
	}
	public static MultiThreadSingleton getInstance() {
		if (instance == null) {
			synchronized (lock) {
				if (instance == null) {
					instance = new MultiThreadSingleton();
				}
			}
		}
		return instance;
	}
}

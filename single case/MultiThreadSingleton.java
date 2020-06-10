package 单例模式;

public class MultiThreadSingleton {
	private static MultiThreadSingleton instance = null;
	private static Object lock = new Object();  // 锁旗标
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

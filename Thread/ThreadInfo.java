package Thread;

public class ThreadInfo {

	public static void main(String[] args) {
		Thread t = new Thread("My Thread");
		log(" ", t);
	}

	public static void log(String string, Thread t) {
		System.out.println(string + " THREAD Name : " + t.getName());
		System.out.println(string + "ID : " + t.getId());
		System.out.println(string + "Priority : " + t.getPriority());
		System.out.println(string + "State : " + t.getState());
		System.out.println(string + "thread Group : " + t.getThreadGroup());
		System.out.println(string + " Is Alive : " + t.isAlive());
		System.out.println(string + " Is Daemon : " + t.isDaemon() + "\n");

	}

}

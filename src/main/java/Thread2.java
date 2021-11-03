public class Thread2 implements Runnable {
    public void run() {

    }

    public static void main(String[] args) {
        Thread2 myThread = new Thread2();
        Thread thread = new Thread(myThread);
        thread.start();
    }
}

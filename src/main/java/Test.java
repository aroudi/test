public class Test extends Thread {
    public void run() {
        System.out.print("in run ");
    }
    public static void main(String[] args) {
        Test test = new Test();
        test.start();
        Test test1 = new Test();
        test1.start();
    }

    public static void callMe() {
        System.out.println("hello");
    }
}

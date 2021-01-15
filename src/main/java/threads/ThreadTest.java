package threads;

public class ThreadTest {
    public static void main(String[] args) {
        ThreadClass t1 = new ThreadClass();
        ThreadClass t2 = new ThreadClass();
        t1.start();
        t2.start();

        for (int i = 0; i < 100; i++) {
            try {
                Thread.currentThread().sleep(5000);
                System.out.println(Thread.currentThread().getId() + "----" + Thread.currentThread().getName() + "---" + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("------------------main-----------------");
    }
}

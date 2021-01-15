package threads;

public class ThreadClass extends Thread {
    @Override
    public void run() {
        Thread t = new Thread();
        for (int i = 0; i < 100; i++) {
            try {
                t.sleep(5000);
                System.out.println(t.getId() + "----" + t.getName() + "---" + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

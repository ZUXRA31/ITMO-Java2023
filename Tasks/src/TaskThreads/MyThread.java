package TaskThreads;

public class MyThread extends Thread {

    private final String syncObj;

    MyThread(String name, String syncObj) {
        super(name);
        this.syncObj = syncObj;
    }

    @Override
    public void run() {
        try {
            synchronized (syncObj) {
                while (true) {
                    System.out.println(Thread.currentThread().getName());
                    syncObj.notify();
                    syncObj.wait();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

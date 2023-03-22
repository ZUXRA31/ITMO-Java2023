package TaskThreads;

public class Main {

    public static void tenThreads() {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                for (int j = 0; j <= 100; j++) {
                    System.out.println(Thread.currentThread().getName() + " " + j);
                }
            }, "Thread №" + (i + 1)).start();
        }
    }

    public static void infoThread() {
        Thread myThread = new Thread(() -> {
            System.out.println("Состояние во время: " + Thread.currentThread().getState());
        });
        System.out.println("Состояние до: " + myThread.getState());
        myThread.start();
        try {
            Thread.sleep(10);
            System.out.println("Состояние после: " + myThread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void counterThread() {
        Counter counter = new Counter();
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                synchronized (counter) {
                    for (int j = 0; j < 1000; j++) {
                        counter.increment();
                    }
                }
            }).start();
        }
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(counter.count);
    }

    public static void printThreadNames() {
        String syncObj = "Объект синхронизации";
        MyThread myThread1 = new MyThread("First thread", syncObj);
        MyThread myThread2 = new MyThread("Second thread", syncObj);
        myThread1.start();
        myThread2.start();

    }

    public static void main(String[] args) {
        printThreadNames();


    }
}

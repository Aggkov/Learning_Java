public class Main {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        t.setName("The Parent");

        SafeArrayList sl = new SafeArrayList();

        Thread[] threads = new Thread[3];
        for (int i=0; i< threads.length; i++) {
            threads[i] = new Thread(new MyThread(i * 10, sl));
            threads[i].start();
        }

        try {
            for (int i=0; i<threads.length; i++)
                threads[i].join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(t + ": exiting");
    }
}
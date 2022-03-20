public class MyThread implements Runnable {
    private int init;
    private SafeArrayList resource;

    // Threads from this class will act on the structure SafeArraylist
    public MyThread(int init, SafeArrayList resource) {
        this.init = init;
        this.resource = resource;
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        t.setName("Worker" + init);

        for (int i = init; i < init + 4; i++) {
            System.out.println(t + " trying to add " + i);
            resource.add(i);
        }
        System.out.println(t + " finished! ");

    }
}
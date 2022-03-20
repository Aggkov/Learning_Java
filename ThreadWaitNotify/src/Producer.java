public class Producer implements Runnable{
    private int init;
    private Resource resource;

    Producer(int init, Resource resource) {
        this.init = init;
        this.resource = resource;
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        t.setName("Producer" + init);

        for(int i = init; i < init + 4; i++) {
            // Takes time to process some data
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            // Adding data to resource (Arraylist)
            resource.add(i);
        }
        System.out.println(t + "finished! ");
    }
}

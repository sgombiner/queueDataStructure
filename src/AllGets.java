public class AllGets implements Runnable {
    Queue sharedQ;

    public AllGets(Queue sharedQ) {
        this.sharedQ = sharedQ;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i = i + 1) {
            Object anObject = sharedQ.get();
            System.out.println(anObject);
        }

        for (int i = 0; i < 100; i = i + 1) {
            Object anObject = sharedQ.get();
            System.out.println(anObject);
        }

        for (int i = 0; i < 5; i = i + 1) {
            Object anObject = sharedQ.get();
            System.out.println(anObject);
        }

    }
}

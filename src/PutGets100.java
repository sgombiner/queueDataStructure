public class PutGets100 implements Runnable {
    Queue sharedQ;

    public PutGets100(Queue sharedQ) {
        this.sharedQ = sharedQ;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i = i + 1) {
                if (sharedQ.put(i) == false) {
                    Thread.currentThread().sleep(5);
                }
            }

            for (int i = 0; i < 100; i = i + 1) {
                Object anObject = null;
                while ((anObject = sharedQ.get()) == null) {
                    Thread.currentThread().sleep(5);
                }
                System.out.println(anObject);
            }
        } catch (Exception ex) {
        }

        System.out.println("Finished 100 numbers: " + sharedQ);
    }
}

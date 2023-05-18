public class PutGets5 implements Runnable {
    Queue sharedQ;

    public PutGets5(Queue sharedQ) {
        this.sharedQ = sharedQ;
    }

    @Override
    public void run() {
        try {
            while (sharedQ.put("Who") == false) {
                Thread.currentThread().sleep(5);
            }
            while (sharedQ.put("What") == false) {
                Thread.currentThread().sleep(5);
            }
            while (sharedQ.put("Why") == false) {
                Thread.currentThread().sleep(5);
            }
            while (sharedQ.put("When") == false) {
                Thread.currentThread().sleep(5);
            }
            while (sharedQ.put("Where") == false) {
                Thread.currentThread().sleep(5);
            }


            for (int i = 0; i < 5; i = i + 1) {
                Object anObject = null;
                while ((anObject = sharedQ.get()) == null) {
                    Thread.currentThread().sleep(5);
                }
                System.out.println(anObject);
            }
        } catch (Exception ex) {
        }

        System.out.println("Finished 5 questions: " + sharedQ);
    }
}

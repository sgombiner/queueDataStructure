public class PutGets3 implements Runnable {
    Queue sharedQ;

    public PutGets3(Queue sharedQ) {
        this.sharedQ = sharedQ;
    }

    @Override
    public void run() {
        try {
            while (sharedQ.put("Mr.") == false) {
                Thread.currentThread().sleep(5);
            }
            while (sharedQ.put("Hernandez") == false) {
                Thread.currentThread().sleep(5);
            }
            while (sharedQ.put("Computer Science") == false) {
                Thread.currentThread().sleep(5);
            }

           for (int i = 0; i < 3; i = i + 1) {
                Object anObject = null;
                while ((anObject = sharedQ.get()) == null) {
                    Thread.currentThread().sleep(5);
                }
                System.out.println(anObject);
            }
        } catch (Exception ex) {
        }
        System.out.println("Finished 3 names: " + sharedQ);
    }
}

public class AllPuts implements Runnable {
    Queue sharedQ;

    public AllPuts(Queue sharedQ) {
        this.sharedQ = sharedQ;
    }

    @Override
    public void run() {
        sharedQ.put("Mr.");
        sharedQ.put("Hernandez");
        sharedQ.put("Computer Science");

        for (int i = 0; i < 100; i = i + 1) {
            sharedQ.put(i);
        }

        sharedQ.put("Who");
        sharedQ.put("What");
        sharedQ.put("Why");
        sharedQ.put("When");
        sharedQ.put("Where");
    }
}

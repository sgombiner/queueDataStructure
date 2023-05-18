public class Main {
    public static void main(String[] args) {

        Queue myQ = new Queue();

        PutGets3 three = new PutGets3(myQ);
        PutGets100 hundred = new PutGets100(myQ);
        PutGets5 five = new PutGets5(myQ);
        Thread thread1 = new Thread(three);
        Thread thread2 = new Thread(hundred);
        Thread thread3 = new Thread(five);
        thread2.start();
        thread3.start();
        thread1.start();

        /*

        myQ.put("Mr.");
        myQ.put("Hernandez");
        myQ.put("Computer Science");

        for (int i = 0; i < 3; i = i + 1) {
            Object anObject = myQ.get();
            System.out.println(anObject);
        }

        for (int i = 0; i < 100; i = i + 1) {
            myQ.put(i);
        }

        System.out.println(myQ);

        for (int i = 0; i < 100; i = i + 1) {
            Object anObject = myQ.get();
            System.out.println(anObject);
        }

        System.out.println(myQ);


        myQ.put("Who");
        myQ.put("What");
        myQ.put("Why");
        myQ.put("When");
        myQ.put("Where");

        for (int i = 0; i < 5; i = i + 1) {
            Object anObject = myQ.get();
            System.out.println(anObject);
        }

        System.out.println(myQ);

*/

    }
}
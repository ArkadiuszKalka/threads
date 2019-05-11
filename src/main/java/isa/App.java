package isa;

public class App {

    public static void main(String[] args) throws InterruptedException {


        for (int i = 0; i < 2; i++) {

            final int current = i;

            Thread thread = new Thread(() -> {
                try {
                    Thread.sleep(current * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("T0" + (current + 1));
            });
            System.out.println("test0000" + i);
            thread.start();

            thread.join();
        }
        System.out.println("test 1");


/*
// Zadanie 2
        for (int i = 0; i < 8; i++) {

            final int current = i;

            Thread thread = new Thread(() -> {
                System.out.println("T0" + (current + 1));
            });

            thread.start();

        }
*/

/*
// Sposób 1
                    System.out.println("MT start");
            Thread thread = new Thread(() -> {
                System.out.println("T0 start");
                for (int i = 0; i < 5; i++) {
                    System.out.println("T0 " + i);
                }
                System.out.println("T0 stop");
            });
            thread.start();
            for (int i = 0; i < 5; i++) {
                System.out.println("MT " + i);
            }
            System.out.println("MT stop");
        */
        }

    }

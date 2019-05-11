package isa;

public class App {

    public static void main(String[] args) {


        for (int i = 0; i < 8; i++) {

            final int current = i;

            Thread thread = new Thread(() -> {
                System.out.println("T0" + (current + 1));
            });

            thread.start();

        }

/*
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

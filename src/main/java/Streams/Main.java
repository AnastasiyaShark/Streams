package Streams;


public class Main {

    public static void main(String[] args) {
        ThreadGroup mainGroup = new ThreadGroup("main group");

        final Thread myThreadNorthern = new MyThread(mainGroup, "Северный");
        final Thread myThreadSouthern = new MyThread(mainGroup, "Южный");
        final Thread myThreadOriental = new MyThread(mainGroup, "Восточный");
        final Thread myThreadWest = new MyThread(mainGroup, "Западный");
        System.out.println("Создаю потоки..");
        myThreadNorthern.start();
        myThreadSouthern.start();
        myThreadOriental.start();
        myThreadWest.start();

        try {
            Thread.sleep(15000);
        } catch (InterruptedException err) {
            System.out.println("error" + err.getMessage());
        }
        System.out.println("Завершаю все потоки.");
        mainGroup.interrupt();
    }
}

package Streams;

class MyThread extends Thread {

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(3000);
                System.out.printf("Всем привет! Я поток %s ;) %n", getName());
            }
        } catch (InterruptedException err) {
        }
    }
}

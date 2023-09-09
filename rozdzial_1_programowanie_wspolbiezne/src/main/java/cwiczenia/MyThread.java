package cwiczenia;

/**
 * przykładowa klasa dziedzicząca z Thread
 */

class MyThread extends Thread {

    public MyThread() {
        super();
    }

    public void run() {
        System.out.println("Thread: My Thread");
    }
}

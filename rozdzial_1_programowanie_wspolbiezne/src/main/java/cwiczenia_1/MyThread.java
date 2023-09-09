package cwiczenia_1;

/**
 * przykładowa klasa dziedzicząca z Thread
 */

class MyThread extends Thread {

    public MyThread() {
        super();
    }

    public void run() {
        System.out.println(this.getName());
    }

    public static void main(String[] args) {
        new MyThread().start();
        new MyThread().start();
    }
}

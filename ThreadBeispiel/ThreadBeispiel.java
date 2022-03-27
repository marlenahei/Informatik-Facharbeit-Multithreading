public class ThreadBeispiel {
    public static void main(String[] args) {
        System.out.println("starte.....");

        MyThread myThread1 = new MyThread("A");
        MyThread myThread2 = new MyThread("B");

        myThread1.start();
        myThread2.start();
    }
}

class MyThread extends Thread {
    String name;

    MyThread(String pName) {
        name = pName;
    }

    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println(name + "-->" + i);
        }
    }
}
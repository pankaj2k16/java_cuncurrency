public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread t = new Thread(myThread);
        t.start();
        ThreadExample myThreadExample = new ThreadExample();
        Thread t1 = new Thread(myThreadExample);
        t1.start();

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch);
        }
    }
}

public class ThreadExample extends Thread {
    @Override
    public void run() {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(ch);
        }
    }
}

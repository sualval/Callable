import java.util.concurrent.*;


class MyThread implements Callable<Integer> {
    private static int COUNT = 1;

    @Override
    public Integer call() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("����� " + Thread.currentThread().getName() + " ���� ������!" + " " + COUNT);
            COUNT++;
        }
        return COUNT;
    }

}
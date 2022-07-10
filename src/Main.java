import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;


public class Main {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        List<Callable<Integer>> callableList = new ArrayList<>();
        Callable<Integer> callable = new MyThread();

        callableList.add(callable);
        callableList.add(callable);
        callableList.add(callable);
        callableList.add(callable);
        for (Callable<Integer> f : callableList) {
            executorService.submit(f);
        }
        System.out.println(executorService.invokeAny(callableList));

        executorService.shutdownNow();
    }

}

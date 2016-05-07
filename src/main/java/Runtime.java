import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by anzhen on 2016/4/30.
 */
public class Runtime<Event> {

    private final Event t;

    private final ExecutorService executorService;

    private final CountDownLatch countDownLatch;

    private final Map<EventHandler<Event>, EventProcess<Event>> processMap;

    private final Callback<Event> callback;

    private final long timeout;

    private volatile Throwable error;

    private final Lock lock = new ReentrantLock();

    private volatile boolean canceled = false;

    private final ArrayList<Future<?>> futures;

    private final static ArrayList<Future<?>> EmptyFutures = new ArrayList<Future<?>>(0);

    public Runtime(Event t, ExecutorService executorService, CountDownLatch countDownLatch, Map<EventHandler<Event>, EventProcess<Event>> processMap, Callback<Event> callback, long timeout) {
        this.t = t;
        this.executorService = executorService;
        this.processMap = processMap;
        this.callback = callback;
        if (callback == null) {
            this.countDownLatch = new CountDownLatch(1);
        } else {
            this.countDownLatch = null;
        }
        this.timeout = timeout;
        if (timeout > 0) {
            futures = new ArrayList<Future<?>>(1);
        } else {
            futures = EmptyFutures;
        }
    }

    /**
     * 找出所有没有依赖的线程，优先执行，
     * 否则会导致一些线程被重复执行的bug
     */
    Event run(){

        ArrayList<EventProcess<Event>>  independencyProcesses = new ArrayList<EventProcess<Event>>(1);
        for(EventProcess<Event>  process: processMap.values()){
            if()
        }

    }
}

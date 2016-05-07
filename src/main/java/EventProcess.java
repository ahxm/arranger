import java.util.List;
import java.util.concurrent.locks.Lock;

/**
 * Created by anzhen on 2016/4/30.
 * 线程类
 */
public class EventProcess <Event> implements Runnable,Cloneable{

    /*运行时*/
    protected Runtime<Event> runtime;

   /* 对应的处理器*/
    private final EventHandler<Event> eventHandler;


   /* 依赖的event数量*/
   /* 单纯的set场景 get场景ok； 不能应用于进行getAndOperate场景，如果使用必须加锁或者使用AtomicInteger*/
    private volatile int dependingEvents;

    private final List<EventHandler<Event>>  dependedEventHandlers;

    private Event event;

    private Lock lock;


    public EventProcess(EventHandler<Event> eventHandler, List<EventHandler<Event>> dependedEventHandlers, int dependingEvents) {
        this.eventHandler = eventHandler;
        this.dependedEventHandlers = dependedEventHandlers;
        this.dependingEvents = dependingEvents;
    }


    public void init()

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p/>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {

    }
}

import java.util.IdentityHashMap;
import java.util.List;

/**
 * Created by anzhen on 2016/5/7.
 */
public class Flow<Event> {

    private volatile boolean ready = false;

    private final IdentityHashMap<EventHandler<Event>,List<EventHandler<Event>>>  dependedEventHandlers ;

    public Flow() {

        this.dependedEventHandlers = new IdentityHashMap<EventHandler<Event>, List<EventHandler<Event>>>();
    }

    synchronized
}

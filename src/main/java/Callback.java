/**
 * Created by anzhen on 2016/4/30.
 */
public interface Callback <Event>{

    public void onSuccess(Event event);

    public void onError(Event event,Throwable throwable );

}

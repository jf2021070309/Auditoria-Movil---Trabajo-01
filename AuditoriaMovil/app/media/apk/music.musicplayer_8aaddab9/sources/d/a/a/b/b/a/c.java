package d.a.a.b.b.a;

import ch.qos.logback.core.net.server.ConcurrentServerRunner;
import ch.qos.logback.core.net.server.ServerListener;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class c extends ConcurrentServerRunner<a> {
    public final int a;

    public c(ServerListener<a> serverListener, Executor executor, int i2) {
        super(serverListener, executor);
        this.a = i2;
    }

    @Override // ch.qos.logback.core.net.server.ConcurrentServerRunner
    public boolean configureClient(a aVar) {
        a aVar2 = aVar;
        aVar2.setContext(getContext());
        aVar2.T(new ArrayBlockingQueue(this.a));
        return true;
    }
}

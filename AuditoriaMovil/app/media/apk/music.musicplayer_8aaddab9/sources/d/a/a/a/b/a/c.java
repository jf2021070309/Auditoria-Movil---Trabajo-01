package d.a.a.a.b.a;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.net.server.ConcurrentServerRunner;
import ch.qos.logback.core.net.server.ServerListener;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class c extends ConcurrentServerRunner<a> {
    public c(ServerListener<a> serverListener, Executor executor) {
        super(serverListener, executor);
    }

    @Override // ch.qos.logback.core.net.server.ConcurrentServerRunner
    public boolean configureClient(a aVar) {
        aVar.setLoggerContext((LoggerContext) getContext());
        return true;
    }
}

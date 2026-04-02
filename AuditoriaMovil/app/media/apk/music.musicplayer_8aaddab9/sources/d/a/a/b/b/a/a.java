package d.a.a.b.b.a;

import ch.qos.logback.core.net.server.Client;
import ch.qos.logback.core.spi.ContextAware;
import java.io.Serializable;
import java.util.concurrent.BlockingQueue;
/* loaded from: classes.dex */
public interface a extends Client, ContextAware {
    void T(BlockingQueue<Serializable> blockingQueue);

    boolean t(Serializable serializable);
}

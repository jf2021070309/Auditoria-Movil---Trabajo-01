package ch.qos.logback.core.net.server;

import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.net.AbstractSocketAppender;
import ch.qos.logback.core.spi.PreSerializationTransformer;
import d.a.a.b.b.a.b;
import d.a.a.b.b.a.c;
import java.io.IOException;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.UnknownHostException;
import java.util.concurrent.Executor;
import javax.net.ServerSocketFactory;
/* loaded from: classes.dex */
public abstract class ServerSocketAppenderBase<E> extends AppenderBase<E> {
    public static final int DEFAULT_BACKLOG = 50;
    public static final int DEFAULT_CLIENT_QUEUE_SIZE = 100;
    private String address;
    private ServerRunner<d.a.a.b.b.a.a> runner;
    private int port = AbstractSocketAppender.DEFAULT_PORT;
    private int backlog = 50;
    private int clientQueueSize = 100;

    /* loaded from: classes.dex */
    public class a implements ClientVisitor<d.a.a.b.b.a.a> {
        public final /* synthetic */ Serializable a;

        public a(ServerSocketAppenderBase serverSocketAppenderBase, Serializable serializable) {
            this.a = serializable;
        }

        @Override // ch.qos.logback.core.net.server.ClientVisitor
        public void visit(d.a.a.b.b.a.a aVar) {
            aVar.t(this.a);
        }
    }

    @Override // ch.qos.logback.core.AppenderBase
    public void append(E e2) {
        if (e2 == null) {
            return;
        }
        postProcessEvent(e2);
        this.runner.accept(new a(this, getPST().transform(e2)));
    }

    public ServerListener<d.a.a.b.b.a.a> createServerListener(ServerSocket serverSocket) {
        return new b(serverSocket);
    }

    public ServerRunner<d.a.a.b.b.a.a> createServerRunner(ServerListener<d.a.a.b.b.a.a> serverListener, Executor executor) {
        return new c(serverListener, executor, getClientQueueSize());
    }

    public String getAddress() {
        return this.address;
    }

    public Integer getBacklog() {
        return Integer.valueOf(this.backlog);
    }

    public int getClientQueueSize() {
        return this.clientQueueSize;
    }

    public InetAddress getInetAddress() throws UnknownHostException {
        if (getAddress() == null) {
            return null;
        }
        return InetAddress.getByName(getAddress());
    }

    public abstract PreSerializationTransformer<E> getPST();

    public int getPort() {
        return this.port;
    }

    public ServerSocketFactory getServerSocketFactory() throws Exception {
        return ServerSocketFactory.getDefault();
    }

    public abstract void postProcessEvent(E e2);

    public void setAddress(String str) {
        this.address = str;
    }

    public void setBacklog(Integer num) {
        this.backlog = num.intValue();
    }

    public void setClientQueueSize(int i2) {
        this.clientQueueSize = i2;
    }

    public void setPort(int i2) {
        this.port = i2;
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        if (isStarted()) {
            return;
        }
        try {
            ServerRunner<d.a.a.b.b.a.a> createServerRunner = createServerRunner(createServerListener(getServerSocketFactory().createServerSocket(getPort(), getBacklog().intValue(), getInetAddress())), getContext().getScheduledExecutorService());
            this.runner = createServerRunner;
            createServerRunner.setContext(getContext());
            getContext().getScheduledExecutorService().execute(this.runner);
            super.start();
        } catch (Exception e2) {
            addError("server startup error: " + e2, e2);
        }
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        if (isStarted()) {
            try {
                this.runner.stop();
                super.stop();
            } catch (IOException e2) {
                addError("server shutdown error: " + e2, e2);
            }
        }
    }
}

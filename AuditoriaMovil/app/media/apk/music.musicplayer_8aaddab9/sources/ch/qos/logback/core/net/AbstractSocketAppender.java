package ch.qos.logback.core.net;

import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.net.SocketConnector;
import ch.qos.logback.core.spi.PreSerializationTransformer;
import ch.qos.logback.core.util.CloseUtil;
import ch.qos.logback.core.util.Duration;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
/* loaded from: classes.dex */
public abstract class AbstractSocketAppender<E> extends AppenderBase<E> implements SocketConnector.ExceptionHandler {
    private static final int DEFAULT_ACCEPT_CONNECTION_DELAY = 5000;
    private static final int DEFAULT_EVENT_DELAY_TIMEOUT = 100;
    public static final int DEFAULT_PORT = 4560;
    public static final int DEFAULT_QUEUE_SIZE = 128;
    public static final int DEFAULT_RECONNECTION_DELAY = 30000;
    private int acceptConnectionTimeout;
    private InetAddress address;
    private SocketConnector connector;
    private BlockingDeque<E> deque;
    private Duration eventDelayLimit;
    private final ObjectWriterFactory objectWriterFactory;
    private String peerId;
    private int port;
    private final QueueFactory queueFactory;
    private int queueSize;
    private Duration reconnectionDelay;
    private String remoteHost;
    private volatile Socket socket;
    private Future<?> task;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractSocketAppender.this.connectSocketAndDispatchEvents();
        }
    }

    public AbstractSocketAppender() {
        this(new QueueFactory(), new ObjectWriterFactory());
    }

    public AbstractSocketAppender(QueueFactory queueFactory, ObjectWriterFactory objectWriterFactory) {
        this.port = DEFAULT_PORT;
        this.reconnectionDelay = new Duration(30000L);
        this.queueSize = 128;
        this.acceptConnectionTimeout = 5000;
        this.eventDelayLimit = new Duration(100L);
        this.objectWriterFactory = objectWriterFactory;
        this.queueFactory = queueFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connectSocketAndDispatchEvents() {
        StringBuilder sb;
        while (socketConnectionCouldBeEstablished()) {
            try {
                try {
                    ObjectWriter createObjectWriterForSocket = createObjectWriterForSocket();
                    addInfo(this.peerId + "connection established");
                    dispatchEvents(createObjectWriterForSocket);
                    CloseUtil.closeQuietly(this.socket);
                    this.socket = null;
                    sb = new StringBuilder();
                    sb.append(this.peerId);
                    sb.append("connection closed");
                } catch (IOException e2) {
                    addInfo(this.peerId + "connection failed: " + e2);
                    CloseUtil.closeQuietly(this.socket);
                    this.socket = null;
                    sb = new StringBuilder();
                    sb.append(this.peerId);
                    sb.append("connection closed");
                }
                addInfo(sb.toString());
            } catch (InterruptedException unused) {
            }
        }
        addInfo("shutting down");
    }

    private SocketConnector createConnector(InetAddress inetAddress, int i2, int i3, long j2) {
        SocketConnector newConnector = newConnector(inetAddress, i2, i3, j2);
        newConnector.setExceptionHandler(this);
        newConnector.setSocketFactory(getSocketFactory());
        return newConnector;
    }

    private ObjectWriter createObjectWriterForSocket() throws IOException {
        this.socket.setSoTimeout(this.acceptConnectionTimeout);
        AutoFlushingObjectWriter newAutoFlushingObjectWriter = this.objectWriterFactory.newAutoFlushingObjectWriter(this.socket.getOutputStream());
        this.socket.setSoTimeout(0);
        return newAutoFlushingObjectWriter;
    }

    private void dispatchEvents(ObjectWriter objectWriter) throws InterruptedException, IOException {
        while (true) {
            E takeFirst = this.deque.takeFirst();
            postProcessEvent(takeFirst);
            try {
                objectWriter.write(getPST().transform(takeFirst));
            } catch (IOException e2) {
                tryReAddingEventToFrontOfQueue(takeFirst);
                throw e2;
            }
        }
    }

    private boolean socketConnectionCouldBeEstablished() throws InterruptedException {
        Socket call = this.connector.call();
        this.socket = call;
        return call != null;
    }

    private void tryReAddingEventToFrontOfQueue(E e2) {
        if (this.deque.offerFirst(e2)) {
            return;
        }
        addInfo("Dropping event due to socket connection error and maxed out deque capacity");
    }

    @Override // ch.qos.logback.core.AppenderBase
    public void append(E e2) {
        if (e2 == null || !isStarted()) {
            return;
        }
        try {
            if (this.deque.offer(e2, this.eventDelayLimit.getMilliseconds(), TimeUnit.MILLISECONDS)) {
                return;
            }
            addInfo("Dropping event due to timeout limit of [" + this.eventDelayLimit + "] being exceeded");
        } catch (InterruptedException e3) {
            addError("Interrupted while appending event to SocketAppender", e3);
        }
    }

    @Override // ch.qos.logback.core.net.SocketConnector.ExceptionHandler
    public void connectionFailed(SocketConnector socketConnector, Exception exc) {
        StringBuilder sb;
        String sb2;
        if (exc instanceof InterruptedException) {
            sb2 = "connector interrupted";
        } else {
            if (exc instanceof ConnectException) {
                sb = new StringBuilder();
                sb.append(this.peerId);
                sb.append("connection refused");
            } else {
                sb = new StringBuilder();
                sb.append(this.peerId);
                sb.append(exc);
            }
            sb2 = sb.toString();
        }
        addInfo(sb2);
    }

    public Duration getEventDelayLimit() {
        return this.eventDelayLimit;
    }

    public abstract PreSerializationTransformer<E> getPST();

    public int getPort() {
        return this.port;
    }

    public int getQueueSize() {
        return this.queueSize;
    }

    public Duration getReconnectionDelay() {
        return this.reconnectionDelay;
    }

    public String getRemoteHost() {
        return this.remoteHost;
    }

    public SocketFactory getSocketFactory() {
        return SocketFactory.getDefault();
    }

    public SocketConnector newConnector(InetAddress inetAddress, int i2, long j2, long j3) {
        return new DefaultSocketConnector(inetAddress, i2, j2, j3);
    }

    public abstract void postProcessEvent(E e2);

    public void setAcceptConnectionTimeout(int i2) {
        this.acceptConnectionTimeout = i2;
    }

    public void setEventDelayLimit(Duration duration) {
        this.eventDelayLimit = duration;
    }

    public void setPort(int i2) {
        this.port = i2;
    }

    public void setQueueSize(int i2) {
        this.queueSize = i2;
    }

    public void setReconnectionDelay(Duration duration) {
        this.reconnectionDelay = duration;
    }

    public void setRemoteHost(String str) {
        this.remoteHost = str;
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        if (isStarted()) {
            return;
        }
        int i2 = 0;
        if (this.port <= 0) {
            StringBuilder y = e.a.d.a.a.y("No port was configured for appender");
            y.append(this.name);
            y.append(" For more information, please visit http://logback.qos.ch/codes.html#socket_no_port");
            addError(y.toString());
            i2 = 1;
        }
        if (this.remoteHost == null) {
            i2++;
            StringBuilder y2 = e.a.d.a.a.y("No remote host was configured for appender");
            y2.append(this.name);
            y2.append(" For more information, please visit http://logback.qos.ch/codes.html#socket_no_host");
            addError(y2.toString());
        }
        if (this.queueSize == 0) {
            addWarn("Queue size of zero is deprecated, use a size of one to indicate synchronous processing");
        }
        if (this.queueSize < 0) {
            i2++;
            addError("Queue size must be greater than zero");
        }
        if (i2 == 0) {
            try {
                this.address = InetAddress.getByName(this.remoteHost);
            } catch (UnknownHostException unused) {
                StringBuilder y3 = e.a.d.a.a.y("unknown host: ");
                y3.append(this.remoteHost);
                addError(y3.toString());
                i2++;
            }
        }
        if (i2 == 0) {
            this.deque = this.queueFactory.newLinkedBlockingDeque(this.queueSize);
            StringBuilder y4 = e.a.d.a.a.y("remote peer ");
            y4.append(this.remoteHost);
            y4.append(":");
            this.peerId = e.a.d.a.a.p(y4, this.port, ": ");
            this.connector = createConnector(this.address, this.port, 0, this.reconnectionDelay.getMilliseconds());
            this.task = getContext().getScheduledExecutorService().submit(new a());
            super.start();
        }
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        if (isStarted()) {
            CloseUtil.closeQuietly(this.socket);
            this.task.cancel(true);
            super.stop();
        }
    }
}

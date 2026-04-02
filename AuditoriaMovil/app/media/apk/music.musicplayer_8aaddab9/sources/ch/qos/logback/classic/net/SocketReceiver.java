package ch.qos.logback.classic.net;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.net.server.HardenedLoggingEventInputStream;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.net.DefaultSocketConnector;
import ch.qos.logback.core.net.SocketConnector;
import ch.qos.logback.core.util.CloseUtil;
import e.a.d.a.a;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import javax.net.SocketFactory;
/* loaded from: classes.dex */
public class SocketReceiver extends ReceiverBase implements Runnable, SocketConnector.ExceptionHandler {
    private static final int DEFAULT_ACCEPT_CONNECTION_DELAY = 5000;
    private int acceptConnectionTimeout = 5000;
    private InetAddress address;
    private Future<Socket> connectorTask;
    private int port;
    private String receiverId;
    private int reconnectionDelay;
    private String remoteHost;
    private volatile Socket socket;

    private Future<Socket> activateConnector(SocketConnector socketConnector) {
        try {
            return getContext().getScheduledExecutorService().submit(socketConnector);
        } catch (RejectedExecutionException unused) {
            return null;
        }
    }

    private SocketConnector createConnector(InetAddress inetAddress, int i2, int i3, int i4) {
        SocketConnector newConnector = newConnector(inetAddress, i2, i3, i4);
        newConnector.setExceptionHandler(this);
        newConnector.setSocketFactory(getSocketFactory());
        return newConnector;
    }

    private void dispatchEvents(LoggerContext loggerContext) {
        HardenedLoggingEventInputStream hardenedLoggingEventInputStream;
        StringBuilder sb;
        try {
            try {
                this.socket.setSoTimeout(this.acceptConnectionTimeout);
                hardenedLoggingEventInputStream = new HardenedLoggingEventInputStream(this.socket.getInputStream());
                try {
                    this.socket.setSoTimeout(0);
                    addInfo(this.receiverId + "connection established");
                    while (true) {
                        ILoggingEvent iLoggingEvent = (ILoggingEvent) hardenedLoggingEventInputStream.readObject();
                        Logger logger = loggerContext.getLogger(iLoggingEvent.getLoggerName());
                        if (logger.isEnabledFor(iLoggingEvent.getLevel())) {
                            logger.callAppenders(iLoggingEvent);
                        }
                    }
                } catch (EOFException unused) {
                    addInfo(this.receiverId + "end-of-stream detected");
                    CloseUtil.closeQuietly(hardenedLoggingEventInputStream);
                    CloseUtil.closeQuietly(this.socket);
                    this.socket = null;
                    sb = new StringBuilder();
                    sb.append(this.receiverId);
                    sb.append("connection closed");
                    addInfo(sb.toString());
                } catch (IOException e2) {
                    e = e2;
                    addInfo(this.receiverId + "connection failed: " + e);
                    CloseUtil.closeQuietly(hardenedLoggingEventInputStream);
                    CloseUtil.closeQuietly(this.socket);
                    this.socket = null;
                    sb = new StringBuilder();
                    sb.append(this.receiverId);
                    sb.append("connection closed");
                    addInfo(sb.toString());
                } catch (ClassNotFoundException e3) {
                    e = e3;
                    addInfo(this.receiverId + "unknown event class: " + e);
                    CloseUtil.closeQuietly(hardenedLoggingEventInputStream);
                    CloseUtil.closeQuietly(this.socket);
                    this.socket = null;
                    sb = new StringBuilder();
                    sb.append(this.receiverId);
                    sb.append("connection closed");
                    addInfo(sb.toString());
                }
            } catch (Throwable th) {
                th = th;
                CloseUtil.closeQuietly((Closeable) null);
                CloseUtil.closeQuietly(this.socket);
                this.socket = null;
                addInfo(this.receiverId + "connection closed");
                throw th;
            }
        } catch (EOFException unused2) {
            hardenedLoggingEventInputStream = null;
        } catch (IOException e4) {
            e = e4;
            hardenedLoggingEventInputStream = null;
        } catch (ClassNotFoundException e5) {
            e = e5;
            hardenedLoggingEventInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            CloseUtil.closeQuietly((Closeable) null);
            CloseUtil.closeQuietly(this.socket);
            this.socket = null;
            addInfo(this.receiverId + "connection closed");
            throw th;
        }
    }

    private Socket waitForConnectorToReturnASocket() throws InterruptedException {
        try {
            Socket socket = this.connectorTask.get();
            this.connectorTask = null;
            return socket;
        } catch (ExecutionException unused) {
            return null;
        }
    }

    @Override // ch.qos.logback.core.net.SocketConnector.ExceptionHandler
    public void connectionFailed(SocketConnector socketConnector, Exception exc) {
        StringBuilder sb;
        String str;
        String sb2;
        if (exc instanceof InterruptedException) {
            sb2 = "connector interrupted";
        } else {
            if (exc instanceof ConnectException) {
                sb = new StringBuilder();
                sb.append(this.receiverId);
                str = "connection refused";
            } else {
                sb = new StringBuilder();
                sb.append(this.receiverId);
                str = "unspecified error";
            }
            sb.append(str);
            sb2 = sb.toString();
        }
        addWarn(sb2, exc);
    }

    @Override // ch.qos.logback.classic.net.ReceiverBase
    public Runnable getRunnableTask() {
        return this;
    }

    public SocketFactory getSocketFactory() {
        return SocketFactory.getDefault();
    }

    public SocketConnector newConnector(InetAddress inetAddress, int i2, int i3, int i4) {
        return new DefaultSocketConnector(inetAddress, i2, i3, i4);
    }

    @Override // ch.qos.logback.classic.net.ReceiverBase
    public void onStop() {
        if (this.socket != null) {
            CloseUtil.closeQuietly(this.socket);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            LoggerContext loggerContext = (LoggerContext) getContext();
            while (!Thread.currentThread().isInterrupted()) {
                Future<Socket> activateConnector = activateConnector(createConnector(this.address, this.port, 0, this.reconnectionDelay));
                this.connectorTask = activateConnector;
                if (activateConnector == null) {
                    break;
                }
                this.socket = waitForConnectorToReturnASocket();
                if (this.socket == null) {
                    break;
                }
                dispatchEvents(loggerContext);
            }
        } catch (InterruptedException unused) {
        }
        addInfo("shutting down");
    }

    public void setAcceptConnectionTimeout(int i2) {
        this.acceptConnectionTimeout = i2;
    }

    public void setPort(int i2) {
        this.port = i2;
    }

    public void setReconnectionDelay(int i2) {
        this.reconnectionDelay = i2;
    }

    public void setRemoteHost(String str) {
        this.remoteHost = str;
    }

    @Override // ch.qos.logback.classic.net.ReceiverBase
    public boolean shouldStart() {
        int i2;
        if (this.port == 0) {
            addError("No port was configured for receiver. For more information, please visit http://logback.qos.ch/codes.html#receiver_no_port");
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (this.remoteHost == null) {
            i2++;
            addError("No host name or address was configured for receiver. For more information, please visit http://logback.qos.ch/codes.html#receiver_no_host");
        }
        if (this.reconnectionDelay == 0) {
            this.reconnectionDelay = 30000;
        }
        if (i2 == 0) {
            try {
                this.address = InetAddress.getByName(this.remoteHost);
            } catch (UnknownHostException unused) {
                StringBuilder y = a.y("unknown host: ");
                y.append(this.remoteHost);
                addError(y.toString());
                i2++;
            }
        }
        if (i2 == 0) {
            StringBuilder y2 = a.y("receiver ");
            y2.append(this.remoteHost);
            y2.append(":");
            this.receiverId = a.p(y2, this.port, ": ");
        }
        return i2 == 0;
    }
}

package d.a.a.a.b.a;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.net.server.HardenedLoggingEventInputStream;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.net.HardenedObjectInputStream;
import ch.qos.logback.core.util.CloseUtil;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
/* loaded from: classes.dex */
public class d implements a {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final Socket f4943b;

    /* renamed from: c  reason: collision with root package name */
    public LoggerContext f4944c;

    /* renamed from: d  reason: collision with root package name */
    public Logger f4945d;

    public d(String str, Socket socket) {
        this.a = str;
        this.f4943b = socket;
    }

    public final HardenedObjectInputStream a() throws IOException {
        return new HardenedLoggingEventInputStream(this.f4943b.getInputStream());
    }

    @Override // ch.qos.logback.core.net.server.Client, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Socket socket = this.f4943b;
        if (socket == null) {
            return;
        }
        CloseUtil.closeQuietly(socket);
    }

    @Override // java.lang.Runnable
    public void run() {
        Logger logger;
        StringBuilder sb;
        Logger logger2 = this.f4945d;
        logger2.info(this + ": connected");
        HardenedObjectInputStream hardenedObjectInputStream = null;
        try {
            try {
                try {
                    hardenedObjectInputStream = a();
                    while (true) {
                        ILoggingEvent iLoggingEvent = (ILoggingEvent) hardenedObjectInputStream.readObject();
                        Logger logger3 = this.f4944c.getLogger(iLoggingEvent.getLoggerName());
                        if (logger3.isEnabledFor(iLoggingEvent.getLevel())) {
                            logger3.callAppenders(iLoggingEvent);
                        }
                    }
                } catch (EOFException unused) {
                    if (hardenedObjectInputStream != null) {
                        CloseUtil.closeQuietly(hardenedObjectInputStream);
                    }
                    close();
                    logger = this.f4945d;
                    sb = new StringBuilder();
                    sb.append(this);
                    sb.append(": connection closed");
                    logger.info(sb.toString());
                } catch (ClassNotFoundException unused2) {
                    Logger logger4 = this.f4945d;
                    logger4.error(this + ": unknown event class");
                    if (hardenedObjectInputStream != null) {
                        CloseUtil.closeQuietly(hardenedObjectInputStream);
                    }
                    close();
                    logger = this.f4945d;
                    sb = new StringBuilder();
                    sb.append(this);
                    sb.append(": connection closed");
                    logger.info(sb.toString());
                }
            } catch (IOException e2) {
                Logger logger5 = this.f4945d;
                logger5.info(this + ": " + e2);
                if (hardenedObjectInputStream != null) {
                    CloseUtil.closeQuietly(hardenedObjectInputStream);
                }
                close();
                logger = this.f4945d;
                sb = new StringBuilder();
                sb.append(this);
                sb.append(": connection closed");
                logger.info(sb.toString());
            } catch (RuntimeException e3) {
                Logger logger6 = this.f4945d;
                logger6.error(this + ": " + e3);
                if (hardenedObjectInputStream != null) {
                    CloseUtil.closeQuietly(hardenedObjectInputStream);
                }
                close();
                logger = this.f4945d;
                sb = new StringBuilder();
                sb.append(this);
                sb.append(": connection closed");
                logger.info(sb.toString());
            }
        } catch (Throwable th) {
            if (hardenedObjectInputStream != null) {
                CloseUtil.closeQuietly(hardenedObjectInputStream);
            }
            close();
            Logger logger7 = this.f4945d;
            logger7.info(this + ": connection closed");
            throw th;
        }
    }

    @Override // d.a.a.a.b.a.a
    public void setLoggerContext(LoggerContext loggerContext) {
        this.f4944c = loggerContext;
        this.f4945d = loggerContext.getLogger(d.class.getPackage().getName());
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("client ");
        y.append(this.a);
        return y.toString();
    }
}

package d.a.a.b.b.a;

import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.util.CloseUtil;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.net.SocketException;
import java.util.concurrent.BlockingQueue;
/* loaded from: classes.dex */
public class d extends ContextAwareBase implements a {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final Socket f4948b;

    /* renamed from: c  reason: collision with root package name */
    public BlockingQueue<Serializable> f4949c;

    public d(String str, Socket socket) {
        this.a = e.a.d.a.a.l("client ", str, ": ");
        this.f4948b = socket;
    }

    @Override // d.a.a.b.b.a.a
    public void T(BlockingQueue<Serializable> blockingQueue) {
        this.f4949c = blockingQueue;
    }

    public final ObjectOutputStream a() throws IOException {
        return this.f4948b == null ? new ObjectOutputStream(null) : new ObjectOutputStream(this.f4948b.getOutputStream());
    }

    @Override // ch.qos.logback.core.net.server.Client, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Socket socket = this.f4948b;
        if (socket == null) {
            return;
        }
        CloseUtil.closeQuietly(socket);
    }

    @Override // java.lang.Runnable
    public void run() {
        StringBuilder sb;
        addInfo(this.a + "connected");
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                try {
                    objectOutputStream = a();
                    loop0: while (true) {
                        int i2 = 0;
                        while (!Thread.currentThread().isInterrupted()) {
                            try {
                                objectOutputStream.writeObject(this.f4949c.take());
                                objectOutputStream.flush();
                                i2++;
                            } catch (InterruptedException unused) {
                            }
                            if (i2 >= 70) {
                                try {
                                    objectOutputStream.reset();
                                    break;
                                } catch (InterruptedException unused2) {
                                    i2 = 0;
                                    Thread.currentThread().interrupt();
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    CloseUtil.closeQuietly(objectOutputStream);
                    close();
                    sb = new StringBuilder();
                } catch (SocketException e2) {
                    addInfo(this.a + e2);
                    if (objectOutputStream != null) {
                        CloseUtil.closeQuietly(objectOutputStream);
                    }
                    close();
                    sb = new StringBuilder();
                }
            } catch (IOException e3) {
                addError(this.a + e3);
                if (objectOutputStream != null) {
                    CloseUtil.closeQuietly(objectOutputStream);
                }
                close();
                sb = new StringBuilder();
            } catch (RuntimeException e4) {
                addError(this.a + e4);
                if (objectOutputStream != null) {
                    CloseUtil.closeQuietly(objectOutputStream);
                }
                close();
                sb = new StringBuilder();
            }
            sb.append(this.a);
            sb.append("connection closed");
            addInfo(sb.toString());
        } catch (Throwable th) {
            if (objectOutputStream != null) {
                CloseUtil.closeQuietly(objectOutputStream);
            }
            close();
            addInfo(this.a + "connection closed");
            throw th;
        }
    }

    @Override // d.a.a.b.b.a.a
    public boolean t(Serializable serializable) {
        BlockingQueue<Serializable> blockingQueue = this.f4949c;
        if (blockingQueue != null) {
            return blockingQueue.offer(serializable);
        }
        throw new IllegalStateException("client has no event queue");
    }
}

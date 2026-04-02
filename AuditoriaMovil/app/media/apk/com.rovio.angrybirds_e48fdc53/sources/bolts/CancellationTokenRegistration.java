package bolts;

import java.io.Closeable;
/* loaded from: classes2.dex */
public class CancellationTokenRegistration implements Closeable {
    private final Object a = new Object();
    private CancellationTokenSource b;
    private Runnable c;
    private boolean d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CancellationTokenRegistration(CancellationTokenSource cancellationTokenSource, Runnable runnable) {
        this.b = cancellationTokenSource;
        this.c = runnable;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.a) {
            if (!this.d) {
                this.d = true;
                this.b.a(this);
                this.b = null;
                this.c = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        synchronized (this.a) {
            b();
            this.c.run();
            close();
        }
    }

    private void b() {
        if (this.d) {
            throw new IllegalStateException("Object already closed");
        }
    }
}

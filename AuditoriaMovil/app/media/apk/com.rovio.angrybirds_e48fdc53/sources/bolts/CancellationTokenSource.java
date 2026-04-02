package bolts;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class CancellationTokenSource implements Closeable {
    private final Object a = new Object();
    private final List<CancellationTokenRegistration> b = new ArrayList();
    private final ScheduledExecutorService c = b.b();
    private ScheduledFuture<?> d;
    private boolean e;
    private boolean f;

    public boolean isCancellationRequested() {
        boolean z;
        synchronized (this.a) {
            b();
            z = this.e;
        }
        return z;
    }

    public CancellationToken getToken() {
        CancellationToken cancellationToken;
        synchronized (this.a) {
            b();
            cancellationToken = new CancellationToken(this);
        }
        return cancellationToken;
    }

    public void cancel() {
        synchronized (this.a) {
            b();
            if (!this.e) {
                c();
                this.e = true;
                a(new ArrayList(this.b));
            }
        }
    }

    public void cancelAfter(long j) {
        a(j, TimeUnit.MILLISECONDS);
    }

    private void a(long j, TimeUnit timeUnit) {
        if (j < -1) {
            throw new IllegalArgumentException("Delay must be >= -1");
        }
        if (j == 0) {
            cancel();
            return;
        }
        synchronized (this.a) {
            if (!this.e) {
                c();
                if (j != -1) {
                    this.d = this.c.schedule(new Runnable() { // from class: bolts.CancellationTokenSource.1
                        @Override // java.lang.Runnable
                        public void run() {
                            synchronized (CancellationTokenSource.this.a) {
                                CancellationTokenSource.this.d = null;
                            }
                            CancellationTokenSource.this.cancel();
                        }
                    }, j, timeUnit);
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.a) {
            if (!this.f) {
                c();
                for (CancellationTokenRegistration cancellationTokenRegistration : this.b) {
                    cancellationTokenRegistration.close();
                }
                this.b.clear();
                this.f = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CancellationTokenRegistration a(Runnable runnable) {
        CancellationTokenRegistration cancellationTokenRegistration;
        synchronized (this.a) {
            b();
            cancellationTokenRegistration = new CancellationTokenRegistration(this, runnable);
            if (this.e) {
                cancellationTokenRegistration.a();
            } else {
                this.b.add(cancellationTokenRegistration);
            }
        }
        return cancellationTokenRegistration;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        synchronized (this.a) {
            b();
            if (this.e) {
                throw new CancellationException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(CancellationTokenRegistration cancellationTokenRegistration) {
        synchronized (this.a) {
            b();
            this.b.remove(cancellationTokenRegistration);
        }
    }

    private void a(List<CancellationTokenRegistration> list) {
        for (CancellationTokenRegistration cancellationTokenRegistration : list) {
            cancellationTokenRegistration.a();
        }
    }

    public String toString() {
        return String.format(Locale.US, "%s@%s[cancellationRequested=%s]", getClass().getName(), Integer.toHexString(hashCode()), Boolean.toString(isCancellationRequested()));
    }

    private void b() {
        if (this.f) {
            throw new IllegalStateException("Object already closed");
        }
    }

    private void c() {
        if (this.d != null) {
            this.d.cancel(true);
            this.d = null;
        }
    }
}

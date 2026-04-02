package e.h.g;

import java.util.concurrent.locks.Lock;
/* loaded from: classes.dex */
public class y0 implements AutoCloseable {
    public final Lock a;

    public y0(Lock lock) {
        this.a = lock;
        lock.lock();
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.a.unlock();
    }
}

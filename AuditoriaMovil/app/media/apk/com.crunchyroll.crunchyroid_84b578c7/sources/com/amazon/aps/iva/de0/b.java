package com.amazon.aps.iva.de0;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: locks.kt */
/* loaded from: classes4.dex */
public class b implements k {
    public final Lock b;

    public /* synthetic */ b(int i) {
        this(new ReentrantLock());
    }

    @Override // com.amazon.aps.iva.de0.k
    public void lock() {
        this.b.lock();
    }

    @Override // com.amazon.aps.iva.de0.k
    public final void unlock() {
        this.b.unlock();
    }

    public b(Lock lock) {
        com.amazon.aps.iva.yb0.j.f(lock, "lock");
        this.b = lock;
    }
}

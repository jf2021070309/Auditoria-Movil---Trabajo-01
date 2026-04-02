package com.amazon.aps.iva.x5;

import android.os.ConditionVariable;
/* compiled from: SimpleCache.java */
/* loaded from: classes.dex */
public final class q extends Thread {
    public final /* synthetic */ ConditionVariable b;
    public final /* synthetic */ r c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.c = rVar;
        this.b = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.c) {
            this.b.open();
            r.k(this.c);
            this.c.b.d();
        }
    }
}

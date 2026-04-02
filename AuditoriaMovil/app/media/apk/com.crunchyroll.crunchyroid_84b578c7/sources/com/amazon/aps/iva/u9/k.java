package com.amazon.aps.iva.u9;

import androidx.work.WorkerParameters;
/* compiled from: StartWorkRunnable.java */
/* loaded from: classes.dex */
public final class k implements Runnable {
    public final com.amazon.aps.iva.l9.k b;
    public final String c;
    public final WorkerParameters.a d;

    public k(com.amazon.aps.iva.l9.k kVar, String str, WorkerParameters.a aVar) {
        this.b = kVar;
        this.c = str;
        this.d = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f.e(this.c, this.d);
    }
}

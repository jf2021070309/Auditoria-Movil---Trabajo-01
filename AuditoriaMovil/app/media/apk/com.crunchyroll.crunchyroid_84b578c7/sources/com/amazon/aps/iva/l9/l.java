package com.amazon.aps.iva.l9;

import androidx.work.ListenableWorker;
import com.google.common.util.concurrent.ListenableFuture;
/* compiled from: WorkerWrapper.java */
/* loaded from: classes.dex */
public final class l implements Runnable {
    public final /* synthetic */ ListenableFuture b;
    public final /* synthetic */ com.amazon.aps.iva.v9.c c;
    public final /* synthetic */ n d;

    public l(n nVar, com.amazon.aps.iva.v9.c cVar, com.amazon.aps.iva.v9.c cVar2) {
        this.d = nVar;
        this.b = cVar;
        this.c = cVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.amazon.aps.iva.v9.c cVar = this.c;
        n nVar = this.d;
        try {
            this.b.get();
            com.amazon.aps.iva.k9.m c = com.amazon.aps.iva.k9.m.c();
            int i = n.u;
            String.format("Starting work for %s", nVar.f.c);
            c.a(new Throwable[0]);
            ListenableFuture<ListenableWorker.a> startWork = nVar.g.startWork();
            nVar.s = startWork;
            cVar.j(startWork);
        } catch (Throwable th) {
            cVar.i(th);
        }
    }
}

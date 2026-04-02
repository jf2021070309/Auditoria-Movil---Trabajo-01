package com.amazon.aps.iva.u9;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;
import java.util.UUID;
/* compiled from: WorkForegroundRunnable.java */
/* loaded from: classes.dex */
public final class n implements Runnable {
    public static final /* synthetic */ int h = 0;
    public final com.amazon.aps.iva.v9.c<Void> b = new com.amazon.aps.iva.v9.c<>();
    public final Context c;
    public final com.amazon.aps.iva.t9.p d;
    public final ListenableWorker e;
    public final com.amazon.aps.iva.k9.h f;
    public final com.amazon.aps.iva.w9.a g;

    /* compiled from: WorkForegroundRunnable.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ com.amazon.aps.iva.v9.c b;

        public a(com.amazon.aps.iva.v9.c cVar) {
            this.b = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.b.j(n.this.e.getForegroundInfoAsync());
        }
    }

    /* compiled from: WorkForegroundRunnable.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ com.amazon.aps.iva.v9.c b;

        public b(com.amazon.aps.iva.v9.c cVar) {
            this.b = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            n nVar = n.this;
            try {
                com.amazon.aps.iva.k9.g gVar = (com.amazon.aps.iva.k9.g) this.b.get();
                if (gVar != null) {
                    com.amazon.aps.iva.k9.m c = com.amazon.aps.iva.k9.m.c();
                    int i = n.h;
                    Object[] objArr = new Object[1];
                    com.amazon.aps.iva.t9.p pVar = nVar.d;
                    ListenableWorker listenableWorker = nVar.e;
                    objArr[0] = pVar.c;
                    String.format("Updating notification for %s", objArr);
                    c.a(new Throwable[0]);
                    listenableWorker.setRunInForeground(true);
                    com.amazon.aps.iva.v9.c<Void> cVar = nVar.b;
                    com.amazon.aps.iva.k9.h hVar = nVar.f;
                    Context context = nVar.c;
                    UUID id = listenableWorker.getId();
                    p pVar2 = (p) hVar;
                    pVar2.getClass();
                    com.amazon.aps.iva.v9.c cVar2 = new com.amazon.aps.iva.v9.c();
                    ((com.amazon.aps.iva.w9.b) pVar2.a).a(new o(pVar2, cVar2, id, gVar, context));
                    cVar.j(cVar2);
                    return;
                }
                throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", nVar.d.c));
            } catch (Throwable th) {
                nVar.b.i(th);
            }
        }
    }

    static {
        com.amazon.aps.iva.k9.m.e("WorkForegroundRunnable");
    }

    @SuppressLint({"LambdaLast"})
    public n(Context context, com.amazon.aps.iva.t9.p pVar, ListenableWorker listenableWorker, com.amazon.aps.iva.k9.h hVar, com.amazon.aps.iva.w9.a aVar) {
        this.c = context;
        this.d = pVar;
        this.e = listenableWorker;
        this.f = hVar;
        this.g = aVar;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public final void run() {
        if (this.d.q && !com.amazon.aps.iva.k3.a.b()) {
            com.amazon.aps.iva.v9.c cVar = new com.amazon.aps.iva.v9.c();
            com.amazon.aps.iva.w9.b bVar = (com.amazon.aps.iva.w9.b) this.g;
            bVar.c.execute(new a(cVar));
            cVar.addListener(new b(cVar), bVar.c);
            return;
        }
        this.b.h(null);
    }
}

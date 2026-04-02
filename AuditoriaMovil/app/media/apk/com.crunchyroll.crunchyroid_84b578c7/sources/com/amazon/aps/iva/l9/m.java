package com.amazon.aps.iva.l9;

import android.annotation.SuppressLint;
import androidx.work.ListenableWorker;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
/* compiled from: WorkerWrapper.java */
/* loaded from: classes.dex */
public final class m implements Runnable {
    public final /* synthetic */ com.amazon.aps.iva.v9.c b;
    public final /* synthetic */ String c;
    public final /* synthetic */ n d;

    public m(n nVar, com.amazon.aps.iva.v9.c cVar, String str) {
        this.d = nVar;
        this.b = cVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"SyntheticAccessor"})
    public final void run() {
        String str = this.c;
        n nVar = this.d;
        try {
            try {
                ListenableWorker.a aVar = (ListenableWorker.a) this.b.get();
                if (aVar == null) {
                    com.amazon.aps.iva.k9.m c = com.amazon.aps.iva.k9.m.c();
                    int i = n.u;
                    String.format("%s returned a null result. Treating it as a failure.", nVar.f.c);
                    c.b(new Throwable[0]);
                } else {
                    com.amazon.aps.iva.k9.m c2 = com.amazon.aps.iva.k9.m.c();
                    int i2 = n.u;
                    String.format("%s returned a %s result.", nVar.f.c, aVar);
                    c2.a(new Throwable[0]);
                    nVar.i = aVar;
                }
            } catch (InterruptedException e) {
                e = e;
                com.amazon.aps.iva.k9.m c3 = com.amazon.aps.iva.k9.m.c();
                int i3 = n.u;
                String.format("%s failed because it threw an exception/error", str);
                c3.b(e);
            } catch (CancellationException e2) {
                com.amazon.aps.iva.k9.m c4 = com.amazon.aps.iva.k9.m.c();
                int i4 = n.u;
                String.format("%s was cancelled", str);
                c4.d(e2);
            } catch (ExecutionException e3) {
                e = e3;
                com.amazon.aps.iva.k9.m c32 = com.amazon.aps.iva.k9.m.c();
                int i32 = n.u;
                String.format("%s failed because it threw an exception/error", str);
                c32.b(e);
            }
        } finally {
            nVar.c();
        }
    }
}

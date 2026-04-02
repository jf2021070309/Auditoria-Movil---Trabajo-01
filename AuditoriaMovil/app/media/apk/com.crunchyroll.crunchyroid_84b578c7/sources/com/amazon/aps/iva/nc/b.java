package com.amazon.aps.iva.nc;

import com.amazon.aps.iva.nc.c;
/* compiled from: ActiveResources.java */
/* loaded from: classes.dex */
public final class b implements Runnable {
    public final /* synthetic */ c b;

    public b(c cVar) {
        this.b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c cVar = this.b;
        cVar.getClass();
        while (true) {
            try {
                cVar.b((c.a) cVar.d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

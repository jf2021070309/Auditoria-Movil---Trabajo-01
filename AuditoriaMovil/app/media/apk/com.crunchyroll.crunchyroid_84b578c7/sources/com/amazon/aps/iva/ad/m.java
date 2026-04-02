package com.amazon.aps.iva.ad;

import com.amazon.aps.iva.ad.l;
/* compiled from: SingletonConnectivityReceiver.java */
/* loaded from: classes.dex */
public final class m implements Runnable {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ l.c.a c;

    public m(l.c.a aVar, boolean z) {
        this.c = aVar;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l.c.a aVar = this.c;
        aVar.getClass();
        com.amazon.aps.iva.hd.l.a();
        l.c cVar = l.c.this;
        boolean z = cVar.a;
        boolean z2 = this.b;
        cVar.a = z2;
        if (z != z2) {
            cVar.b.a(z2);
        }
    }
}

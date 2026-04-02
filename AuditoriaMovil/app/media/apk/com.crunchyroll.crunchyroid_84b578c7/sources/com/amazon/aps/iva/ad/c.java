package com.amazon.aps.iva.ad;

import android.content.Context;
import com.amazon.aps.iva.ad.a;
import com.amazon.aps.iva.ad.l;
import com.amazon.aps.iva.ec.g;
/* compiled from: DefaultConnectivityMonitor.java */
/* loaded from: classes.dex */
public final class c implements a {
    public final Context b;
    public final a.InterfaceC0112a c;

    public c(Context context, g.b bVar) {
        this.b = context.getApplicationContext();
        this.c = bVar;
    }

    @Override // com.amazon.aps.iva.ad.h
    public final void onStart() {
        l a = l.a(this.b);
        a.InterfaceC0112a interfaceC0112a = this.c;
        synchronized (a) {
            a.b.add(interfaceC0112a);
            a.b();
        }
    }

    @Override // com.amazon.aps.iva.ad.h
    public final void onStop() {
        l a = l.a(this.b);
        a.InterfaceC0112a interfaceC0112a = this.c;
        synchronized (a) {
            a.b.remove(interfaceC0112a);
            if (a.c && a.b.isEmpty()) {
                l.c cVar = a.a;
                cVar.c.get().unregisterNetworkCallback(cVar.d);
                a.c = false;
            }
        }
    }

    @Override // com.amazon.aps.iva.ad.h
    public final void onDestroy() {
    }
}

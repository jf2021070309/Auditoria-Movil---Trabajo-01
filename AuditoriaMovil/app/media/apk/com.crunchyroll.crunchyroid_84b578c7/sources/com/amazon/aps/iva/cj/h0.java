package com.amazon.aps.iva.cj;

import com.amazon.aps.iva.pj.f;
/* compiled from: PlayerViewMonitor.kt */
/* loaded from: classes.dex */
public final class h0 {
    public final com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.pj.a, com.amazon.aps.iva.kb0.q> a;

    public h0(w wVar) {
        this.a = wVar;
    }

    public final void a(boolean z) {
        com.amazon.aps.iva.qj.b bVar;
        if (z) {
            bVar = com.amazon.aps.iva.qj.b.PORTRAIT;
        } else {
            bVar = com.amazon.aps.iva.qj.b.LANDSCAPE;
        }
        this.a.invoke(new f.a(bVar));
    }

    public final void b(boolean z) {
        com.amazon.aps.iva.qj.c cVar;
        if (z) {
            cVar = com.amazon.aps.iva.qj.c.FULLSCREEN;
        } else {
            cVar = com.amazon.aps.iva.qj.c.NORMAL;
        }
        this.a.invoke(new f.b(cVar));
    }
}

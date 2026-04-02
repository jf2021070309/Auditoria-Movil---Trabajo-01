package com.amazon.aps.iva.fo;

import com.amazon.aps.iva.es.q;
import com.amazon.aps.iva.js.s0;
import com.amazon.aps.iva.ks.a;
/* compiled from: WatchDataNotificationAnalytics.kt */
/* loaded from: classes2.dex */
public final class d implements c {
    public final com.amazon.aps.iva.ds.a a;

    public d(com.amazon.aps.iva.ds.a aVar) {
        this.a = aVar;
    }

    @Override // com.amazon.aps.iva.fo.c
    public final void a(com.amazon.aps.iva.ls.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "screen");
        this.a.e(new q(a.C0456a.b(aVar), s0.COMPLETE, com.amazon.aps.iva.js.i.CR_VOD_FUNIMATION_MIGRATION));
    }

    @Override // com.amazon.aps.iva.fo.c
    public final void b(com.amazon.aps.iva.ls.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "screen");
        this.a.e(new q(a.C0456a.b(aVar), s0.IN_PROGRESS, com.amazon.aps.iva.js.i.CR_VOD_FUNIMATION_MIGRATION));
    }
}

package com.amazon.aps.iva.p30;

import com.amazon.aps.iva.es.y;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.actions.SearchIntents;
/* compiled from: SearchAnalytics.kt */
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.us.b implements b {
    public final com.amazon.aps.iva.ds.a e;

    public c(com.amazon.aps.iva.ds.a aVar, com.amazon.aps.iva.xb0.a<? extends com.amazon.aps.iva.fs.c> aVar2) {
        super(aVar2);
        this.e = aVar;
    }

    @Override // com.amazon.aps.iva.p30.b
    public final void L(String str) {
        j.f(str, SearchIntents.EXTRA_QUERY);
        this.e.e(new y(str));
    }

    @Override // com.amazon.aps.iva.us.b
    public final void O(float f) {
        this.e.c(i.s(com.amazon.aps.iva.ls.a.SEARCH, f, null, null, null, new com.amazon.aps.iva.is.a[0], 28));
    }
}

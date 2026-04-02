package com.amazon.aps.iva.ne;

import com.amazon.aps.iva.es.k;
import com.amazon.aps.iva.ks.s;
import com.amazon.aps.iva.xb0.l;
/* compiled from: CancellationCompleteAnalytics.kt */
/* loaded from: classes.dex */
public final class d extends com.amazon.aps.iva.us.b implements c {
    public final e e;
    public final com.amazon.aps.iva.ds.a f;
    public final l<String, String> g;

    /* JADX WARN: Multi-variable type inference failed */
    public d(e eVar, com.amazon.aps.iva.ds.a aVar, l<? super String, String> lVar, com.amazon.aps.iva.xb0.a<? extends com.amazon.aps.iva.fs.c> aVar2) {
        super(aVar2);
        this.e = eVar;
        this.f = aVar;
        this.g = lVar;
    }

    @Override // com.amazon.aps.iva.us.b
    public final void O(float f) {
        this.f.c(i.s(com.amazon.aps.iva.ls.a.CANCELLATION_COMPLETE, f, null, null, null, new com.amazon.aps.iva.is.a[0], 28));
    }

    @Override // com.amazon.aps.iva.ne.c
    public final void w() {
        String str;
        e eVar = this.e;
        String str2 = eVar.b;
        if (str2 != null) {
            str = this.g.invoke(str2);
        } else {
            str = null;
        }
        this.f.e(new k(new s(eVar.b, str)));
    }
}

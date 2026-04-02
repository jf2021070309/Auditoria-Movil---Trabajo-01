package com.amazon.aps.iva.rm;

import com.amazon.aps.iva.ds.c;
import com.amazon.aps.iva.es.j;
/* compiled from: ProfileActivationAnalytics.kt */
/* loaded from: classes2.dex */
public final class b implements a {
    public final com.amazon.aps.iva.ds.a a = c.b;
    public final com.amazon.aps.iva.fs.c b;

    public b(com.amazon.aps.iva.fs.c cVar) {
        this.b = cVar;
    }

    @Override // com.amazon.aps.iva.rm.a
    public final void a() {
        this.a.c(new j(com.amazon.aps.iva.ls.a.PROFILE_ACTIVATION, i.t(i.d, this.b.a(), null, null, null, null, 62)));
    }
}

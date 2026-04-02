package com.amazon.aps.iva.dj;

import com.amazon.aps.iva.dj.a;
import com.amazon.aps.iva.dj.g;
import com.amazon.aps.iva.ks.w;
import java.util.List;
/* compiled from: MediaPropertyProvider.kt */
/* loaded from: classes.dex */
public final class e implements d {
    public final a a = a.C0197a.a;
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.nk.j> b;
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.nk.i> c;

    public e(g.c cVar, g.d dVar) {
        this.b = cVar;
        this.c = dVar;
    }

    @Override // com.amazon.aps.iva.dj.d
    public final w a() {
        String str;
        com.amazon.aps.iva.nk.j invoke = this.b.invoke();
        List<? extends com.amazon.aps.iva.qj.h> list = invoke.r;
        com.amazon.aps.iva.nk.i invoke2 = this.c.invoke();
        w b = this.a.b(invoke.h);
        boolean z = !invoke.m.d.isEmpty();
        String str2 = invoke2.b;
        boolean z2 = !invoke.s.isEmpty();
        String str3 = null;
        String str4 = invoke2.e;
        if (z2) {
            str = str4;
        } else {
            str = null;
        }
        if (!list.isEmpty()) {
            str3 = str4;
        }
        return w.b(b, str3, str2, z, str);
    }
}

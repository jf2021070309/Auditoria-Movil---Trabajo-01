package com.amazon.aps.iva.bk;

import com.amazon.aps.iva.k6.n;
import com.amazon.aps.iva.k6.s;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.tj.h;
import com.amazon.aps.iva.yb0.j;
import java.util.List;
/* compiled from: PlayerMediaCodecSelector.kt */
/* loaded from: classes.dex */
public final class d implements c {
    public final com.amazon.aps.iva.xb0.a<q> b;
    public boolean c;

    public d(h hVar) {
        this.b = hVar;
    }

    @Override // com.amazon.aps.iva.k6.q
    public final List<n> a(String str, boolean z, boolean z2) {
        boolean z3;
        j.f(str, "mimeType");
        if (z && !this.c) {
            z3 = true;
        } else {
            z3 = false;
        }
        List<n> e = s.e(str, z3, z2);
        j.e(e, "DEFAULT.getDecoderInfos(…unnelingDecoder\n        )");
        return e;
    }

    @Override // com.amazon.aps.iva.bk.c
    public final void b() {
        com.amazon.aps.iva.mf0.a.a.a("Attempting to use a non-secure decoder in hopes to find a free one!", new Object[0]);
        this.c = true;
        this.b.invoke();
    }

    @Override // com.amazon.aps.iva.bk.c
    public final boolean c() {
        return this.c;
    }
}

package com.amazon.aps.iva.l40;

import com.amazon.aps.iva.g00.a;
import java.util.List;
/* compiled from: ShowPageSeasonOverflowMenuProvider.kt */
/* loaded from: classes2.dex */
public final class f1 implements com.amazon.aps.iva.n70.d<t> {
    public final com.amazon.aps.iva.xb0.l<List<String>, com.amazon.aps.iva.kb0.q> a;

    /* JADX WARN: Multi-variable type inference failed */
    public f1(com.amazon.aps.iva.xb0.l<? super List<String>, com.amazon.aps.iva.kb0.q> lVar) {
        this.a = lVar;
    }

    @Override // com.amazon.aps.iva.n70.d
    public final List a(t tVar) {
        com.amazon.aps.iva.n70.b bVar;
        t tVar2 = tVar;
        com.amazon.aps.iva.yb0.j.f(tVar2, "data");
        if (tVar2.b) {
            bVar = new com.amazon.aps.iva.n70.b(a.c.e, d1.h);
        } else {
            bVar = new com.amazon.aps.iva.n70.b(a.C0284a.e, new e1(this, tVar2));
        }
        return com.amazon.aps.iva.ee0.f1.J(bVar);
    }
}

package com.amazon.aps.iva.kb;

import com.amazon.aps.iva.j0.d1;
/* compiled from: ColumnsCriteriaFactory.java */
/* loaded from: classes.dex */
public final class b extends a {
    @Override // com.amazon.aps.iva.kb.a
    public final i a() {
        com.amazon.aps.iva.hb.e eVar = new com.amazon.aps.iva.hb.e(3);
        int i = this.a;
        if (i != 0) {
            return new f(eVar, i);
        }
        return eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.amazon.aps.iva.kb.g] */
    @Override // com.amazon.aps.iva.kb.a
    public final i b() {
        d1 d1Var = new d1();
        int i = this.a;
        if (i != 0) {
            d1Var = new g(d1Var, i);
        }
        int i2 = this.b;
        if (i2 != 0) {
            return new c(d1Var, i2);
        }
        return d1Var;
    }
}

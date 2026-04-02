package com.amazon.aps.iva.kb;
/* compiled from: RowsCriteriaFactory.java */
/* loaded from: classes.dex */
public final class k extends a {
    @Override // com.amazon.aps.iva.kb.a
    public final i a() {
        com.amazon.aps.iva.da0.a aVar = new com.amazon.aps.iva.da0.a();
        int i = this.a;
        if (i != 0) {
            return new h(aVar, i);
        }
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.amazon.aps.iva.kb.d] */
    @Override // com.amazon.aps.iva.kb.a
    public final i b() {
        e eVar = new e();
        int i = this.a;
        if (i != 0) {
            eVar = new d(eVar, i);
        }
        int i2 = this.b;
        if (i2 != 0) {
            return new c(eVar, i2);
        }
        return eVar;
    }
}

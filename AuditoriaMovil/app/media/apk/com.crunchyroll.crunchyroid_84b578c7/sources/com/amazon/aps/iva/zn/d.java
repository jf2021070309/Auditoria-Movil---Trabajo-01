package com.amazon.aps.iva.zn;
/* compiled from: Checkbox.kt */
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.a1.f h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ String j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(boolean z, String str, com.amazon.aps.iva.a1.f fVar, int i, int i2) {
        super(2);
        this.h = fVar;
        this.i = z;
        this.j = str;
        this.k = i;
        this.l = i2;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        num.intValue();
        com.amazon.aps.iva.a1.f fVar = this.h;
        e.a(this.i, this.j, fVar, iVar, com.amazon.aps.iva.ff0.b.I(this.k | 1), this.l);
        return com.amazon.aps.iva.kb0.q.a;
    }
}

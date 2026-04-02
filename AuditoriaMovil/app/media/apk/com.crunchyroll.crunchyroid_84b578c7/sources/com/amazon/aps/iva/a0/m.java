package com.amazon.aps.iva.a0;

import com.amazon.aps.iva.h1.a;
/* compiled from: Border.kt */
/* loaded from: classes.dex */
public final class m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.h1.c, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ boolean h;
    public final /* synthetic */ com.amazon.aps.iva.f1.s i;
    public final /* synthetic */ long j;
    public final /* synthetic */ float k;
    public final /* synthetic */ float l;
    public final /* synthetic */ long m;
    public final /* synthetic */ long n;
    public final /* synthetic */ com.amazon.aps.iva.h1.i o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(boolean z, com.amazon.aps.iva.f1.s sVar, long j, float f, float f2, long j2, long j3, com.amazon.aps.iva.h1.i iVar) {
        super(1);
        this.h = z;
        this.i = sVar;
        this.j = j;
        this.k = f;
        this.l = f2;
        this.m = j2;
        this.n = j3;
        this.o = iVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.h1.c cVar) {
        com.amazon.aps.iva.h1.c cVar2 = cVar;
        com.amazon.aps.iva.yb0.j.f(cVar2, "$this$onDrawWithContent");
        cVar2.f1();
        if (this.h) {
            com.amazon.aps.iva.h1.e.L0(cVar2, this.i, 0L, 0L, this.j, null, 246);
        } else {
            long j = this.j;
            float b = com.amazon.aps.iva.e1.a.b(j);
            float f = this.k;
            if (b < f) {
                float f2 = this.l;
                float d = com.amazon.aps.iva.e1.g.d(cVar2.h());
                float f3 = this.l;
                float f4 = d - f3;
                float b2 = com.amazon.aps.iva.e1.g.b(cVar2.h()) - f3;
                com.amazon.aps.iva.f1.s sVar = this.i;
                long j2 = this.j;
                a.b R0 = cVar2.R0();
                long h = R0.h();
                R0.a().n();
                R0.a.b(f2, f2, f4, b2, 0);
                com.amazon.aps.iva.h1.e.L0(cVar2, sVar, 0L, 0L, j2, null, 246);
                R0.a().g();
                R0.b(h);
            } else {
                com.amazon.aps.iva.h1.e.L0(cVar2, this.i, this.m, this.n, k.k(j, f), this.o, 208);
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}

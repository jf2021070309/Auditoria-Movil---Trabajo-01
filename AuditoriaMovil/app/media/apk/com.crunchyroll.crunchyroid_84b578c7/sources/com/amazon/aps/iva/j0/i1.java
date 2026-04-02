package com.amazon.aps.iva.j0;
/* compiled from: TextFieldCursor.kt */
/* loaded from: classes.dex */
public final class i1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.h1.c, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.z.b<Float, com.amazon.aps.iva.z.m> h;
    public final /* synthetic */ com.amazon.aps.iva.i2.q i;
    public final /* synthetic */ com.amazon.aps.iva.i2.e0 j;
    public final /* synthetic */ p2 k;
    public final /* synthetic */ com.amazon.aps.iva.f1.s l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(com.amazon.aps.iva.z.b<Float, com.amazon.aps.iva.z.m> bVar, com.amazon.aps.iva.i2.q qVar, com.amazon.aps.iva.i2.e0 e0Var, p2 p2Var, com.amazon.aps.iva.f1.s sVar) {
        super(1);
        this.h = bVar;
        this.i = qVar;
        this.j = e0Var;
        this.k = p2Var;
        this.l = sVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.h1.c cVar) {
        boolean z;
        com.amazon.aps.iva.e1.e eVar;
        com.amazon.aps.iva.c2.y yVar;
        com.amazon.aps.iva.h1.c cVar2 = cVar;
        com.amazon.aps.iva.yb0.j.f(cVar2, "$this$drawWithContent");
        cVar2.f1();
        float i = com.amazon.aps.iva.aq.j.i(this.h.c().floatValue(), 0.0f, 1.0f);
        if (i == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            long j = this.j.b;
            int i2 = com.amazon.aps.iva.c2.z.c;
            int b = this.i.b((int) (j >> 32));
            q2 c = this.k.c();
            if (c != null && (yVar = c.a) != null) {
                eVar = yVar.c(b);
            } else {
                eVar = new com.amazon.aps.iva.e1.e(0.0f, 0.0f, 0.0f, 0.0f);
            }
            float P0 = cVar2.P0(k1.b);
            float f = P0 / 2;
            float f2 = eVar.a + f;
            float d = com.amazon.aps.iva.e1.g.d(cVar2.h()) - f;
            if (f2 > d) {
                f2 = d;
            }
            com.amazon.aps.iva.h1.e.K0(cVar2, this.l, com.amazon.aps.iva.e1.d.d(f2, eVar.b), com.amazon.aps.iva.e1.d.d(f2, eVar.d), P0, i, 432);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}

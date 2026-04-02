package com.amazon.aps.iva.y;

import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
/* compiled from: AnimatedContent.kt */
/* loaded from: classes.dex */
public final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<y, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ r<Object> h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ com.amazon.aps.iva.y0.u<Object> j;
    public final /* synthetic */ com.amazon.aps.iva.xb0.r<o, Object, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> k;
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(r<Object> rVar, Object obj, com.amazon.aps.iva.y0.u<Object> uVar, com.amazon.aps.iva.xb0.r<? super o, Object, ? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> rVar2, int i) {
        super(3);
        this.h = rVar;
        this.i = obj;
        this.j = uVar;
        this.k = rVar2;
        this.l = i;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final com.amazon.aps.iva.kb0.q invoke(y yVar, com.amazon.aps.iva.o0.i iVar, Integer num) {
        int i;
        y yVar2 = yVar;
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        int intValue = num.intValue();
        com.amazon.aps.iva.yb0.j.f(yVar2, "$this$AnimatedVisibility");
        if ((intValue & 14) == 0) {
            if (iVar2.H(yVar2)) {
                i = 4;
            } else {
                i = 2;
            }
            intValue |= i;
        }
        if ((intValue & 91) == 18 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = com.amazon.aps.iva.o0.e0.a;
            com.amazon.aps.iva.y0.u<Object> uVar = this.j;
            Object obj = this.i;
            r<Object> rVar = this.h;
            com.amazon.aps.iva.o0.x0.a(yVar2, new g(uVar, obj, rVar), iVar2);
            rVar.d.put(obj, ((z) yVar2).a);
            iVar2.s(-492369756);
            Object t = iVar2.t();
            if (t == i.a.a) {
                t = new p(yVar2);
                iVar2.n(t);
            }
            iVar2.G();
            Integer valueOf = Integer.valueOf((this.l >> 9) & 896);
            this.k.K((p) t, obj, iVar2, valueOf);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}

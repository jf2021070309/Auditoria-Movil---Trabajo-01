package com.amazon.aps.iva.s1;

import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.s1.x;
/* compiled from: SubcomposeLayout.kt */
/* loaded from: classes.dex */
public final class a0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ x.b h;
    public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a0(x.b bVar, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar) {
        super(2);
        this.h = bVar;
        this.i = pVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = com.amazon.aps.iva.o0.e0.a;
            boolean booleanValue = ((Boolean) this.h.e.getValue()).booleanValue();
            iVar2.x(Boolean.valueOf(booleanValue));
            boolean a = iVar2.a(booleanValue);
            if (booleanValue) {
                this.i.invoke(iVar2, 0);
            } else {
                iVar2.f(a);
            }
            iVar2.r();
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}

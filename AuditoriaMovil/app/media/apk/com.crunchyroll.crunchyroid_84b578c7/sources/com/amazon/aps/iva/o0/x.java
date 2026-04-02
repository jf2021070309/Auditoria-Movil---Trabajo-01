package com.amazon.aps.iva.o0;

import com.amazon.aps.iva.o0.e0;
/* compiled from: Composer.kt */
/* loaded from: classes.dex */
public final class x extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ k1<Object> h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(k1<Object> k1Var, Object obj) {
        super(2);
        this.h = k1Var;
        this.i = obj;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.q invoke(i iVar, Integer num) {
        i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
            return com.amazon.aps.iva.kb0.q.a;
        }
        e0.b bVar = e0.a;
        this.h.getClass();
        throw null;
    }
}

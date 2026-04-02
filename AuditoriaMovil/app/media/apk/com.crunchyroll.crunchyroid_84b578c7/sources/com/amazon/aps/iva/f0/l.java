package com.amazon.aps.iva.f0;

import com.amazon.aps.iva.f0.m;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.x0;
/* compiled from: LazyLayoutItemContentFactory.kt */
/* loaded from: classes.dex */
public final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ m h;
    public final /* synthetic */ m.a i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, m.a aVar) {
        super(2);
        this.h = mVar;
        this.i = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        boolean z;
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = com.amazon.aps.iva.o0.e0.a;
            m mVar = this.h;
            p invoke = mVar.b.invoke();
            m.a aVar = this.i;
            int i = aVar.c;
            int b = invoke.b();
            Object obj = aVar.a;
            if ((i >= b || !com.amazon.aps.iva.yb0.j.a(invoke.getKey(i), obj)) && (i = invoke.a(obj)) != -1) {
                aVar.c = i;
            }
            int i2 = i;
            if (i2 != -1) {
                z = true;
            } else {
                z = false;
            }
            iVar2.x(Boolean.valueOf(z));
            boolean a = iVar2.a(z);
            if (z) {
                defpackage.i.h(invoke, mVar.a, i2, aVar.a, iVar2, 0);
            } else {
                iVar2.f(a);
            }
            iVar2.r();
            x0.a(obj, new k(aVar), iVar2);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}

package com.amazon.aps.iva.j0;

import com.amazon.aps.iva.j0.p2;
import java.util.List;
/* compiled from: TextFieldDelegate.kt */
/* loaded from: classes.dex */
public final class l1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.i2.f>, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.i2.h h;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.i2.e0, com.amazon.aps.iva.kb0.q> i;
    public final /* synthetic */ com.amazon.aps.iva.yb0.d0<com.amazon.aps.iva.i2.n0> j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(com.amazon.aps.iva.i2.h hVar, p2.b bVar, com.amazon.aps.iva.yb0.d0 d0Var) {
        super(1);
        this.h = hVar;
        this.i = bVar;
        this.j = d0Var;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(List<? extends com.amazon.aps.iva.i2.f> list) {
        List<? extends com.amazon.aps.iva.i2.f> list2 = list;
        com.amazon.aps.iva.yb0.j.f(list2, "it");
        com.amazon.aps.iva.i2.n0 n0Var = this.j.b;
        com.amazon.aps.iva.i2.h hVar = this.h;
        com.amazon.aps.iva.yb0.j.f(hVar, "editProcessor");
        com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.i2.e0, com.amazon.aps.iva.kb0.q> lVar = this.i;
        com.amazon.aps.iva.yb0.j.f(lVar, "onValueChange");
        com.amazon.aps.iva.i2.e0 a = hVar.a(list2);
        if (n0Var != null) {
            n0Var.b(null, a);
        }
        lVar.invoke(a);
        return com.amazon.aps.iva.kb0.q.a;
    }
}

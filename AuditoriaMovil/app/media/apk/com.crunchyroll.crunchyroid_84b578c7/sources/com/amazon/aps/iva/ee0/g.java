package com.amazon.aps.iva.ee0;

import com.amazon.aps.iva.ee0.b1;
import java.util.ArrayList;
import java.util.List;
/* compiled from: AbstractTypeChecker.kt */
/* loaded from: classes4.dex */
public final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<b1.a, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ List<com.amazon.aps.iva.he0.i> h;
    public final /* synthetic */ b1 i;
    public final /* synthetic */ com.amazon.aps.iva.he0.n j;
    public final /* synthetic */ com.amazon.aps.iva.he0.i k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ArrayList arrayList, b1 b1Var, com.amazon.aps.iva.he0.n nVar, com.amazon.aps.iva.he0.i iVar) {
        super(1);
        this.h = arrayList;
        this.i = b1Var;
        this.j = nVar;
        this.k = iVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(b1.a aVar) {
        b1.a aVar2 = aVar;
        com.amazon.aps.iva.yb0.j.f(aVar2, "$this$runForkingPoint");
        for (com.amazon.aps.iva.he0.i iVar : this.h) {
            aVar2.a(new f(this.i, this.j, iVar, this.k));
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}

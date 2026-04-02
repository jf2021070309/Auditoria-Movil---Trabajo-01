package com.amazon.aps.iva.e0;

import com.amazon.aps.iva.s1.u0;
import java.util.ArrayList;
import java.util.List;
/* compiled from: LazyListMeasure.kt */
/* loaded from: classes.dex */
public final class a0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<u0.a, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ List<c0> h;
    public final /* synthetic */ c0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(ArrayList arrayList, c0 c0Var) {
        super(1);
        this.h = arrayList;
        this.i = c0Var;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(u0.a aVar) {
        c0 c0Var;
        u0.a aVar2 = aVar;
        com.amazon.aps.iva.yb0.j.f(aVar2, "$this$invoke");
        List<c0> list = this.h;
        int size = list.size();
        int i = 0;
        while (true) {
            c0Var = this.i;
            if (i >= size) {
                break;
            }
            c0 c0Var2 = list.get(i);
            if (c0Var2 != c0Var) {
                c0Var2.d(aVar2);
            }
            i++;
        }
        if (c0Var != null) {
            c0Var.d(aVar2);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}

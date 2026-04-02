package com.amazon.aps.iva.l40;

import android.view.View;
import java.util.ArrayList;
/* compiled from: ShowPagePresenter.kt */
/* loaded from: classes2.dex */
public final class z0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<View, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ v h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(v vVar) {
        super(1);
        this.h = vVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(View view) {
        View view2 = view;
        com.amazon.aps.iva.yb0.j.f(view2, "buttonView");
        v vVar = this.h;
        i1 q6 = v.q6(vVar);
        com.amazon.aps.iva.i00.a[] values = com.amazon.aps.iva.i00.a.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (com.amazon.aps.iva.i00.a aVar : values) {
            arrayList.add(new com.amazon.aps.iva.a70.a(new com.amazon.aps.iva.a70.b(aVar.getResId(), null, false, null, 14), aVar));
        }
        q6.Mc(view2, new com.amazon.aps.iva.a70.c(arrayList, ""), vVar.c.I(), new y0(vVar));
        return com.amazon.aps.iva.kb0.q.a;
    }
}

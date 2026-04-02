package com.amazon.aps.iva.nz;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import java.util.Arrays;
import java.util.List;
/* compiled from: PlayheadsSynchronizerAgent.kt */
/* loaded from: classes2.dex */
public final class g extends l implements com.amazon.aps.iva.xb0.l<List<? extends a>, q> {
    public final /* synthetic */ h h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar) {
        super(1);
        this.h = hVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(List<? extends a> list) {
        List<? extends a> list2 = list;
        j.f(list2, "assetIds");
        b bVar = this.h.c;
        a[] aVarArr = (a[]) list2.toArray(new a[0]);
        bVar.b((a[]) Arrays.copyOf(aVarArr, aVarArr.length));
        return q.a;
    }
}

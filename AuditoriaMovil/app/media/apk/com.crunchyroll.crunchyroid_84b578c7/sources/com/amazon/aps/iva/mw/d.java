package com.amazon.aps.iva.mw;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.downloading.e0;
import com.ellation.crunchyroll.downloading.g0;
import java.util.ArrayList;
import java.util.List;
/* compiled from: LocalVideosManagerQueue.kt */
/* loaded from: classes2.dex */
public final class d extends l implements com.amazon.aps.iva.xb0.l<g0, q> {
    public final /* synthetic */ List<e0> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(List<? extends e0> list) {
        super(1);
        this.h = list;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(g0 g0Var) {
        boolean z;
        g0 g0Var2 = g0Var;
        j.f(g0Var2, "$this$notify");
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.h) {
            if (((e0) obj).g() != e0.b.COMPLETED) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(obj);
            }
        }
        g0Var2.v5(arrayList);
        return q.a;
    }
}

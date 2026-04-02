package com.amazon.aps.iva.mw;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.sv.n0;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.downloading.e0;
import java.util.ArrayList;
import java.util.List;
/* compiled from: LocalVideosManagerQueue.kt */
/* loaded from: classes2.dex */
public final class b extends l implements com.amazon.aps.iva.xb0.l<List<? extends e0>, q> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<List<? extends e0>, q> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n0 n0Var) {
        super(1);
        this.h = n0Var;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(List<? extends e0> list) {
        boolean z;
        List<? extends e0> list2 = list;
        j.f(list2, "downloads");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (((e0) obj).g() == e0.b.PAUSED) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(obj);
            }
        }
        this.h.invoke(arrayList);
        return q.a;
    }
}

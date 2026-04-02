package com.ellation.crunchyroll.downloading;

import com.ellation.crunchyroll.downloading.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: InternalDownloadsManager.kt */
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<g0, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ List<e0> h;
    public final /* synthetic */ List<String> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(List<? extends e0> list, List<String> list2) {
        super(1);
        this.h = list;
        this.i = list2;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(g0 g0Var) {
        g0 g0Var2 = g0Var;
        com.amazon.aps.iva.yb0.j.f(g0Var2, "$this$notify");
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.h) {
            if (this.i.contains(((e0) obj).e())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((e0) it.next()).a(e0.b.STARTED));
        }
        g0Var2.M3(arrayList2);
        return com.amazon.aps.iva.kb0.q.a;
    }
}

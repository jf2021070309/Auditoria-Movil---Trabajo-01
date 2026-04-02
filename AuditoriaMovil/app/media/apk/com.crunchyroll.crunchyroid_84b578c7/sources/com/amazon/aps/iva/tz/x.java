package com.amazon.aps.iva.tz;

import com.amazon.aps.iva.j8.f;
import com.amazon.aps.iva.uz.h;
import com.ellation.crunchyroll.model.Panel;
import java.util.ArrayList;
import java.util.List;
/* compiled from: BrowseAllPopularityDataSource.kt */
/* loaded from: classes2.dex */
public final class x extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<v0, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ f.c<Integer, com.amazon.aps.iva.uz.h> h;
    public final /* synthetic */ v i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(f.d dVar, v vVar) {
        super(1);
        this.h = dVar;
        this.i = vVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(v0 v0Var) {
        int i;
        Integer num;
        v0 v0Var2 = v0Var;
        com.amazon.aps.iva.yb0.j.f(v0Var2, "browsePanelModel");
        List<Panel> list = v0Var2.a;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list));
        for (Panel panel : list) {
            arrayList.add(new h.c.C0774c(panel));
        }
        if (!arrayList.isEmpty()) {
            i = v0Var2.b;
        } else {
            i = 0;
        }
        if (arrayList.isEmpty()) {
            num = null;
        } else {
            num = 1;
        }
        this.h.a(arrayList, i, num);
        this.i.k.invoke(0, arrayList);
        return com.amazon.aps.iva.kb0.q.a;
    }
}

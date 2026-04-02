package com.amazon.aps.iva.tz;

import com.amazon.aps.iva.j8.m;
import com.ellation.crunchyroll.model.browse.BrowseSectionItem;
import java.util.ArrayList;
import java.util.List;
/* compiled from: BrowseAllDataSource.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<a1, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ f h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ m.b<com.amazon.aps.iva.uz.h> k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, int i, int i2, m.c cVar) {
        super(1);
        this.h = fVar;
        this.i = i;
        this.j = i2;
        this.k = cVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(a1 a1Var) {
        boolean z;
        a1 a1Var2 = a1Var;
        com.amazon.aps.iva.yb0.j.f(a1Var2, "browseSectionItemModel");
        f fVar = this.h;
        y0 y0Var = fVar.d;
        List<BrowseSectionItem> list = a1Var2.a;
        y0Var.a(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((BrowseSectionItem) obj).getTotal() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size() + a1Var2.b;
        int min = Math.min(size, this.i);
        m.b<com.amazon.aps.iva.uz.h> bVar = this.k;
        int i = this.j;
        fVar.i(min, i, new a(size, bVar, i), new e(com.amazon.aps.iva.mf0.a.a));
        return com.amazon.aps.iva.kb0.q.a;
    }
}

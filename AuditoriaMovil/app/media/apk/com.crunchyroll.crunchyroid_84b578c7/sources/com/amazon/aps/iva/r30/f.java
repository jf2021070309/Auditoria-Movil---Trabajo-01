package com.amazon.aps.iva.r30;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.u;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.s30.h;
import com.amazon.aps.iva.s30.k;
import com.amazon.aps.iva.wy.j;
import com.amazon.aps.iva.xb0.l;
import com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus;
import com.ellation.crunchyroll.model.Panel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* compiled from: SearchResultViewModel.kt */
/* loaded from: classes2.dex */
public abstract class f extends com.amazon.aps.iva.ez.b implements e {
    public final v<g<List<h>>> b;

    public f(j... jVarArr) {
        super((j[]) Arrays.copyOf(jVarArr, jVarArr.length));
        this.b = new v<>();
    }

    @Override // com.amazon.aps.iva.r30.e
    public final v S7() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.r30.e
    public final void a(com.amazon.aps.iva.b60.j jVar, l<? super List<Integer>, q> lVar) {
        Iterable iterable;
        k kVar;
        Panel panel;
        g.c<List<h>> a;
        List<h> list;
        com.amazon.aps.iva.yb0.j.f(jVar, "data");
        g<List<h>> d = this.b.d();
        if (d != null && (a = d.a()) != null && (list = a.a) != null) {
            iterable = x.X0(list);
        } else {
            iterable = z.b;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : iterable) {
            int i2 = i + 1;
            String str = null;
            if (i >= 0) {
                h hVar = (h) obj;
                if (hVar instanceof k) {
                    kVar = (k) hVar;
                } else {
                    kVar = null;
                }
                if (kVar != null) {
                    panel = kVar.a();
                } else {
                    panel = null;
                }
                if (panel != null) {
                    str = panel.getId();
                }
                if (com.amazon.aps.iva.yb0.j.a(str, jVar.b)) {
                    WatchlistStatus watchlistStatus = panel.getWatchlistStatus();
                    WatchlistStatus watchlistStatus2 = jVar.c;
                    if (watchlistStatus != watchlistStatus2) {
                        panel.setWatchlistStatus(watchlistStatus2);
                        arrayList.add(Integer.valueOf(i));
                    }
                }
                i = i2;
            } else {
                f1.S();
                throw null;
            }
        }
        if (!arrayList.isEmpty()) {
            lVar.invoke(arrayList);
        }
    }

    @Override // com.amazon.aps.iva.r30.e
    public final <T extends h> int o5(h hVar, Class<T> cls) {
        g.c<List<h>> a;
        List<h> list;
        com.amazon.aps.iva.yb0.j.f(hVar, "item");
        g<List<h>> d = this.b.d();
        if (d != null && (a = d.a()) != null && (list = a.a) != null) {
            Iterator it = u.j0(list, cls).iterator();
            int i = 0;
            while (it.hasNext()) {
                if (!com.amazon.aps.iva.yb0.j.a(((h) it.next()).a, hVar.a)) {
                    i++;
                } else {
                    return i;
                }
            }
        }
        return -1;
    }
}

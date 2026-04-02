package com.amazon.aps.iva.l10;

import com.amazon.aps.iva.kb0.q;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.List;
/* compiled from: GenresListPresenter.kt */
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.m10.e>, q> {
    public final /* synthetic */ k h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar) {
        super(1);
        this.h = kVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(List<? extends com.amazon.aps.iva.m10.e> list) {
        l view;
        l view2;
        boolean z;
        Object obj;
        com.amazon.aps.iva.m10.b bVar;
        a aVar;
        l view3;
        com.amazon.aps.iva.m10.b bVar2;
        String str;
        a aVar2;
        List<? extends com.amazon.aps.iva.m10.e> list2 = list;
        com.amazon.aps.iva.yb0.j.f(list2, FirebaseAnalytics.Param.ITEMS);
        k kVar = this.h;
        view = kVar.getView();
        view.H();
        view2 = kVar.getView();
        view2.setGenres(list2);
        String str2 = kVar.b;
        if (str2 != null && !com.amazon.aps.iva.oe0.m.b0(str2)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            Iterator<T> it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    com.amazon.aps.iva.m10.e eVar = (com.amazon.aps.iva.m10.e) obj;
                    if (eVar instanceof com.amazon.aps.iva.m10.b) {
                        bVar2 = (com.amazon.aps.iva.m10.b) eVar;
                    } else {
                        bVar2 = null;
                    }
                    if (bVar2 != null && (aVar2 = bVar2.e) != null) {
                        str = aVar2.b;
                    } else {
                        str = null;
                    }
                    if (com.amazon.aps.iva.yb0.j.a(str, kVar.b)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (obj instanceof com.amazon.aps.iva.m10.b) {
                bVar = (com.amazon.aps.iva.m10.b) obj;
            } else {
                bVar = null;
            }
            if (bVar != null) {
                aVar = bVar.e;
            } else {
                aVar = null;
            }
            if (aVar != null) {
                view3 = kVar.getView();
                view3.o1(aVar);
                kVar.b = null;
            }
        }
        return q.a;
    }
}

package com.amazon.aps.iva.kw;

import android.content.Context;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.r;
import com.ellation.crunchyroll.api.GsonHolder;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PlayheadsToSyncCache.kt */
/* loaded from: classes2.dex */
public final class j extends com.amazon.aps.iva.xe.a<com.amazon.aps.iva.ig.a> implements i {
    public j(Context context) {
        super(com.amazon.aps.iva.ig.a.class, context, "playheads_to_sync_cache", GsonHolder.getInstance());
    }

    @Override // com.amazon.aps.iva.kw.i
    public final Object f(List list, f fVar) {
        List<com.amazon.aps.iva.ig.a> list2 = list;
        ArrayList arrayList = new ArrayList(r.Y(list2));
        for (com.amazon.aps.iva.ig.a aVar : list2) {
            com.amazon.aps.iva.yb0.j.f(aVar, "<this>");
            arrayList.add(aVar.a());
        }
        Object deleteItems = deleteItems(arrayList, fVar);
        if (deleteItems == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return deleteItems;
        }
        return q.a;
    }

    @Override // com.amazon.aps.iva.xe.a
    public final String getInternalCacheableId(com.amazon.aps.iva.ig.a aVar) {
        com.amazon.aps.iva.ig.a aVar2 = aVar;
        com.amazon.aps.iva.yb0.j.f(aVar2, "<this>");
        return aVar2.a();
    }
}

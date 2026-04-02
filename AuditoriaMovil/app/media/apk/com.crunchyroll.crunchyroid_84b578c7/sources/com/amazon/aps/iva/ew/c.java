package com.amazon.aps.iva.ew;

import android.content.Context;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.r;
import com.ellation.crunchyroll.api.GsonHolder;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ContentExpirationCache.kt */
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.xe.a<a> implements b {
    public c(Context context) {
        super(a.class, context, "content_expiration_cache", GsonHolder.getInstance());
    }

    @Override // com.amazon.aps.iva.ew.b
    public final Object a(List<? extends PlayableAsset> list, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        List<? extends PlayableAsset> list2 = list;
        ArrayList arrayList = new ArrayList(r.Y(list2));
        for (PlayableAsset playableAsset : list2) {
            arrayList.add(com.amazon.aps.iva.aq.j.r(playableAsset));
        }
        Object deleteItems = deleteItems(arrayList, dVar);
        if (deleteItems == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return deleteItems;
        }
        return q.a;
    }

    @Override // com.amazon.aps.iva.xe.a
    public final String getInternalCacheableId(a aVar) {
        a aVar2 = aVar;
        com.amazon.aps.iva.yb0.j.f(aVar2, "<this>");
        return aVar2.a();
    }
}

package com.amazon.aps.iva.wv;

import android.content.Context;
import com.ellation.crunchyroll.api.GsonHolder;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.util.ArrayList;
import java.util.List;
/* compiled from: DownloadModelCache.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.xe.a<com.amazon.aps.iva.xv.a> implements a {
    public b(Context context) {
        super(com.amazon.aps.iva.xv.a.class, context, "sync_quality_cache", GsonHolder.getInstance());
    }

    @Override // com.amazon.aps.iva.wv.a
    public final Object a(List<? extends PlayableAsset> list, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        List<? extends PlayableAsset> list2 = list;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list2));
        for (PlayableAsset playableAsset : list2) {
            arrayList.add(com.amazon.aps.iva.aq.j.r(playableAsset));
        }
        Object deleteItems = deleteItems(arrayList, dVar);
        if (deleteItems == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return deleteItems;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }

    @Override // com.amazon.aps.iva.xe.a
    public final String getInternalCacheableId(com.amazon.aps.iva.xv.a aVar) {
        com.amazon.aps.iva.xv.a aVar2 = aVar;
        com.amazon.aps.iva.yb0.j.f(aVar2, "<this>");
        return aVar2.a();
    }
}

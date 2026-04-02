package com.amazon.aps.iva.wv;

import android.content.Context;
import com.ellation.crunchyroll.api.GsonHolder;
/* compiled from: DownloadInOrderCache.kt */
/* loaded from: classes2.dex */
public final class n extends com.amazon.aps.iva.xe.a<w> implements m {
    public n(Context context) {
        super(w.class, context, "episodes_order_cache", GsonHolder.getInstance());
    }

    @Override // com.amazon.aps.iva.xe.a
    public final String getInternalCacheableId(w wVar) {
        w wVar2 = wVar;
        com.amazon.aps.iva.yb0.j.f(wVar2, "<this>");
        return wVar2.b();
    }
}

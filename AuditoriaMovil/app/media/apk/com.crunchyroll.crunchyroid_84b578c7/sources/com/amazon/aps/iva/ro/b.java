package com.amazon.aps.iva.ro;

import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.us.r;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: WatchScreenAnalytics.kt */
/* loaded from: classes2.dex */
public interface b extends r {

    /* compiled from: WatchScreenAnalytics.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static c a(com.amazon.aps.iva.xb0.a aVar) {
            com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
            w wVar = w.d;
            com.amazon.aps.iva.ro.a aVar2 = com.amazon.aps.iva.ro.a.h;
            j.f(aVar2, "createLoadingTimer");
            return new c(cVar, wVar, aVar, aVar2);
        }
    }

    void y(PlayableAsset playableAsset, Throwable th);
}

package com.amazon.aps.iva.sd;

import com.amazon.aps.iva.es.x;
import com.amazon.aps.iva.us.s;
import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.cast.MediaError;
/* compiled from: ContinueWatchingWidgetAnalytics.kt */
/* loaded from: classes.dex */
public final class b {
    public final com.amazon.aps.iva.ds.a a;

    public b(com.amazon.aps.iva.ds.a aVar) {
        this.a = aVar;
    }

    public final void a(com.amazon.aps.iva.ks.a aVar, a aVar2) {
        com.amazon.aps.iva.ks.e eVar;
        if (aVar2 != null) {
            String str = aVar2.b;
            j.f(str, "mediaId");
            String str2 = aVar2.c;
            j.f(str2, "mediaTitle");
            t tVar = aVar2.f;
            j.f(tVar, "resourceType");
            String str3 = aVar2.h;
            j.f(str3, "seasonTitle");
            String str4 = aVar2.g;
            j.f(str4, "episodeNumber");
            eVar = new com.amazon.aps.iva.ks.e(null, s.e(str, tVar), str, "", str2, str3, null, str4, MediaError.DetailedErrorCode.DASH_NETWORK);
        } else {
            eVar = null;
        }
        this.a.e(new x(aVar, eVar));
    }
}

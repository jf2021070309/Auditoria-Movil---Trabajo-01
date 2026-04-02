package com.amazon.aps.iva.xu;

import com.amazon.aps.iva.lv.i;
import com.amazon.aps.iva.us.r;
import com.amazon.aps.iva.yb0.j;
/* compiled from: CrunchylistsAnalytics.kt */
/* loaded from: classes2.dex */
public interface d extends r {

    /* compiled from: CrunchylistsAnalytics.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static com.amazon.aps.iva.xu.a a(com.amazon.aps.iva.ls.a aVar, i iVar, int i) {
            c cVar;
            com.amazon.aps.iva.ds.c cVar2 = com.amazon.aps.iva.ds.c.b;
            com.amazon.aps.iva.xb0.a aVar2 = iVar;
            if ((i & 4) != 0) {
                aVar2 = b.h;
            }
            if ((i & 8) != 0) {
                cVar = c.h;
            } else {
                cVar = null;
            }
            j.f(aVar, "screen");
            j.f(aVar2, "getContentMedia");
            j.f(cVar, "createTimer");
            return new com.amazon.aps.iva.xu.a(aVar, aVar2, cVar);
        }
    }

    void a(Throwable th);
}

package com.amazon.aps.iva.xu;

import android.app.Activity;
import android.content.Context;
import com.amazon.aps.iva.hv.p;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import java.util.List;
/* compiled from: CrunchylistsFeature.kt */
/* loaded from: classes2.dex */
public final class f {
    public final l<Activity, q> a;
    public final l<androidx.fragment.app.h, e> b;
    public final EtpContentService c;
    public final l<Context, p> d;
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.n60.b> e;

    public f(com.amazon.aps.iva.ex.a aVar, com.amazon.aps.iva.ex.b bVar, EtpContentService etpContentService, com.amazon.aps.iva.ex.c cVar, com.amazon.aps.iva.ex.d dVar) {
        this.a = aVar;
        this.b = bVar;
        this.c = etpContentService;
        this.d = cVar;
        this.e = dVar;
    }

    public final com.amazon.aps.iva.lv.a a() {
        com.amazon.aps.iva.lv.a.g.getClass();
        return new com.amazon.aps.iva.lv.a();
    }

    public final int b(List<? extends com.amazon.aps.iva.wy.e> list) {
        j.f(list, "fragments");
        int i = 0;
        for (com.amazon.aps.iva.wy.e eVar : list) {
            if (!(eVar instanceof com.amazon.aps.iva.lv.a)) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }
}

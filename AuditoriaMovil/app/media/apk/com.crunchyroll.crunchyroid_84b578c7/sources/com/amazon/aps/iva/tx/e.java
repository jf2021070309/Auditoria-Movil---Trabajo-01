package com.amazon.aps.iva.tx;

import android.content.Context;
import com.amazon.aps.iva.cx.q;
import com.amazon.aps.iva.sv.h;
import com.amazon.aps.iva.wv.k0;
import com.amazon.aps.iva.wv.l0;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.playback.PlayService;
import com.ellation.crunchyroll.application.CrunchyrollApplication;
import com.ellation.crunchyroll.application.a;
import com.ellation.crunchyroll.downloading.InternalDownloadsManager;
/* compiled from: WatchScreenStreamsInteractorFactoryImpl.kt */
/* loaded from: classes2.dex */
public final class e implements com.amazon.aps.iva.bp.e {
    public static final e a = new e();

    @Override // com.amazon.aps.iva.bp.e
    public final c a() {
        h hVar = h.a.a;
        if (hVar != null) {
            InternalDownloadsManager a2 = hVar.a();
            PlayService playService = com.ellation.crunchyroll.application.e.c().getPlayService();
            com.ellation.crunchyroll.application.a aVar = a.C0959a.a;
            if (aVar != null) {
                Object c = aVar.c().c(q.class, "streams_limits");
                if (c != null) {
                    return new c(new com.amazon.aps.iva.c00.h(a2, playService, (q) c));
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.StreamsLimitsConfigImpl");
            }
            j.m("instance");
            throw null;
        }
        j.m("instance");
        throw null;
    }

    @Override // com.amazon.aps.iva.bp.e
    public final d b() {
        CrunchyrollApplication b = com.ellation.crunchyroll.application.e.b();
        l0 l0Var = k0.a.a;
        if (l0Var == null) {
            Context applicationContext = b.getApplicationContext();
            j.e(applicationContext, "context.applicationContext");
            l0Var = new l0(applicationContext);
            k0.a.a = l0Var;
        }
        h hVar = h.a.a;
        if (hVar != null) {
            return new d(new com.amazon.aps.iva.c00.b(l0Var, hVar.a()));
        }
        j.m("instance");
        throw null;
    }
}

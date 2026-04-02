package com.amazon.aps.iva.nx;

import com.amazon.aps.iva.cj.k;
import com.amazon.aps.iva.cj.k0;
import com.amazon.aps.iva.ct.j;
import com.amazon.aps.iva.cx.n;
import com.amazon.aps.iva.cx.q;
import com.amazon.aps.iva.w5.f;
import com.amazon.aps.iva.yb0.t;
import com.amazon.aps.iva.yw.a0;
import com.ellation.crunchyroll.api.drm.DrmProxyService;
import com.ellation.crunchyroll.api.etp.auth.EtpAuthInterceptor;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.api.etp.playback.PlayService;
import com.ellation.crunchyroll.application.CrunchyrollApplication;
import com.ellation.crunchyroll.application.a;
import com.ellation.crunchyroll.cast.CastFeature;
import com.ellation.crunchyroll.cast.session.SessionManagerProviderHolder;
import okhttp3.OkHttpClient;
/* compiled from: PlayerDependenciesImpl.kt */
/* loaded from: classes2.dex */
public final class f implements k {
    public final CastFeature a;
    public final com.amazon.aps.iva.aj.f b;
    public final com.amazon.aps.iva.ph.a c;
    public final PlayService d;
    public final com.amazon.aps.iva.xb0.a<f.a> e;
    public final d f = new t(com.ellation.crunchyroll.application.f.a(null, 3)) { // from class: com.amazon.aps.iva.nx.d
        @Override // com.amazon.aps.iva.yb0.t, com.amazon.aps.iva.fc0.m
        public final Object get() {
            return ((j) this.receiver).R0();
        }
    };
    public final com.amazon.aps.iva.gy.t g = new com.amazon.aps.iva.gy.t();

    /* JADX WARN: Type inference failed for: r1v1, types: [com.amazon.aps.iva.nx.d] */
    public f(com.amazon.aps.iva.f20.j jVar, com.amazon.aps.iva.aj.j jVar2, PlayService playService, CastFeature castFeature, a0 a0Var) {
        this.a = castFeature;
        this.b = jVar2;
        this.c = jVar;
        this.d = playService;
        this.e = a0Var;
    }

    @Override // com.amazon.aps.iva.cj.k
    public final CastFeature a() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.cj.k
    public final com.amazon.aps.iva.pm.a b() {
        return com.ellation.crunchyroll.application.e.a().b();
    }

    @Override // com.amazon.aps.iva.cj.k
    public final com.amazon.aps.iva.ph.a c() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.cj.k
    public final com.amazon.aps.iva.dh.c d() {
        return com.ellation.crunchyroll.application.e.a().d().d();
    }

    @Override // com.amazon.aps.iva.cj.k
    public final com.amazon.aps.iva.aj.f e() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.cj.k
    public final b f(androidx.fragment.app.h hVar) {
        return new b(hVar);
    }

    @Override // com.amazon.aps.iva.cj.k
    public final CrunchyrollApplication g() {
        return com.ellation.crunchyroll.application.e.b();
    }

    @Override // com.amazon.aps.iva.cj.k
    public final EtpAuthInterceptor getAuthInterceptor() {
        return com.ellation.crunchyroll.application.e.c().getAuthInterceptor();
    }

    @Override // com.amazon.aps.iva.cj.k
    public final DrmProxyService getDrmProxyService() {
        return com.ellation.crunchyroll.application.e.c().getDrmProxyService();
    }

    @Override // com.amazon.aps.iva.cj.k
    public final EtpContentService getEtpContentService() {
        return com.ellation.crunchyroll.application.e.c().getEtpContentService();
    }

    @Override // com.amazon.aps.iva.cj.k
    public final PlayService getPlayService() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.cj.k
    public final com.amazon.aps.iva.ye.j getSessionManagerProvider() {
        return SessionManagerProviderHolder.get();
    }

    @Override // com.amazon.aps.iva.cj.k
    public final q h() {
        com.ellation.crunchyroll.application.a aVar = a.C0959a.a;
        if (aVar != null) {
            Object c = aVar.c().c(q.class, "streams_limits");
            if (c != null) {
                return (q) c;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.StreamsLimitsConfigImpl");
        }
        com.amazon.aps.iva.yb0.j.m("instance");
        throw null;
    }

    @Override // com.amazon.aps.iva.cj.k
    public final h i() {
        int i;
        k0 k0Var;
        com.amazon.aps.iva.rv.f fVar = (com.amazon.aps.iva.rv.f) com.amazon.aps.iva.aq.k.n(com.ellation.crunchyroll.application.e.b()).d.getValue();
        com.amazon.aps.iva.yb0.j.f(fVar, "performanceClass");
        int[] iArr = g.a;
        int i2 = iArr[fVar.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    i = 4;
                } else {
                    throw new com.amazon.aps.iva.kb0.h();
                }
            } else {
                i = 10;
            }
        } else {
            i = 24;
        }
        int i3 = iArr[fVar.ordinal()];
        if (i3 != 1) {
            if (i3 != 2 && i3 != 3) {
                throw new com.amazon.aps.iva.kb0.h();
            }
            k0Var = k0.MAX_FULL_HD;
        } else {
            k0Var = k0.ORIGINAL;
        }
        return new h(i, k0Var);
    }

    @Override // com.amazon.aps.iva.cj.k
    public final d j() {
        return this.f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.amazon.aps.iva.nx.e] */
    @Override // com.amazon.aps.iva.cj.k
    public final e k() {
        return new t(com.ellation.crunchyroll.application.f.a(null, 3)) { // from class: com.amazon.aps.iva.nx.e
            @Override // com.amazon.aps.iva.yb0.t, com.amazon.aps.iva.fc0.m
            public final Object get() {
                return Boolean.valueOf(((j) this.receiver).getHasPremiumBenefit());
            }
        };
    }

    @Override // com.amazon.aps.iva.cj.k
    public final c l() {
        return c.h;
    }

    @Override // com.amazon.aps.iva.cj.k
    public final n m() {
        com.ellation.crunchyroll.application.a aVar = a.C0959a.a;
        if (aVar != null) {
            Object c = aVar.c().c(n.class, "player_gestures");
            if (c != null) {
                return (n) c;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.PlayerGesturesConfigImpl");
        }
        com.amazon.aps.iva.yb0.j.m("instance");
        throw null;
    }

    @Override // com.amazon.aps.iva.cj.k
    public final com.amazon.aps.iva.k50.j n(androidx.fragment.app.h hVar) {
        return this.c.b(hVar);
    }

    @Override // com.amazon.aps.iva.cj.k
    public final OkHttpClient o() {
        return com.ellation.crunchyroll.application.e.c().getSimpleOkHttpClient();
    }
}

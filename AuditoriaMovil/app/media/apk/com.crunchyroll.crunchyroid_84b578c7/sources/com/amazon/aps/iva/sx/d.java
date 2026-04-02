package com.amazon.aps.iva.sx;

import android.app.Activity;
import android.content.Context;
import com.amazon.aps.iva.aj.f;
import com.amazon.aps.iva.cj.l;
import com.amazon.aps.iva.d20.k;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.qo.u;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.y30.h;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yw.d0;
import com.ellation.crunchyroll.api.etp.commenting.TalkboxService;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.cast.CastFeature;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: WatchScreenDependenciesImpl.kt */
/* loaded from: classes2.dex */
public final class d implements com.amazon.aps.iva.lo.b {
    public final l a;
    public final com.amazon.aps.iva.ff.a b;
    public final com.amazon.aps.iva.fg.a c;
    public final com.amazon.aps.iva.ye.a d;
    public final f e;
    public final com.amazon.aps.iva.ph.a f;
    public final EtpContentService g;
    public final TalkboxService h;
    public final com.amazon.aps.iva.tx.a i;
    public final com.amazon.aps.iva.tx.e j;
    public final c k;
    public final String l;
    public final b m;

    /* compiled from: WatchScreenDependenciesImpl.kt */
    /* loaded from: classes2.dex */
    public static final class a implements com.amazon.aps.iva.fp.f {
        public final com.amazon.aps.iva.d20.b a;

        public a() {
            k kVar = new k(com.ellation.crunchyroll.application.e.c().getAccountService(), com.ellation.crunchyroll.application.e.c().getJwtInvalidator(), h.a.a(null, 7), ((d0) com.ellation.crunchyroll.application.e.a()).c.a);
            EtpContentService etpContentService = com.ellation.crunchyroll.application.e.c().getEtpContentService();
            com.amazon.aps.iva.xe0.d j = z.j();
            j.f(etpContentService, "contentService");
            this.a = new com.amazon.aps.iva.d20.b(kVar, etpContentService, j);
        }

        @Override // com.amazon.aps.iva.fp.f
        public final Object enableMatureContent(PlayableAsset playableAsset, com.amazon.aps.iva.ob0.d<? super PlayableAsset> dVar) {
            return this.a.enableMatureContent(playableAsset, dVar);
        }
    }

    public d(l lVar, com.amazon.aps.iva.ff.a aVar, com.amazon.aps.iva.sv.e eVar, CastFeature castFeature, com.amazon.aps.iva.aj.j jVar, com.amazon.aps.iva.ph.a aVar2) {
        j.f(lVar, "playerFeature");
        j.f(aVar, "commentingFeature");
        j.f(castFeature, "castFeature");
        j.f(jVar, "parentalControlsFeature");
        j.f(aVar2, "multitierSubscriptionFeature");
        this.a = lVar;
        this.b = aVar;
        this.c = eVar;
        this.d = castFeature;
        this.e = jVar;
        this.f = aVar2;
        this.g = com.ellation.crunchyroll.application.e.c().getEtpContentService();
        this.h = com.ellation.crunchyroll.application.e.c().getTalkboxService();
        this.i = com.amazon.aps.iva.tx.a.a;
        this.j = com.amazon.aps.iva.tx.e.a;
        this.k = c.h;
        com.amazon.aps.iva.ts.b.a.getClass();
        this.l = com.amazon.aps.iva.ts.a.j;
        this.m = b.h;
    }

    @Override // com.amazon.aps.iva.lo.b
    public final com.amazon.aps.iva.ye.a a() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.lo.b
    public final boolean b() {
        return com.ellation.crunchyroll.application.f.a(null, 3).getHasPremiumBenefit();
    }

    @Override // com.amazon.aps.iva.lo.b
    public final com.amazon.aps.iva.ph.a c() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.lo.b
    public final String d() {
        return this.l;
    }

    @Override // com.amazon.aps.iva.lo.b
    public final f e() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.lo.b
    public final com.amazon.aps.iva.bp.c f() {
        return this.i;
    }

    @Override // com.amazon.aps.iva.lo.b
    public final com.amazon.aps.iva.xb0.l<Context, com.amazon.aps.iva.tg.a> g() {
        return this.m;
    }

    @Override // com.amazon.aps.iva.lo.b
    public final EtpContentService getContentService() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.lo.b
    public final com.amazon.aps.iva.fp.f getMaturePreferenceInteractor() {
        return new a();
    }

    @Override // com.amazon.aps.iva.lo.b
    public final l getPlayerFeature() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.lo.b
    public final TalkboxService getTalkboxService() {
        return this.h;
    }

    @Override // com.amazon.aps.iva.lo.b
    public final com.amazon.aps.iva.ff.a h() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.lo.b
    public final com.amazon.aps.iva.bp.e j() {
        return this.j;
    }

    @Override // com.amazon.aps.iva.lo.b
    public final p<Activity, Boolean, u> k() {
        return this.k;
    }

    @Override // com.amazon.aps.iva.lo.b
    public final com.amazon.aps.iva.fg.a l() {
        return this.c;
    }
}

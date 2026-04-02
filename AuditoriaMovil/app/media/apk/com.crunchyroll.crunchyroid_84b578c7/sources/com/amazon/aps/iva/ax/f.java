package com.amazon.aps.iva.ax;

import android.content.Context;
import com.amazon.aps.iva.a9.k0;
import com.amazon.aps.iva.cj.b;
import com.amazon.aps.iva.cj.l;
import com.amazon.aps.iva.ct.k;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.wy.i;
import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.y30.h;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.EtpNetworkModule;
import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.cast.dependencies.CastDependencies;
import com.ellation.crunchyroll.cast.dependencies.CastResources;
import com.ellation.crunchyroll.cast.dependencies.CastRouters;
import com.ellation.crunchyroll.cast.expanded.ChromecastMaturePreferenceInteractor;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.util.Locale;
/* compiled from: CastFeatureFactory.kt */
/* loaded from: classes2.dex */
public final class f implements CastDependencies {
    public final b a = new b(com.amazon.aps.iva.uy.a.a);
    public final com.amazon.aps.iva.ax.a b = com.amazon.aps.iva.ax.a.h;
    public final c c;
    public final h d;
    public final d e;
    public final com.amazon.aps.iva.ts.a f;
    public final EtpContentService g;
    public final EtpAccountService h;
    public final g i;
    public final k0 j;
    public final com.amazon.aps.iva.d20.b k;
    public final e l;
    public final /* synthetic */ EtpNetworkModule m;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<l> n;

    /* compiled from: CastFeatureFactory.kt */
    /* loaded from: classes2.dex */
    public static final class a implements com.amazon.aps.iva.bf.a, com.amazon.aps.iva.o00.c {
        public final /* synthetic */ i b;

        public a(EtpNetworkModule etpNetworkModule) {
            i dVar;
            EtpContentService etpContentService = etpNetworkModule.getEtpContentService();
            t tVar = t.EPISODE;
            j.f(etpContentService, "contentService");
            j.f(tVar, "resourceType");
            int i = com.amazon.aps.iva.o00.b.a[tVar.ordinal()];
            if (i != 1 && i != 2) {
                dVar = new com.amazon.aps.iva.o00.a();
            } else {
                dVar = new com.amazon.aps.iva.o00.d(etpContentService);
            }
            this.b = dVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.amazon.aps.iva.wy.i, com.amazon.aps.iva.o00.c] */
        @Override // com.amazon.aps.iva.bf.a, com.amazon.aps.iva.o00.c
        public final Object c(String str, com.amazon.aps.iva.ob0.d<? super PlayableAsset> dVar) {
            return this.b.c(str, dVar);
        }

        @Override // com.amazon.aps.iva.wy.j
        public final void cancelRunningApiCalls() {
            this.b.cancelRunningApiCalls();
        }
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [com.amazon.aps.iva.ax.c] */
    public f(com.amazon.aps.iva.f20.j jVar, com.amazon.aps.iva.fm.g gVar, EtpNetworkModule etpNetworkModule, com.amazon.aps.iva.yw.i iVar) {
        this.m = etpNetworkModule;
        this.n = iVar;
        final k a2 = com.ellation.crunchyroll.application.f.a(null, 3);
        this.c = new com.amazon.aps.iva.yb0.t(a2) { // from class: com.amazon.aps.iva.ax.c
            @Override // com.amazon.aps.iva.yb0.t, com.amazon.aps.iva.fc0.m
            public final Object get() {
                return Boolean.valueOf(((com.amazon.aps.iva.ct.j) this.receiver).getHasPremiumBenefit());
            }
        };
        this.d = h.h;
        this.e = d.h;
        this.f = com.amazon.aps.iva.ts.b.c;
        this.g = etpNetworkModule.getEtpContentService();
        this.h = etpNetworkModule.getAccountService();
        this.i = new g(jVar);
        this.j = new k0();
        com.amazon.aps.iva.d20.k kVar = new com.amazon.aps.iva.d20.k(etpNetworkModule.getAccountService(), etpNetworkModule.getJwtInvalidator(), h.a.a(null, 7), gVar.a);
        EtpContentService etpContentService = etpNetworkModule.getEtpContentService();
        com.amazon.aps.iva.xe0.d j = z.j();
        j.f(etpContentService, "contentService");
        this.k = new com.amazon.aps.iva.d20.b(kVar, etpContentService, j);
        this.l = new e(this);
    }

    @Override // com.ellation.crunchyroll.cast.dependencies.CastDependencies
    public final EtpAccountService getAccountService() {
        return this.h;
    }

    @Override // com.ellation.crunchyroll.cast.dependencies.CastDependencies
    public final com.amazon.aps.iva.cj.b getAdvertisingInfoProvider() {
        return b.a.a(com.ellation.crunchyroll.application.e.b());
    }

    @Override // com.ellation.crunchyroll.cast.dependencies.CastDependencies
    public final com.amazon.aps.iva.ts.c getApiConfiguration() {
        return this.f;
    }

    @Override // com.ellation.crunchyroll.cast.dependencies.CastDependencies
    public final String getCastId() {
        com.amazon.aps.iva.ts.a aVar = com.amazon.aps.iva.ts.b.a;
        com.amazon.aps.iva.ts.b.a.getClass();
        return com.amazon.aps.iva.ts.a.p;
    }

    @Override // com.ellation.crunchyroll.cast.dependencies.CastDependencies
    public final EtpContentService getContentService() {
        return this.g;
    }

    @Override // com.ellation.crunchyroll.cast.dependencies.CastDependencies
    public final Context getContext() {
        return com.ellation.crunchyroll.application.e.b();
    }

    @Override // com.ellation.crunchyroll.cast.dependencies.CastDependencies
    public final com.amazon.aps.iva.xb0.a<Boolean> getGetAutoplaySetting() {
        return this.b;
    }

    @Override // com.ellation.crunchyroll.cast.dependencies.CastDependencies
    public final com.amazon.aps.iva.xb0.a<Locale> getGetLocale() {
        return this.a;
    }

    @Override // com.ellation.crunchyroll.cast.dependencies.CastDependencies
    public final com.amazon.aps.iva.xb0.a<Boolean> getHasPremiumBenefit() {
        return this.c;
    }

    @Override // com.ellation.crunchyroll.cast.dependencies.CastDependencies
    public final ChromecastMaturePreferenceInteractor getMaturePreferenceInteractor() {
        return this.l;
    }

    @Override // com.ellation.crunchyroll.cast.dependencies.CastDependencies
    public final int getMediaRouteMenuItemId() {
        return R.id.menu_item_media_route;
    }

    @Override // com.ellation.crunchyroll.cast.dependencies.CastDependencies
    public final com.amazon.aps.iva.bf.a getNextAssetInteractor() {
        return new a(this.m);
    }

    @Override // com.ellation.crunchyroll.cast.dependencies.CastDependencies
    public final l getPlayerFeature() {
        return this.n.invoke();
    }

    @Override // com.ellation.crunchyroll.cast.dependencies.CastDependencies
    public final CastResources getResources() {
        return this.j;
    }

    @Override // com.ellation.crunchyroll.cast.dependencies.CastDependencies
    public final CastRouters getRouters() {
        return this.i;
    }

    @Override // com.ellation.crunchyroll.cast.dependencies.CastDependencies
    public final com.amazon.aps.iva.xb0.a<String> getSubtitleLanguage() {
        return this.d;
    }

    @Override // com.ellation.crunchyroll.cast.dependencies.CastDependencies
    public final com.amazon.aps.iva.xb0.a<Boolean> isClosedCaptionsEnabled() {
        return this.e;
    }
}

package com.amazon.aps.iva.ox;

import android.app.Activity;
import android.content.Context;
import com.amazon.aps.iva.fm.f;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
import com.ellation.crunchyroll.api.etp.assets.DigitalAssetManagementService;
import com.ellation.crunchyroll.api.etp.auth.JwtInvalidator;
import com.ellation.crunchyroll.api.etp.auth.RefreshTokenMonitor;
import com.ellation.crunchyroll.application.CrunchyrollApplication;
import com.ellation.crunchyroll.application.a;
import com.ellation.crunchyroll.application.e;
import com.ellation.crunchyroll.presentation.main.settings.SettingsBottomBarActivity;
/* compiled from: ProfilesFeatureFactory.kt */
/* loaded from: classes2.dex */
public final class d implements f {
    public final DigitalAssetManagementService a = e.c().getAssetsService();
    public final EtpAccountService b = e.c().getAccountService();
    public final com.amazon.aps.iva.m30.a c = com.amazon.aps.iva.m30.a.c;
    public final com.amazon.aps.iva.m30.b d = com.amazon.aps.iva.m30.b.a;
    public final JwtInvalidator e = e.c().getJwtInvalidator();
    public final b f = b.h;
    public final com.amazon.aps.iva.ox.a g;
    public final a h;
    public final String i;
    public final CrunchyrollApplication j;
    public final RefreshTokenMonitor k;

    /* compiled from: ProfilesFeatureFactory.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<String> {
        public static final a h = new a();

        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final String invoke() {
            return e.d().b();
        }
    }

    /* compiled from: ProfilesFeatureFactory.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<Activity, q> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(Activity activity) {
            Activity activity2 = activity;
            j.f(activity2, "activity");
            SettingsBottomBarActivity.B.getClass();
            activity2.startActivity(SettingsBottomBarActivity.a.a(activity2, null));
            return q.a;
        }
    }

    public d() {
        com.ellation.crunchyroll.application.a aVar = a.C0959a.a;
        if (aVar != null) {
            Object c = aVar.c().c(com.amazon.aps.iva.ox.a.class, "lupin");
            if (c != null) {
                this.g = (com.amazon.aps.iva.ox.a) c;
                this.h = a.h;
                com.amazon.aps.iva.ts.b.a.getClass();
                this.i = com.amazon.aps.iva.ts.a.k;
                this.j = e.b();
                this.k = e.c().getRefreshTokenMonitor();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.profiles.LupinConfigImpl");
        }
        j.m("instance");
        throw null;
    }

    @Override // com.amazon.aps.iva.fm.f
    public final b a() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.fm.f
    public final com.amazon.aps.iva.m30.a b() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.fm.f
    public final String c() {
        return this.i;
    }

    @Override // com.amazon.aps.iva.fm.f
    public final com.amazon.aps.iva.m30.b d() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.fm.f
    public final a e() {
        return this.h;
    }

    @Override // com.amazon.aps.iva.fm.f
    public final com.amazon.aps.iva.ox.a f() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.fm.f
    public final Context g() {
        return this.j;
    }

    @Override // com.amazon.aps.iva.fm.f
    public final EtpAccountService getAccountService() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.fm.f
    public final DigitalAssetManagementService getAssetsService() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.fm.f
    public final JwtInvalidator getJwtInvalidator() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.fm.f
    public final RefreshTokenMonitor getRefreshTokenMonitor() {
        return this.k;
    }
}

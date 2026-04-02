package com.amazon.aps.iva.lx;

import android.app.Activity;
import android.content.Intent;
import com.amazon.aps.iva.cj.j0;
import com.amazon.aps.iva.cj.l;
import com.amazon.aps.iva.cx.q;
import com.amazon.aps.iva.gn.c;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yh.e;
import com.amazon.aps.iva.yw.d0;
import com.crunchyroll.music.artist.ArtistActivity;
import com.crunchyroll.music.watch.screen.WatchMusicActivity;
import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.api.etp.playback.PlayService;
import com.ellation.crunchyroll.application.a;
import com.ellation.crunchyroll.application.f;
import com.ellation.crunchyroll.cast.CastFeature;
import com.ellation.crunchyroll.presentation.main.browse.BrowseBottomBarActivity;
/* compiled from: MusicFeatureFactory.kt */
/* loaded from: classes2.dex */
public final class c implements e {
    public final a a;
    public final EtpContentService b;
    public final EtpAccountService c;
    public final b d;
    public final com.amazon.aps.iva.ye.a e;
    public final q f;
    public final /* synthetic */ l g;

    public c(CastFeature castFeature, l lVar) {
        this.g = lVar;
        com.ellation.crunchyroll.application.a aVar = a.C0959a.a;
        if (aVar != null) {
            Object c = aVar.c().c(a.class, "browse_music");
            if (c != null) {
                this.a = (a) c;
                this.b = com.ellation.crunchyroll.application.e.c().getEtpContentService();
                this.c = com.ellation.crunchyroll.application.e.c().getAccountService();
                this.d = new b(d.a);
                this.e = castFeature;
                com.ellation.crunchyroll.application.a aVar2 = a.C0959a.a;
                if (aVar2 != null) {
                    Object c2 = aVar2.c().c(q.class, "streams_limits");
                    if (c2 != null) {
                        this.f = (q) c2;
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.StreamsLimitsConfigImpl");
                }
                j.m("instance");
                throw null;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.music.BrowseMusicConfigImpl");
        }
        j.m("instance");
        throw null;
    }

    @Override // com.amazon.aps.iva.yh.e
    public final com.amazon.aps.iva.ye.a a() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.yh.e
    public final boolean b() {
        return f.a(null, 3).getHasPremiumBenefit();
    }

    @Override // com.amazon.aps.iva.yh.e
    public final com.amazon.aps.iva.aj.a c() {
        return ((d0) com.ellation.crunchyroll.application.e.a()).d.c;
    }

    @Override // com.amazon.aps.iva.yh.e
    public final void d(Activity activity) {
        j.f(activity, "activity");
        int i = BrowseBottomBarActivity.v;
        Intent intent = new Intent(activity, BrowseBottomBarActivity.class);
        intent.addFlags(131072);
        intent.putExtra("should_animate", true);
        intent.putExtra("should_open_browse_music", true);
        activity.startActivity(intent);
        activity.overridePendingTransition(0, 0);
    }

    @Override // com.amazon.aps.iva.yh.e
    public final void e(o oVar, ArtistActivity.i iVar) {
        j.f(oVar, "owner");
        com.ellation.crunchyroll.application.e.c().getPolicyChangeMonitor().observePolicyChange(oVar, iVar);
    }

    @Override // com.amazon.aps.iva.yh.e
    public final com.amazon.aps.iva.bi.a f() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.yh.e
    public final com.amazon.aps.iva.k50.j g(WatchMusicActivity watchMusicActivity) {
        j.f(watchMusicActivity, "lifecycleOwner");
        return ((d0) com.ellation.crunchyroll.application.e.a()).i.b(watchMusicActivity);
    }

    @Override // com.amazon.aps.iva.yh.e
    public final EtpContentService getEtpContentService() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.yh.e
    public final PlayService getPlayService() {
        return com.ellation.crunchyroll.application.e.c().getPlayService();
    }

    @Override // com.amazon.aps.iva.yh.e
    public final l getPlayerFeature() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.yh.e
    public final j0 h() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.yh.e
    public final com.amazon.aps.iva.gn.c i(com.amazon.aps.iva.gn.e eVar) {
        com.amazon.aps.iva.ts.b.a.getClass();
        return c.a.a(eVar, com.amazon.aps.iva.ts.a.j);
    }

    @Override // com.amazon.aps.iva.yh.e
    public final com.amazon.aps.iva.xb0.a j() {
        return this.d;
    }
}

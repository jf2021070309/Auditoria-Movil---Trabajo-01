package com.amazon.aps.iva.yh;

import android.app.Activity;
import com.amazon.aps.iva.cj.j0;
import com.amazon.aps.iva.cj.l;
import com.amazon.aps.iva.di.n;
import com.amazon.aps.iva.di.p;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yh.f;
import com.crunchyroll.music.artist.ArtistActivity;
import com.crunchyroll.music.watch.screen.WatchMusicActivity;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.api.etp.playback.PlayService;
/* compiled from: MusicFeature.kt */
/* loaded from: classes.dex */
public final class i implements f, e {
    public final /* synthetic */ e a;

    public i(com.amazon.aps.iva.lx.c cVar) {
        this.a = cVar;
    }

    @Override // com.amazon.aps.iva.yh.e
    public final com.amazon.aps.iva.ye.a a() {
        return this.a.a();
    }

    @Override // com.amazon.aps.iva.yh.e
    public final boolean b() {
        return this.a.b();
    }

    @Override // com.amazon.aps.iva.yh.e
    public final com.amazon.aps.iva.aj.a c() {
        return this.a.c();
    }

    @Override // com.amazon.aps.iva.yh.e
    public final void d(Activity activity) {
        j.f(activity, "activity");
        this.a.d(activity);
    }

    @Override // com.amazon.aps.iva.yh.e
    public final void e(o oVar, ArtistActivity.i iVar) {
        j.f(oVar, "owner");
        this.a.e(oVar, iVar);
    }

    @Override // com.amazon.aps.iva.yh.e
    public final com.amazon.aps.iva.bi.a f() {
        return this.a.f();
    }

    @Override // com.amazon.aps.iva.yh.e
    public final com.amazon.aps.iva.k50.j g(WatchMusicActivity watchMusicActivity) {
        j.f(watchMusicActivity, "lifecycleOwner");
        return this.a.g(watchMusicActivity);
    }

    @Override // com.amazon.aps.iva.yh.e
    public final EtpContentService getEtpContentService() {
        return this.a.getEtpContentService();
    }

    @Override // com.amazon.aps.iva.yh.e
    public final PlayService getPlayService() {
        return this.a.getPlayService();
    }

    @Override // com.amazon.aps.iva.yh.e
    public final l getPlayerFeature() {
        return this.a.getPlayerFeature();
    }

    @Override // com.amazon.aps.iva.yh.e
    public final j0 h() {
        return this.a.h();
    }

    @Override // com.amazon.aps.iva.yh.e
    public final com.amazon.aps.iva.gn.c i(com.amazon.aps.iva.gn.e eVar) {
        return this.a.i(eVar);
    }

    @Override // com.amazon.aps.iva.yh.e
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.n60.b> j() {
        return this.a.j();
    }

    @Override // com.amazon.aps.iva.yh.f
    public final com.amazon.aps.iva.hi.a k() {
        com.amazon.aps.iva.hi.a aVar = f.a.b;
        if (aVar != null) {
            return aVar;
        }
        j.m("watchMusicScreenRouter");
        throw null;
    }

    public final com.amazon.aps.iva.bi.b l() {
        com.amazon.aps.iva.bi.b.d.getClass();
        return new com.amazon.aps.iva.bi.b();
    }

    public final com.amazon.aps.iva.di.c m(androidx.fragment.app.h hVar) {
        j.f(hVar, "activity");
        EtpContentService etpContentService = getEtpContentService();
        j.f(etpContentService, "contentService");
        return new com.amazon.aps.iva.di.c((n) com.amazon.aps.iva.ez.l.a(hVar, p.class, new h(new com.amazon.aps.iva.di.f(etpContentService), this, hVar)));
    }
}

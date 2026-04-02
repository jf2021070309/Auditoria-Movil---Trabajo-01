package com.amazon.aps.iva.lo;

import android.app.Activity;
import android.content.Context;
import com.amazon.aps.iva.qo.u;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.xb0.p;
import com.crunchyroll.watchscreen.screen.WatchScreenActivity;
import com.crunchyroll.watchscreen.screen.offline.OfflineWatchScreenActivity;
import com.ellation.crunchyroll.api.etp.commenting.TalkboxService;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
/* compiled from: WatchScreenFeature.kt */
/* loaded from: classes2.dex */
public final class d implements c, b {
    public final b a;

    public d(com.amazon.aps.iva.sx.d dVar) {
        this.a = dVar;
    }

    @Override // com.amazon.aps.iva.lo.b
    public final com.amazon.aps.iva.ye.a a() {
        return this.a.a();
    }

    @Override // com.amazon.aps.iva.lo.b
    public final boolean b() {
        return this.a.b();
    }

    @Override // com.amazon.aps.iva.lo.b
    public final com.amazon.aps.iva.ph.a c() {
        return this.a.c();
    }

    @Override // com.amazon.aps.iva.lo.b
    public final String d() {
        return this.a.d();
    }

    @Override // com.amazon.aps.iva.lo.b
    public final com.amazon.aps.iva.aj.f e() {
        return this.a.e();
    }

    @Override // com.amazon.aps.iva.lo.b
    public final com.amazon.aps.iva.bp.c f() {
        return this.a.f();
    }

    @Override // com.amazon.aps.iva.lo.b
    public final l<Context, com.amazon.aps.iva.tg.a> g() {
        return this.a.g();
    }

    @Override // com.amazon.aps.iva.lo.b
    public final EtpContentService getContentService() {
        return this.a.getContentService();
    }

    @Override // com.amazon.aps.iva.lo.b
    public final com.amazon.aps.iva.fp.f getMaturePreferenceInteractor() {
        return this.a.getMaturePreferenceInteractor();
    }

    @Override // com.amazon.aps.iva.lo.b
    public final com.amazon.aps.iva.cj.l getPlayerFeature() {
        return this.a.getPlayerFeature();
    }

    @Override // com.amazon.aps.iva.lo.b
    public final TalkboxService getTalkboxService() {
        return this.a.getTalkboxService();
    }

    @Override // com.amazon.aps.iva.lo.b
    public final com.amazon.aps.iva.ff.a h() {
        return this.a.h();
    }

    @Override // com.amazon.aps.iva.lo.c
    public final Class<? extends WatchScreenActivity> i(boolean z) {
        if (z) {
            return WatchScreenActivity.class;
        }
        return OfflineWatchScreenActivity.class;
    }

    @Override // com.amazon.aps.iva.lo.b
    public final com.amazon.aps.iva.bp.e j() {
        return this.a.j();
    }

    @Override // com.amazon.aps.iva.lo.b
    public final p<Activity, Boolean, u> k() {
        return this.a.k();
    }

    @Override // com.amazon.aps.iva.lo.b
    public final com.amazon.aps.iva.fg.a l() {
        return this.a.l();
    }
}

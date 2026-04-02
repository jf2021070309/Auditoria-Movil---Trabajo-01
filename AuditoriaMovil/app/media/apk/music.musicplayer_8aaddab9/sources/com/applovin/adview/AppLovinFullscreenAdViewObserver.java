package com.applovin.adview;

import c.p.j;
import c.p.o;
import c.p.y;
import com.applovin.impl.adview.activity.b.a;
import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.m;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class AppLovinFullscreenAdViewObserver implements o {
    private final m a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f3035b = new AtomicBoolean(true);

    /* renamed from: c  reason: collision with root package name */
    private a f3036c;

    /* renamed from: d  reason: collision with root package name */
    private com.applovin.impl.adview.o f3037d;

    public AppLovinFullscreenAdViewObserver(j jVar, com.applovin.impl.adview.o oVar, m mVar) {
        this.f3037d = oVar;
        this.a = mVar;
        jVar.a(this);
    }

    @y(j.a.ON_DESTROY)
    public void onDestroy() {
        com.applovin.impl.adview.o oVar = this.f3037d;
        if (oVar != null) {
            oVar.e();
            this.f3037d = null;
        }
        a aVar = this.f3036c;
        if (aVar != null) {
            aVar.h();
            this.f3036c.j();
            this.f3036c = null;
        }
    }

    @y(j.a.ON_PAUSE)
    public void onPause() {
        a aVar = this.f3036c;
        if (aVar != null) {
            aVar.g();
            this.f3036c.e();
        }
    }

    @y(j.a.ON_RESUME)
    public void onResume() {
        a aVar;
        if (this.f3035b.getAndSet(false) || (aVar = this.f3036c) == null) {
            return;
        }
        aVar.f();
        this.f3036c.a(((Boolean) this.a.a(b.eR)).booleanValue() ? 0L : 250L);
    }

    @y(j.a.ON_STOP)
    public void onStop() {
        a aVar = this.f3036c;
        if (aVar != null) {
            aVar.i();
        }
    }

    public void setPresenter(a aVar) {
        this.f3036c = aVar;
    }
}

package com.applovin.impl.sdk.d;

import android.annotation.TargetApi;
import android.app.Activity;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.d.c;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.h;
/* loaded from: classes.dex */
public class d {
    private final m a;

    /* renamed from: b  reason: collision with root package name */
    private final g f3982b;

    /* renamed from: c  reason: collision with root package name */
    private final c.b f3983c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f3984d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private final long f3985e;

    /* renamed from: f  reason: collision with root package name */
    private long f3986f;

    /* renamed from: g  reason: collision with root package name */
    private long f3987g;

    /* renamed from: h  reason: collision with root package name */
    private long f3988h;

    public d(AppLovinAdImpl appLovinAdImpl, m mVar) {
        if (appLovinAdImpl == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (mVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.a = mVar;
        this.f3982b = mVar.T();
        c.b a = mVar.ab().a(appLovinAdImpl);
        this.f3983c = a;
        a.a(b.a, appLovinAdImpl.getSource().ordinal()).a();
        this.f3985e = appLovinAdImpl.getCreatedAtMillis();
    }

    public static void a(long j2, AppLovinAdBase appLovinAdBase, m mVar) {
        if (appLovinAdBase == null || mVar == null) {
            return;
        }
        mVar.ab().a(appLovinAdBase).a(b.f3963b, j2).a();
    }

    public static void a(AppLovinAdBase appLovinAdBase, m mVar) {
        if (appLovinAdBase == null || mVar == null) {
            return;
        }
        mVar.ab().a(appLovinAdBase).a(b.f3964c, appLovinAdBase.getFetchLatencyMillis()).a(b.f3965d, appLovinAdBase.getFetchResponseSize()).a();
    }

    private void a(b bVar) {
        synchronized (this.f3984d) {
            if (this.f3986f > 0) {
                this.f3983c.a(bVar, System.currentTimeMillis() - this.f3986f).a();
            }
        }
    }

    public static void a(e eVar, AppLovinAdBase appLovinAdBase, m mVar) {
        if (appLovinAdBase == null || mVar == null || eVar == null) {
            return;
        }
        mVar.ab().a(appLovinAdBase).a(b.f3966e, eVar.c()).a(b.f3967f, eVar.d()).a(b.u, eVar.g()).a(b.v, eVar.h()).a(b.w, eVar.b() ? 1L : 0L).a();
    }

    @TargetApi(24)
    public void a() {
        this.f3983c.a(b.f3971j, this.f3982b.a(f.f3995b)).a(b.f3970i, this.f3982b.a(f.f3997d));
        synchronized (this.f3984d) {
            long j2 = 0;
            if (this.f3985e > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                this.f3986f = currentTimeMillis;
                long O = currentTimeMillis - this.a.O();
                long j3 = this.f3986f - this.f3985e;
                long j4 = h.a(this.a.L()) ? 1L : 0L;
                Activity a = this.a.ae().a();
                if (com.applovin.impl.sdk.utils.g.f() && a != null && a.isInMultiWindowMode()) {
                    j2 = 1;
                }
                this.f3983c.a(b.f3969h, O).a(b.f3968g, j3).a(b.p, j4).a(b.x, j2);
            }
        }
        this.f3983c.a();
    }

    public void a(long j2) {
        this.f3983c.a(b.r, j2).a();
    }

    public void b() {
        synchronized (this.f3984d) {
            if (this.f3987g < 1) {
                long currentTimeMillis = System.currentTimeMillis();
                this.f3987g = currentTimeMillis;
                long j2 = this.f3986f;
                if (j2 > 0) {
                    this.f3983c.a(b.f3974m, currentTimeMillis - j2).a();
                }
            }
        }
    }

    public void b(long j2) {
        this.f3983c.a(b.q, j2).a();
    }

    public void c() {
        a(b.f3972k);
    }

    public void c(long j2) {
        this.f3983c.a(b.s, j2).a();
    }

    public void d() {
        a(b.f3975n);
    }

    public void d(long j2) {
        synchronized (this.f3984d) {
            if (this.f3988h < 1) {
                this.f3988h = j2;
                this.f3983c.a(b.t, j2).a();
            }
        }
    }

    public void e() {
        a(b.o);
    }

    public void f() {
        a(b.f3973l);
    }

    public void g() {
        this.f3983c.a(b.y).a();
    }
}

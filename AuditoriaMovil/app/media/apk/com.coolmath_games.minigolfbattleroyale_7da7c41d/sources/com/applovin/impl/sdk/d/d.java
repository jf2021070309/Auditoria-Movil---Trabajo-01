package com.applovin.impl.sdk.d;

import android.app.Activity;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.d.c;
import com.applovin.impl.sdk.k;
/* loaded from: classes.dex */
public class d {
    private final k a;
    private final g b;
    private final c.b c;
    private final Object d = new Object();
    private final long e;
    private long f;
    private long g;
    private long h;

    public d(AppLovinAdBase appLovinAdBase, k kVar) {
        if (appLovinAdBase == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.a = kVar;
        this.b = kVar.R();
        c.b a = kVar.aa().a(appLovinAdBase);
        this.c = a;
        a.a(b.a, appLovinAdBase.getSource().ordinal()).a();
        this.e = appLovinAdBase.getCreatedAtMillis();
    }

    public static void a(long j, AppLovinAdBase appLovinAdBase, k kVar) {
        if (appLovinAdBase == null || kVar == null) {
            return;
        }
        kVar.aa().a(appLovinAdBase).a(b.b, j).a();
    }

    public static void a(AppLovinAdBase appLovinAdBase, k kVar) {
        if (appLovinAdBase == null || kVar == null) {
            return;
        }
        kVar.aa().a(appLovinAdBase).a(b.c, appLovinAdBase.getFetchLatencyMillis()).a(b.d, appLovinAdBase.getFetchResponseSize()).a();
    }

    private void a(b bVar) {
        synchronized (this.d) {
            if (this.f > 0) {
                this.c.a(bVar, System.currentTimeMillis() - this.f).a();
            }
        }
    }

    public static void a(e eVar, AppLovinAdBase appLovinAdBase, k kVar) {
        if (appLovinAdBase == null || kVar == null || eVar == null) {
            return;
        }
        kVar.aa().a(appLovinAdBase).a(b.e, eVar.c()).a(b.f, eVar.d()).a(b.u, eVar.g()).a(b.v, eVar.h()).a(b.w, eVar.b() ? 1L : 0L).a();
    }

    public void a() {
        this.c.a(b.j, this.b.a(f.b)).a(b.i, this.b.a(f.d));
        synchronized (this.d) {
            long j = 0;
            if (this.e > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                this.f = currentTimeMillis;
                long M = currentTimeMillis - this.a.M();
                long j2 = this.f - this.e;
                long j3 = com.applovin.impl.sdk.utils.g.a(this.a.J()) ? 1L : 0L;
                Activity a = this.a.ad().a();
                if (com.applovin.impl.sdk.utils.f.f() && a != null && a.isInMultiWindowMode()) {
                    j = 1;
                }
                this.c.a(b.h, M).a(b.g, j2).a(b.p, j3).a(b.x, j);
            }
        }
        this.c.a();
    }

    public void a(long j) {
        this.c.a(b.r, j).a();
    }

    public void b() {
        synchronized (this.d) {
            if (this.g < 1) {
                long currentTimeMillis = System.currentTimeMillis();
                this.g = currentTimeMillis;
                if (this.f > 0) {
                    this.c.a(b.m, currentTimeMillis - this.f).a();
                }
            }
        }
    }

    public void b(long j) {
        this.c.a(b.q, j).a();
    }

    public void c() {
        a(b.k);
    }

    public void c(long j) {
        this.c.a(b.s, j).a();
    }

    public void d() {
        a(b.n);
    }

    public void d(long j) {
        synchronized (this.d) {
            if (this.h < 1) {
                this.h = j;
                this.c.a(b.t, j).a();
            }
        }
    }

    public void e() {
        a(b.o);
    }

    public void f() {
        a(b.l);
    }

    public void g() {
        this.c.a(b.y).a();
    }
}

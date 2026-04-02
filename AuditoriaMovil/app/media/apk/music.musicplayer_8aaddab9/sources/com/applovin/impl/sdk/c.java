package com.applovin.impl.sdk;

import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class c {
    private final m a;

    /* renamed from: b  reason: collision with root package name */
    private final v f3911b;

    /* renamed from: d  reason: collision with root package name */
    private final Map<com.applovin.impl.sdk.ad.d, x> f3913d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final Map<com.applovin.impl.sdk.ad.d, x> f3914e = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Object f3912c = new Object();

    public c(m mVar) {
        this.a = mVar;
        this.f3911b = mVar.B();
        for (com.applovin.impl.sdk.ad.d dVar : com.applovin.impl.sdk.ad.d.f()) {
            this.f3913d.put(dVar, new x());
            this.f3914e.put(dVar, new x());
        }
    }

    private x d(com.applovin.impl.sdk.ad.d dVar) {
        x xVar;
        synchronized (this.f3912c) {
            xVar = this.f3913d.get(dVar);
            if (xVar == null) {
                xVar = new x();
                this.f3913d.put(dVar, xVar);
            }
        }
        return xVar;
    }

    private x e(com.applovin.impl.sdk.ad.d dVar) {
        x xVar;
        synchronized (this.f3912c) {
            xVar = this.f3914e.get(dVar);
            if (xVar == null) {
                xVar = new x();
                this.f3914e.put(dVar, xVar);
            }
        }
        return xVar;
    }

    private x f(com.applovin.impl.sdk.ad.d dVar) {
        synchronized (this.f3912c) {
            x e2 = e(dVar);
            if (e2.a() > 0) {
                return e2;
            }
            return d(dVar);
        }
    }

    public AppLovinAdImpl a(com.applovin.impl.sdk.ad.d dVar) {
        com.applovin.impl.sdk.ad.f fVar;
        StringBuilder sb;
        String str;
        synchronized (this.f3912c) {
            x d2 = d(dVar);
            if (d2.a() > 0) {
                e(dVar).a(d2.c());
                fVar = new com.applovin.impl.sdk.ad.f(dVar, this.a);
            } else {
                fVar = null;
            }
        }
        v vVar = this.f3911b;
        if (fVar != null) {
            sb = new StringBuilder();
            str = "Retrieved ad of zone ";
        } else {
            sb = new StringBuilder();
            str = "Unable to retrieve ad of zone ";
        }
        sb.append(str);
        sb.append(dVar);
        sb.append("...");
        vVar.b("AdPreloadManager", sb.toString());
        return fVar;
    }

    public void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f3912c) {
            d(appLovinAdImpl.getAdZone()).a(appLovinAdImpl);
            v vVar = this.f3911b;
            vVar.b("AdPreloadManager", "Ad enqueued: " + appLovinAdImpl);
        }
    }

    public AppLovinAdImpl b(com.applovin.impl.sdk.ad.d dVar) {
        AppLovinAdImpl c2;
        synchronized (this.f3912c) {
            c2 = f(dVar).c();
        }
        return c2;
    }

    public AppLovinAdBase c(com.applovin.impl.sdk.ad.d dVar) {
        AppLovinAdImpl d2;
        synchronized (this.f3912c) {
            d2 = f(dVar).d();
        }
        return d2;
    }
}

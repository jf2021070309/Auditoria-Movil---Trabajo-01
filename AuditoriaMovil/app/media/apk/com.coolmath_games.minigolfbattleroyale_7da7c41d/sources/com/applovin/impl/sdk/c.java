package com.applovin.impl.sdk;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class c {
    private final k a;
    private final r b;
    private final Map<com.applovin.impl.sdk.a.d, t> d = new HashMap();
    private final Map<com.applovin.impl.sdk.a.d, t> e = new HashMap();
    private final Object c = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(k kVar) {
        this.a = kVar;
        this.b = kVar.z();
        for (com.applovin.impl.sdk.a.d dVar : com.applovin.impl.sdk.a.d.f()) {
            this.d.put(dVar, new t());
            this.e.put(dVar, new t());
        }
    }

    private t e(com.applovin.impl.sdk.a.d dVar) {
        t tVar;
        synchronized (this.c) {
            tVar = this.d.get(dVar);
            if (tVar == null) {
                tVar = new t();
                this.d.put(dVar, tVar);
            }
        }
        return tVar;
    }

    private t f(com.applovin.impl.sdk.a.d dVar) {
        t tVar;
        synchronized (this.c) {
            tVar = this.e.get(dVar);
            if (tVar == null) {
                tVar = new t();
                this.e.put(dVar, tVar);
            }
        }
        return tVar;
    }

    private t g(com.applovin.impl.sdk.a.d dVar) {
        synchronized (this.c) {
            t f = f(dVar);
            if (f.a() > 0) {
                return f;
            }
            return e(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(AppLovinAdBase appLovinAdBase) {
        synchronized (this.c) {
            e(appLovinAdBase.getAdZone()).a(appLovinAdBase);
            r rVar = this.b;
            rVar.b("AdPreloadManager", "Ad enqueued: " + appLovinAdBase);
        }
    }

    public boolean a(com.applovin.impl.sdk.a.d dVar) {
        synchronized (this.c) {
            boolean z = true;
            if (f(dVar).a() > 0) {
                return true;
            }
            if (e(dVar).a() <= 0) {
                z = false;
            }
            return z;
        }
    }

    public AppLovinAdBase b(com.applovin.impl.sdk.a.d dVar) {
        com.applovin.impl.sdk.a.h hVar;
        StringBuilder sb;
        String str;
        synchronized (this.c) {
            t e = e(dVar);
            if (e.a() > 0) {
                f(dVar).a(e.c());
                hVar = new com.applovin.impl.sdk.a.h(dVar, this.a);
            } else {
                hVar = null;
            }
        }
        r rVar = this.b;
        if (hVar != null) {
            sb = new StringBuilder();
            str = "Retrieved ad of zone ";
        } else {
            sb = new StringBuilder();
            str = "Unable to retrieve ad of zone ";
        }
        sb.append(str);
        sb.append(dVar);
        sb.append("...");
        rVar.b("AdPreloadManager", sb.toString());
        return hVar;
    }

    public AppLovinAdBase c(com.applovin.impl.sdk.a.d dVar) {
        AppLovinAdBase c;
        synchronized (this.c) {
            c = g(dVar).c();
        }
        return c;
    }

    public AppLovinAdBase d(com.applovin.impl.sdk.a.d dVar) {
        AppLovinAdBase d;
        synchronized (this.c) {
            d = g(dVar).d();
        }
        return d;
    }
}

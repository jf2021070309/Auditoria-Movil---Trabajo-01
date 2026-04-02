package com.kwad.components.ad.h;

import com.kwad.components.core.o.h;
import com.kwad.components.core.o.i;
import com.kwad.sdk.core.response.model.AdTemplate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class b implements com.kwad.components.core.internal.api.b {
    private static final Object nR = new Object();
    private static volatile b nS;
    private Set<Integer> nT = new HashSet();
    private List<c> nU = new ArrayList();
    private Map<com.kwad.components.core.internal.api.a, Object> nV = new WeakHashMap();
    private Map<com.kwad.components.core.o.c, Object> nW = new WeakHashMap();
    private i nX = new i() { // from class: com.kwad.components.ad.h.b.1
        @Override // com.kwad.components.core.o.i, com.kwad.sdk.core.c.c
        /* renamed from: a */
        public final void c(com.kwad.components.core.o.c cVar) {
            super.c(cVar);
            b.this.nW.put(cVar, b.nR);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.kwad.components.core.o.i, com.kwad.sdk.core.c.c
        public final void b(com.kwad.components.core.o.c cVar) {
            super.b(cVar);
            b.this.nW.remove(cVar);
            if (b.this.nW.isEmpty()) {
                b.this.fd();
            }
        }
    };

    private b() {
        h.pA().a(this.nX);
        this.nT.add(2);
        this.nT.add(3);
        this.nT.add(13);
        this.nT.add(6);
    }

    private void e(com.kwad.components.core.internal.api.a aVar) {
        this.nV.put(aVar, nR);
        if (g(aVar)) {
            c cVar = new c(aVar);
            cVar.fg();
            this.nU.add(cVar);
        }
    }

    private void f(com.kwad.components.core.internal.api.a aVar) {
        this.nV.remove(aVar);
        for (c cVar : this.nU) {
            cVar.d(aVar);
        }
        if (p(aVar.getAdTemplate())) {
            fd();
        }
    }

    public static b fc() {
        if (nS == null) {
            synchronized (b.class) {
                if (nS == null) {
                    nS = new b();
                }
            }
        }
        return nS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void fd() {
        boolean fe = fe();
        com.kwad.sdk.core.e.c.d("KsAdGlobalWatcher", "checkCurrentPage noSDKPage: " + fe);
        if (fe) {
            for (c cVar : this.nU) {
                cVar.fi();
            }
        }
    }

    private static boolean g(com.kwad.components.core.internal.api.a aVar) {
        if (aVar.ae()) {
            return com.kwad.sdk.core.response.b.a.cD(com.kwad.sdk.core.response.b.d.ck(aVar.getAdTemplate()));
        }
        return false;
    }

    private boolean p(AdTemplate adTemplate) {
        if (adTemplate == null) {
            return false;
        }
        return this.nT.contains(Integer.valueOf(adTemplate.adStyle));
    }

    public final void a(c cVar) {
        if (cVar != null) {
            this.nU.remove(cVar);
        }
    }

    public final void a(com.kwad.components.core.internal.api.a aVar) {
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public final void b(com.kwad.components.core.internal.api.a aVar) {
        if (aVar != null) {
            aVar.b(this);
        }
    }

    @Override // com.kwad.components.core.internal.api.b
    public final void c(com.kwad.components.core.internal.api.a aVar) {
        e(aVar);
    }

    @Override // com.kwad.components.core.internal.api.b
    public final void d(com.kwad.components.core.internal.api.a aVar) {
        f(aVar);
        b(aVar);
    }

    public final synchronized boolean fe() {
        for (com.kwad.components.core.internal.api.a aVar : this.nV.keySet()) {
            if (p(aVar.getAdTemplate())) {
                return false;
            }
        }
        return this.nW.isEmpty();
    }
}

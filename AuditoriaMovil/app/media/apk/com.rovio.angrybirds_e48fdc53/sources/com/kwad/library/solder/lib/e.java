package com.kwad.library.solder.lib;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
/* loaded from: classes.dex */
public final class e implements com.kwad.library.solder.lib.a.d {
    private final com.kwad.library.solder.lib.ext.c afG;
    private final com.kwad.library.solder.lib.a.c afI;
    private final com.kwad.library.solder.lib.a.f afJ;
    private final com.kwad.library.solder.lib.a.b afK;
    private final com.kwad.library.solder.lib.ext.a afL;
    private Map<String, b> afM;

    /* loaded from: classes.dex */
    public static abstract class a {
        final com.kwad.library.solder.lib.a.d afQ;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.kwad.library.solder.lib.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0239a extends a {
            C0239a(com.kwad.library.solder.lib.a.d dVar) {
                super(dVar);
            }

            @Override // com.kwad.library.solder.lib.e.a
            public final void h(com.kwad.library.solder.lib.a.e eVar) {
                this.afQ.wd().d(eVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static class b extends a {
            b(com.kwad.library.solder.lib.a.d dVar) {
                super(dVar);
            }

            @Override // com.kwad.library.solder.lib.e.a
            public final void h(com.kwad.library.solder.lib.a.e eVar) {
                this.afQ.we().i(eVar);
            }
        }

        public a(com.kwad.library.solder.lib.a.d dVar) {
            this.afQ = dVar;
        }

        public static a a(com.kwad.library.solder.lib.a.d dVar, int i) {
            return i != 1 ? new C0239a(dVar) : new b(dVar);
        }

        public abstract void h(com.kwad.library.solder.lib.a.e eVar);
    }

    /* loaded from: classes.dex */
    public static class b {
        private final com.kwad.library.solder.lib.a.e afR;
        private final Future<com.kwad.library.solder.lib.a.e> afS;

        public b(com.kwad.library.solder.lib.a.e eVar, Future<com.kwad.library.solder.lib.a.e> future) {
            this.afR = eVar;
            this.afS = future;
        }

        public final void cancel() {
            this.afR.cancel();
            this.afS.cancel(true);
        }
    }

    public e(com.kwad.library.solder.lib.a.c cVar, com.kwad.library.solder.lib.a.f fVar, com.kwad.library.solder.lib.a.b bVar, com.kwad.library.solder.lib.ext.c cVar2, com.kwad.library.solder.lib.ext.a aVar) {
        this.afI = cVar;
        this.afJ = fVar;
        this.afK = bVar;
        this.afG = cVar2;
        this.afL = aVar;
    }

    private synchronized void a(String str, b bVar) {
        Map<String, b> c = c(this.afM);
        this.afM = c;
        if (str != null) {
            c.put(str, bVar);
        }
    }

    private b b(final com.kwad.library.solder.lib.a.e eVar, final a aVar) {
        b bD = bD(eVar.wt());
        if (bD != null) {
            bD.cancel();
        }
        eVar.a(this);
        b bVar = new b(eVar, this.afG.wL().submit(new Callable<com.kwad.library.solder.lib.a.e>() { // from class: com.kwad.library.solder.lib.e.1
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* renamed from: wh */
            public com.kwad.library.solder.lib.a.e call() {
                return e.this.a(eVar, aVar);
            }
        }));
        a(eVar.wt(), bVar);
        return bVar;
    }

    private synchronized b bD(String str) {
        Map<String, b> c = c(this.afM);
        this.afM = c;
        if (str != null) {
            return c.get(str);
        }
        return null;
    }

    private static Map<String, b> c(Map<String, b> map) {
        return (map == null || map == Collections.EMPTY_MAP) ? new HashMap() : map;
    }

    public final com.kwad.library.solder.lib.a.e a(com.kwad.library.solder.lib.a.e eVar, a aVar) {
        if (eVar.wp() == null) {
            eVar.a(this);
        }
        StringBuilder sb = new StringBuilder("request pluginId:");
        sb.append(eVar.wt());
        sb.append(", state: ");
        sb.append(eVar.wq());
        aVar.h(eVar);
        return eVar;
    }

    public final b a(com.kwad.library.solder.lib.a.e eVar, int i) {
        return b(eVar, a.a(this, 16));
    }

    public final void g(com.kwad.library.solder.lib.a.e eVar) {
        b bD = bD(eVar.wt());
        if (bD != null) {
            bD.cancel();
        }
        a(eVar.wt(), (b) null);
    }

    @Override // com.kwad.library.solder.lib.a.d
    public final com.kwad.library.solder.lib.ext.c wc() {
        return this.afG;
    }

    @Override // com.kwad.library.solder.lib.a.d
    public final com.kwad.library.solder.lib.a.c wd() {
        return this.afI;
    }

    @Override // com.kwad.library.solder.lib.a.d
    public final com.kwad.library.solder.lib.a.f we() {
        return this.afJ;
    }

    @Override // com.kwad.library.solder.lib.a.d
    public final com.kwad.library.solder.lib.a.b wf() {
        return this.afK;
    }

    @Override // com.kwad.library.solder.lib.a.d
    public final com.kwad.library.solder.lib.ext.a wg() {
        return this.afL;
    }
}

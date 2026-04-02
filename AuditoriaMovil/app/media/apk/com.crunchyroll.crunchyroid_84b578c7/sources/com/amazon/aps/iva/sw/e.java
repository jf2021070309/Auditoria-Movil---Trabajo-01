package com.amazon.aps.iva.sw;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.bw.p;
import com.amazon.aps.iva.lb0.o;
import com.amazon.aps.iva.qw.g;
import com.amazon.aps.iva.se0.c2;
import com.amazon.aps.iva.se0.j1;
import com.amazon.aps.iva.sv.c1;
import com.amazon.aps.iva.sv.d1;
import com.amazon.aps.iva.sv.q2;
import com.amazon.aps.iva.sv.r2;
import com.amazon.aps.iva.xb0.l;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.downloading.DownloadsManagerImpl;
import com.ellation.crunchyroll.downloading.y;
import com.ellation.crunchyroll.model.Channel;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ToDownloadInteractor.kt */
/* loaded from: classes2.dex */
public final class e implements com.amazon.aps.iva.sw.d {
    public final com.amazon.aps.iva.vg.a b;
    public final com.amazon.aps.iva.qw.g c;
    public final com.amazon.aps.iva.qw.g d;
    public final com.ellation.crunchyroll.downloading.a e;
    public final q2 f;
    public final EtpContentService g;
    public final com.amazon.aps.iva.sv.c h;
    public final com.amazon.aps.iva.ob0.g i;
    public final l<String, Channel> j;
    public final com.amazon.aps.iva.sw.c k;
    public final d l;

    /* compiled from: ToDownloadInteractor.kt */
    /* loaded from: classes2.dex */
    public static final class a extends CancellationException {
        public a() {
            super("Cancelled automatically");
        }
    }

    /* compiled from: ToDownloadInteractor.kt */
    /* loaded from: classes2.dex */
    public static final class b extends CancellationException {
        public b() {
            super("Cancelled by user");
        }
    }

    /* compiled from: ToDownloadInteractor.kt */
    /* loaded from: classes2.dex */
    public static final class c extends CancellationException {
        public c() {
            super("Paused by user");
        }
    }

    /* compiled from: ToDownloadInteractor.kt */
    /* loaded from: classes2.dex */
    public final class d {
        public final ConcurrentHashMap a = new ConcurrentHashMap();

        public final void a(String str, b bVar) {
            com.amazon.aps.iva.yb0.j.f(str, "assetId");
            ConcurrentHashMap concurrentHashMap = this.a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                if (com.amazon.aps.iva.yb0.j.a(((com.amazon.aps.iva.xg.a) entry.getKey()).a, str)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                com.amazon.aps.iva.xg.a aVar = (com.amazon.aps.iva.xg.a) entry2.getKey();
                ((j1) entry2.getValue()).a(bVar);
                com.amazon.aps.iva.yb0.j.f(aVar, "input");
                concurrentHashMap.remove(aVar);
            }
        }

        public final boolean b(com.amazon.aps.iva.xg.a... aVarArr) {
            com.amazon.aps.iva.yb0.j.f(aVarArr, "input");
            ConcurrentHashMap concurrentHashMap = this.a;
            if (!concurrentHashMap.isEmpty()) {
                for (Map.Entry entry : concurrentHashMap.entrySet()) {
                    if (o.N(aVarArr, entry.getKey())) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* compiled from: ToDownloadInteractor.kt */
    /* renamed from: com.amazon.aps.iva.sw.e$e  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0717e extends com.amazon.aps.iva.yb0.l implements l<g.a, Boolean> {
        public final /* synthetic */ String h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0717e(String str) {
            super(1);
            this.h = str;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(g.a aVar) {
            g.a aVar2 = aVar;
            com.amazon.aps.iva.yb0.j.f(aVar2, "it");
            return Boolean.valueOf(com.amazon.aps.iva.yb0.j.a(aVar2.e, this.h));
        }
    }

    /* compiled from: ToDownloadInteractor.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements l<g.a, Boolean> {
        public final /* synthetic */ String h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(1);
            this.h = str;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(g.a aVar) {
            g.a aVar2 = aVar;
            com.amazon.aps.iva.yb0.j.f(aVar2, "it");
            return Boolean.valueOf(com.amazon.aps.iva.yb0.j.a(aVar2.e, this.h));
        }
    }

    /* compiled from: ToDownloadInteractor.kt */
    /* loaded from: classes2.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements l<g.a, Boolean> {
        public final /* synthetic */ com.amazon.aps.iva.hg.a h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.amazon.aps.iva.hg.a aVar) {
            super(1);
            this.h = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(g.a aVar) {
            boolean a;
            g.a aVar2 = aVar;
            com.amazon.aps.iva.yb0.j.f(aVar2, "it");
            com.amazon.aps.iva.hg.a aVar3 = this.h;
            String seasonId = aVar3.getSeasonId();
            String str = aVar2.a;
            if (seasonId != null) {
                if (com.amazon.aps.iva.yb0.j.a(str, aVar3.k0())) {
                    if (com.amazon.aps.iva.yb0.j.a(aVar2.b, aVar3.getSeasonId())) {
                        a = true;
                    }
                }
                a = false;
            } else {
                a = com.amazon.aps.iva.yb0.j.a(str, aVar3.k0());
            }
            return Boolean.valueOf(a);
        }
    }

    public e(p pVar, com.amazon.aps.iva.qw.h hVar, com.amazon.aps.iva.qw.h hVar2, com.ellation.crunchyroll.downloading.b bVar, r2 r2Var, EtpContentService etpContentService, com.amazon.aps.iva.sv.d dVar, com.amazon.aps.iva.ye0.c cVar, l lVar) {
        com.amazon.aps.iva.yb0.j.f(etpContentService, "contentService");
        com.amazon.aps.iva.yb0.j.f(cVar, "backgroundContext");
        com.amazon.aps.iva.yb0.j.f(lVar, "getChannelById");
        this.b = pVar;
        this.c = hVar;
        this.d = hVar2;
        this.e = bVar;
        this.f = r2Var;
        this.g = etpContentService;
        this.h = dVar;
        this.i = cVar;
        this.j = lVar;
        this.k = new com.amazon.aps.iva.sw.c();
        this.l = new d();
    }

    @Override // com.amazon.aps.iva.sw.d
    public final void K0(PlayableAsset playableAsset, DownloadsManagerImpl.l.a aVar, DownloadsManagerImpl.l.b bVar) {
        c2 d2 = com.amazon.aps.iva.se0.i.d(this.h, this.i, null, new j(this, playableAsset, bVar, aVar, null), 2);
        com.amazon.aps.iva.xg.a k0 = x.k0(playableAsset);
        d dVar = this.l;
        dVar.getClass();
        dVar.a.put(k0, d2);
        d2.s0(new k(this, k0));
    }

    @Override // com.amazon.aps.iva.sw.d
    public final void P(com.amazon.aps.iva.hg.a aVar) {
        boolean a2;
        com.amazon.aps.iva.yb0.j.f(aVar, "data");
        b bVar = new b();
        d dVar = this.l;
        dVar.getClass();
        ConcurrentHashMap concurrentHashMap = dVar.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (aVar.getSeasonId() != null) {
                if (com.amazon.aps.iva.yb0.j.a(((com.amazon.aps.iva.xg.a) entry.getKey()).b, aVar.k0()) && com.amazon.aps.iva.yb0.j.a(((com.amazon.aps.iva.xg.a) entry.getKey()).d, aVar.getSeasonId())) {
                    a2 = true;
                } else {
                    a2 = false;
                }
            } else {
                a2 = com.amazon.aps.iva.yb0.j.a(((com.amazon.aps.iva.xg.a) entry.getKey()).b, aVar.k0());
            }
            if (a2) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            dVar.a(((com.amazon.aps.iva.xg.a) entry2.getKey()).a, bVar);
        }
        this.k.a(aVar.k0(), aVar.getSeasonId());
        g gVar = new g(aVar);
        this.c.d(gVar);
        this.d.d(gVar);
    }

    @Override // com.amazon.aps.iva.sw.d
    public final void X(List list, com.ellation.crunchyroll.downloading.x xVar, com.ellation.crunchyroll.downloading.l lVar, com.ellation.crunchyroll.downloading.k kVar, c1 c1Var, d1 d1Var, y yVar) {
        d dVar;
        com.amazon.aps.iva.yb0.j.f(list, "inputs");
        com.amazon.aps.iva.yb0.j.f(lVar, "onPreparePaused");
        com.amazon.aps.iva.yb0.j.f(kVar, "onPrepareFailed");
        com.amazon.aps.iva.yb0.j.f(c1Var, "onPrepareCancelled");
        com.amazon.aps.iva.yb0.j.f(d1Var, "onPrepareCancelledAutomatically");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            dVar = this.l;
            if (!hasNext) {
                break;
            }
            Object next = it.next();
            if (!dVar.b((com.amazon.aps.iva.xg.a) next)) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            dVar.a.put((com.amazon.aps.iva.xg.a) it2.next(), com.amazon.aps.iva.a60.b.f());
        }
        com.amazon.aps.iva.se0.i.d(this.h, this.i, null, new com.amazon.aps.iva.sw.g(xVar, arrayList, this, list, kVar, lVar, c1Var, d1Var, yVar, null), 2);
    }

    @Override // com.amazon.aps.iva.sw.d
    public final void a() {
        m(new a());
    }

    @Override // com.amazon.aps.iva.wy.j
    public final void cancelRunningApiCalls() {
    }

    @Override // com.amazon.aps.iva.sw.d
    public final void i0() {
        m(new c());
    }

    @Override // com.amazon.aps.iva.sw.d
    public final void j0(String... strArr) {
        com.amazon.aps.iva.yb0.j.f(strArr, "assetIds");
        for (String str : strArr) {
            this.l.a(str, new b());
            this.c.d(new C0717e(str));
            this.d.d(new f(str));
        }
    }

    public final void m(CancellationException cancellationException) {
        ConcurrentHashMap concurrentHashMap = this.l.a;
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            ((j1) entry.getValue()).a(cancellationException);
        }
        concurrentHashMap.clear();
        this.c.a();
        this.d.a();
    }
}

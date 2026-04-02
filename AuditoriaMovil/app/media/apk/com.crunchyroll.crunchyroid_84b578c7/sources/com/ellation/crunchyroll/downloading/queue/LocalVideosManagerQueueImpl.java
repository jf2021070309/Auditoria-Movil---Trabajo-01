package com.ellation.crunchyroll.downloading.queue;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.m;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.lb0.u;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.sv.j0;
import com.amazon.aps.iva.sv.l2;
import com.amazon.aps.iva.sv.n0;
import com.amazon.aps.iva.xw.y;
import com.ellation.crunchyroll.api.cms.model.streams.Stream;
import com.ellation.crunchyroll.downloading.DownloadsManagerImpl;
import com.ellation.crunchyroll.downloading.LocalVideosManager;
import com.ellation.crunchyroll.downloading.e0;
import com.ellation.crunchyroll.downloading.exoplayer.ExoPlayerLocalVideosManagerImpl;
import com.ellation.crunchyroll.downloading.g0;
import com.ellation.crunchyroll.downloading.p;
import com.ellation.crunchyroll.downloading.q;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LocalVideosManagerQueue.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/ellation/crunchyroll/downloading/queue/LocalVideosManagerQueueImpl;", "Lcom/ellation/crunchyroll/downloading/queue/LocalVideosManagerQueue;", "Lcom/ellation/crunchyroll/downloading/LocalVideosManager;", "Lcom/ellation/crunchyroll/downloading/g0;", "a", "downloading_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class LocalVideosManagerQueueImpl implements LocalVideosManagerQueue, LocalVideosManager, g0 {
    public final LocalVideosManager b;
    public final com.amazon.aps.iva.mw.f c;
    public final com.amazon.aps.iva.pw.a d;
    public final com.amazon.aps.iva.xb0.a<Boolean> e;
    public final boolean f;
    public final a g;
    public boolean h;

    /* compiled from: LocalVideosManagerQueue.kt */
    /* loaded from: classes2.dex */
    public static final class a implements g0 {
        public final com.amazon.aps.iva.xe.d<e0.a> b;
        public String c = "";

        public a(com.amazon.aps.iva.tw.a aVar) {
            this.b = aVar;
        }

        @Override // com.ellation.crunchyroll.downloading.g0
        public final void A0(e0 e0Var) {
            com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
            b(e0Var);
        }

        @Override // com.ellation.crunchyroll.downloading.g0
        public final void J3(com.amazon.aps.iva.nw.g gVar) {
        }

        @Override // com.ellation.crunchyroll.downloading.g0
        public final void J7(e0 e0Var) {
            com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
        }

        @Override // com.ellation.crunchyroll.downloading.g0
        public final void L0() {
        }

        @Override // com.ellation.crunchyroll.downloading.g0
        public final void M3(List<? extends e0> list) {
            com.amazon.aps.iva.yb0.j.f(list, "localVideos");
            e0[] e0VarArr = (e0[]) list.toArray(new e0[0]);
            b((e0[]) Arrays.copyOf(e0VarArr, e0VarArr.length));
        }

        @Override // com.ellation.crunchyroll.downloading.g0
        public final void P5(String str) {
            com.amazon.aps.iva.yb0.j.f(str, "downloadId");
        }

        @Override // com.ellation.crunchyroll.downloading.g0
        public final void T3() {
        }

        @Override // com.ellation.crunchyroll.downloading.g0
        public final void V4(List<? extends PlayableAsset> list) {
            com.amazon.aps.iva.yb0.j.f(list, "playableAssets");
        }

        public final void a(String str) {
            if (com.amazon.aps.iva.yb0.j.a(this.c, str)) {
                this.c = "";
            }
        }

        public final void b(e0... e0VarArr) {
            ArrayList L = m.L(e0VarArr, e0.a.class);
            com.amazon.aps.iva.xe.d<e0.a> dVar = this.b;
            dVar.n1(L);
            ArrayList L2 = m.L(e0VarArr, e0.c.class);
            ArrayList arrayList = new ArrayList(r.Y(L2));
            Iterator it = L2.iterator();
            while (it.hasNext()) {
                arrayList.add(((e0.c) it.next()).a);
            }
            dVar.X0(arrayList);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                a((String) it2.next());
            }
        }

        @Override // com.ellation.crunchyroll.downloading.g0
        public final void c3(String str) {
            com.amazon.aps.iva.yb0.j.f(str, "downloadId");
            this.b.f1(str);
            a(str);
        }

        @Override // com.ellation.crunchyroll.downloading.g0
        public final void f7(e0 e0Var) {
            com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
        }

        @Override // com.ellation.crunchyroll.downloading.g0
        public final void s3(e0 e0Var) {
            com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
            this.b.f1(e0Var.e());
            a(e0Var.e());
        }

        @Override // com.ellation.crunchyroll.downloading.g0
        public final void s8(e0 e0Var) {
            com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
            b(e0Var);
        }

        @Override // com.ellation.crunchyroll.downloading.g0
        public final void t3() {
        }

        @Override // com.ellation.crunchyroll.downloading.g0
        public final void u7(e0 e0Var) {
            com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
        }

        @Override // com.ellation.crunchyroll.downloading.g0
        public final void v5(ArrayList arrayList) {
        }

        @Override // com.ellation.crunchyroll.downloading.g0
        public final void x6(String str) {
            com.amazon.aps.iva.yb0.j.f(str, "downloadId");
        }

        @Override // com.ellation.crunchyroll.downloading.g0
        public final void y7(List<? extends e0> list) {
            com.amazon.aps.iva.yb0.j.f(list, "localVideos");
        }

        @Override // com.ellation.crunchyroll.downloading.g0
        public final void z1(List<? extends PlayableAsset> list) {
            com.amazon.aps.iva.yb0.j.f(list, "playableAssets");
        }

        @Override // com.ellation.crunchyroll.downloading.g0
        public final void z3(e0 e0Var, Throwable th) {
            com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
            com.amazon.aps.iva.yb0.j.f(th, "throwable");
            b(e0Var);
            a(e0Var.e());
        }
    }

    /* compiled from: LocalVideosManagerQueue.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends e0>, q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<List<? extends e0>, q> i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(com.amazon.aps.iva.xb0.l<? super List<? extends e0>, q> lVar) {
            super(1);
            this.i = lVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(List<? extends e0> list) {
            List<? extends e0> list2 = list;
            com.amazon.aps.iva.yb0.j.f(list2, "currentDownloads");
            LocalVideosManagerQueueImpl localVideosManagerQueueImpl = LocalVideosManagerQueueImpl.this;
            ArrayList L0 = x.L0(list2, localVideosManagerQueueImpl.F6());
            ArrayList arrayList = new ArrayList(r.Y(L0));
            Iterator it = L0.iterator();
            while (it.hasNext()) {
                arrayList.add(LocalVideosManagerQueueImpl.a(localVideosManagerQueueImpl, (e0) it.next()));
            }
            this.i.invoke(arrayList);
            return q.a;
        }
    }

    /* compiled from: LocalVideosManagerQueue.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends e0>, q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<List<? extends e0>, q> h;
        public final /* synthetic */ LocalVideosManagerQueueImpl i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(LocalVideosManagerQueueImpl localVideosManagerQueueImpl, com.amazon.aps.iva.xb0.l lVar) {
            super(1);
            this.h = lVar;
            this.i = localVideosManagerQueueImpl;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(List<? extends e0> list) {
            boolean z;
            List<? extends e0> list2 = list;
            com.amazon.aps.iva.yb0.j.f(list2, "localVideos");
            ArrayList F6 = this.i.F6();
            ArrayList arrayList = new ArrayList();
            Iterator it = F6.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((e0.a) next).g() == e0.b.FAILED) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            this.h.invoke(x.L0(list2, arrayList));
            return q.a;
        }
    }

    /* compiled from: LocalVideosManagerQueue.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<e0, q> {
        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(e0 e0Var) {
            e0 e0Var2 = e0Var;
            com.amazon.aps.iva.yb0.j.f(e0Var2, "it");
            boolean z = e0Var2 instanceof e0.a;
            LocalVideosManagerQueueImpl localVideosManagerQueueImpl = LocalVideosManagerQueueImpl.this;
            if (z) {
                localVideosManagerQueueImpl.notify(new com.ellation.crunchyroll.downloading.queue.d(e0Var2));
            }
            localVideosManagerQueueImpl.f6(null);
            return q.a;
        }
    }

    /* compiled from: LocalVideosManagerQueue.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
        public e() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            LocalVideosManagerQueueImpl.this.f6(null);
            return q.a;
        }
    }

    /* compiled from: LocalVideosManagerQueue.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<e0, q> {
        public final /* synthetic */ String i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(1);
            this.i = str;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(e0 e0Var) {
            e0 e0Var2 = e0Var;
            com.amazon.aps.iva.yb0.j.f(e0Var2, "localVideo");
            boolean z = e0Var2 instanceof e0.c;
            LocalVideosManagerQueueImpl localVideosManagerQueueImpl = LocalVideosManagerQueueImpl.this;
            if (z) {
                localVideosManagerQueueImpl.G6(new com.ellation.crunchyroll.downloading.queue.f(e0Var2, localVideosManagerQueueImpl, this.i));
            } else {
                boolean z2 = e0Var2 instanceof e0.a;
                if (z2 && ((e0.a) e0Var2).s()) {
                    localVideosManagerQueueImpl.notify(new com.ellation.crunchyroll.downloading.queue.g(e0Var2));
                } else if (z2 && !((e0.a) e0Var2).s()) {
                    localVideosManagerQueueImpl.notify(new com.ellation.crunchyroll.downloading.queue.h(e0Var2));
                }
            }
            return q.a;
        }
    }

    /* compiled from: LocalVideosManagerQueue.kt */
    /* loaded from: classes2.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
        public static final g h = new g();

        public g() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final /* bridge */ /* synthetic */ q invoke() {
            return q.a;
        }
    }

    /* compiled from: LocalVideosManagerQueue.kt */
    /* loaded from: classes2.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends e0>, q> {
        public final /* synthetic */ String i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str) {
            super(1);
            this.i = str;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(List<? extends e0> list) {
            List<? extends e0> list2 = list;
            com.amazon.aps.iva.yb0.j.f(list2, "inProgressDownloads");
            if (list2.isEmpty()) {
                LocalVideosManagerQueueImpl localVideosManagerQueueImpl = LocalVideosManagerQueueImpl.this;
                a aVar = localVideosManagerQueueImpl.g;
                aVar.getClass();
                String str = this.i;
                com.amazon.aps.iva.yb0.j.f(str, "downloadId");
                aVar.c = str;
                localVideosManagerQueueImpl.P0(str, new l(localVideosManagerQueueImpl, str), new k(localVideosManagerQueueImpl));
            }
            return q.a;
        }
    }

    /* compiled from: LocalVideosManagerQueue.kt */
    /* loaded from: classes2.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<e0, q> {
        public i() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(e0 e0Var) {
            e0 e0Var2 = e0Var;
            com.amazon.aps.iva.yb0.j.f(e0Var2, "download");
            LocalVideosManagerQueueImpl.this.Y2(e0Var2.e());
            return q.a;
        }
    }

    public LocalVideosManagerQueueImpl(com.amazon.aps.iva.tw.a aVar, ExoPlayerLocalVideosManagerImpl exoPlayerLocalVideosManagerImpl, com.amazon.aps.iva.tw.g gVar, com.amazon.aps.iva.pw.a aVar2, com.amazon.aps.iva.xb0.a aVar3, boolean z) {
        com.amazon.aps.iva.yb0.j.f(aVar2, "streamDataLoader");
        com.amazon.aps.iva.yb0.j.f(aVar3, "hasNetworkConnection");
        this.b = exoPlayerLocalVideosManagerImpl;
        this.c = gVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f = z;
        a aVar4 = new a(aVar);
        this.g = aVar4;
        exoPlayerLocalVideosManagerImpl.addEventListener(aVar4);
        exoPlayerLocalVideosManagerImpl.addEventListener(this);
    }

    public static final e0 a(LocalVideosManagerQueueImpl localVideosManagerQueueImpl, e0 e0Var) {
        boolean z;
        localVideosManagerQueueImpl.getClass();
        e0.b bVar = e0.b.IN_PROGRESS;
        e0.b bVar2 = e0.b.NEW;
        e0.b bVar3 = e0.b.INFO_LOADED;
        e0.b bVar4 = e0.b.PAUSED;
        boolean contains = f1.K(bVar, bVar2, bVar3, bVar4).contains(e0Var.g());
        boolean z2 = true;
        if (localVideosManagerQueueImpl.h && contains) {
            z = true;
        } else {
            z = false;
        }
        if (e0Var.g() != bVar4 || !localVideosManagerQueueImpl.c.contains(e0Var.e())) {
            z2 = false;
        }
        if (z) {
            return e0Var.a(bVar4);
        }
        if (z2) {
            return e0Var.a(bVar);
        }
        return e0Var;
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void A0(e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
    }

    @Override // com.ellation.crunchyroll.downloading.LocalVideosManager
    public final void A3(com.amazon.aps.iva.xb0.l<? super List<? extends e0>, q> lVar) {
        this.b.A3(lVar);
    }

    @Override // com.ellation.crunchyroll.downloading.LocalVideosManager
    public final void B(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "itemId");
        this.h = false;
        this.c.t(str);
        P0(str, g.h, new f(str));
    }

    @Override // com.ellation.crunchyroll.downloading.queue.LocalVideosManagerQueue
    public final void F1(String str, q.h hVar, q.i iVar) {
        com.amazon.aps.iva.yb0.j.f(str, "seasonId");
        ArrayList F6 = F6();
        ArrayList arrayList = new ArrayList();
        Iterator it = F6.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (com.amazon.aps.iva.yb0.j.a(((e0.a) next).r(), str)) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            e0.a aVar = (e0.a) it2.next();
            hVar.invoke(aVar.e());
            remove(aVar.e());
            iVar.invoke(aVar.e());
        }
    }

    @Override // com.ellation.crunchyroll.downloading.queue.LocalVideosManagerQueue
    public final ArrayList F6() {
        List<String> G = G();
        ArrayList arrayList = new ArrayList();
        for (String str : G) {
            e0.a aVar = this.g.b.I0().get(str);
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    @Override // com.ellation.crunchyroll.downloading.queue.LocalVideosManagerQueue
    public final List<String> G() {
        return this.c.s();
    }

    @Override // com.ellation.crunchyroll.downloading.LocalVideosManager
    public final void G6(com.amazon.aps.iva.xb0.l<? super List<? extends e0>, com.amazon.aps.iva.kb0.q> lVar) {
        this.b.G6(lVar);
    }

    @Override // com.ellation.crunchyroll.downloading.LocalVideosManager
    public final void J2(com.amazon.aps.iva.xb0.l<? super List<? extends e0>, com.amazon.aps.iva.kb0.q> lVar) {
        this.b.J2(new c(this, lVar));
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void J3(com.amazon.aps.iva.nw.g gVar) {
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void J7(e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void L0() {
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void M3(List<? extends e0> list) {
        com.amazon.aps.iva.yb0.j.f(list, "localVideos");
        ArrayList j0 = u.j0(list, e0.a.class);
        ArrayList arrayList = new ArrayList(r.Y(j0));
        Iterator it = j0.iterator();
        while (it.hasNext()) {
            arrayList.add(((e0.a) it.next()).e());
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.c.t((String[]) Arrays.copyOf(strArr, strArr.length));
        if (this.h) {
            this.h = false;
            Z(new com.ellation.crunchyroll.downloading.queue.b(this));
        }
    }

    @Override // com.ellation.crunchyroll.downloading.LocalVideosManager
    public final void P0(String str, com.amazon.aps.iva.xb0.a aVar, com.amazon.aps.iva.xb0.l lVar) {
        com.amazon.aps.iva.yb0.j.f(str, "itemId");
        com.amazon.aps.iva.yb0.j.f(aVar, "failure");
        a aVar2 = this.g;
        aVar2.getClass();
        e0.a v = aVar2.b.v(str);
        if (v != null) {
            lVar.invoke(v);
            return;
        }
        this.b.P0(str, aVar, new com.ellation.crunchyroll.downloading.queue.a(this, lVar));
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void P5(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "downloadId");
    }

    @Override // com.ellation.crunchyroll.downloading.queue.LocalVideosManagerQueue
    public final void R1(String str, p.h hVar, p.i iVar) {
        com.amazon.aps.iva.yb0.j.f(str, "containerId");
        ArrayList F6 = F6();
        ArrayList arrayList = new ArrayList();
        Iterator it = F6.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (com.amazon.aps.iva.yb0.j.a(((e0.a) next).p(), str)) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            e0.a aVar = (e0.a) it2.next();
            hVar.invoke(aVar.e());
            remove(aVar.e());
            iVar.invoke(aVar.e());
        }
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void T3() {
    }

    @Override // com.ellation.crunchyroll.downloading.LocalVideosManager
    public final void T4() {
        this.c.clear();
        this.b.T4();
    }

    @Override // com.ellation.crunchyroll.downloading.LocalVideosManager
    public final Object T6(String str, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return this.b.T6(str, dVar);
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void V4(List<? extends PlayableAsset> list) {
        com.amazon.aps.iva.yb0.j.f(list, "playableAssets");
    }

    @Override // com.ellation.crunchyroll.downloading.LocalVideosManager
    public final void W6(n0 n0Var) {
        Z(new com.amazon.aps.iva.mw.b(n0Var));
    }

    @Override // com.ellation.crunchyroll.downloading.queue.LocalVideosManagerQueue
    public final void Y0() {
        this.b.T4();
        if (!this.h) {
            this.h = true;
            Z(new com.ellation.crunchyroll.downloading.queue.c(this));
        }
    }

    @Override // com.ellation.crunchyroll.downloading.queue.LocalVideosManagerQueue
    public final void Y2(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "itemId");
        if (this.e.invoke().booleanValue() && !(!com.amazon.aps.iva.oe0.m.b0(this.g.c))) {
            this.b.G6(new h(str));
            if (this.h) {
                this.h = false;
                Z(new com.ellation.crunchyroll.downloading.queue.b(this));
            }
        }
    }

    @Override // com.ellation.crunchyroll.downloading.LocalVideosManager
    public final void Z(com.amazon.aps.iva.xb0.l<? super List<? extends e0>, com.amazon.aps.iva.kb0.q> lVar) {
        this.b.Z(new b(lVar));
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void addEventListener(g0 g0Var) {
        g0 g0Var2 = g0Var;
        com.amazon.aps.iva.yb0.j.f(g0Var2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.b.addEventListener(g0Var2);
    }

    @Override // com.ellation.crunchyroll.downloading.LocalVideosManager
    public final void b6(String str, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.fg.d, com.amazon.aps.iva.kb0.q> lVar) {
        com.amazon.aps.iva.yb0.j.f(str, "downloadId");
        this.b.b6(str, lVar);
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void c3(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "downloadId");
        this.c.p(str);
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void clear() {
        this.b.clear();
    }

    @Override // com.ellation.crunchyroll.downloading.queue.LocalVideosManagerQueue
    public final void f6(String str) {
        List s;
        com.amazon.aps.iva.mw.f fVar = this.c;
        if (str != null) {
            s = y.a(str, fVar.s());
        } else {
            s = fVar.s();
        }
        Z(new com.amazon.aps.iva.mw.a(s, new i()));
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void f7(e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
        this.c.p(e0Var.e());
        f6(null);
    }

    @Override // com.ellation.crunchyroll.downloading.LocalVideosManager
    public final void g(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "itemId");
        this.c.p(str);
        this.b.g(str);
        P0(str, new e(), new d());
    }

    @Override // com.ellation.crunchyroll.downloading.LocalVideosManager
    public final void g5(j0 j0Var) {
        this.b.g5(j0Var);
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final int getListenerCount() {
        return this.b.getListenerCount();
    }

    @Override // com.ellation.crunchyroll.downloading.LocalVideosManager
    public final boolean isStarted() {
        return this.b.isStarted();
    }

    @Override // com.ellation.crunchyroll.downloading.LocalVideosManager
    public final void j4(String str, Stream stream) {
        com.amazon.aps.iva.yb0.j.f(str, "itemId");
        com.amazon.aps.iva.yb0.j.f(stream, "stream");
        this.b.j4(str, stream);
    }

    @Override // com.ellation.crunchyroll.downloading.LocalVideosManager
    public final void l8(l2.a aVar) {
        this.b.l8(aVar);
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void notify(com.amazon.aps.iva.xb0.l<? super g0, com.amazon.aps.iva.kb0.q> lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "action");
        this.b.notify(lVar);
    }

    @Override // com.ellation.crunchyroll.downloading.queue.LocalVideosManagerQueue
    public final void p1(List<String> list) {
        String[] strArr = (String[]) list.toArray(new String[0]);
        this.c.p((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // com.ellation.crunchyroll.downloading.LocalVideosManager
    public final void remove(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "itemId");
        this.b.remove(str);
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void removeEventListener(g0 g0Var) {
        g0 g0Var2 = g0Var;
        com.amazon.aps.iva.yb0.j.f(g0Var2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.b.removeEventListener(g0Var2);
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void s3(e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void s8(e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
    }

    @Override // com.ellation.crunchyroll.downloading.LocalVideosManager
    public final void t2(DownloadsManagerImpl.n nVar) {
        this.b.t2(nVar);
        this.c.clear();
        this.g.b.clear();
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void t3() {
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void u7(e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void v5(ArrayList arrayList) {
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void x6(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "downloadId");
        f6(null);
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void y7(List<? extends e0> list) {
        com.amazon.aps.iva.yb0.j.f(list, "localVideos");
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void z1(List<? extends PlayableAsset> list) {
        com.amazon.aps.iva.yb0.j.f(list, "playableAssets");
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void z3(e0 e0Var, Throwable th) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
        com.amazon.aps.iva.yb0.j.f(th, "throwable");
        f6(e0Var.e());
    }
}

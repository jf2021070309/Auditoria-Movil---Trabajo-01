package com.ellation.crunchyroll.downloading.exoplayer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import com.amazon.aps.iva.a6.g1;
import com.amazon.aps.iva.a6.k;
import com.amazon.aps.iva.a6.o1;
import com.amazon.aps.iva.a6.p1;
import com.amazon.aps.iva.b50.w;
import com.amazon.aps.iva.dw.n;
import com.amazon.aps.iva.dw.o;
import com.amazon.aps.iva.dw.p;
import com.amazon.aps.iva.dw.r;
import com.amazon.aps.iva.fg.d;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.m6.f;
import com.amazon.aps.iva.m6.i;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.q5.b0;
import com.amazon.aps.iva.q5.u0;
import com.amazon.aps.iva.sv.j0;
import com.amazon.aps.iva.sv.l2;
import com.amazon.aps.iva.sv.m;
import com.amazon.aps.iva.sv.q1;
import com.amazon.aps.iva.w5.f;
import com.amazon.aps.iva.x6.s;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.amazon.aps.iva.zv.b;
import com.ellation.crunchyroll.api.cms.model.streams.Stream;
import com.ellation.crunchyroll.downloading.DownloadsManagerImpl;
import com.ellation.crunchyroll.downloading.LocalVideosManager;
import com.ellation.crunchyroll.downloading.e0;
import com.ellation.crunchyroll.downloading.g0;
import com.ellation.crunchyroll.downloading.queue.LocalVideosManagerQueueImpl;
import com.ellation.crunchyroll.eventdispatcher.EventDispatcher;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
/* compiled from: ExoPlayerLocalVideosManagerImpl.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/ellation/crunchyroll/downloading/exoplayer/ExoPlayerLocalVideosManagerImpl;", "Lcom/ellation/crunchyroll/downloading/LocalVideosManager;", "Lcom/amazon/aps/iva/m6/i$c;", "Lcom/ellation/crunchyroll/eventdispatcher/EventDispatcher;", "Lcom/ellation/crunchyroll/downloading/g0;", "downloading_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"UnsafeOptInUsageError"})
/* loaded from: classes2.dex */
public final class ExoPlayerLocalVideosManagerImpl implements LocalVideosManager, i.c, EventDispatcher<g0> {
    public final com.amazon.aps.iva.m6.i b;
    public final com.amazon.aps.iva.bw.e c;
    public final f.a d;
    public final q1 e;
    public final ExoPlayerEventsMapper f;
    public final r g;
    public final com.amazon.aps.iva.dw.i h;
    public final m i;

    /* compiled from: ExoPlayerLocalVideosManagerImpl.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<List<? extends e0>, q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(List<? extends e0> list) {
            List<? extends e0> list2 = list;
            j.f(list2, "downloads");
            for (e0 e0Var : list2) {
                ExoPlayerLocalVideosManagerImpl.this.g(e0Var.e());
            }
            return q.a;
        }
    }

    /* compiled from: ExoPlayerLocalVideosManagerImpl.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ String i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.i = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            ExoPlayerLocalVideosManagerImpl.this.notify(new com.ellation.crunchyroll.downloading.exoplayer.a(this.i));
            return q.a;
        }
    }

    /* compiled from: ExoPlayerLocalVideosManagerImpl.kt */
    /* loaded from: classes2.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ String i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.i = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            ExoPlayerLocalVideosManagerImpl.this.notify(new com.ellation.crunchyroll.downloading.exoplayer.b(this.i));
            return q.a;
        }
    }

    /* compiled from: ExoPlayerLocalVideosManagerImpl.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.exoplayer.ExoPlayerLocalVideosManagerImpl", f = "ExoPlayerLocalVideosManagerImpl.kt", l = {161}, m = "renewLicense")
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.qb0.c {
        public ExoPlayerLocalVideosManagerImpl h;
        public com.amazon.aps.iva.m6.c i;
        public /* synthetic */ Object j;
        public int l;

        public d(com.amazon.aps.iva.ob0.d<? super d> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return ExoPlayerLocalVideosManagerImpl.this.T6(null, this);
        }
    }

    /* compiled from: ExoPlayerLocalVideosManagerImpl.kt */
    /* loaded from: classes2.dex */
    public static final class e extends l implements com.amazon.aps.iva.xb0.l<g0, q> {
        public final /* synthetic */ e0 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e0 e0Var) {
            super(1);
            this.h = e0Var;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(g0 g0Var) {
            g0 g0Var2 = g0Var;
            j.f(g0Var2, "$this$notify");
            g0Var2.A0(this.h.a(e0.b.STARTED));
            return q.a;
        }
    }

    /* compiled from: ExoPlayerLocalVideosManagerImpl.kt */
    /* loaded from: classes2.dex */
    public static final class f extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.m6.m, q> {
        public f() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.m6.m mVar) {
            com.amazon.aps.iva.m6.m mVar2 = mVar;
            j.f(mVar2, "newDownloadRequest");
            ExoPlayerLocalVideosManagerImpl.this.h.C(mVar2);
            return q.a;
        }
    }

    /* compiled from: ExoPlayerLocalVideosManagerImpl.kt */
    /* loaded from: classes2.dex */
    public static final class g extends l implements com.amazon.aps.iva.xb0.l<Throwable, q> {
        public final /* synthetic */ e0 i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(e0 e0Var) {
            super(1);
            this.i = e0Var;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(Throwable th) {
            Throwable th2 = th;
            j.f(th2, "e");
            ExoPlayerLocalVideosManagerImpl exoPlayerLocalVideosManagerImpl = ExoPlayerLocalVideosManagerImpl.this;
            exoPlayerLocalVideosManagerImpl.getClass();
            exoPlayerLocalVideosManagerImpl.notify(new p(this.i, th2));
            return q.a;
        }
    }

    /* compiled from: ExoPlayerLocalVideosManagerImpl.kt */
    /* loaded from: classes2.dex */
    public static final class h extends l implements com.amazon.aps.iva.xb0.l<byte[], q> {
        public final /* synthetic */ String h;
        public final /* synthetic */ Stream i;
        public final /* synthetic */ ExoPlayerLocalVideosManagerImpl j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, Stream stream, ExoPlayerLocalVideosManagerImpl exoPlayerLocalVideosManagerImpl) {
            super(1);
            this.h = str;
            this.i = stream;
            this.j = exoPlayerLocalVideosManagerImpl;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(byte[] bArr) {
            Uri parse;
            boolean z;
            boolean z2;
            v d;
            byte[] bArr2 = bArr;
            b0.b bVar = new b0.b();
            String str = this.h;
            str.getClass();
            bVar.a = str;
            String url = this.i.getUrl();
            if (url == null) {
                parse = null;
            } else {
                parse = Uri.parse(url);
            }
            bVar.b = parse;
            b0 a = bVar.a();
            ExoPlayerLocalVideosManagerImpl exoPlayerLocalVideosManagerImpl = this.j;
            u0 i = exoPlayerLocalVideosManagerImpl.g.i();
            Context context = b.a.a;
            if (context != null) {
                k kVar = new k(context);
                int i2 = com.amazon.aps.iva.m6.f.n;
                b0.g gVar = a.c;
                gVar.getClass();
                boolean z3 = false;
                if (com.amazon.aps.iva.t5.g0.J(gVar.b, gVar.c) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                f.a aVar = exoPlayerLocalVideosManagerImpl.d;
                if (!z && aVar == null) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                com.amazon.aps.iva.cq.b.t(z2);
                if (z) {
                    d = null;
                } else {
                    d = new com.amazon.aps.iva.o6.m(aVar, s.a).d(a);
                }
                v vVar = d;
                o1[] a2 = kVar.a(com.amazon.aps.iva.t5.g0.n(null), new com.amazon.aps.iva.hc.m(), new w(), new com.amazon.aps.iva.c80.a(), new com.amazon.aps.iva.k.q());
                p1[] p1VarArr = new p1[a2.length];
                for (int i3 = 0; i3 < a2.length; i3++) {
                    p1VarArr[i3] = a2[i3].r();
                }
                com.amazon.aps.iva.m6.f fVar = new com.amazon.aps.iva.m6.f(a, vVar, i, p1VarArr);
                com.ellation.crunchyroll.downloading.exoplayer.c cVar = new com.ellation.crunchyroll.downloading.exoplayer.c(str, bArr2, exoPlayerLocalVideosManagerImpl);
                if (fVar.h == null) {
                    z3 = true;
                }
                com.amazon.aps.iva.cq.b.C(z3);
                fVar.h = cVar;
                if (vVar != null) {
                    fVar.i = new f.e(vVar, fVar);
                } else {
                    fVar.f.post(new g1(2, fVar, cVar));
                }
                return q.a;
            }
            j.m("internalContext");
            throw null;
        }
    }

    /* compiled from: ExoPlayerLocalVideosManagerImpl.kt */
    /* loaded from: classes2.dex */
    public static final class i extends l implements com.amazon.aps.iva.xb0.l<Throwable, q> {
        public final /* synthetic */ String i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str) {
            super(1);
            this.i = str;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(Throwable th) {
            Throwable th2 = th;
            j.f(th2, "it");
            ExoPlayerLocalVideosManagerImpl exoPlayerLocalVideosManagerImpl = ExoPlayerLocalVideosManagerImpl.this;
            exoPlayerLocalVideosManagerImpl.getClass();
            exoPlayerLocalVideosManagerImpl.notify(new o(this.i, th2));
            return q.a;
        }
    }

    public ExoPlayerLocalVideosManagerImpl(com.amazon.aps.iva.m6.i iVar, com.amazon.aps.iva.bw.e eVar, f.a aVar, q1 q1Var, ExoPlayerEventsMapperImpl exoPlayerEventsMapperImpl, r.a aVar2, com.amazon.aps.iva.dw.h hVar, com.amazon.aps.iva.dw.j jVar, m mVar) {
        j.f(mVar, "downloadsDataSynchronizer");
        this.b = iVar;
        this.c = eVar;
        this.d = aVar;
        this.e = q1Var;
        this.f = exoPlayerEventsMapperImpl;
        this.g = aVar2;
        this.h = jVar;
        this.i = mVar;
        iVar.e.add(this);
        hVar.a(new n(this));
    }

    @Override // com.ellation.crunchyroll.downloading.LocalVideosManager
    public final void A3(com.amazon.aps.iva.xb0.l<? super List<? extends e0>, q> lVar) {
        lVar.invoke(this.e.a(0, 2));
    }

    @Override // com.ellation.crunchyroll.downloading.LocalVideosManager
    public final void B(String str) {
        com.amazon.aps.iva.m6.m mVar;
        j.f(str, "itemId");
        q1 q1Var = this.e;
        com.amazon.aps.iva.m6.c g2 = q1Var.g(str);
        if (g2 != null) {
            mVar = g2.a;
        } else {
            mVar = null;
        }
        com.amazon.aps.iva.m6.m mVar2 = mVar;
        com.amazon.aps.iva.dw.i iVar = this.h;
        if (mVar2 != null) {
            if (mVar2.f != null) {
                e0 b2 = q1Var.b(str);
                if (b2 != null) {
                    notify(new e(b2));
                    this.c.d(TimeUnit.DAYS.toSeconds(2L), mVar2, new f(), new g(b2));
                    return;
                }
                return;
            }
            iVar.C(mVar2);
            return;
        }
        iVar.B(str);
    }

    @Override // com.ellation.crunchyroll.downloading.LocalVideosManager
    public final void G6(com.amazon.aps.iva.xb0.l<? super List<? extends e0>, q> lVar) {
        lVar.invoke(this.e.a(2));
    }

    @Override // com.ellation.crunchyroll.downloading.LocalVideosManager
    public final void J2(com.amazon.aps.iva.xb0.l<? super List<? extends e0>, q> lVar) {
        LocalVideosManagerQueueImpl.c cVar = (LocalVideosManagerQueueImpl.c) lVar;
        cVar.invoke(this.e.a(4));
    }

    @Override // com.ellation.crunchyroll.downloading.LocalVideosManager
    public final void P0(String str, com.amazon.aps.iva.xb0.a aVar, com.amazon.aps.iva.xb0.l lVar) {
        j.f(str, "itemId");
        j.f(aVar, "failure");
        e0 b2 = this.e.b(str);
        if (b2 != null) {
            lVar.invoke(b2);
        } else {
            aVar.invoke();
        }
    }

    @Override // com.ellation.crunchyroll.downloading.LocalVideosManager
    public final void T4() {
        A3(new a());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    @Override // com.ellation.crunchyroll.downloading.LocalVideosManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T6(java.lang.String r5, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.ellation.crunchyroll.downloading.exoplayer.ExoPlayerLocalVideosManagerImpl.d
            if (r0 == 0) goto L13
            r0 = r6
            com.ellation.crunchyroll.downloading.exoplayer.ExoPlayerLocalVideosManagerImpl$d r0 = (com.ellation.crunchyroll.downloading.exoplayer.ExoPlayerLocalVideosManagerImpl.d) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.ellation.crunchyroll.downloading.exoplayer.ExoPlayerLocalVideosManagerImpl$d r0 = new com.ellation.crunchyroll.downloading.exoplayer.ExoPlayerLocalVideosManagerImpl$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.amazon.aps.iva.m6.c r5 = r0.i
            com.ellation.crunchyroll.downloading.exoplayer.ExoPlayerLocalVideosManagerImpl r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r6)
            goto L59
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            com.amazon.aps.iva.ab.x.i0(r6)
            com.amazon.aps.iva.sv.q1 r6 = r4.e
            com.amazon.aps.iva.m6.c r5 = r6.g(r5)
            r6 = 0
            if (r5 == 0) goto L42
            com.amazon.aps.iva.m6.m r2 = r5.a
            goto L43
        L42:
            r2 = r6
        L43:
            if (r2 == 0) goto L47
            byte[] r6 = r2.f
        L47:
            if (r6 == 0) goto L60
            r0.h = r4
            r0.i = r5
            r0.l = r3
            com.amazon.aps.iva.bw.e r6 = r4.c
            java.lang.Object r6 = r6.f(r2, r0)
            if (r6 != r1) goto L58
            return r1
        L58:
            r0 = r4
        L59:
            com.amazon.aps.iva.m6.m r6 = (com.amazon.aps.iva.m6.m) r6
            com.amazon.aps.iva.sv.q1 r0 = r0.e
            r0.f(r5, r6)
        L60:
            com.amazon.aps.iva.kb0.q r5 = com.amazon.aps.iva.kb0.q.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.downloading.exoplayer.ExoPlayerLocalVideosManagerImpl.T6(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.ellation.crunchyroll.downloading.LocalVideosManager
    public final void Z(com.amazon.aps.iva.xb0.l<? super List<? extends e0>, q> lVar) {
        ((LocalVideosManagerQueueImpl.b) lVar).invoke(this.e.d());
    }

    @Override // com.amazon.aps.iva.m6.i.c
    public final void a(com.amazon.aps.iva.m6.i iVar, com.amazon.aps.iva.m6.c cVar, Exception exc) {
        j.f(cVar, "download");
        this.f.D1(cVar, exc);
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void addEventListener(g0 g0Var) {
        g0 g0Var2 = g0Var;
        j.f(g0Var2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f.addEventListener(g0Var2);
    }

    @Override // com.ellation.crunchyroll.downloading.LocalVideosManager
    public final void b6(String str, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.fg.d, q> lVar) {
        j.f(str, "downloadId");
        com.amazon.aps.iva.fg.d e2 = this.e.e(str);
        if (e2 == null) {
            e2 = new d.b(null, false);
        }
        lVar.invoke(e2);
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void clear() {
        this.f.clear();
    }

    @Override // com.amazon.aps.iva.m6.i.c
    public final void d(com.amazon.aps.iva.m6.i iVar) {
        this.i.a();
    }

    @Override // com.amazon.aps.iva.m6.i.c
    public final void f(com.amazon.aps.iva.m6.i iVar, com.amazon.aps.iva.m6.c cVar) {
        j.f(cVar, "download");
        this.f.J1(cVar);
    }

    @Override // com.ellation.crunchyroll.downloading.LocalVideosManager
    public final void g(String str) {
        j.f(str, "itemId");
        this.h.g(str);
    }

    @Override // com.ellation.crunchyroll.downloading.LocalVideosManager
    public final void g5(j0 j0Var) {
        j0Var.invoke(this.e.a(3));
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final int getListenerCount() {
        return this.f.getListenerCount();
    }

    @Override // com.ellation.crunchyroll.downloading.LocalVideosManager
    public final boolean isStarted() {
        return this.b.h;
    }

    @Override // com.ellation.crunchyroll.downloading.LocalVideosManager
    public final void j4(String str, Stream stream) {
        j.f(str, "itemId");
        j.f(stream, "stream");
        this.c.e(str, stream.getVideoToken(), stream.getUrl(), new h(str, stream, this), new i(str));
    }

    @Override // com.ellation.crunchyroll.downloading.LocalVideosManager
    public final void l8(l2.a aVar) {
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void notify(com.amazon.aps.iva.xb0.l<? super g0, q> lVar) {
        j.f(lVar, "action");
        this.f.notify(lVar);
    }

    @Override // com.ellation.crunchyroll.downloading.LocalVideosManager
    public final void remove(String str) {
        j.f(str, "itemId");
        this.c.c(str);
        this.e.c(str, new b(str), new c(str));
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void removeEventListener(g0 g0Var) {
        g0 g0Var2 = g0Var;
        j.f(g0Var2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f.removeEventListener(g0Var2);
    }

    @Override // com.ellation.crunchyroll.downloading.LocalVideosManager
    public final void t2(DownloadsManagerImpl.n nVar) {
        this.c.b();
        this.e.r();
    }
}

package com.ellation.crunchyroll.downloading;

import com.amazon.aps.iva.aw.a;
import com.amazon.aps.iva.qw.g;
import com.amazon.aps.iva.sv.b1;
import com.amazon.aps.iva.sv.c1;
import com.amazon.aps.iva.sv.d1;
import com.amazon.aps.iva.sv.e1;
import com.amazon.aps.iva.sv.f1;
import com.amazon.aps.iva.sv.g1;
import com.amazon.aps.iva.sv.h1;
import com.amazon.aps.iva.sv.i1;
import com.amazon.aps.iva.sv.j0;
import com.amazon.aps.iva.sv.l0;
import com.amazon.aps.iva.sv.n0;
import com.amazon.aps.iva.sv.n1;
import com.amazon.aps.iva.sv.p0;
import com.amazon.aps.iva.sv.q2;
import com.amazon.aps.iva.sv.r;
import com.amazon.aps.iva.sv.r2;
import com.amazon.aps.iva.sv.t2;
import com.amazon.aps.iva.sv.u1;
import com.amazon.aps.iva.sv.u2;
import com.amazon.aps.iva.sv.v;
import com.amazon.aps.iva.sv.v0;
import com.amazon.aps.iva.sv.v1;
import com.amazon.aps.iva.sv.w0;
import com.amazon.aps.iva.sv.y0;
import com.amazon.aps.iva.sv.z0;
import com.amazon.aps.iva.sv.z1;
import com.crunchyroll.downloading.presentation.download.button.DownloadButtonState;
import com.ellation.crunchyroll.api.cms.model.streams.Stream;
import com.ellation.crunchyroll.api.cms.model.streams.Streams;
import com.ellation.crunchyroll.downloading.LocalVideosManager;
import com.ellation.crunchyroll.downloading.a;
import com.ellation.crunchyroll.downloading.bulk.d;
import com.ellation.crunchyroll.downloading.g0;
import com.ellation.crunchyroll.downloading.queue.LocalVideosManagerQueue;
import com.ellation.crunchyroll.downloading.z;
import com.ellation.crunchyroll.eventdispatcher.EventDispatcher;
import com.ellation.crunchyroll.model.Movie;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.ellation.crunchyroll.model.PlayableAssetVersion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
/* compiled from: InternalDownloadsManager.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/ellation/crunchyroll/downloading/DownloadsManagerImpl;", "Lcom/ellation/crunchyroll/downloading/InternalDownloadsManager;", "Lcom/amazon/aps/iva/sv/z1;", "Lcom/ellation/crunchyroll/eventdispatcher/EventDispatcher;", "Lcom/ellation/crunchyroll/downloading/g0;", "a", "b", "downloading_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class DownloadsManagerImpl implements InternalDownloadsManager, z1, EventDispatcher<g0> {
    public final u1 b;
    public final com.amazon.aps.iva.sw.d c;
    public final com.amazon.aps.iva.nw.a d;
    public final t2 e;
    public final com.amazon.aps.iva.qw.g f;
    public final com.amazon.aps.iva.qw.g g;
    public final com.ellation.crunchyroll.downloading.a h;
    public final z i;
    public final q2 j;
    public final com.amazon.aps.iva.tv.c k;
    public final LocalVideosManagerQueue l;
    public final com.amazon.aps.iva.gg.a m;
    public final com.amazon.aps.iva.sv.c n;
    public final com.amazon.aps.iva.wu.a o;
    public final com.ellation.crunchyroll.downloading.m p;
    public final com.ellation.crunchyroll.downloading.l q;
    public final e1 r;
    public final com.ellation.crunchyroll.downloading.k s;
    public final c1 t;
    public final d1 u;

    /* compiled from: InternalDownloadsManager.kt */
    /* loaded from: classes2.dex */
    public final class a implements g0 {

        /* compiled from: InternalDownloadsManager.kt */
        /* renamed from: com.ellation.crunchyroll.downloading.DownloadsManagerImpl$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0961a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<g0, com.amazon.aps.iva.kb0.q> {
            public static final C0961a h = new C0961a();

            public C0961a() {
                super(1);
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final com.amazon.aps.iva.kb0.q invoke(g0 g0Var) {
                g0 g0Var2 = g0Var;
                com.amazon.aps.iva.yb0.j.f(g0Var2, "$this$notify");
                g0Var2.L0();
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        public a() {
        }

        @Override // com.ellation.crunchyroll.downloading.g0
        public final void A0(e0 e0Var) {
            com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
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

        @Override // com.ellation.crunchyroll.downloading.g0
        public final void c3(String str) {
            com.amazon.aps.iva.yb0.j.f(str, "downloadId");
        }

        @Override // com.ellation.crunchyroll.downloading.g0
        public final void f7(e0 e0Var) {
            com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
        }

        @Override // com.ellation.crunchyroll.downloading.g0
        public final void s3(e0 e0Var) {
            com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
            DownloadsManagerImpl downloadsManagerImpl = DownloadsManagerImpl.this;
            if (!downloadsManagerImpl.e.a()) {
                downloadsManagerImpl.Y0();
            }
        }

        @Override // com.ellation.crunchyroll.downloading.g0
        public final void s8(e0 e0Var) {
            com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
            DownloadsManagerImpl downloadsManagerImpl = DownloadsManagerImpl.this;
            if (!downloadsManagerImpl.e.a()) {
                downloadsManagerImpl.notify(C0961a.h);
            }
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
            g0.a.a(e0Var, th);
        }
    }

    /* compiled from: InternalDownloadsManager.kt */
    /* loaded from: classes2.dex */
    public final class b implements g0 {
        @Override // com.ellation.crunchyroll.downloading.g0
        public final void A0(e0 e0Var) {
            com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
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

        @Override // com.ellation.crunchyroll.downloading.g0
        public final void c3(String str) {
            com.amazon.aps.iva.yb0.j.f(str, "downloadId");
        }

        @Override // com.ellation.crunchyroll.downloading.g0
        public final void f7(e0 e0Var) {
            com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
        }

        @Override // com.ellation.crunchyroll.downloading.g0
        public final void s3(e0 e0Var) {
            com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
        }

        @Override // com.ellation.crunchyroll.downloading.g0
        public final void s8(e0 e0Var) {
            com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
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
            g0.a.a(e0Var, th);
        }
    }

    /* compiled from: InternalDownloadsManager.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsManagerImpl$cancelDownloads$1", f = "InternalDownloadsManager.kt", l = {335}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public String[] h;
        public DownloadsManagerImpl i;
        public int j;
        public int k;
        public int l;
        public final /* synthetic */ String[] m;
        public final /* synthetic */ DownloadsManagerImpl n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String[] strArr, DownloadsManagerImpl downloadsManagerImpl, com.amazon.aps.iva.ob0.d<? super c> dVar) {
            super(2, dVar);
            this.m = strArr;
            this.n = downloadsManagerImpl;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new c(this.m, this.n, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((c) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0047 -> B:13:0x004a). Please submit an issue!!! */
        @Override // com.amazon.aps.iva.qb0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                int r1 = r9.l
                r2 = 1
                if (r1 == 0) goto L1e
                if (r1 != r2) goto L16
                int r1 = r9.k
                int r3 = r9.j
                com.ellation.crunchyroll.downloading.DownloadsManagerImpl r4 = r9.i
                java.lang.String[] r5 = r9.h
                com.amazon.aps.iva.ab.x.i0(r10)
                r10 = r9
                goto L4a
            L16:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1e:
                com.amazon.aps.iva.ab.x.i0(r10)
                java.lang.String[] r10 = r9.m
                int r1 = r10.length
                com.ellation.crunchyroll.downloading.DownloadsManagerImpl r3 = r9.n
                r4 = 0
                r5 = r10
                r10 = r9
                r8 = r4
                r4 = r3
                r3 = r8
            L2c:
                if (r3 >= r1) goto L4c
                r6 = r5[r3]
                com.amazon.aps.iva.tv.c r7 = r4.k
                r7.G4(r6)
                java.lang.String[] r6 = new java.lang.String[]{r6}
                r10.h = r5
                r10.i = r4
                r10.j = r3
                r10.k = r1
                r10.l = r2
                java.lang.Object r6 = r4.R3(r6, r10)
                if (r6 != r0) goto L4a
                return r0
            L4a:
                int r3 = r3 + r2
                goto L2c
            L4c:
                com.amazon.aps.iva.kb0.q r10 = com.amazon.aps.iva.kb0.q.a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.downloading.DownloadsManagerImpl.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: InternalDownloadsManager.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsManagerImpl", f = "InternalDownloadsManager.kt", l = {751}, m = "getDownloadButtonState")
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.qb0.c {
        public /* synthetic */ Object h;
        public int j;

        public d(com.amazon.aps.iva.ob0.d<? super d> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.h = obj;
            this.j |= Integer.MIN_VALUE;
            return DownloadsManagerImpl.this.b(null, this);
        }
    }

    /* compiled from: InternalDownloadsManager.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsManagerImpl$getDownloads$2", f = "InternalDownloadsManager.kt", l = {618}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public com.amazon.aps.iva.xb0.l h;
        public int i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<List<? extends e0>, com.amazon.aps.iva.kb0.q> j;
        public final /* synthetic */ DownloadsManagerImpl k;
        public final /* synthetic */ List<String> l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(com.amazon.aps.iva.xb0.l<? super List<? extends e0>, com.amazon.aps.iva.kb0.q> lVar, DownloadsManagerImpl downloadsManagerImpl, List<String> list, com.amazon.aps.iva.ob0.d<? super e> dVar) {
            super(2, dVar);
            this.j = lVar;
            this.k = downloadsManagerImpl;
            this.l = list;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new e(this.j, this.k, this.l, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((e) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [com.amazon.aps.iva.xb0.l] */
        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.xb0.l<List<? extends e0>, com.amazon.aps.iva.kb0.q> lVar;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.i;
            if (i != 0) {
                if (i == 1) {
                    lVar = this.h;
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                com.amazon.aps.iva.xb0.l<List<? extends e0>, com.amazon.aps.iva.kb0.q> lVar2 = this.j;
                this.h = lVar2;
                this.i = 1;
                Object d3 = this.k.d3(this.l, this);
                if (d3 == aVar) {
                    return aVar;
                }
                lVar = lVar2;
                obj = d3;
            }
            lVar.invoke(obj);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: InternalDownloadsManager.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<e0, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ List<e0> h;
        public final /* synthetic */ com.amazon.aps.iva.yb0.b0 i;
        public final /* synthetic */ com.amazon.aps.iva.se0.m<List<? extends e0>> j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ArrayList arrayList, com.amazon.aps.iva.yb0.b0 b0Var, com.amazon.aps.iva.se0.n nVar) {
            super(1);
            this.h = arrayList;
            this.i = b0Var;
            this.j = nVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(e0 e0Var) {
            e0 e0Var2 = e0Var;
            com.amazon.aps.iva.yb0.j.f(e0Var2, "localVideo");
            List<e0> list = this.h;
            list.add(e0Var2);
            if (list.size() == this.i.b) {
                this.j.resumeWith(list);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: InternalDownloadsManager.kt */
    /* loaded from: classes2.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.yb0.b0 h;
        public final /* synthetic */ List<e0> i;
        public final /* synthetic */ com.amazon.aps.iva.se0.m<List<? extends e0>> j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ArrayList arrayList, com.amazon.aps.iva.yb0.b0 b0Var, com.amazon.aps.iva.se0.n nVar) {
            super(0);
            this.h = b0Var;
            this.i = arrayList;
            this.j = nVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            com.amazon.aps.iva.yb0.b0 b0Var = this.h;
            b0Var.b--;
            List<e0> list = this.i;
            if (list.size() == b0Var.b) {
                this.j.resumeWith(list);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: InternalDownloadsManager.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsManagerImpl", f = "InternalDownloadsManager.kt", l = {737}, m = "getRelatedDubs")
    /* loaded from: classes2.dex */
    public static final class h extends com.amazon.aps.iva.qb0.c {
        public List h;
        public /* synthetic */ Object i;
        public int k;

        public h(com.amazon.aps.iva.ob0.d<? super h> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return DownloadsManagerImpl.this.U7(null, this);
        }
    }

    /* compiled from: InternalDownloadsManager.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsManagerImpl$getSeasonQueue$1", f = "InternalDownloadsManager.kt", l = {680}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ String j;
        public final /* synthetic */ String k;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<List<String>, com.amazon.aps.iva.kb0.q> l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(String str, String str2, com.amazon.aps.iva.xb0.l<? super List<String>, com.amazon.aps.iva.kb0.q> lVar, com.amazon.aps.iva.ob0.d<? super i> dVar) {
            super(2, dVar);
            this.j = str;
            this.k = str2;
            this.l = lVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new i(this.j, this.k, this.l, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((i) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            DownloadsManagerImpl downloadsManagerImpl = DownloadsManagerImpl.this;
            if (i != 0) {
                if (i == 1) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                u1 u1Var = downloadsManagerImpl.b;
                this.h = 1;
                obj = u1Var.C(this.j, this.k, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            Iterable<PlayableAsset> iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(iterable));
            for (PlayableAsset playableAsset : iterable) {
                arrayList.add(playableAsset.getId());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : downloadsManagerImpl.G()) {
                if (arrayList.contains((String) obj2)) {
                    arrayList2.add(obj2);
                }
            }
            this.l.invoke(arrayList2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: InternalDownloadsManager.kt */
    /* loaded from: classes2.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends e0>, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<Boolean, com.amazon.aps.iva.kb0.q> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(com.amazon.aps.iva.xb0.l<? super Boolean, com.amazon.aps.iva.kb0.q> lVar) {
            super(1);
            this.h = lVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(List<? extends e0> list) {
            List<? extends e0> list2 = list;
            com.amazon.aps.iva.yb0.j.f(list2, "downloads");
            this.h.invoke(Boolean.valueOf(!list2.isEmpty()));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: InternalDownloadsManager.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsManagerImpl", f = "InternalDownloadsManager.kt", l = {895}, m = "isDownloadCompleted")
    /* loaded from: classes2.dex */
    public static final class k extends com.amazon.aps.iva.qb0.c {
        public /* synthetic */ Object h;
        public int j;

        public k(com.amazon.aps.iva.ob0.d<? super k> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.h = obj;
            this.j |= Integer.MIN_VALUE;
            return DownloadsManagerImpl.this.l(null, this);
        }
    }

    /* compiled from: InternalDownloadsManager.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsManagerImpl$loadVideoStreamUrl$1", f = "InternalDownloadsManager.kt", l = {257}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class l extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ String j;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<Stream, com.amazon.aps.iva.kb0.q> k;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<PlayableAsset, Throwable, com.amazon.aps.iva.kb0.q> l;

        /* compiled from: InternalDownloadsManager.kt */
        /* loaded from: classes2.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<PlayableAsset, Streams, Stream, com.amazon.aps.iva.kb0.q> {
            public final /* synthetic */ DownloadsManagerImpl h;
            public final /* synthetic */ com.amazon.aps.iva.xb0.l<Stream, com.amazon.aps.iva.kb0.q> i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(DownloadsManagerImpl downloadsManagerImpl, com.amazon.aps.iva.xb0.l<? super Stream, com.amazon.aps.iva.kb0.q> lVar) {
                super(3);
                this.h = downloadsManagerImpl;
                this.i = lVar;
            }

            @Override // com.amazon.aps.iva.xb0.q
            public final com.amazon.aps.iva.kb0.q invoke(PlayableAsset playableAsset, Streams streams, Stream stream) {
                PlayableAsset playableAsset2 = playableAsset;
                Streams streams2 = streams;
                Stream stream2 = stream;
                com.amazon.aps.iva.yb0.j.f(playableAsset2, "newAsset");
                com.amazon.aps.iva.yb0.j.f(streams2, "streams");
                com.amazon.aps.iva.yb0.j.f(stream2, "downloadStream");
                DownloadsManagerImpl downloadsManagerImpl = this.h;
                com.amazon.aps.iva.se0.i.d(downloadsManagerImpl.n, downloadsManagerImpl.o.a(), null, new com.ellation.crunchyroll.downloading.h(this.h, playableAsset2, streams2, this.i, stream2, null), 2);
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* compiled from: InternalDownloadsManager.kt */
        /* loaded from: classes2.dex */
        public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
            public final /* synthetic */ com.amazon.aps.iva.xb0.p<PlayableAsset, Throwable, com.amazon.aps.iva.kb0.q> h;
            public final /* synthetic */ PlayableAsset i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(com.amazon.aps.iva.xb0.p<? super PlayableAsset, ? super Throwable, com.amazon.aps.iva.kb0.q> pVar, PlayableAsset playableAsset) {
                super(1);
                this.h = pVar;
                this.i = playableAsset;
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
                Throwable th2 = th;
                com.amazon.aps.iva.yb0.j.f(th2, "e");
                this.h.invoke(this.i, th2);
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l(String str, com.amazon.aps.iva.xb0.l<? super Stream, com.amazon.aps.iva.kb0.q> lVar, com.amazon.aps.iva.xb0.p<? super PlayableAsset, ? super Throwable, com.amazon.aps.iva.kb0.q> pVar, com.amazon.aps.iva.ob0.d<? super l> dVar) {
            super(2, dVar);
            this.j = str;
            this.k = lVar;
            this.l = pVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new l(this.j, this.k, this.l, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((l) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            DownloadsManagerImpl downloadsManagerImpl = DownloadsManagerImpl.this;
            if (i != 0) {
                if (i == 1) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                this.h = 1;
                obj = downloadsManagerImpl.h(this.j, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            PlayableAsset playableAsset = (PlayableAsset) obj;
            if (playableAsset != null) {
                downloadsManagerImpl.c.K0(playableAsset, new a(downloadsManagerImpl, this.k), new b(this.l, playableAsset));
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: InternalDownloadsManager.kt */
    /* loaded from: classes2.dex */
    public static final class m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<g0, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ String h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str) {
            super(1);
            this.h = str;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(g0 g0Var) {
            g0 g0Var2 = g0Var;
            com.amazon.aps.iva.yb0.j.f(g0Var2, "$this$notify");
            g0Var2.c3(this.h);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: InternalDownloadsManager.kt */
    /* loaded from: classes2.dex */
    public static final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public n() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            DownloadsManagerImpl downloadsManagerImpl = DownloadsManagerImpl.this;
            com.amazon.aps.iva.se0.i.d(downloadsManagerImpl.n, downloadsManagerImpl.o.a(), null, new com.ellation.crunchyroll.downloading.o(downloadsManagerImpl, null), 2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: InternalDownloadsManager.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsManagerImpl", f = "InternalDownloadsManager.kt", l = {436}, m = "removeDownloads")
    /* loaded from: classes2.dex */
    public static final class o extends com.amazon.aps.iva.qb0.c {
        public DownloadsManagerImpl h;
        public String[] i;
        public String j;
        public int k;
        public int l;
        public /* synthetic */ Object m;
        public int o;

        public o(com.amazon.aps.iva.ob0.d<? super o> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.m = obj;
            this.o |= Integer.MIN_VALUE;
            return DownloadsManagerImpl.this.R3(null, this);
        }
    }

    /* compiled from: InternalDownloadsManager.kt */
    /* loaded from: classes2.dex */
    public static final class p extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<g.a, Boolean> {
        public final /* synthetic */ String h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String str) {
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

    /* compiled from: InternalDownloadsManager.kt */
    /* loaded from: classes2.dex */
    public static final class q extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<g.a, Boolean> {
        public final /* synthetic */ String h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String str) {
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

    /* compiled from: InternalDownloadsManager.kt */
    /* loaded from: classes2.dex */
    public static final class r extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<a.C0962a, Boolean> {
        public final /* synthetic */ String h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String str) {
            super(1);
            this.h = str;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(a.C0962a c0962a) {
            a.C0962a c0962a2 = c0962a;
            com.amazon.aps.iva.yb0.j.f(c0962a2, "it");
            return Boolean.valueOf(com.amazon.aps.iva.yb0.j.a(c0962a2.a, this.h));
        }
    }

    /* compiled from: InternalDownloadsManager.kt */
    /* loaded from: classes2.dex */
    public static final class s extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<z.a, Boolean> {
        public final /* synthetic */ String h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(String str) {
            super(1);
            this.h = str;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(z.a aVar) {
            z.a aVar2 = aVar;
            com.amazon.aps.iva.yb0.j.f(aVar2, "it");
            return Boolean.valueOf(com.amazon.aps.iva.yb0.j.a(aVar2.c, this.h));
        }
    }

    /* compiled from: InternalDownloadsManager.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsManagerImpl$renewAllDownloads$1", f = "InternalDownloadsManager.kt", l = {665}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class t extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;

        /* compiled from: InternalDownloadsManager.kt */
        /* loaded from: classes2.dex */
        public /* synthetic */ class a extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<List<? extends String>, com.amazon.aps.iva.kb0.q> {
            public a(DownloadsManagerImpl downloadsManagerImpl) {
                super(1, downloadsManagerImpl, DownloadsManagerImpl.class, "notifyRenewAllStarted", "notifyRenewAllStarted(Ljava/util/List;)V", 0);
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final com.amazon.aps.iva.kb0.q invoke(List<? extends String> list) {
                List<? extends String> list2 = list;
                com.amazon.aps.iva.yb0.j.f(list2, "p0");
                DownloadsManagerImpl downloadsManagerImpl = (DownloadsManagerImpl) this.receiver;
                downloadsManagerImpl.getClass();
                downloadsManagerImpl.l.Z(new y0(downloadsManagerImpl, list2));
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* compiled from: InternalDownloadsManager.kt */
        /* loaded from: classes2.dex */
        public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
            public final /* synthetic */ DownloadsManagerImpl h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(DownloadsManagerImpl downloadsManagerImpl) {
                super(1);
                this.h = downloadsManagerImpl;
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
                com.amazon.aps.iva.yb0.j.f(th, "it");
                String str = DownloadButtonState.NotStarted.c.a;
                DownloadsManagerImpl downloadsManagerImpl = this.h;
                LocalVideosManager.a.a(downloadsManagerImpl.l, str, new b1(downloadsManagerImpl));
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* compiled from: InternalDownloadsManager.kt */
        /* loaded from: classes2.dex */
        public /* synthetic */ class c extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.p<String, Boolean, com.amazon.aps.iva.kb0.q> {
            public c(DownloadsManagerImpl downloadsManagerImpl) {
                super(2, downloadsManagerImpl, DownloadsManagerImpl.class, "notifyDownloadRenew", "notifyDownloadRenew(Ljava/lang/String;Z)V", 0);
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final com.amazon.aps.iva.kb0.q invoke(String str, Boolean bool) {
                String str2 = str;
                boolean booleanValue = bool.booleanValue();
                com.amazon.aps.iva.yb0.j.f(str2, "p0");
                DownloadsManagerImpl downloadsManagerImpl = (DownloadsManagerImpl) this.receiver;
                if (booleanValue) {
                    LocalVideosManager.a.a(downloadsManagerImpl.l, str2, new v0(downloadsManagerImpl));
                } else {
                    downloadsManagerImpl.notify(w0.h);
                }
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        public t(com.amazon.aps.iva.ob0.d<? super t> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new t(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((t) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                DownloadsManagerImpl downloadsManagerImpl = DownloadsManagerImpl.this;
                com.amazon.aps.iva.nw.a aVar2 = downloadsManagerImpl.d;
                a aVar3 = new a(downloadsManagerImpl);
                b bVar = new b(downloadsManagerImpl);
                c cVar = new c(downloadsManagerImpl);
                this.h = 1;
                if (aVar2.D(this, aVar3, bVar, cVar) == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: InternalDownloadsManager.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsManagerImpl$renewDownload$1", f = "InternalDownloadsManager.kt", l = {652}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class u extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ String j;

        /* compiled from: InternalDownloadsManager.kt */
        /* loaded from: classes2.dex */
        public /* synthetic */ class a extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.p<String, Boolean, com.amazon.aps.iva.kb0.q> {
            public a(DownloadsManagerImpl downloadsManagerImpl) {
                super(2, downloadsManagerImpl, DownloadsManagerImpl.class, "notifyDownloadRenew", "notifyDownloadRenew(Ljava/lang/String;Z)V", 0);
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final com.amazon.aps.iva.kb0.q invoke(String str, Boolean bool) {
                String str2 = str;
                boolean booleanValue = bool.booleanValue();
                com.amazon.aps.iva.yb0.j.f(str2, "p0");
                DownloadsManagerImpl downloadsManagerImpl = (DownloadsManagerImpl) this.receiver;
                if (booleanValue) {
                    LocalVideosManager.a.a(downloadsManagerImpl.l, str2, new v0(downloadsManagerImpl));
                } else {
                    downloadsManagerImpl.notify(w0.h);
                }
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* compiled from: InternalDownloadsManager.kt */
        /* loaded from: classes2.dex */
        public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
            public final /* synthetic */ DownloadsManagerImpl h;
            public final /* synthetic */ String i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(DownloadsManagerImpl downloadsManagerImpl, String str) {
                super(1);
                this.h = downloadsManagerImpl;
                this.i = str;
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
                Throwable th2 = th;
                com.amazon.aps.iva.yb0.j.f(th2, "e");
                DownloadsManagerImpl downloadsManagerImpl = this.h;
                downloadsManagerImpl.getClass();
                if (th2 instanceof IOException) {
                    downloadsManagerImpl.notify(new f1(th2));
                } else if (th2 instanceof IllegalStateException) {
                    downloadsManagerImpl.notify(new g1(th2));
                }
                LocalVideosManager.a.a(downloadsManagerImpl.l, this.i, new p0(downloadsManagerImpl, th2));
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(String str, com.amazon.aps.iva.ob0.d<? super u> dVar) {
            super(2, dVar);
            this.j = str;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new u(this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((u) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                DownloadsManagerImpl downloadsManagerImpl = DownloadsManagerImpl.this;
                LocalVideosManagerQueue localVideosManagerQueue = downloadsManagerImpl.l;
                z0 z0Var = new z0(downloadsManagerImpl);
                String str = this.j;
                LocalVideosManager.a.a(localVideosManagerQueue, str, z0Var);
                a aVar2 = new a(downloadsManagerImpl);
                b bVar = new b(downloadsManagerImpl, str);
                this.h = 1;
                if (downloadsManagerImpl.d.h0(str, aVar2, bVar, this) == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: InternalDownloadsManager.kt */
    /* loaded from: classes2.dex */
    public static final class v extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public v() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            DownloadsManagerImpl downloadsManagerImpl = DownloadsManagerImpl.this;
            com.amazon.aps.iva.se0.i.d(downloadsManagerImpl.n, downloadsManagerImpl.o.b(), null, new com.ellation.crunchyroll.downloading.r(downloadsManagerImpl, null), 2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: InternalDownloadsManager.kt */
    /* loaded from: classes2.dex */
    public static final class w extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ PlayableAsset i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(PlayableAsset playableAsset) {
            super(0);
            this.i = playableAsset;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            DownloadsManagerImpl downloadsManagerImpl = DownloadsManagerImpl.this;
            LocalVideosManagerQueue localVideosManagerQueue = downloadsManagerImpl.l;
            PlayableAsset playableAsset = this.i;
            localVideosManagerQueue.P0(playableAsset.getId(), new com.ellation.crunchyroll.downloading.t(downloadsManagerImpl, playableAsset), new com.ellation.crunchyroll.downloading.s(downloadsManagerImpl, playableAsset));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: InternalDownloadsManager.kt */
    /* loaded from: classes2.dex */
    public static final class x extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ List<com.amazon.aps.iva.xg.a> i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(List<com.amazon.aps.iva.xg.a> list, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
            super(0);
            this.i = list;
            this.j = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            DownloadsManagerImpl downloadsManagerImpl = DownloadsManagerImpl.this;
            downloadsManagerImpl.c.X(this.i, new com.ellation.crunchyroll.downloading.x(downloadsManagerImpl, this.j), downloadsManagerImpl.q, downloadsManagerImpl.s, downloadsManagerImpl.t, downloadsManagerImpl.u, new com.ellation.crunchyroll.downloading.y(downloadsManagerImpl));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: InternalDownloadsManager.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsManagerImpl$suspendAllActiveDownloads$1", f = "InternalDownloadsManager.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class y extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public y(com.amazon.aps.iva.ob0.d<? super y> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new y(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((y) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            com.amazon.aps.iva.ab.x.i0(obj);
            DownloadsManagerImpl downloadsManagerImpl = DownloadsManagerImpl.this;
            downloadsManagerImpl.c.i0();
            downloadsManagerImpl.i.a();
            downloadsManagerImpl.f.a();
            downloadsManagerImpl.g.a();
            downloadsManagerImpl.h.a();
            downloadsManagerImpl.l.Y0();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public DownloadsManagerImpl(v1 v1Var, com.amazon.aps.iva.sw.e eVar, com.amazon.aps.iva.nw.c cVar, u2 u2Var, com.amazon.aps.iva.qw.h hVar, com.amazon.aps.iva.qw.h hVar2, com.ellation.crunchyroll.downloading.b bVar, a0 a0Var, r2 r2Var, com.amazon.aps.iva.tv.d dVar, LocalVideosManagerQueue localVideosManagerQueue, com.amazon.aps.iva.uv.d dVar2, com.amazon.aps.iva.sv.d dVar3) {
        com.amazon.aps.iva.wu.b bVar2 = com.amazon.aps.iva.wu.b.a;
        this.b = v1Var;
        this.c = eVar;
        this.d = cVar;
        this.e = u2Var;
        this.f = hVar;
        this.g = hVar2;
        this.h = bVar;
        this.i = a0Var;
        this.j = r2Var;
        this.k = dVar;
        this.l = localVideosManagerQueue;
        this.m = dVar2;
        this.n = dVar3;
        this.o = bVar2;
        this.p = new com.ellation.crunchyroll.downloading.m(this);
        this.q = new com.ellation.crunchyroll.downloading.l(this);
        this.r = new e1(this);
        this.s = new com.ellation.crunchyroll.downloading.k(this);
        this.t = new c1(this);
        this.u = new d1(this);
        addEventListener(new a());
        addEventListener(new b());
        addEventListener(dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
        if (r6 == r1) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c A[LOOP:0: B:18:0x0056->B:20:0x005c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7 A[LOOP:2: B:28:0x00a1->B:30:0x00a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.amazon.aps.iva.pb0.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable f(com.ellation.crunchyroll.downloading.DownloadsManagerImpl r4, java.lang.String r5, com.amazon.aps.iva.ob0.d r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof com.amazon.aps.iva.sv.g0
            if (r0 == 0) goto L16
            r0 = r6
            com.amazon.aps.iva.sv.g0 r0 = (com.amazon.aps.iva.sv.g0) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.l = r1
            goto L1b
        L16:
            com.amazon.aps.iva.sv.g0 r0 = new com.amazon.aps.iva.sv.g0
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.String r5 = r0.i
            com.ellation.crunchyroll.downloading.DownloadsManagerImpl r4 = r0.h
            com.amazon.aps.iva.ab.x.i0(r6)
            goto L47
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            com.amazon.aps.iva.ab.x.i0(r6)
            r0.h = r4
            r0.i = r5
            r0.l = r3
            java.lang.Object r6 = r4.v(r5, r0)
            if (r6 != r1) goto L47
            goto Lde
        L47:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = com.amazon.aps.iva.lb0.r.Y(r6)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L56:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L6a
            java.lang.Object r1 = r6.next()
            com.ellation.crunchyroll.model.PlayableAsset r1 = (com.ellation.crunchyroll.model.PlayableAsset) r1
            java.lang.String r1 = r1.getId()
            r0.add(r1)
            goto L56
        L6a:
            com.ellation.crunchyroll.downloading.queue.LocalVideosManagerQueue r4 = r4.l
            java.util.ArrayList r4 = r4.F6()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r4 = r4.iterator()
        L79:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L94
            java.lang.Object r1 = r4.next()
            r2 = r1
            com.ellation.crunchyroll.downloading.e0$a r2 = (com.ellation.crunchyroll.downloading.e0.a) r2
            java.lang.String r2 = r2.p()
            boolean r2 = com.amazon.aps.iva.yb0.j.a(r2, r5)
            if (r2 == 0) goto L79
            r6.add(r1)
            goto L79
        L94:
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = com.amazon.aps.iva.lb0.r.Y(r6)
            r4.<init>(r5)
            java.util.Iterator r5 = r6.iterator()
        La1:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Lb5
            java.lang.Object r6 = r5.next()
            com.ellation.crunchyroll.downloading.e0$a r6 = (com.ellation.crunchyroll.downloading.e0.a) r6
            java.lang.String r6 = r6.e()
            r4.add(r6)
            goto La1
        Lb5:
            java.util.ArrayList r4 = com.amazon.aps.iva.lb0.x.L0(r4, r0)
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r4 = r4.iterator()
        Lc7:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto Lde
            java.lang.Object r6 = r4.next()
            r0 = r6
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r5.add(r0)
            if (r0 == 0) goto Lc7
            r1.add(r6)
            goto Lc7
        Lde:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.downloading.DownloadsManagerImpl.f(com.ellation.crunchyroll.downloading.DownloadsManagerImpl, java.lang.String, com.amazon.aps.iva.ob0.d):java.io.Serializable");
    }

    public static final void i(DownloadsManagerImpl downloadsManagerImpl, String str) {
        downloadsManagerImpl.c.j0(str);
        downloadsManagerImpl.i.e(str);
        downloadsManagerImpl.f.c(str);
        downloadsManagerImpl.h.c(str);
        downloadsManagerImpl.g.c(str);
        downloadsManagerImpl.l.remove(str);
        downloadsManagerImpl.d.b(str);
        downloadsManagerImpl.j.remove(str);
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void A2(String... strArr) {
        com.amazon.aps.iva.yb0.j.f(strArr, "downloadIds");
        this.l.p1(com.amazon.aps.iva.lb0.o.b0(strArr));
        this.c.j0((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // com.amazon.aps.iva.sv.z1
    public final Object C(String str, String str2, com.amazon.aps.iva.ob0.d<? super List<? extends PlayableAsset>> dVar) {
        return this.b.C(str, str2, dVar);
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void F8(String... strArr) {
        com.amazon.aps.iva.se0.i.d(this.n, this.o.a(), null, new c(strArr, this, null), 2);
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final List<String> G() {
        return this.l.G();
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void H6(String str, d.a aVar) {
        com.amazon.aps.iva.yb0.j.f(str, "containerId");
        com.amazon.aps.iva.se0.i.d(this.n, this.o.a(), null, new com.ellation.crunchyroll.downloading.p(this, str, aVar, null), 2);
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void N0(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "downloadId");
        com.amazon.aps.iva.se0.i.d(this.n, this.o.a(), null, new u(str, null), 2);
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void P0(String str, com.amazon.aps.iva.xb0.a aVar, com.amazon.aps.iva.xb0.l lVar) {
        com.amazon.aps.iva.yb0.j.f(str, "downloadId");
        this.l.P0(str, new com.amazon.aps.iva.sv.f0(aVar), lVar);
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void Q1(String str, com.ellation.crunchyroll.downloading.queue.i iVar, com.ellation.crunchyroll.downloading.queue.j jVar) {
        com.amazon.aps.iva.yb0.j.f(str, "downloadId");
        q7(str, iVar, new h1(this, jVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0073 -> B:19:0x0076). Please submit an issue!!! */
    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R3(java.lang.String[] r12, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.ellation.crunchyroll.downloading.DownloadsManagerImpl.o
            if (r0 == 0) goto L13
            r0 = r13
            com.ellation.crunchyroll.downloading.DownloadsManagerImpl$o r0 = (com.ellation.crunchyroll.downloading.DownloadsManagerImpl.o) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.o = r1
            goto L18
        L13:
            com.ellation.crunchyroll.downloading.DownloadsManagerImpl$o r0 = new com.ellation.crunchyroll.downloading.DownloadsManagerImpl$o
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.m
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.o
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            int r12 = r0.l
            int r2 = r0.k
            java.lang.String r4 = r0.j
            java.lang.String[] r5 = r0.i
            com.ellation.crunchyroll.downloading.DownloadsManagerImpl r6 = r0.h
            com.amazon.aps.iva.ab.x.i0(r13)
            r13 = r5
            goto L76
        L32:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3a:
            com.amazon.aps.iva.ab.x.i0(r13)
            java.util.List r13 = com.amazon.aps.iva.lb0.o.b0(r12)
            com.ellation.crunchyroll.downloading.queue.LocalVideosManagerQueue r2 = r11.l
            r2.p1(r13)
            int r13 = r12.length
            r2 = 0
            r6 = r11
            r10 = r13
            r13 = r12
            r12 = r10
        L4c:
            if (r2 >= r12) goto Lbd
            r4 = r13[r2]
            r6.z(r4)
            com.amazon.aps.iva.tv.c r5 = r6.k
            r5.x6(r4)
            com.amazon.aps.iva.sw.d r5 = r6.c
            java.lang.String[] r7 = new java.lang.String[]{r4}
            r5.j0(r7)
            r0.h = r6
            r0.i = r13
            r0.j = r4
            r0.k = r2
            r0.l = r12
            r0.o = r3
            com.amazon.aps.iva.sv.u1 r5 = r6.b
            java.lang.Object r5 = r5.d(r4, r0)
            if (r5 != r1) goto L76
            return r1
        L76:
            com.amazon.aps.iva.qw.g r5 = r6.f
            com.ellation.crunchyroll.downloading.DownloadsManagerImpl$p r7 = new com.ellation.crunchyroll.downloading.DownloadsManagerImpl$p
            r7.<init>(r4)
            r5.d(r7)
            com.ellation.crunchyroll.downloading.DownloadsManagerImpl$q r5 = new com.ellation.crunchyroll.downloading.DownloadsManagerImpl$q
            r5.<init>(r4)
            com.amazon.aps.iva.qw.g r7 = r6.g
            r7.d(r5)
            com.ellation.crunchyroll.downloading.DownloadsManagerImpl$r r5 = new com.ellation.crunchyroll.downloading.DownloadsManagerImpl$r
            r5.<init>(r4)
            com.ellation.crunchyroll.downloading.a r8 = r6.h
            r8.d(r5)
            com.ellation.crunchyroll.downloading.DownloadsManagerImpl$s r5 = new com.ellation.crunchyroll.downloading.DownloadsManagerImpl$s
            r5.<init>(r4)
            com.ellation.crunchyroll.downloading.z r9 = r6.i
            r9.c(r5)
            r9.e(r4)
            com.amazon.aps.iva.qw.g r5 = r6.f
            r5.c(r4)
            r7.c(r4)
            r8.c(r4)
            com.ellation.crunchyroll.downloading.queue.LocalVideosManagerQueue r5 = r6.l
            r5.remove(r4)
            com.amazon.aps.iva.nw.a r5 = r6.d
            r5.b(r4)
            com.amazon.aps.iva.sv.q2 r5 = r6.j
            r5.remove(r4)
            int r2 = r2 + r3
            goto L4c
        Lbd:
            com.amazon.aps.iva.kb0.q r12 = com.amazon.aps.iva.kb0.q.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.downloading.DownloadsManagerImpl.R3(java.lang.String[], com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void S0(PlayableAsset playableAsset) {
        com.amazon.aps.iva.yb0.j.f(playableAsset, "asset");
        w wVar = new w(playableAsset);
        if (this.e.a()) {
            wVar.invoke();
        } else {
            notify(com.amazon.aps.iva.sv.e0.h);
        }
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void S5(List<com.amazon.aps.iva.xg.a> list, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "onStart");
        x xVar = new x(list, aVar);
        if (this.e.a()) {
            xVar.invoke();
        } else {
            notify(com.amazon.aps.iva.sv.e0.h);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[LOOP:0: B:21:0x0060->B:23:0x0066, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object U7(java.util.List<? extends com.ellation.crunchyroll.model.PlayableAsset> r6, com.amazon.aps.iva.ob0.d<? super java.util.List<? extends com.ellation.crunchyroll.downloading.e0>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.ellation.crunchyroll.downloading.DownloadsManagerImpl.h
            if (r0 == 0) goto L13
            r0 = r7
            com.ellation.crunchyroll.downloading.DownloadsManagerImpl$h r0 = (com.ellation.crunchyroll.downloading.DownloadsManagerImpl.h) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.ellation.crunchyroll.downloading.DownloadsManagerImpl$h r0 = new com.ellation.crunchyroll.downloading.DownloadsManagerImpl$h
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.util.List r6 = r0.h
            java.util.List r6 = (java.util.List) r6
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L48
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            com.amazon.aps.iva.ab.x.i0(r7)
            java.util.List r7 = com.amazon.aps.iva.e.w.z(r6)
            r2 = r6
            java.util.List r2 = (java.util.List) r2
            r0.h = r2
            r0.k = r3
            java.lang.Object r7 = r5.d3(r7, r0)
            if (r7 != r1) goto L48
            return r1
        L48:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            int r0 = com.amazon.aps.iva.lb0.r.Y(r7)
            int r0 = com.amazon.aps.iva.aq.k.w(r0)
            r1 = 16
            if (r0 >= r1) goto L57
            r0 = r1
        L57:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r0)
            java.util.Iterator r7 = r7.iterator()
        L60:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L75
            java.lang.Object r0 = r7.next()
            r2 = r0
            com.ellation.crunchyroll.downloading.e0 r2 = (com.ellation.crunchyroll.downloading.e0) r2
            java.lang.String r2 = r2.e()
            r1.put(r2, r0)
            goto L60
        L75:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L80:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Ld0
            java.lang.Object r0 = r6.next()
            com.ellation.crunchyroll.model.PlayableAsset r0 = (com.ellation.crunchyroll.model.PlayableAsset) r0
            java.lang.String r2 = r0.getId()
            java.lang.Object r2 = r1.get(r2)
            com.ellation.crunchyroll.downloading.e0 r2 = (com.ellation.crunchyroll.downloading.e0) r2
            java.util.List r0 = r0.getVersions()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        La5:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto Lc1
            java.lang.Object r4 = r0.next()
            com.ellation.crunchyroll.model.PlayableAssetVersion r4 = (com.ellation.crunchyroll.model.PlayableAssetVersion) r4
            java.lang.String r4 = r4.getAssetId()
            java.lang.Object r4 = r1.get(r4)
            com.ellation.crunchyroll.downloading.e0 r4 = (com.ellation.crunchyroll.downloading.e0) r4
            if (r4 == 0) goto La5
            r3.add(r4)
            goto La5
        Lc1:
            java.lang.Object r0 = com.amazon.aps.iva.lb0.x.v0(r3)
            com.ellation.crunchyroll.downloading.e0 r0 = (com.ellation.crunchyroll.downloading.e0) r0
            if (r2 != 0) goto Lca
            r2 = r0
        Lca:
            if (r2 == 0) goto L80
            r7.add(r2)
            goto L80
        Ld0:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.downloading.DownloadsManagerImpl.U7(java.util.List, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void W2(String str, String str2, com.amazon.aps.iva.b10.q qVar) {
        com.amazon.aps.iva.yb0.j.f(str, "containerId");
        com.amazon.aps.iva.yb0.j.f(str2, "seasonId");
        this.l.g5(new j0(this, str, str2, qVar));
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void W7(com.amazon.aps.iva.hg.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "data");
        this.c.P(aVar);
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void Y0() {
        com.amazon.aps.iva.se0.i.d(this.n, this.o.b(), null, new y(null), 2);
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void Z(com.amazon.aps.iva.xb0.l<? super List<? extends e0>, com.amazon.aps.iva.kb0.q> lVar) {
        this.l.Z(lVar);
    }

    @Override // com.amazon.aps.iva.sv.z1
    public final Object a(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return this.b.a(dVar);
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void a6(String str, String str2, d.a aVar) {
        com.amazon.aps.iva.yb0.j.f(str, "containerId");
        com.amazon.aps.iva.se0.i.d(this.n, this.o.a(), null, new com.ellation.crunchyroll.downloading.q(this, str, str2, aVar, null), 2);
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void a7(String str, a.C0118a c0118a) {
        com.amazon.aps.iva.yb0.j.f(str, "containerId");
        com.amazon.aps.iva.se0.i.d(this.n, this.o.a(), null, new com.amazon.aps.iva.sv.h0(this, str, c0118a, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    @Override // com.amazon.aps.iva.fg.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.ellation.crunchyroll.model.PlayableAsset r5, com.amazon.aps.iva.ob0.d<? super com.crunchyroll.downloading.presentation.download.button.DownloadButtonState> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.ellation.crunchyroll.downloading.DownloadsManagerImpl.d
            if (r0 == 0) goto L13
            r0 = r6
            com.ellation.crunchyroll.downloading.DownloadsManagerImpl$d r0 = (com.ellation.crunchyroll.downloading.DownloadsManagerImpl.d) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.ellation.crunchyroll.downloading.DownloadsManagerImpl$d r0 = new com.ellation.crunchyroll.downloading.DownloadsManagerImpl$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            com.amazon.aps.iva.ab.x.i0(r6)
            goto L47
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            com.amazon.aps.iva.ab.x.i0(r6)
            com.amazon.aps.iva.gg.a r6 = r4.m
            boolean r6 = r6.c(r5)
            if (r6 == 0) goto L59
            java.util.List r5 = com.amazon.aps.iva.ee0.f1.J(r5)
            r0.j = r3
            java.lang.Object r6 = r4.U7(r5, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r5 = com.amazon.aps.iva.lb0.x.v0(r6)
            com.ellation.crunchyroll.downloading.e0 r5 = (com.ellation.crunchyroll.downloading.e0) r5
            if (r5 == 0) goto L56
            com.crunchyroll.downloading.presentation.download.button.DownloadButtonState r5 = com.amazon.aps.iva.x00.f.a(r5)
            goto L63
        L56:
            com.crunchyroll.downloading.presentation.download.button.DownloadButtonState$NotStarted r5 = com.crunchyroll.downloading.presentation.download.button.DownloadButtonState.NotStarted.c
            goto L63
        L59:
            com.crunchyroll.downloading.presentation.download.button.DownloadButtonState$Inactive r6 = new com.crunchyroll.downloading.presentation.download.button.DownloadButtonState$Inactive
            java.lang.String r5 = r5.getId()
            r6.<init>(r5)
            r5 = r6
        L63:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.downloading.DownloadsManagerImpl.b(com.ellation.crunchyroll.model.PlayableAsset, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void b1() {
        com.amazon.aps.iva.se0.i.d(this.n, this.o.a(), null, new t(null), 2);
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void c7(String str, String str2, com.amazon.aps.iva.xb0.l<? super List<String>, com.amazon.aps.iva.kb0.q> lVar) {
        com.amazon.aps.iva.yb0.j.f(str, "containerId");
        com.amazon.aps.iva.yb0.j.f(str2, "seasonId");
        com.amazon.aps.iva.se0.i.d(this.n, this.o.a(), null, new i(str, str2, lVar, null), 2);
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void clear() {
        this.l.clear();
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final Object d3(List<String> list, com.amazon.aps.iva.ob0.d<? super List<? extends e0>> dVar) {
        com.amazon.aps.iva.se0.n nVar = new com.amazon.aps.iva.se0.n(1, com.amazon.aps.iva.a60.b.s(dVar));
        nVar.r();
        com.amazon.aps.iva.yb0.b0 b0Var = new com.amazon.aps.iva.yb0.b0();
        b0Var.b = list.size();
        ArrayList arrayList = new ArrayList();
        if (list.isEmpty()) {
            nVar.resumeWith(com.amazon.aps.iva.lb0.z.b);
        }
        for (String str : list) {
            P0(str, new g(arrayList, b0Var, nVar), new f(arrayList, b0Var, nVar));
        }
        Object q2 = nVar.q();
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        return q2;
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void g(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "downloadId");
        this.l.g(str);
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void g1(com.amazon.aps.iva.xb0.l<? super Boolean, com.amazon.aps.iva.kb0.q> lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "result");
        this.l.A3(new j(lVar));
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final int getListenerCount() {
        return this.l.getListenerCount();
    }

    @Override // com.amazon.aps.iva.sv.z1
    public final Object getMovie(String str, com.amazon.aps.iva.ob0.d<? super Movie> dVar) {
        return this.b.getMovie(str, dVar);
    }

    @Override // com.amazon.aps.iva.sv.z1
    public final Object h(String str, com.amazon.aps.iva.ob0.d<? super PlayableAsset> dVar) {
        return this.b.h(str, dVar);
    }

    @Override // com.amazon.aps.iva.sv.z1
    public final Object j(com.amazon.aps.iva.ob0.d<? super List<String>> dVar) {
        return this.b.j(dVar);
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void j8(String str, String str2, com.amazon.aps.iva.b10.s sVar) {
        com.amazon.aps.iva.yb0.j.f(str, "containerId");
        com.amazon.aps.iva.yb0.j.f(str2, "seasonId");
        this.l.J2(new l0(this, str, str2, sVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @Override // com.amazon.aps.iva.fg.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r5, com.amazon.aps.iva.ob0.d<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.ellation.crunchyroll.downloading.DownloadsManagerImpl.k
            if (r0 == 0) goto L13
            r0 = r6
            com.ellation.crunchyroll.downloading.DownloadsManagerImpl$k r0 = (com.ellation.crunchyroll.downloading.DownloadsManagerImpl.k) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.ellation.crunchyroll.downloading.DownloadsManagerImpl$k r0 = new com.ellation.crunchyroll.downloading.DownloadsManagerImpl$k
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            com.amazon.aps.iva.ab.x.i0(r6)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            com.amazon.aps.iva.ab.x.i0(r6)
            r0.j = r3
            java.lang.Object r6 = com.amazon.aps.iva.gd0.j.g(r4, r5, r0)
            if (r6 != r1) goto L3b
            return r1
        L3b:
            com.ellation.crunchyroll.downloading.e0 r6 = (com.ellation.crunchyroll.downloading.e0) r6
            if (r6 == 0) goto L46
            boolean r5 = r6.i()
            if (r5 == 0) goto L46
            goto L47
        L46:
            r3 = 0
        L47:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.downloading.DownloadsManagerImpl.l(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    /* renamed from: m */
    public final void addEventListener(g0 g0Var) {
        com.amazon.aps.iva.yb0.j.f(g0Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.l.addEventListener(g0Var);
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void m3(String str, String str2, com.amazon.aps.iva.d10.b bVar) {
        com.amazon.aps.iva.yb0.j.f(str, "containerId");
        p((List) com.amazon.aps.iva.se0.i.e(this.o.a(), new com.ellation.crunchyroll.downloading.g(this, str, str2, null)), bVar);
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final int m7(String str, String str2) {
        com.amazon.aps.iva.yb0.j.f(str, "containerId");
        return ((List) com.amazon.aps.iva.se0.i.e(this.o.a(), new com.ellation.crunchyroll.downloading.g(this, str, str2, null))).size();
    }

    @Override // com.amazon.aps.iva.fg.c
    public final void n(String str, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.fg.d, com.amazon.aps.iva.kb0.q> lVar) {
        com.amazon.aps.iva.yb0.j.f(str, "downloadId");
        this.l.b6(str, lVar);
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void notify(com.amazon.aps.iva.xb0.l<? super g0, com.amazon.aps.iva.kb0.q> lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "action");
        this.l.notify(lVar);
    }

    @Override // com.amazon.aps.iva.sv.z1
    public final Object o(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return this.b.o(dVar);
    }

    public final void p(List<String> list, com.amazon.aps.iva.xb0.l<? super List<? extends e0>, com.amazon.aps.iva.kb0.q> lVar) {
        com.amazon.aps.iva.yb0.j.f(list, "downloadIds");
        com.amazon.aps.iva.yb0.j.f(lVar, FirebaseAnalytics.Param.SUCCESS);
        com.amazon.aps.iva.se0.i.d(this.n, this.o.a(), null, new e(lVar, this, list, null), 2);
    }

    @Override // com.amazon.aps.iva.sv.z1
    public final Object q(String str, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.wg.b> dVar) {
        return this.b.q(str, dVar);
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void q1() {
        if (!G().isEmpty()) {
            v vVar = new v();
            if (this.e.a()) {
                vVar.invoke();
            } else {
                notify(com.amazon.aps.iva.sv.d0.h);
            }
        }
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void q7(String str, com.amazon.aps.iva.xb0.l<? super Stream, com.amazon.aps.iva.kb0.q> lVar, com.amazon.aps.iva.xb0.p<? super PlayableAsset, ? super Throwable, com.amazon.aps.iva.kb0.q> pVar) {
        com.amazon.aps.iva.yb0.j.f(str, "downloadId");
        com.amazon.aps.iva.se0.i.d(this.n, this.o.a(), null, new l(str, lVar, pVar, null), 2);
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void r() {
        this.c.a();
        this.d.a();
        this.l.t2(new n());
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void removeEventListener(g0 g0Var) {
        g0 g0Var2 = g0Var;
        com.amazon.aps.iva.yb0.j.f(g0Var2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.l.removeEventListener(g0Var2);
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void s4(PlayableAsset playableAsset, String str, r.a aVar) {
        com.amazon.aps.iva.yb0.j.f(playableAsset, "asset");
        com.amazon.aps.iva.yb0.j.f(str, "audioLocale");
        for (PlayableAssetVersion playableAssetVersion : playableAsset.getVersions()) {
            if (com.amazon.aps.iva.yb0.j.a(playableAssetVersion.getAudioLocale(), str)) {
                com.amazon.aps.iva.se0.i.d(this.n, this.o.a(), null, new i1(playableAsset, this, playableAssetVersion, aVar, null), 2);
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void s7(PlayableAsset playableAsset, v.a aVar) {
        com.amazon.aps.iva.yb0.j.f(playableAsset, "asset");
        n1 n1Var = new n1(this, playableAsset, aVar);
        if (this.e.a()) {
            n1Var.invoke();
        } else {
            notify(com.amazon.aps.iva.sv.e0.h);
        }
    }

    @Override // com.amazon.aps.iva.sv.z1
    public final Object t(com.amazon.aps.iva.qb0.c cVar) {
        return this.b.t(cVar);
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void t8(String str, String str2, com.amazon.aps.iva.b10.r rVar) {
        com.amazon.aps.iva.yb0.j.f(str, "containerId");
        com.amazon.aps.iva.yb0.j.f(str2, "seasonId");
        this.l.W6(new n0(this, str, str2, rVar));
    }

    @Override // com.amazon.aps.iva.sv.z1
    public final Object u(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return this.b.u(dVar);
    }

    @Override // com.amazon.aps.iva.sv.z1
    public final Object v(String str, com.amazon.aps.iva.ob0.d<? super List<? extends PlayableAsset>> dVar) {
        return this.b.v(str, dVar);
    }

    public final void z(String str) {
        notify(new m(str));
    }
}

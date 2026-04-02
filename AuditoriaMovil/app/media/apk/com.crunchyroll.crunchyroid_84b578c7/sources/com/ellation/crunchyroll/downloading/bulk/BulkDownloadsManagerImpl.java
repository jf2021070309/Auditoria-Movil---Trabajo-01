package com.ellation.crunchyroll.downloading.bulk;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.l40.a1;
import com.amazon.aps.iva.lb0.t;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.c2;
import com.amazon.aps.iva.sv.a0;
import com.amazon.aps.iva.sv.f2;
import com.amazon.aps.iva.sv.n;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.downloading.InternalDownloadsManager;
import com.ellation.crunchyroll.downloading.e0;
import com.ellation.crunchyroll.downloading.g0;
import com.ellation.crunchyroll.eventdispatcher.EventDispatcher;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BulkDownloadsManager.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002:\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/ellation/crunchyroll/downloading/bulk/BulkDownloadsManagerImpl;", "Lcom/ellation/crunchyroll/downloading/bulk/BulkDownloadsManager;", "Lcom/ellation/crunchyroll/eventdispatcher/EventDispatcher;", "Lcom/amazon/aps/iva/sv/f2;", "Lcom/amazon/aps/iva/vv/a;", "a", "b", "downloading_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class BulkDownloadsManagerImpl implements BulkDownloadsManager, EventDispatcher<f2<com.amazon.aps.iva.vv.a>> {
    public final InternalDownloadsManager b;
    public final com.amazon.aps.iva.gg.a c;
    public final com.amazon.aps.iva.wu.a d;
    public final com.amazon.aps.iva.vv.b e;
    public final EventDispatcher<f2<com.amazon.aps.iva.vv.a>> f;
    public final b g;

    /* compiled from: BulkDownloadsManager.kt */
    /* loaded from: classes2.dex */
    public final class a implements com.amazon.aps.iva.vv.a {
        public com.amazon.aps.iva.hg.c b;
        public final com.amazon.aps.iva.hg.g c;
        public final l<com.amazon.aps.iva.hg.c, q> d;
        public c2 e;

        public a(com.amazon.aps.iva.hg.c cVar, com.amazon.aps.iva.hg.g gVar, a1 a1Var) {
            this.b = cVar;
            this.c = gVar;
            this.d = a1Var;
        }

        @Override // com.ellation.crunchyroll.downloading.g0
        public final void A0(e0 e0Var) {
            j.f(e0Var, "localVideo");
        }

        @Override // com.amazon.aps.iva.vv.a
        public final l<com.amazon.aps.iva.hg.c, q> F0() {
            return this.d;
        }

        @Override // com.ellation.crunchyroll.downloading.g0
        public final void J3(com.amazon.aps.iva.nw.g gVar) {
        }

        @Override // com.ellation.crunchyroll.downloading.g0
        public final void J7(e0 e0Var) {
            j.f(e0Var, "localVideo");
        }

        @Override // com.ellation.crunchyroll.downloading.g0
        public final void L0() {
        }

        @Override // com.ellation.crunchyroll.downloading.g0
        public final void M3(List<? extends e0> list) {
            j.f(list, "localVideos");
        }

        @Override // com.ellation.crunchyroll.downloading.g0
        public final void P5(String str) {
            j.f(str, "downloadId");
        }

        @Override // com.ellation.crunchyroll.downloading.g0
        public final void T3() {
        }

        @Override // com.ellation.crunchyroll.downloading.g0
        public final void V4(List<? extends PlayableAsset> list) {
            j.f(list, "playableAssets");
        }

        @Override // com.ellation.crunchyroll.downloading.g0
        public final void c3(String str) {
            j.f(str, "downloadId");
        }

        @Override // com.ellation.crunchyroll.downloading.g0
        public final void f7(e0 e0Var) {
            j.f(e0Var, "localVideo");
        }

        @Override // com.ellation.crunchyroll.downloading.g0
        public final void s3(e0 e0Var) {
            j.f(e0Var, "localVideo");
        }

        @Override // com.ellation.crunchyroll.downloading.g0
        public final void s8(e0 e0Var) {
            j.f(e0Var, "localVideo");
        }

        @Override // com.ellation.crunchyroll.downloading.g0
        public final void t3() {
        }

        @Override // com.ellation.crunchyroll.downloading.g0
        public final void u7(e0 e0Var) {
            j.f(e0Var, "localVideo");
        }

        @Override // com.ellation.crunchyroll.downloading.g0
        public final void v5(ArrayList arrayList) {
        }

        @Override // com.ellation.crunchyroll.downloading.g0
        public final void x6(String str) {
            j.f(str, "downloadId");
        }

        @Override // com.ellation.crunchyroll.downloading.g0
        public final void y7(List<? extends e0> list) {
            j.f(list, "localVideos");
        }

        @Override // com.ellation.crunchyroll.downloading.g0
        public final void z1(List<? extends PlayableAsset> list) {
            j.f(list, "playableAssets");
        }

        @Override // com.ellation.crunchyroll.downloading.g0
        public final void z3(e0 e0Var, Throwable th) {
            j.f(e0Var, "localVideo");
            j.f(th, "throwable");
            g0.a.a(e0Var, th);
        }
    }

    /* compiled from: BulkDownloadsManager.kt */
    /* loaded from: classes2.dex */
    public static final class b {
        public final ArrayList a = new ArrayList();

        public final void a(com.amazon.aps.iva.hg.a aVar) {
            j.f(aVar, "data");
            t.h0(this.a, new com.ellation.crunchyroll.downloading.bulk.b(aVar));
        }
    }

    /* compiled from: BulkDownloadsManager.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.bulk.BulkDownloadsManagerImpl", f = "BulkDownloadsManager.kt", l = {187}, m = "checkBulkDownloadStatus")
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.qb0.c {
        public Object h;
        public com.amazon.aps.iva.hg.g i;
        public List j;
        public /* synthetic */ Object k;
        public int m;

        public c(com.amazon.aps.iva.ob0.d<? super c> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.k = obj;
            this.m |= Integer.MIN_VALUE;
            return BulkDownloadsManagerImpl.this.m0(null, this);
        }
    }

    /* compiled from: BulkDownloadsManager.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements l<e0, Boolean> {
        public static final d h = new d();

        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(e0 e0Var) {
            e0 e0Var2 = e0Var;
            j.f(e0Var2, "it");
            return Boolean.valueOf(e0Var2.j());
        }
    }

    /* compiled from: BulkDownloadsManager.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements l<e0, Boolean> {
        public static final e h = new e();

        public e() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(e0 e0Var) {
            e0 e0Var2 = e0Var;
            j.f(e0Var2, "it");
            return Boolean.valueOf(e0Var2.k());
        }
    }

    /* compiled from: BulkDownloadsManager.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.bulk.BulkDownloadsManagerImpl$removeRelatedDubs$1", f = "BulkDownloadsManager.kt", l = {300, 304}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends i implements p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public Object h;
        public int i;
        public final /* synthetic */ com.amazon.aps.iva.hg.g k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.amazon.aps.iva.hg.g gVar, com.amazon.aps.iva.ob0.d<? super f> dVar) {
            super(2, dVar);
            this.k = gVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new f(this.k, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((f) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.i;
            com.amazon.aps.iva.hg.g gVar = this.k;
            BulkDownloadsManagerImpl bulkDownloadsManagerImpl = BulkDownloadsManagerImpl.this;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        bulkDownloadsManagerImpl = (BulkDownloadsManagerImpl) this.h;
                        x.i0(obj);
                        com.amazon.aps.iva.hg.c cVar = ((com.amazon.aps.iva.hg.f) obj).b;
                        bulkDownloadsManagerImpl.getClass();
                        bulkDownloadsManagerImpl.notify(new com.amazon.aps.iva.vv.i(cVar));
                        return q.a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.i0(obj);
            } else {
                x.i0(obj);
                b bVar = bulkDownloadsManagerImpl.g;
                bVar.getClass();
                t.e0(bVar.a, new com.amazon.aps.iva.hg.a[]{gVar});
                bulkDownloadsManagerImpl.notify(com.amazon.aps.iva.vv.j.h);
                String[] strArr = (String[]) w.z(gVar.d).toArray(new String[0]);
                InternalDownloadsManager internalDownloadsManager = bulkDownloadsManagerImpl.b;
                internalDownloadsManager.A2((String[]) Arrays.copyOf(strArr, strArr.length));
                this.i = 1;
                if (internalDownloadsManager.R3((String[]) Arrays.copyOf(strArr, strArr.length), this) == aVar) {
                    return aVar;
                }
            }
            bulkDownloadsManagerImpl.g.a(gVar);
            this.h = bulkDownloadsManagerImpl;
            this.i = 2;
            obj = bulkDownloadsManagerImpl.m0(gVar, this);
            if (obj == aVar) {
                return aVar;
            }
            com.amazon.aps.iva.hg.c cVar2 = ((com.amazon.aps.iva.hg.f) obj).b;
            bulkDownloadsManagerImpl.getClass();
            bulkDownloadsManagerImpl.notify(new com.amazon.aps.iva.vv.i(cVar2));
            return q.a;
        }
    }

    /* compiled from: BulkDownloadsManager.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.bulk.BulkDownloadsManagerImpl$stopRelatedDubs$1", f = "BulkDownloadsManager.kt", l = {310, 317, 320}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends i implements p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public Object h;
        public int i;
        public final /* synthetic */ com.amazon.aps.iva.hg.g k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.amazon.aps.iva.hg.g gVar, com.amazon.aps.iva.ob0.d<? super g> dVar) {
            super(2, dVar);
            this.k = gVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new g(this.k, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((g) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00da A[RETURN] */
        @Override // com.amazon.aps.iva.qb0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                int r1 = r9.i
                r2 = 3
                r3 = 2
                r4 = 1
                com.amazon.aps.iva.hg.g r5 = r9.k
                com.ellation.crunchyroll.downloading.bulk.BulkDownloadsManagerImpl r6 = com.ellation.crunchyroll.downloading.bulk.BulkDownloadsManagerImpl.this
                if (r1 == 0) goto L2e
                if (r1 == r4) goto L2a
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r0 = r9.h
                r6 = r0
                com.ellation.crunchyroll.downloading.bulk.BulkDownloadsManagerImpl r6 = (com.ellation.crunchyroll.downloading.bulk.BulkDownloadsManagerImpl) r6
                com.amazon.aps.iva.ab.x.i0(r10)
                goto Ldb
            L1d:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L25:
                com.amazon.aps.iva.ab.x.i0(r10)
                goto Lcb
            L2a:
                com.amazon.aps.iva.ab.x.i0(r10)
                goto L42
            L2e:
                com.amazon.aps.iva.ab.x.i0(r10)
                com.ellation.crunchyroll.downloading.InternalDownloadsManager r10 = r6.b
                java.util.List<com.ellation.crunchyroll.model.PlayableAsset> r1 = r5.d
                java.util.List r1 = com.amazon.aps.iva.e.w.z(r1)
                r9.i = r4
                java.lang.Object r10 = r10.d3(r1, r9)
                if (r10 != r0) goto L42
                return r0
            L42:
                java.lang.Iterable r10 = (java.lang.Iterable) r10
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r10 = r10.iterator()
            L4d:
                boolean r7 = r10.hasNext()
                if (r7 == 0) goto L64
                java.lang.Object r7 = r10.next()
                r8 = r7
                com.ellation.crunchyroll.downloading.e0 r8 = (com.ellation.crunchyroll.downloading.e0) r8
                boolean r8 = r8.i()
                if (r8 != 0) goto L4d
                r1.add(r7)
                goto L4d
            L64:
                java.util.ArrayList r10 = new java.util.ArrayList
                int r7 = com.amazon.aps.iva.lb0.r.Y(r1)
                r10.<init>(r7)
                java.util.Iterator r1 = r1.iterator()
            L71:
                boolean r7 = r1.hasNext()
                if (r7 == 0) goto L85
                java.lang.Object r7 = r1.next()
                com.ellation.crunchyroll.downloading.e0 r7 = (com.ellation.crunchyroll.downloading.e0) r7
                java.lang.String r7 = r7.e()
                r10.add(r7)
                goto L71
            L85:
                java.util.Set r10 = com.amazon.aps.iva.lb0.x.c1(r10)
                com.ellation.crunchyroll.downloading.bulk.BulkDownloadsManagerImpl$b r1 = r6.g
                com.amazon.aps.iva.hg.a[] r4 = new com.amazon.aps.iva.hg.a[r4]
                r7 = 0
                r4[r7] = r5
                r1.getClass()
                java.util.ArrayList r1 = r1.a
                com.amazon.aps.iva.lb0.t.e0(r1, r4)
                com.amazon.aps.iva.vv.j r1 = com.amazon.aps.iva.vv.j.h
                r6.notify(r1)
                java.util.Collection r10 = (java.util.Collection) r10
                java.lang.String[] r1 = new java.lang.String[r7]
                java.lang.Object[] r1 = r10.toArray(r1)
                java.lang.String[] r1 = (java.lang.String[]) r1
                int r4 = r1.length
                java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r4)
                java.lang.String[] r1 = (java.lang.String[]) r1
                com.ellation.crunchyroll.downloading.InternalDownloadsManager r4 = r6.b
                r4.A2(r1)
                java.lang.String[] r1 = new java.lang.String[r7]
                java.lang.Object[] r10 = r10.toArray(r1)
                java.lang.String[] r10 = (java.lang.String[]) r10
                int r1 = r10.length
                java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r1)
                java.lang.String[] r10 = (java.lang.String[]) r10
                r9.i = r3
                java.lang.Object r10 = r4.R3(r10, r9)
                if (r10 != r0) goto Lcb
                return r0
            Lcb:
                com.ellation.crunchyroll.downloading.bulk.BulkDownloadsManagerImpl$b r10 = r6.g
                r10.a(r5)
                r9.h = r6
                r9.i = r2
                java.lang.Object r10 = r6.m0(r5, r9)
                if (r10 != r0) goto Ldb
                return r0
            Ldb:
                com.amazon.aps.iva.hg.f r10 = (com.amazon.aps.iva.hg.f) r10
                com.amazon.aps.iva.hg.c r10 = r10.b
                r6.getClass()
                com.amazon.aps.iva.vv.i r0 = new com.amazon.aps.iva.vv.i
                r0.<init>(r10)
                r6.notify(r0)
                com.amazon.aps.iva.kb0.q r10 = com.amazon.aps.iva.kb0.q.a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.downloading.bulk.BulkDownloadsManagerImpl.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public BulkDownloadsManagerImpl() {
        throw null;
    }

    public BulkDownloadsManagerImpl(InternalDownloadsManager internalDownloadsManager, com.amazon.aps.iva.uv.d dVar, com.amazon.aps.iva.vv.c cVar) {
        com.amazon.aps.iva.wu.b bVar = com.amazon.aps.iva.wu.b.a;
        EventDispatcher.EventDispatcherImpl eventDispatcherImpl = new EventDispatcher.EventDispatcherImpl();
        this.b = internalDownloadsManager;
        this.c = dVar;
        this.d = bVar;
        this.e = cVar;
        this.f = eventDispatcherImpl;
        this.g = new b();
    }

    @Override // com.ellation.crunchyroll.downloading.bulk.BulkDownloadsManager
    public final void G8(ArrayList arrayList) {
        com.amazon.aps.iva.se0.i.d(this.e, this.d.b(), null, new com.ellation.crunchyroll.downloading.bulk.d(this, arrayList, null), 2);
    }

    @Override // com.ellation.crunchyroll.downloading.bulk.BulkDownloadsManager
    public final void K0(com.amazon.aps.iva.hg.g gVar) {
        j.f(gVar, "input");
        com.amazon.aps.iva.se0.i.d(this.e, this.d.b(), null, new f(gVar, null), 2);
    }

    @Override // com.ellation.crunchyroll.downloading.bulk.BulkDownloadsManager
    public final f2 N3(com.amazon.aps.iva.hg.c cVar, com.amazon.aps.iva.hg.g gVar, a1 a1Var) {
        a aVar = new a(cVar, gVar, a1Var);
        return new f2(new com.amazon.aps.iva.vv.d(gVar), aVar, new com.ellation.crunchyroll.downloading.bulk.c(aVar));
    }

    public final com.amazon.aps.iva.hg.g a(com.amazon.aps.iva.hg.g gVar) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : gVar.d) {
            if (this.c.c((PlayableAsset) obj)) {
                arrayList.add(obj);
            }
        }
        return com.amazon.aps.iva.hg.g.a(gVar, arrayList, null, 11);
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void addEventListener(f2<com.amazon.aps.iva.vv.a> f2Var) {
        f2<com.amazon.aps.iva.vv.a> f2Var2 = f2Var;
        j.f(f2Var2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.b.addEventListener(f2Var2);
        this.f.addEventListener(f2Var2);
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void clear() {
        this.f.clear();
    }

    @Override // com.ellation.crunchyroll.downloading.bulk.BulkDownloadsManager
    public final void g2(com.amazon.aps.iva.hg.g gVar, a0.a aVar) {
        j.f(gVar, "input");
        com.amazon.aps.iva.se0.i.d(this.e, this.d.b(), null, new com.ellation.crunchyroll.downloading.bulk.f(this, gVar, true, aVar, null), 2);
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final int getListenerCount() {
        return this.f.getListenerCount();
    }

    @Override // com.ellation.crunchyroll.downloading.bulk.BulkDownloadsManager
    public final void l2(com.amazon.aps.iva.hg.g gVar, String str, com.amazon.aps.iva.sv.t tVar) {
        j.f(gVar, "input");
        j.f(str, "newAudioLocale");
        com.amazon.aps.iva.se0.i.d(this.e, this.d.b(), null, new com.ellation.crunchyroll.downloading.bulk.e(this, gVar, str, tVar, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x021b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:375:0x02d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:377:0x029e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:385:0x038a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0412 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01bd  */
    @Override // com.ellation.crunchyroll.downloading.bulk.BulkDownloadsManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m0(com.amazon.aps.iva.hg.g r19, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.hg.f> r20) {
        /*
            Method dump skipped, instructions count: 1383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.downloading.bulk.BulkDownloadsManagerImpl.m0(com.amazon.aps.iva.hg.g, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void notify(l<? super f2<com.amazon.aps.iva.vv.a>, q> lVar) {
        j.f(lVar, "action");
        this.f.notify(lVar);
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void removeEventListener(f2<com.amazon.aps.iva.vv.a> f2Var) {
        f2<com.amazon.aps.iva.vv.a> f2Var2 = f2Var;
        j.f(f2Var2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.b.removeEventListener(f2Var2);
        this.f.removeEventListener(f2Var2);
    }

    @Override // com.ellation.crunchyroll.downloading.bulk.BulkDownloadsManager
    public final void w2(com.amazon.aps.iva.hg.g gVar, n.h.a aVar) {
        j.f(gVar, "input");
        com.amazon.aps.iva.se0.i.d(this.e, this.d.b(), null, new com.ellation.crunchyroll.downloading.bulk.f(this, gVar, false, aVar, null), 2);
    }

    @Override // com.ellation.crunchyroll.downloading.bulk.BulkDownloadsManager
    public final void y(com.amazon.aps.iva.hg.g gVar) {
        j.f(gVar, "input");
        com.amazon.aps.iva.se0.i.d(this.e, this.d.b(), null, new g(gVar, null), 2);
    }
}

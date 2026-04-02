package com.amazon.aps.iva.sw;

import com.amazon.aps.iva.ab.t;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.d2;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.se0.m0;
import com.amazon.aps.iva.sw.e;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.xb0.p;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;
/* compiled from: ToDownloadInteractor.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.todownload.ToDownloadInteractorImpl$prepareDataToDownload$2", f = "ToDownloadInteractor.kt", l = {94}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class g extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public int h;
    public final /* synthetic */ l<List<com.amazon.aps.iva.xg.a>, q> i;
    public final /* synthetic */ List<com.amazon.aps.iva.xg.a> j;
    public final /* synthetic */ e k;
    public final /* synthetic */ List<com.amazon.aps.iva.xg.a> l;
    public final /* synthetic */ p<com.amazon.aps.iva.xg.a, Throwable, q> m;
    public final /* synthetic */ l<com.amazon.aps.iva.xg.a, q> n;
    public final /* synthetic */ l<com.amazon.aps.iva.xg.a, q> o;
    public final /* synthetic */ l<com.amazon.aps.iva.xg.a, q> p;
    public final /* synthetic */ p<b, com.amazon.aps.iva.ob0.d<? super q>, Object> q;

    /* compiled from: ToDownloadInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.todownload.ToDownloadInteractorImpl$prepareDataToDownload$2$1", f = "ToDownloadInteractor.kt", l = {96, 124, WebSocketProtocol.PAYLOAD_SHORT}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public p h;
        public Iterator i;
        public m0 j;
        public int k;
        public /* synthetic */ Object l;
        public final /* synthetic */ l<List<com.amazon.aps.iva.xg.a>, q> m;
        public final /* synthetic */ List<com.amazon.aps.iva.xg.a> n;
        public final /* synthetic */ e o;
        public final /* synthetic */ List<com.amazon.aps.iva.xg.a> p;
        public final /* synthetic */ p<com.amazon.aps.iva.xg.a, Throwable, q> q;
        public final /* synthetic */ l<com.amazon.aps.iva.xg.a, q> r;
        public final /* synthetic */ l<com.amazon.aps.iva.xg.a, q> s;
        public final /* synthetic */ l<com.amazon.aps.iva.xg.a, q> t;
        public final /* synthetic */ p<com.amazon.aps.iva.sw.b, com.amazon.aps.iva.ob0.d<? super q>, Object> u;

        /* compiled from: ToDownloadInteractor.kt */
        @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.todownload.ToDownloadInteractorImpl$prepareDataToDownload$2$1$1$1", f = "ToDownloadInteractor.kt", l = {99}, m = "invokeSuspend")
        /* renamed from: com.amazon.aps.iva.sw.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0719a extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.sw.b>, Object> {
            public int h;
            public final /* synthetic */ e i;
            public final /* synthetic */ com.amazon.aps.iva.xg.a j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0719a(com.amazon.aps.iva.xg.a aVar, e eVar, com.amazon.aps.iva.ob0.d dVar) {
                super(2, dVar);
                this.i = eVar;
                this.j = aVar;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                return new C0719a(this.j, this.i, dVar);
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.sw.b> dVar) {
                return ((C0719a) create(g0Var, dVar)).invokeSuspend(q.a);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                int i = this.h;
                if (i != 0) {
                    if (i == 1) {
                        x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    x.i0(obj);
                    this.h = 1;
                    e eVar = this.i;
                    eVar.getClass();
                    obj = z.p(new h(this.j, eVar, null), this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        /* compiled from: ToDownloadInteractor.kt */
        /* loaded from: classes2.dex */
        public static final class b extends com.amazon.aps.iva.yb0.l implements l<Throwable, q> {
            public final /* synthetic */ p<com.amazon.aps.iva.xg.a, Throwable, q> h;
            public final /* synthetic */ com.amazon.aps.iva.xg.a i;
            public final /* synthetic */ l<com.amazon.aps.iva.xg.a, q> j;
            public final /* synthetic */ l<com.amazon.aps.iva.xg.a, q> k;
            public final /* synthetic */ l<com.amazon.aps.iva.xg.a, q> l;
            public final /* synthetic */ e m;
            public final /* synthetic */ List<com.amazon.aps.iva.xg.a> n;
            public final /* synthetic */ List<com.amazon.aps.iva.xg.a> o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(p<? super com.amazon.aps.iva.xg.a, ? super Throwable, q> pVar, com.amazon.aps.iva.xg.a aVar, l<? super com.amazon.aps.iva.xg.a, q> lVar, l<? super com.amazon.aps.iva.xg.a, q> lVar2, l<? super com.amazon.aps.iva.xg.a, q> lVar3, e eVar, List<com.amazon.aps.iva.xg.a> list, List<com.amazon.aps.iva.xg.a> list2) {
                super(1);
                this.h = pVar;
                this.i = aVar;
                this.j = lVar;
                this.k = lVar2;
                this.l = lVar3;
                this.m = eVar;
                this.n = list;
                this.o = list2;
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final q invoke(Throwable th) {
                Throwable th2;
                Throwable th3 = th;
                boolean z = th3 instanceof IOException;
                p<com.amazon.aps.iva.xg.a, Throwable, q> pVar = this.h;
                com.amazon.aps.iva.xg.a aVar = this.i;
                if (z) {
                    pVar.invoke(aVar, th3);
                } else {
                    if (th3 != null) {
                        th2 = th3.getCause();
                    } else {
                        th2 = null;
                    }
                    if (th2 instanceof IOException) {
                        Throwable cause = th3.getCause();
                        com.amazon.aps.iva.yb0.j.c(cause);
                        pVar.invoke(aVar, cause);
                    } else if (th3 instanceof e.c) {
                        this.j.invoke(aVar);
                    } else if (th3 instanceof e.b) {
                        this.k.invoke(aVar);
                    } else if (th3 instanceof e.a) {
                        this.l.invoke(aVar);
                    }
                }
                e eVar = this.m;
                e.d dVar = eVar.l;
                dVar.getClass();
                com.amazon.aps.iva.yb0.j.f(aVar, "input");
                dVar.a.remove(aVar);
                com.amazon.aps.iva.xg.a[] aVarArr = (com.amazon.aps.iva.xg.a[]) this.n.toArray(new com.amazon.aps.iva.xg.a[0]);
                if (!eVar.l.b((com.amazon.aps.iva.xg.a[]) Arrays.copyOf(aVarArr, aVarArr.length))) {
                    com.amazon.aps.iva.xg.a[] aVarArr2 = (com.amazon.aps.iva.xg.a[]) this.o.toArray(new com.amazon.aps.iva.xg.a[0]);
                    com.amazon.aps.iva.xg.a[] aVarArr3 = (com.amazon.aps.iva.xg.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length);
                    c cVar = eVar.k;
                    cVar.getClass();
                    com.amazon.aps.iva.yb0.j.f(aVarArr3, "input");
                    for (com.amazon.aps.iva.xg.a aVar2 : aVarArr3) {
                        cVar.a(aVar2.b, aVar2.d);
                    }
                }
                return q.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super List<com.amazon.aps.iva.xg.a>, q> lVar, List<com.amazon.aps.iva.xg.a> list, e eVar, List<com.amazon.aps.iva.xg.a> list2, p<? super com.amazon.aps.iva.xg.a, ? super Throwable, q> pVar, l<? super com.amazon.aps.iva.xg.a, q> lVar2, l<? super com.amazon.aps.iva.xg.a, q> lVar3, l<? super com.amazon.aps.iva.xg.a, q> lVar4, p<? super com.amazon.aps.iva.sw.b, ? super com.amazon.aps.iva.ob0.d<? super q>, ? extends Object> pVar2, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.m = lVar;
            this.n = list;
            this.o = eVar;
            this.p = list2;
            this.q = pVar;
            this.r = lVar2;
            this.s = lVar3;
            this.t = lVar4;
            this.u = pVar2;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            a aVar = new a(this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, dVar);
            aVar.l = obj;
            return aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x012d  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0130  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0134  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0137  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x014d  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0158  */
        /* JADX WARN: Type inference failed for: r15v0 */
        /* JADX WARN: Type inference failed for: r15v1, types: [com.amazon.aps.iva.ob0.g, com.amazon.aps.iva.ob0.d] */
        /* JADX WARN: Type inference failed for: r15v4 */
        /* JADX WARN: Type inference failed for: r4v13, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r5v11, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x014e -> B:42:0x0153). Please submit an issue!!! */
        @Override // com.amazon.aps.iva.qb0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                Method dump skipped, instructions count: 347
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.sw.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(l<? super List<com.amazon.aps.iva.xg.a>, q> lVar, List<com.amazon.aps.iva.xg.a> list, e eVar, List<com.amazon.aps.iva.xg.a> list2, p<? super com.amazon.aps.iva.xg.a, ? super Throwable, q> pVar, l<? super com.amazon.aps.iva.xg.a, q> lVar2, l<? super com.amazon.aps.iva.xg.a, q> lVar3, l<? super com.amazon.aps.iva.xg.a, q> lVar4, p<? super b, ? super com.amazon.aps.iva.ob0.d<? super q>, ? extends Object> pVar2, com.amazon.aps.iva.ob0.d<? super g> dVar) {
        super(2, dVar);
        this.i = lVar;
        this.j = list;
        this.k = eVar;
        this.l = list2;
        this.m = pVar;
        this.n = lVar2;
        this.o = lVar3;
        this.p = lVar4;
        this.q = pVar2;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new g(this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((g) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        if (i != 0) {
            if (i == 1) {
                x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            x.i0(obj);
            a aVar2 = new a(this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, null);
            this.h = 1;
            d2 d2Var = new d2(getContext(), this, 0);
            if (t.u(d2Var, d2Var, aVar2) == aVar) {
                return aVar;
            }
        }
        return q.a;
    }
}

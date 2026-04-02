package com.amazon.aps.iva.rw;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.u;
import com.amazon.aps.iva.nw.g;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.sv.u1;
import com.amazon.aps.iva.sv.v1;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.downloading.e0;
import com.ellation.crunchyroll.downloading.g0;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: SyncQualityListener.kt */
/* loaded from: classes2.dex */
public final class a implements g0 {
    public final u1 b;
    public final com.amazon.aps.iva.wg.a c;
    public final com.amazon.aps.iva.sv.c d;
    public final com.amazon.aps.iva.wu.a e;

    /* compiled from: SyncQualityListener.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.syncquality.SyncQualityListener$onDownloadsStart$1", f = "SyncQualityListener.kt", l = {21}, m = "invokeSuspend")
    /* renamed from: com.amazon.aps.iva.rw.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0685a extends i implements p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public a h;
        public Iterator i;
        public int j;
        public final /* synthetic */ List<e0> k;
        public final /* synthetic */ a l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0685a(List<? extends e0> list, a aVar, com.amazon.aps.iva.ob0.d<? super C0685a> dVar) {
            super(2, dVar);
            this.k = list;
            this.l = aVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new C0685a(this.k, this.l, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((C0685a) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            a aVar;
            com.amazon.aps.iva.pb0.a aVar2 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.j;
            if (i != 0) {
                if (i == 1) {
                    it = this.i;
                    aVar = this.h;
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                it = u.j0(this.k, e0.c.class).iterator();
                aVar = this.l;
            }
            while (it.hasNext()) {
                u1 u1Var = aVar.b;
                String str = ((e0.c) it.next()).a;
                com.amazon.aps.iva.wg.b J = aVar.c.J();
                this.h = aVar;
                this.i = it;
                this.j = 1;
                if (u1Var.e(str, J, this) == aVar2) {
                    return aVar2;
                }
            }
            return q.a;
        }
    }

    public a(v1 v1Var, e eVar, com.amazon.aps.iva.sv.d dVar) {
        com.amazon.aps.iva.wu.b bVar = com.amazon.aps.iva.wu.b.a;
        this.b = v1Var;
        this.c = eVar;
        this.d = dVar;
        this.e = bVar;
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void A0(e0 e0Var) {
        j.f(e0Var, "localVideo");
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void J3(g gVar) {
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
        com.amazon.aps.iva.se0.i.d(this.d, this.e.a(), null, new C0685a(list, this, null), 2);
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
        g0.a.a(e0Var, th);
    }
}

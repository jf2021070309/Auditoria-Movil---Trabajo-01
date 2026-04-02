package com.amazon.aps.iva.vt;

import android.content.res.Configuration;
import android.view.View;
import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.m70.a;
import com.amazon.aps.iva.vt.g;
import com.amazon.aps.iva.vt.q;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.util.ArrayList;
import java.util.List;
/* compiled from: CommentsPresenter.kt */
/* loaded from: classes2.dex */
public final class l extends com.amazon.aps.iva.wy.b<r> implements com.amazon.aps.iva.vt.k {
    public final String b;
    public final LiveData<PlayableAsset> c;
    public final s d;
    public final com.amazon.aps.iva.nu.g e;
    public final com.amazon.aps.iva.iu.a f;
    public final com.amazon.aps.iva.xt.b g;

    /* compiled from: CommentsPresenter.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public a(com.amazon.aps.iva.wy.h hVar) {
            super(0, hVar, r.class, "close", "close()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            ((r) this.receiver).close();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CommentsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<View, com.amazon.aps.iva.kb0.q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(View view) {
            com.amazon.aps.iva.yb0.j.f(view, "it");
            q.b bVar = q.b.e;
            l lVar = l.this;
            lVar.d.K6(bVar);
            lVar.Y5();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CommentsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<View, com.amazon.aps.iva.kb0.q> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(View view) {
            com.amazon.aps.iva.yb0.j.f(view, "it");
            q.a aVar = q.a.e;
            l lVar = l.this;
            lVar.d.K6(aVar);
            lVar.Y5();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CommentsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.du.x i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.amazon.aps.iva.du.x xVar) {
            super(0);
            this.i = xVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            l.q6(l.this).yb(this.i, false);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CommentsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.du.x i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.amazon.aps.iva.du.x xVar) {
            super(0);
            this.i = xVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            l.q6(l.this).yb(this.i, true);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CommentsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.vt.g, com.amazon.aps.iva.kb0.q> {
        public f() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.vt.g gVar) {
            com.amazon.aps.iva.vt.g gVar2 = gVar;
            boolean z = gVar2 instanceof g.e;
            l lVar = l.this;
            if (z) {
                l.r6(lVar);
            } else if (gVar2 instanceof g.d) {
                l.q6(lVar).Y();
            } else if (gVar2 instanceof g.a) {
                l.q6(lVar).e1(new m(lVar));
                lVar.g.a(((g.a) gVar2).a);
            } else if (gVar2 instanceof g.b) {
                l.q6(lVar).J0(((g.b) gVar2).a);
            } else if (gVar2 instanceof g.c) {
                l.q6(lVar).o2();
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CommentsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.j8.h<com.amazon.aps.iva.du.x>>, com.amazon.aps.iva.kb0.q> {
        public g() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.j8.h<com.amazon.aps.iva.du.x>> gVar) {
            com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.j8.h<com.amazon.aps.iva.du.x>> gVar2 = gVar;
            l lVar = l.this;
            gVar2.c(new n(lVar));
            gVar2.e(new o(lVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CommentsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends Integer>, com.amazon.aps.iva.kb0.q> {
        public h() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends Integer> gVar) {
            com.amazon.aps.iva.ez.g<? extends Integer> gVar2 = gVar;
            l lVar = l.this;
            r q6 = l.q6(lVar);
            com.amazon.aps.iva.yb0.j.e(gVar2, "it");
            q6.n2(gVar2);
            gVar2.e(new p(lVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CommentsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<PlayableAsset, com.amazon.aps.iva.kb0.q> {
        public i() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(PlayableAsset playableAsset) {
            String id = playableAsset.getId();
            l lVar = l.this;
            if (!com.amazon.aps.iva.yb0.j.a(id, lVar.b)) {
                l.q6(lVar).close();
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CommentsPresenter.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class j extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public j(com.amazon.aps.iva.wy.h hVar) {
            super(0, hVar, r.class, "showPostCommentDialog", "showPostCommentDialog()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            ((r) this.receiver).P1();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CommentsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class k implements com.amazon.aps.iva.i5.w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public k(com.amazon.aps.iva.xb0.l lVar) {
            this.a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof com.amazon.aps.iva.i5.w) || !(obj instanceof com.amazon.aps.iva.yb0.f)) {
                return false;
            }
            return com.amazon.aps.iva.yb0.j.a(this.a, ((com.amazon.aps.iva.yb0.f) obj).getFunctionDelegate());
        }

        @Override // com.amazon.aps.iva.yb0.f
        public final com.amazon.aps.iva.kb0.a<?> getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // com.amazon.aps.iva.i5.w
        public final /* synthetic */ void onChanged(Object obj) {
            this.a.invoke(obj);
        }
    }

    public l(com.amazon.aps.iva.vt.b bVar, String str, LiveData liveData, x xVar, com.amazon.aps.iva.nu.i iVar, com.amazon.aps.iva.iu.a aVar, com.amazon.aps.iva.xt.c cVar) {
        super(bVar, new com.amazon.aps.iva.wy.j[0]);
        this.b = str;
        this.c = liveData;
        this.d = xVar;
        this.e = iVar;
        this.f = aVar;
        this.g = cVar;
    }

    public static final /* synthetic */ r q6(l lVar) {
        return lVar.getView();
    }

    public static final void r6(l lVar) {
        if (lVar.getView().j1() instanceof a.c) {
            lVar.getView().V();
        }
    }

    @Override // com.amazon.aps.iva.du.f
    public final void M0(com.amazon.aps.iva.du.a aVar, com.amazon.aps.iva.du.x xVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "action");
    }

    @Override // com.amazon.aps.iva.du.f
    public final void O0(com.amazon.aps.iva.du.x xVar) {
        getView().s0().Oa(new e(xVar));
    }

    @Override // com.amazon.aps.iva.vt.k
    public final void Y5() {
        List K = f1.K(new com.amazon.aps.iva.n70.b(q.b.e, new b()), new com.amazon.aps.iva.n70.b(q.a.e, new c()));
        r view = getView();
        List<com.amazon.aps.iva.n70.b> list = K;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list));
        for (com.amazon.aps.iva.n70.b bVar : list) {
            arrayList.add(bVar.a);
        }
        view.a4(arrayList.indexOf(this.d.n7()), K);
    }

    @Override // com.amazon.aps.iva.vt.k
    public final void a() {
        getView().s0().Oa(new a(getView()));
    }

    @Override // com.amazon.aps.iva.du.f
    public final void b3(com.amazon.aps.iva.du.x xVar) {
        com.amazon.aps.iva.yb0.j.f(xVar, "model");
        getView().s0().Oa(new d(xVar));
    }

    @Override // com.amazon.aps.iva.vt.k
    public final void j6(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "assetId");
        this.g.b();
        this.d.k0();
        this.e.l6(str);
    }

    @Override // com.amazon.aps.iva.du.f
    public final void n2(com.amazon.aps.iva.du.x xVar) {
    }

    @Override // com.amazon.aps.iva.du.f
    public final void o(com.amazon.aps.iva.du.x xVar) {
        com.amazon.aps.iva.yb0.j.f(xVar, "updatedModel");
        this.d.o(xVar);
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onConfigurationChanged(Configuration configuration) {
        getView().F0();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        s sVar = this.d;
        sVar.M().e(getView(), new k(new f()));
        sVar.u0().e(getView(), new k(new g()));
        this.e.M7().e(getView(), new k(new h()));
        k kVar = new k(new i());
        this.c.e(getView(), kVar);
    }

    @Override // com.amazon.aps.iva.vt.k
    public final void p4() {
        this.f.G(new j(getView()));
    }
}

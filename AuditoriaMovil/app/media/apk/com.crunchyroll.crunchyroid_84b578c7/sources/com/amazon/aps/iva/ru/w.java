package com.amazon.aps.iva.ru;

import android.content.res.Configuration;
import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.m70.a;
import com.amazon.aps.iva.vt.g;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: CommentRepliesPresenter.kt */
/* loaded from: classes2.dex */
public final class w extends com.amazon.aps.iva.wy.b<b0> implements u {
    public final String b;
    public final boolean c;
    public final LiveData<PlayableAsset> d;
    public final c0 e;
    public final com.amazon.aps.iva.iu.a f;
    public final com.amazon.aps.iva.xt.b g;

    /* compiled from: CommentRepliesPresenter.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public a(com.amazon.aps.iva.wy.h hVar) {
            super(0, hVar, b0.class, "close", "close()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            ((b0) this.receiver).close();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CommentRepliesPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.su.a i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.su.a aVar) {
            super(0);
            this.i = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            w wVar = w.this;
            wVar.getClass();
            wVar.f.G(new v(wVar, this.i));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CommentRepliesPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.du.x, com.amazon.aps.iva.kb0.q> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.du.x xVar) {
            com.amazon.aps.iva.du.x xVar2 = xVar;
            b0 q6 = w.q6(w.this);
            com.amazon.aps.iva.yb0.j.e(xVar2, "parentComment");
            q6.Ed(xVar2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CommentRepliesPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.vt.g, com.amazon.aps.iva.kb0.q> {
        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.vt.g gVar) {
            com.amazon.aps.iva.vt.g gVar2 = gVar;
            boolean z = gVar2 instanceof g.e;
            w wVar = w.this;
            if (z) {
                w.r6(wVar);
            } else if (gVar2 instanceof g.d) {
                w.q6(wVar).Y();
            } else if (gVar2 instanceof g.a) {
                w.q6(wVar).e1(new x(wVar));
                wVar.g.a(((g.a) gVar2).a);
            } else if (gVar2 instanceof g.b) {
                w.q6(wVar).J0(((g.b) gVar2).a);
            } else if (gVar2 instanceof g.c) {
                w.q6(wVar).o2();
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CommentRepliesPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.j8.h<com.amazon.aps.iva.du.x>>, com.amazon.aps.iva.kb0.q> {
        public e() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.j8.h<com.amazon.aps.iva.du.x>> gVar) {
            com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.j8.h<com.amazon.aps.iva.du.x>> gVar2 = gVar;
            w wVar = w.this;
            gVar2.c(new y(wVar));
            gVar2.e(new z(wVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CommentRepliesPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends Integer>, com.amazon.aps.iva.kb0.q> {
        public f() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends Integer> gVar) {
            com.amazon.aps.iva.ez.g<? extends Integer> gVar2 = gVar;
            w wVar = w.this;
            b0 q6 = w.q6(wVar);
            com.amazon.aps.iva.yb0.j.e(gVar2, "it");
            q6.de(gVar2);
            gVar2.e(new a0(wVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CommentRepliesPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<PlayableAsset, com.amazon.aps.iva.kb0.q> {
        public g() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(PlayableAsset playableAsset) {
            String id = playableAsset.getId();
            w wVar = w.this;
            if (!com.amazon.aps.iva.yb0.j.a(id, wVar.b)) {
                w.q6(wVar).close();
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CommentRepliesPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class h implements com.amazon.aps.iva.i5.w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public h(com.amazon.aps.iva.xb0.l lVar) {
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

    public w(b0 b0Var, String str, boolean z, LiveData liveData, h0 h0Var, com.amazon.aps.iva.iu.a aVar, com.amazon.aps.iva.xt.c cVar) {
        super(b0Var, new com.amazon.aps.iva.wy.j[0]);
        this.b = str;
        this.c = z;
        this.d = liveData;
        this.e = h0Var;
        this.f = aVar;
        this.g = cVar;
    }

    public static final /* synthetic */ b0 q6(w wVar) {
        return wVar.getView();
    }

    public static final void r6(w wVar) {
        if (wVar.getView().j1() instanceof a.c) {
            wVar.getView().V();
        }
    }

    @Override // com.amazon.aps.iva.du.f
    public final void M0(com.amazon.aps.iva.du.a aVar, com.amazon.aps.iva.du.x xVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "action");
    }

    @Override // com.amazon.aps.iva.du.f
    public final void O0(com.amazon.aps.iva.du.x xVar) {
        boolean z;
        com.amazon.aps.iva.su.a aVar;
        if (!xVar.i && !xVar.t) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            aVar = null;
        } else {
            aVar = new com.amazon.aps.iva.su.a(xVar.d);
        }
        getView().s0().Oa(new b(aVar));
    }

    @Override // com.amazon.aps.iva.ru.u
    public final void O2() {
        getView().s0().Oa(new a(getView()));
    }

    @Override // com.amazon.aps.iva.du.f
    public final void b3(com.amazon.aps.iva.du.x xVar) {
        com.amazon.aps.iva.yb0.j.f(xVar, "model");
    }

    @Override // com.amazon.aps.iva.ru.u
    public final void e4() {
        this.g.b();
        this.e.k0();
    }

    @Override // com.amazon.aps.iva.du.f
    public final void n2(com.amazon.aps.iva.du.x xVar) {
    }

    @Override // com.amazon.aps.iva.du.f
    public final void o(com.amazon.aps.iva.du.x xVar) {
        com.amazon.aps.iva.yb0.j.f(xVar, "updatedModel");
        this.e.o(xVar);
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onConfigurationChanged(Configuration configuration) {
        getView().F0();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        c0 c0Var = this.e;
        c0Var.U5(getView());
        c0Var.R2().e(getView(), new h(new c()));
        c0Var.M().e(getView(), new h(new d()));
        c0Var.g6().e(getView(), new h(new e()));
        c0Var.P2().e(getView(), new h(new f()));
        h hVar = new h(new g());
        this.d.e(getView(), hVar);
        if (this.c) {
            this.f.G(new v(this, null));
        }
    }

    @Override // com.amazon.aps.iva.ru.u
    public final void v2() {
        this.f.G(new v(this, null));
    }
}

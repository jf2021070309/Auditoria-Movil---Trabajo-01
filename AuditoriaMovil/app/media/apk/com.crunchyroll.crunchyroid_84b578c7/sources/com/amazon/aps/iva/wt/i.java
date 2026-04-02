package com.amazon.aps.iva.wt;

import com.amazon.aps.iva.du.a;
import com.amazon.aps.iva.du.x;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.wt.m;
import com.ellation.crunchyroll.commenting.comments.action.CommentActionViewModel;
import com.ellation.crunchyroll.commenting.comments.action.CommentActionViewModelImpl;
/* compiled from: CommentActionPresenter.kt */
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.wy.b<o> implements h {
    public final CommentActionViewModel b;
    public final com.amazon.aps.iva.iu.a c;

    /* compiled from: CommentActionPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.du.a i;
        public final /* synthetic */ x j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.du.a aVar, x xVar) {
            super(0);
            this.i = aVar;
            this.j = xVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            i.this.b.M0(this.i, this.j);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CommentActionPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends n>, com.amazon.aps.iva.kb0.q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends n> gVar) {
            com.amazon.aps.iva.u70.i iVar;
            com.amazon.aps.iva.ez.g<? extends n> gVar2 = gVar;
            com.amazon.aps.iva.yb0.j.f(gVar2, "$this$observeEvent");
            boolean z = gVar2 instanceof g.b;
            i iVar2 = i.this;
            if (z) {
                n nVar = (n) ((g.b) gVar2).a;
                if (nVar != null) {
                    i.q6(iVar2).i1(nVar.b);
                }
            } else if (gVar2 instanceof g.c) {
                com.amazon.aps.iva.du.a aVar = ((n) ((g.c) gVar2).a).a;
                com.amazon.aps.iva.yb0.j.f(aVar, "<this>");
                if (com.amazon.aps.iva.yb0.j.a(aVar, a.b.e)) {
                    iVar = m.b.b;
                } else if (com.amazon.aps.iva.yb0.j.a(aVar, a.e.e)) {
                    iVar = m.d.b;
                } else if (com.amazon.aps.iva.yb0.j.a(aVar, a.d.e)) {
                    iVar = m.c.b;
                } else if (com.amazon.aps.iva.yb0.j.a(aVar, a.g.e)) {
                    iVar = m.e.b;
                } else {
                    iVar = null;
                }
                if (iVar != null) {
                    i.q6(iVar2).showSnackbar(iVar);
                }
            } else if (gVar2 instanceof g.a) {
                i.q6(iVar2).showSnackbar(com.amazon.aps.iva.bt.c.b);
                n nVar2 = (n) ((g.a) gVar2).b;
                if (nVar2 != null) {
                    i.q6(iVar2).i1(nVar2.b);
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CommentActionPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends x>, com.amazon.aps.iva.kb0.q> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends x> gVar) {
            com.amazon.aps.iva.ez.g<? extends x> gVar2 = gVar;
            com.amazon.aps.iva.yb0.j.f(gVar2, "$this$observeEvent");
            i iVar = i.this;
            gVar2.c(new j(iVar));
            gVar2.e(new k(iVar));
            gVar2.b(new l(iVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public i(o oVar, CommentActionViewModelImpl commentActionViewModelImpl, com.amazon.aps.iva.iu.a aVar) {
        super(oVar, new com.amazon.aps.iva.wy.j[0]);
        this.b = commentActionViewModelImpl;
        this.c = aVar;
    }

    public static final /* synthetic */ o q6(i iVar) {
        return iVar.getView();
    }

    @Override // com.amazon.aps.iva.du.f
    public final void M0(com.amazon.aps.iva.du.a aVar, x xVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "action");
        this.c.G(new a(aVar, xVar));
    }

    @Override // com.amazon.aps.iva.du.f
    public final void O0(x xVar) {
    }

    @Override // com.amazon.aps.iva.du.f
    public final void b3(x xVar) {
        com.amazon.aps.iva.yb0.j.f(xVar, "model");
    }

    @Override // com.amazon.aps.iva.du.f
    public final void n2(x xVar) {
    }

    @Override // com.amazon.aps.iva.du.f
    public final void o(x xVar) {
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        CommentActionViewModel commentActionViewModel = this.b;
        com.amazon.aps.iva.ez.e.a(commentActionViewModel.p5(), getView(), new b());
        com.amazon.aps.iva.ez.e.a(commentActionViewModel.G5(), getView(), new c());
    }
}

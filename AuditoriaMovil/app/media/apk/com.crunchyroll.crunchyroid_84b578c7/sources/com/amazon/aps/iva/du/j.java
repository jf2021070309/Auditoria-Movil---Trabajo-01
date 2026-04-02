package com.amazon.aps.iva.du;

import com.amazon.aps.iva.du.a;
import com.ellation.crunchyroll.eventdispatcher.EventDispatcher;
/* compiled from: CommentItemPresenter.kt */
/* loaded from: classes2.dex */
public final class j extends com.amazon.aps.iva.wy.b<o> implements com.amazon.aps.iva.du.g {
    public final com.amazon.aps.iva.t50.a b;
    public x c;
    public EventDispatcher<com.amazon.aps.iva.du.f> d;

    /* compiled from: CommentItemPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<x, com.amazon.aps.iva.kb0.q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(x xVar) {
            com.amazon.aps.iva.yb0.j.f(xVar, "it");
            j jVar = j.this;
            jVar.getView().m3(new i(jVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CommentItemPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<x, com.amazon.aps.iva.kb0.q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(x xVar) {
            com.amazon.aps.iva.yb0.j.f(xVar, "it");
            j.q6(a.c.e, j.this);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CommentItemPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<x, com.amazon.aps.iva.kb0.q> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(x xVar) {
            com.amazon.aps.iva.yb0.j.f(xVar, "it");
            j.q6(a.f.e, j.this);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CommentItemPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<x, com.amazon.aps.iva.kb0.q> {
        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(x xVar) {
            com.amazon.aps.iva.yb0.j.f(xVar, "it");
            j.q6(a.e.e, j.this);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CommentItemPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<x, com.amazon.aps.iva.kb0.q> {
        public e() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(x xVar) {
            com.amazon.aps.iva.yb0.j.f(xVar, "it");
            j.q6(a.b.e, j.this);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CommentItemPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<x, com.amazon.aps.iva.kb0.q> {
        public f() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(x xVar) {
            com.amazon.aps.iva.yb0.j.f(xVar, "it");
            j.q6(a.g.e, j.this);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CommentItemPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<x, com.amazon.aps.iva.kb0.q> {
        public g() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(x xVar) {
            com.amazon.aps.iva.yb0.j.f(xVar, "it");
            j.q6(a.d.e, j.this);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CommentItemPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.du.f, com.amazon.aps.iva.kb0.q> {
        public h() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.du.f fVar) {
            com.amazon.aps.iva.du.f fVar2 = fVar;
            com.amazon.aps.iva.yb0.j.f(fVar2, "$this$notify");
            x xVar = j.this.c;
            if (xVar != null) {
                fVar2.n2(xVar);
                return com.amazon.aps.iva.kb0.q.a;
            }
            com.amazon.aps.iva.yb0.j.m("commentUiModel");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(o oVar, com.amazon.aps.iva.t50.b bVar) {
        super(oVar, new com.amazon.aps.iva.wy.j[0]);
        com.amazon.aps.iva.yb0.j.f(oVar, "view");
        this.b = bVar;
    }

    public static final void q6(com.amazon.aps.iva.du.a aVar, j jVar) {
        EventDispatcher<com.amazon.aps.iva.du.f> eventDispatcher = jVar.d;
        if (eventDispatcher != null) {
            eventDispatcher.notify(new com.amazon.aps.iva.du.h(aVar, jVar));
        } else {
            com.amazon.aps.iva.yb0.j.m("eventDispatcher");
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.du.g
    public final void i1() {
        EventDispatcher<com.amazon.aps.iva.du.f> eventDispatcher = this.d;
        if (eventDispatcher != null) {
            eventDispatcher.notify(new h());
        } else {
            com.amazon.aps.iva.yb0.j.m("eventDispatcher");
            throw null;
        }
    }

    public final void r6(x xVar, boolean z) {
        this.c = xVar;
        getView().Q1(new com.amazon.aps.iva.j50.d(null, xVar.g, xVar.h, z, 8));
    }

    public final void s6(x xVar) {
        this.c = xVar;
        getView().G5(xVar, new a(), new b(), new c(), new d(), new e(), new f(), new g());
    }

    public final void t6(x xVar) {
        this.c = xVar;
        if (xVar.r) {
            getView().Sb();
            getView().Qh();
            getView().D7();
            return;
        }
        getView().fg();
        getView().Fh();
        getView().V3();
    }

    public final void u6(x xVar) {
        t6(xVar);
        if (xVar.l) {
            getView().H5();
            getView().Cd();
            return;
        }
        getView().B2();
        getView().k4();
        getView().rg();
    }
}

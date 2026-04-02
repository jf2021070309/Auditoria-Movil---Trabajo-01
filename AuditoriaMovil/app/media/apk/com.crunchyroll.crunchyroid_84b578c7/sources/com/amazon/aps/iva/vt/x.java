package com.amazon.aps.iva.vt;

import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.vt.q;
import com.ellation.crunchyroll.api.etp.commenting.model.CommentPreview;
import com.ellation.crunchyroll.api.etp.commenting.model.CommentsSortingType;
/* compiled from: CommentsViewModel.kt */
/* loaded from: classes2.dex */
public final class x extends com.amazon.aps.iva.ez.b implements s, com.amazon.aps.iva.bu.n {
    public final d b;
    public final com.amazon.aps.iva.wu.a c;
    public final com.amazon.aps.iva.i5.v<g> d;
    public q e;
    public final com.amazon.aps.iva.bu.c f;

    /* compiled from: CommentsViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.commenting.comments.CommentsViewModelImpl$refreshComments$1", f = "CommentsViewModel.kt", l = {68}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
                com.amazon.aps.iva.bu.c cVar = x.this.f;
                this.h = 1;
                if (cVar.v0(this) == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CommentsViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.commenting.comments.CommentsViewModelImpl$retryComments$1", f = "CommentsViewModel.kt", l = {64}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;

        public b(com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new b(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
                com.amazon.aps.iva.bu.c cVar = x.this.f;
                this.h = 1;
                if (cVar.w0(this) == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.amazon.aps.iva.bu.d dVar, e eVar) {
        super(eVar);
        com.amazon.aps.iva.wu.b bVar = com.amazon.aps.iva.wu.b.a;
        this.b = eVar;
        this.c = bVar;
        com.amazon.aps.iva.i5.v<g> vVar = new com.amazon.aps.iva.i5.v<>();
        this.d = vVar;
        this.e = q.b.e;
        this.f = com.amazon.aps.iva.bu.e.a(dVar, new f(vVar), null, new u(this), this, 18);
        com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new t(this, null), 3);
    }

    @Override // com.amazon.aps.iva.bu.n
    public final Object H1(int i, int i2, com.amazon.aps.iva.ob0.d<? super CommentPreview> dVar) {
        CommentsSortingType commentsSortingType;
        q qVar = this.e;
        if (com.amazon.aps.iva.yb0.j.a(qVar, q.b.e)) {
            commentsSortingType = CommentsSortingType.POPULARITY;
        } else if (com.amazon.aps.iva.yb0.j.a(qVar, q.a.e)) {
            commentsSortingType = CommentsSortingType.DATE;
        } else {
            throw new com.amazon.aps.iva.kb0.h();
        }
        return this.b.E0(commentsSortingType, i, i2, dVar);
    }

    @Override // com.amazon.aps.iva.vt.s
    public final void K6(q qVar) {
        if (!com.amazon.aps.iva.yb0.j.a(this.e, qVar)) {
            this.e = qVar;
            a0();
        }
    }

    @Override // com.amazon.aps.iva.vt.s
    public final com.amazon.aps.iva.i5.v M() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.vt.s
    public final void a0() {
        com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new b(null), 3);
    }

    @Override // com.amazon.aps.iva.vt.s
    public final void k0() {
        com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new a(null), 3);
    }

    @Override // com.amazon.aps.iva.vt.s
    public final q n7() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.vt.h
    public final void o(com.amazon.aps.iva.du.x xVar) {
        com.amazon.aps.iva.yb0.j.f(xVar, "updatedModel");
        this.f.o(xVar);
    }

    @Override // com.amazon.aps.iva.vt.s
    public final com.amazon.aps.iva.i5.v u0() {
        return this.f.u0();
    }
}

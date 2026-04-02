package com.amazon.aps.iva.mu;

import com.amazon.aps.iva.du.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: CommentVotePresenter.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.wy.b<e> implements com.amazon.aps.iva.mu.a {
    public final f b;
    public final com.amazon.aps.iva.iu.a c;

    /* compiled from: CommentVotePresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ x i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x xVar) {
            super(0);
            this.i = xVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            b.this.b.J4(this.i);
            return q.a;
        }
    }

    /* compiled from: CommentVotePresenter.kt */
    /* renamed from: com.amazon.aps.iva.mu.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0522b extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends x>, q> {
        public C0522b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.ez.g<? extends x> gVar) {
            com.amazon.aps.iva.ez.g<? extends x> gVar2 = gVar;
            j.f(gVar2, "$this$observeEvent");
            b bVar = b.this;
            gVar2.e(new c(bVar));
            gVar2.b(new d(bVar));
            return q.a;
        }
    }

    public b(e eVar, h hVar, com.amazon.aps.iva.iu.a aVar) {
        super(eVar, new com.amazon.aps.iva.wy.j[0]);
        this.b = hVar;
        this.c = aVar;
    }

    @Override // com.amazon.aps.iva.du.f
    public final void M0(com.amazon.aps.iva.du.a aVar, x xVar) {
        j.f(aVar, "action");
    }

    @Override // com.amazon.aps.iva.du.f
    public final void O0(x xVar) {
    }

    @Override // com.amazon.aps.iva.du.f
    public final void b3(x xVar) {
        j.f(xVar, "model");
    }

    @Override // com.amazon.aps.iva.du.f
    public final void n2(x xVar) {
        this.c.G(new a(xVar));
    }

    @Override // com.amazon.aps.iva.du.f
    public final void o(x xVar) {
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        com.amazon.aps.iva.ez.e.a(this.b.D0(), getView(), new C0522b());
    }
}

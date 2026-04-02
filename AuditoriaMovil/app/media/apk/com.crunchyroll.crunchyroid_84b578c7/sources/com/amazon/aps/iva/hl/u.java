package com.amazon.aps.iva.hl;

import com.amazon.aps.iva.k50.j;
/* compiled from: PremiumOverlayRouter.kt */
/* loaded from: classes2.dex */
public final class u implements t {
    public final com.amazon.aps.iva.cj.z a;
    public final com.amazon.aps.iva.k50.j b;
    public final com.amazon.aps.iva.xh.b c;
    public final com.amazon.aps.iva.dj.l d;

    /* compiled from: PremiumOverlayRouter.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public a(com.amazon.aps.iva.cj.z zVar) {
            super(0, zVar, com.amazon.aps.iva.cj.z.class, "reloadContent", "reloadContent()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            ((com.amazon.aps.iva.cj.z) this.receiver).M();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: PremiumOverlayRouter.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public b(com.amazon.aps.iva.cj.z zVar) {
            super(0, zVar, com.amazon.aps.iva.cj.z.class, "reloadContent", "reloadContent()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            ((com.amazon.aps.iva.cj.z) this.receiver).M();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: PremiumOverlayRouter.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class c extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public c(com.amazon.aps.iva.cj.z zVar) {
            super(0, zVar, com.amazon.aps.iva.cj.z.class, "reloadContent", "reloadContent()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            ((com.amazon.aps.iva.cj.z) this.receiver).M();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public u(com.amazon.aps.iva.cj.z zVar, com.amazon.aps.iva.k50.j jVar, com.amazon.aps.iva.xh.b bVar, com.amazon.aps.iva.dj.m mVar) {
        this.a = zVar;
        this.b = jVar;
        this.c = bVar;
        this.d = mVar;
    }

    @Override // com.amazon.aps.iva.hl.t
    public final void j(com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "clickedView");
        com.amazon.aps.iva.cj.z zVar = this.a;
        boolean K1 = zVar.K1();
        com.amazon.aps.iva.dj.l lVar = this.d;
        if (K1) {
            lVar.a(bVar);
            j.a.a(this.b, new a(zVar), 1);
            return;
        }
        lVar.a(bVar);
        this.c.a(null);
    }

    @Override // com.amazon.aps.iva.hl.t
    public final void k() {
        com.amazon.aps.iva.cj.z zVar = this.a;
        this.c.b(new b(zVar));
        c cVar = new c(zVar);
        this.b.a(com.amazon.aps.iva.k50.k.h, cVar);
    }
}

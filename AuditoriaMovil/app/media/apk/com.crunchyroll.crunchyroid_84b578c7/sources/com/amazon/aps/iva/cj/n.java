package com.amazon.aps.iva.cj;
/* compiled from: PlayerFeatureImpl.kt */
/* loaded from: classes.dex */
public final class n implements p {
    public static k d;
    public static h e;
    public static p f;
    public final com.amazon.aps.iva.lj.c a;
    public final com.amazon.aps.iva.lj.c b;
    public final com.amazon.aps.iva.tl.b c;

    /* compiled from: PlayerFeatureImpl.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static k a() {
            k kVar = n.d;
            if (kVar != null) {
                return kVar;
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    public n() {
        com.amazon.aps.iva.lj.c cVar = new com.amazon.aps.iva.lj.c(0);
        this.a = cVar;
        this.b = cVar;
        this.c = new com.amazon.aps.iva.tl.b();
    }

    @Override // com.amazon.aps.iva.cj.l
    public final com.amazon.aps.iva.hl.w a() {
        return new com.amazon.aps.iva.hl.w(new com.amazon.aps.iva.at.c(a.a().k()), a.a().e().c(), a.a().c().c(), a.a().j());
    }

    @Override // com.amazon.aps.iva.cj.p
    public final com.amazon.aps.iva.tl.b b() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.cj.l
    public final com.amazon.aps.iva.lj.c c() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.cj.l
    /* renamed from: d */
    public final h getPlayer() {
        h hVar = e;
        if (hVar != null) {
            return hVar;
        }
        com.amazon.aps.iva.yb0.j.m("player");
        throw null;
    }

    @Override // com.amazon.aps.iva.cj.p
    public final com.amazon.aps.iva.lj.c e() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.cj.l
    public final com.amazon.aps.iva.ll.c f() {
        com.amazon.aps.iva.ll.c.q.getClass();
        return new com.amazon.aps.iva.ll.c();
    }

    @Override // com.amazon.aps.iva.cj.l
    public final com.amazon.aps.iva.tl.b g() {
        return this.c;
    }
}

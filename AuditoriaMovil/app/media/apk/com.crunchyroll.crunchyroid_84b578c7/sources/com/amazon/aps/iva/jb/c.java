package com.amazon.aps.iva.jb;
/* compiled from: DecoratorBreakerFactory.java */
/* loaded from: classes.dex */
public final class c implements e {
    public final e b;
    public final com.amazon.aps.iva.gb.b c;
    public final com.amazon.aps.iva.u0.b d;

    public c(com.amazon.aps.iva.gb.c cVar, com.amazon.aps.iva.u0.b bVar, e eVar) {
        this.c = cVar;
        this.d = bVar;
        this.b = eVar;
    }

    @Override // com.amazon.aps.iva.jb.e
    public final f a() {
        return new a(this.d, new b(this.c, this.b.a()));
    }

    @Override // com.amazon.aps.iva.jb.e
    public final f f() {
        return new d(this.d, this.b.f());
    }
}

package com.amazon.aps.iva.se0;

import com.amazon.aps.iva.ob0.e;
import com.amazon.aps.iva.ob0.g;
/* compiled from: CoroutineDispatcher.kt */
/* loaded from: classes4.dex */
public abstract class d0 extends com.amazon.aps.iva.ob0.a implements com.amazon.aps.iva.ob0.e {
    public static final a b = new a();

    /* compiled from: CoroutineDispatcher.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.ob0.b<com.amazon.aps.iva.ob0.e, d0> {

        /* compiled from: CoroutineDispatcher.kt */
        /* renamed from: com.amazon.aps.iva.se0.d0$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0705a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<g.b, d0> {
            public static final C0705a h = new C0705a();

            public C0705a() {
                super(1);
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final d0 invoke(g.b bVar) {
                g.b bVar2 = bVar;
                if (bVar2 instanceof d0) {
                    return (d0) bVar2;
                }
                return null;
            }
        }

        public a() {
            super(e.a.b, C0705a.h);
        }
    }

    public d0() {
        super(e.a.b);
    }

    public boolean B() {
        return !(this instanceof k2);
    }

    @Override // com.amazon.aps.iva.ob0.e
    public final void f(com.amazon.aps.iva.ob0.d<?> dVar) {
        ((com.amazon.aps.iva.xe0.e) dVar).n();
    }

    @Override // com.amazon.aps.iva.ob0.a, com.amazon.aps.iva.ob0.g
    public final <E extends g.b> E get(g.c<E> cVar) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(cVar, "key");
        if (cVar instanceof com.amazon.aps.iva.ob0.b) {
            com.amazon.aps.iva.ob0.b bVar = (com.amazon.aps.iva.ob0.b) cVar;
            g.c<?> key = getKey();
            com.amazon.aps.iva.yb0.j.f(key, "key");
            if (key != bVar && bVar.c != key) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                E e = (E) bVar.b.invoke(this);
                if (e instanceof g.b) {
                    return e;
                }
            }
        } else if (e.a.b == cVar) {
            return this;
        }
        return null;
    }

    @Override // com.amazon.aps.iva.ob0.e
    public final com.amazon.aps.iva.xe0.e k(com.amazon.aps.iva.ob0.d dVar) {
        return new com.amazon.aps.iva.xe0.e(this, dVar);
    }

    @Override // com.amazon.aps.iva.ob0.a, com.amazon.aps.iva.ob0.g
    public final com.amazon.aps.iva.ob0.g minusKey(g.c<?> cVar) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(cVar, "key");
        boolean z2 = cVar instanceof com.amazon.aps.iva.ob0.b;
        com.amazon.aps.iva.ob0.h hVar = com.amazon.aps.iva.ob0.h.b;
        if (z2) {
            com.amazon.aps.iva.ob0.b bVar = (com.amazon.aps.iva.ob0.b) cVar;
            g.c<?> key = getKey();
            com.amazon.aps.iva.yb0.j.f(key, "key");
            if (key != bVar && bVar.c != key) {
                z = false;
            } else {
                z = true;
            }
            if (z && ((g.b) bVar.b.invoke(this)) != null) {
                return hVar;
            }
        } else if (e.a.b == cVar) {
            return hVar;
        }
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + j0.e(this);
    }

    public abstract void x(com.amazon.aps.iva.ob0.g gVar, Runnable runnable);

    public void y(com.amazon.aps.iva.ob0.g gVar, Runnable runnable) {
        x(gVar, runnable);
    }
}

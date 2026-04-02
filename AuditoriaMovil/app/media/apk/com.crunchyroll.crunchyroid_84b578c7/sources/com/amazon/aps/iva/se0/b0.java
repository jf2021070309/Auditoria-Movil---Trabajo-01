package com.amazon.aps.iva.se0;

import com.amazon.aps.iva.ob0.e;
import com.amazon.aps.iva.ob0.g;
/* compiled from: CoroutineContext.kt */
/* loaded from: classes4.dex */
public final class b0 {

    /* compiled from: CoroutineContext.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.ob0.g, g.b, com.amazon.aps.iva.ob0.g> {
        public static final a h = new a();

        public a() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.ob0.g invoke(com.amazon.aps.iva.ob0.g gVar, g.b bVar) {
            com.amazon.aps.iva.ob0.g gVar2 = gVar;
            g.b bVar2 = bVar;
            if (bVar2 instanceof a0) {
                return gVar2.plus(((a0) bVar2).A());
            }
            return gVar2.plus(bVar2);
        }
    }

    /* compiled from: CoroutineContext.kt */
    /* loaded from: classes4.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.ob0.g, g.b, com.amazon.aps.iva.ob0.g> {
        public final /* synthetic */ com.amazon.aps.iva.yb0.d0<com.amazon.aps.iva.ob0.g> h;
        public final /* synthetic */ boolean i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.yb0.d0<com.amazon.aps.iva.ob0.g> d0Var, boolean z) {
            super(2);
            this.h = d0Var;
            this.i = z;
        }

        /* JADX WARN: Type inference failed for: r1v5, types: [T, com.amazon.aps.iva.ob0.g] */
        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.ob0.g invoke(com.amazon.aps.iva.ob0.g gVar, g.b bVar) {
            com.amazon.aps.iva.ob0.g gVar2 = gVar;
            g.b bVar2 = bVar;
            if (!(bVar2 instanceof a0)) {
                return gVar2.plus(bVar2);
            }
            com.amazon.aps.iva.yb0.d0<com.amazon.aps.iva.ob0.g> d0Var = this.h;
            if (d0Var.b.get(bVar2.getKey()) == null) {
                a0 a0Var = (a0) bVar2;
                if (this.i) {
                    a0Var = a0Var.A();
                }
                return gVar2.plus(a0Var);
            }
            d0Var.b = d0Var.b.minusKey(bVar2.getKey());
            return gVar2.plus(((a0) bVar2).O());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    public static final com.amazon.aps.iva.ob0.g a(com.amazon.aps.iva.ob0.g gVar, com.amazon.aps.iva.ob0.g gVar2, boolean z) {
        Boolean bool = Boolean.FALSE;
        c0 c0Var = c0.h;
        boolean booleanValue = ((Boolean) gVar.fold(bool, c0Var)).booleanValue();
        boolean booleanValue2 = ((Boolean) gVar2.fold(bool, c0Var)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return gVar.plus(gVar2);
        }
        com.amazon.aps.iva.yb0.d0 d0Var = new com.amazon.aps.iva.yb0.d0();
        d0Var.b = gVar2;
        com.amazon.aps.iva.ob0.h hVar = com.amazon.aps.iva.ob0.h.b;
        com.amazon.aps.iva.ob0.g gVar3 = (com.amazon.aps.iva.ob0.g) gVar.fold(hVar, new b(d0Var, z));
        if (booleanValue2) {
            d0Var.b = ((com.amazon.aps.iva.ob0.g) d0Var.b).fold(hVar, a.h);
        }
        return gVar3.plus((com.amazon.aps.iva.ob0.g) d0Var.b);
    }

    public static final com.amazon.aps.iva.ob0.g b(g0 g0Var, com.amazon.aps.iva.ob0.g gVar) {
        com.amazon.aps.iva.ob0.g a2 = a(g0Var.getCoroutineContext(), gVar, true);
        com.amazon.aps.iva.ye0.c cVar = r0.a;
        if (a2 != cVar && a2.get(e.a.b) == null) {
            return a2.plus(cVar);
        }
        return a2;
    }

    public static final l2<?> c(com.amazon.aps.iva.ob0.d<?> dVar, com.amazon.aps.iva.ob0.g gVar, Object obj) {
        boolean z;
        l2<?> l2Var = null;
        if (!(dVar instanceof com.amazon.aps.iva.qb0.d)) {
            return null;
        }
        if (gVar.get(m2.b) != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        com.amazon.aps.iva.qb0.d dVar2 = (com.amazon.aps.iva.qb0.d) dVar;
        while (true) {
            if (!(dVar2 instanceof p0) && (dVar2 = dVar2.getCallerFrame()) != null) {
                if (dVar2 instanceof l2) {
                    l2Var = (l2) dVar2;
                    break;
                }
            } else {
                break;
            }
        }
        if (l2Var != null) {
            l2Var.e.set(new com.amazon.aps.iva.kb0.j<>(gVar, obj));
        }
        return l2Var;
    }
}

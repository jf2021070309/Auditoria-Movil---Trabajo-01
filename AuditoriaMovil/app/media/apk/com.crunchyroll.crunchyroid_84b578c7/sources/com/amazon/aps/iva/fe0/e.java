package com.amazon.aps.iva.fe0;

import com.amazon.aps.iva.ee0.c0;
import com.amazon.aps.iva.ee0.c1;
import com.amazon.aps.iva.ee0.f0;
import com.amazon.aps.iva.ee0.j1;
import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.ee0.u1;
import com.amazon.aps.iva.ee0.v1;
import com.amazon.aps.iva.ee0.y;
import com.amazon.aps.iva.yb0.e0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
/* compiled from: KotlinTypePreparator.kt */
/* loaded from: classes4.dex */
public abstract class e extends com.amazon.aps.iva.ab.a {

    /* compiled from: KotlinTypePreparator.kt */
    /* loaded from: classes4.dex */
    public static final class a extends e {
        public static final a a = new a();
    }

    /* compiled from: KotlinTypePreparator.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b extends com.amazon.aps.iva.yb0.h implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.he0.h, u1> {
        public b(Object obj) {
            super(1, obj);
        }

        @Override // com.amazon.aps.iva.yb0.b, com.amazon.aps.iva.fc0.c
        public final String getName() {
            return "prepareType";
        }

        @Override // com.amazon.aps.iva.yb0.b
        public final com.amazon.aps.iva.fc0.f getOwner() {
            return e0.a(e.class);
        }

        @Override // com.amazon.aps.iva.yb0.b
        public final String getSignature() {
            return "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;";
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final u1 invoke(com.amazon.aps.iva.he0.h hVar) {
            com.amazon.aps.iva.he0.h hVar2 = hVar;
            com.amazon.aps.iva.yb0.j.f(hVar2, "p0");
            return ((e) this.receiver).m(hVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.amazon.aps.iva.ee0.c0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.amazon.aps.iva.ee0.c0] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.amazon.aps.iva.ee0.c0] */
    public static m0 t(m0 m0Var) {
        com.amazon.aps.iva.ee0.e0 type;
        c1 I0 = m0Var.I0();
        boolean z = true;
        boolean z2 = false;
        u1 u1Var = null;
        if (I0 instanceof com.amazon.aps.iva.rd0.c) {
            com.amazon.aps.iva.rd0.c cVar = (com.amazon.aps.iva.rd0.c) I0;
            j1 j1Var = cVar.a;
            if (j1Var.c() != v1.IN_VARIANCE) {
                z = false;
            }
            if (!z) {
                j1Var = null;
            }
            if (j1Var != null && (type = j1Var.getType()) != null) {
                u1Var = type.L0();
            }
            u1 u1Var2 = u1Var;
            if (cVar.b == null) {
                Collection<com.amazon.aps.iva.ee0.e0> g = cVar.g();
                ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(g));
                for (com.amazon.aps.iva.ee0.e0 e0Var : g) {
                    arrayList.add(e0Var.L0());
                }
                j1 j1Var2 = cVar.a;
                com.amazon.aps.iva.yb0.j.f(j1Var2, "projection");
                cVar.b = new j(j1Var2, new i(arrayList), null, null, 8);
            }
            com.amazon.aps.iva.he0.b bVar = com.amazon.aps.iva.he0.b.FOR_SUBTYPING;
            j jVar = cVar.b;
            com.amazon.aps.iva.yb0.j.c(jVar);
            return new h(bVar, jVar, u1Var2, m0Var.H0(), m0Var.J0(), 32);
        } else if (!(I0 instanceof com.amazon.aps.iva.sd0.s)) {
            if ((I0 instanceof c0) && m0Var.J0()) {
                ?? r0 = (c0) I0;
                LinkedHashSet<com.amazon.aps.iva.ee0.e0> linkedHashSet = r0.b;
                ArrayList arrayList2 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(linkedHashSet));
                for (com.amazon.aps.iva.ee0.e0 e0Var2 : linkedHashSet) {
                    arrayList2.add(com.amazon.aps.iva.da0.a.y(e0Var2));
                    z2 = true;
                }
                if (z2) {
                    com.amazon.aps.iva.ee0.e0 e0Var3 = r0.a;
                    if (e0Var3 != null) {
                        u1Var = com.amazon.aps.iva.da0.a.y(e0Var3);
                    }
                    arrayList2.isEmpty();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList2);
                    linkedHashSet2.hashCode();
                    u1Var = new c0(linkedHashSet2, u1Var);
                }
                if (u1Var != null) {
                    r0 = u1Var;
                }
                return r0.c();
            }
            return m0Var;
        } else {
            ((com.amazon.aps.iva.sd0.s) I0).getClass();
            com.amazon.aps.iva.lb0.r.Y(null);
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.ab.a
    /* renamed from: s */
    public final u1 m(com.amazon.aps.iva.he0.h hVar) {
        u1 c;
        com.amazon.aps.iva.ee0.e0 e0Var;
        com.amazon.aps.iva.yb0.j.f(hVar, "type");
        if (hVar instanceof com.amazon.aps.iva.ee0.e0) {
            u1 L0 = ((com.amazon.aps.iva.ee0.e0) hVar).L0();
            if (L0 instanceof m0) {
                c = t((m0) L0);
            } else if (L0 instanceof y) {
                y yVar = (y) L0;
                m0 t = t(yVar.c);
                m0 m0Var = yVar.d;
                m0 t2 = t(m0Var);
                if (t == yVar.c && t2 == m0Var) {
                    c = L0;
                } else {
                    c = f0.c(t, t2);
                }
            } else {
                throw new com.amazon.aps.iva.kb0.h();
            }
            b bVar = new b(this);
            com.amazon.aps.iva.yb0.j.f(c, "<this>");
            com.amazon.aps.iva.yb0.j.f(L0, "origin");
            com.amazon.aps.iva.ee0.e0 t3 = com.amazon.aps.iva.dg.b.t(L0);
            if (t3 != null) {
                e0Var = (com.amazon.aps.iva.ee0.e0) bVar.invoke(t3);
            } else {
                e0Var = null;
            }
            return com.amazon.aps.iva.dg.b.K(c, e0Var);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}

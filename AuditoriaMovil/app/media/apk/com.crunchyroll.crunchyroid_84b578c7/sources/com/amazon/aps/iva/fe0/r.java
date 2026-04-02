package com.amazon.aps.iva.fe0;

import com.amazon.aps.iva.ee0.a1;
import com.amazon.aps.iva.ee0.b1;
import com.amazon.aps.iva.ee0.c0;
import com.amazon.aps.iva.ee0.c1;
import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.f0;
import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.ee0.q0;
import com.amazon.aps.iva.ee0.u0;
import com.amazon.aps.iva.ee0.u1;
import com.amazon.aps.iva.ee0.y0;
import com.amazon.aps.iva.fe0.l;
import com.amazon.aps.iva.lb0.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
/* compiled from: IntersectionType.kt */
/* loaded from: classes4.dex */
public final class r {
    public static final r a = new r();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IntersectionType.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static final a START = new c();
        public static final a ACCEPT_NULL = new C0251a();
        public static final a UNKNOWN = new d();
        public static final a NOT_NULL = new b();
        private static final /* synthetic */ a[] $VALUES = $values();

        /* compiled from: IntersectionType.kt */
        /* renamed from: com.amazon.aps.iva.fe0.r$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0251a extends a {
            public C0251a() {
                super("ACCEPT_NULL", 1, null);
            }

            @Override // com.amazon.aps.iva.fe0.r.a
            public final a combine(u1 u1Var) {
                com.amazon.aps.iva.yb0.j.f(u1Var, "nextType");
                return getResultNullability(u1Var);
            }
        }

        /* compiled from: IntersectionType.kt */
        /* loaded from: classes4.dex */
        public static final class b extends a {
            public b() {
                super("NOT_NULL", 3, null);
            }

            @Override // com.amazon.aps.iva.fe0.r.a
            public final a combine(u1 u1Var) {
                com.amazon.aps.iva.yb0.j.f(u1Var, "nextType");
                return this;
            }
        }

        /* compiled from: IntersectionType.kt */
        /* loaded from: classes4.dex */
        public static final class c extends a {
            public c() {
                super("START", 0, null);
            }

            @Override // com.amazon.aps.iva.fe0.r.a
            public final a combine(u1 u1Var) {
                com.amazon.aps.iva.yb0.j.f(u1Var, "nextType");
                return getResultNullability(u1Var);
            }
        }

        /* compiled from: IntersectionType.kt */
        /* loaded from: classes4.dex */
        public static final class d extends a {
            public d() {
                super("UNKNOWN", 2, null);
            }

            @Override // com.amazon.aps.iva.fe0.r.a
            public final a combine(u1 u1Var) {
                com.amazon.aps.iva.yb0.j.f(u1Var, "nextType");
                a resultNullability = getResultNullability(u1Var);
                if (resultNullability == a.ACCEPT_NULL) {
                    return this;
                }
                return resultNullability;
            }
        }

        private static final /* synthetic */ a[] $values() {
            return new a[]{START, ACCEPT_NULL, UNKNOWN, NOT_NULL};
        }

        public /* synthetic */ a(String str, int i, com.amazon.aps.iva.yb0.e eVar) {
            this(str, i);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public abstract a combine(u1 u1Var);

        public final a getResultNullability(u1 u1Var) {
            com.amazon.aps.iva.yb0.j.f(u1Var, "<this>");
            if (u1Var.J0()) {
                return ACCEPT_NULL;
            }
            if ((u1Var instanceof com.amazon.aps.iva.ee0.q) && (((com.amazon.aps.iva.ee0.q) u1Var).c instanceof u0)) {
                return NOT_NULL;
            }
            if (u1Var instanceof u0) {
                return UNKNOWN;
            }
            if (com.amazon.aps.iva.ee0.c.a(com.amazon.aps.iva.fe0.a.a(false, true, p.a, null, null, 24), com.amazon.aps.iva.dg.b.C(u1Var), b1.c.b.a)) {
                return NOT_NULL;
            }
            return UNKNOWN;
        }

        private a(String str, int i) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0050 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList a(java.util.AbstractCollection r7, com.amazon.aps.iva.xb0.p r8) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r7)
            java.util.Iterator r7 = r0.iterator()
            java.lang.String r1 = "filteredTypes.iterator()"
            com.amazon.aps.iva.yb0.j.e(r7, r1)
        Le:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L57
            java.lang.Object r1 = r7.next()
            com.amazon.aps.iva.ee0.m0 r1 = (com.amazon.aps.iva.ee0.m0) r1
            boolean r2 = r0.isEmpty()
            r3 = 0
            if (r2 == 0) goto L22
            goto L51
        L22:
            java.util.Iterator r2 = r0.iterator()
        L26:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L51
            java.lang.Object r4 = r2.next()
            com.amazon.aps.iva.ee0.m0 r4 = (com.amazon.aps.iva.ee0.m0) r4
            r5 = 1
            if (r4 == r1) goto L4d
            java.lang.String r6 = "lower"
            com.amazon.aps.iva.yb0.j.e(r4, r6)
            java.lang.String r6 = "upper"
            com.amazon.aps.iva.yb0.j.e(r1, r6)
            java.lang.Object r4 = r8.invoke(r4, r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L4d
            r4 = r5
            goto L4e
        L4d:
            r4 = r3
        L4e:
            if (r4 == 0) goto L26
            r3 = r5
        L51:
            if (r3 == 0) goto Le
            r7.remove()
            goto Le
        L57:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.fe0.r.a(java.util.AbstractCollection, com.amazon.aps.iva.xb0.p):java.util.ArrayList");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [com.amazon.aps.iva.ee0.a1] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.amazon.aps.iva.ke0.a, com.amazon.aps.iva.ke0.e, java.lang.Object, com.amazon.aps.iva.ee0.a1] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v20, types: [com.amazon.aps.iva.ee0.m0] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [com.amazon.aps.iva.ee0.m0, com.amazon.aps.iva.ee0.e0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public final m0 b(ArrayList arrayList) {
        m0 m0Var;
        Set y0;
        m0 c;
        com.amazon.aps.iva.ee0.k c2;
        arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m0 m0Var2 = (m0) it.next();
            if (m0Var2.I0() instanceof c0) {
                Collection<e0> g = m0Var2.I0().g();
                com.amazon.aps.iva.yb0.j.e(g, "type.constructor.supertypes");
                Collection<e0> collection = g;
                ArrayList arrayList3 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(collection));
                for (e0 e0Var : collection) {
                    com.amazon.aps.iva.yb0.j.e(e0Var, "it");
                    m0 J = com.amazon.aps.iva.dg.b.J(e0Var);
                    if (m0Var2.J0()) {
                        J = J.M0(true);
                    }
                    arrayList3.add(J);
                }
                arrayList2.addAll(arrayList3);
            } else {
                arrayList2.add(m0Var2);
            }
        }
        a aVar = a.START;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            aVar = aVar.combine((u1) it2.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            m0 m0Var3 = (m0) it3.next();
            if (aVar == a.NOT_NULL) {
                if (m0Var3 instanceof h) {
                    h hVar = (h) m0Var3;
                    com.amazon.aps.iva.yb0.j.f(hVar, "<this>");
                    m0Var3 = new h(hVar.c, hVar.d, hVar.e, hVar.f, hVar.g, true);
                }
                m0Var3 = q0.c(m0Var3, false);
            }
            linkedHashSet.add(m0Var3);
        }
        ArrayList arrayList4 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(arrayList));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((m0) it4.next()).H0());
        }
        Iterator it5 = arrayList4.iterator();
        if (it5.hasNext()) {
            ?? next = it5.next();
            while (it5.hasNext()) {
                a1 a1Var = (a1) it5.next();
                next = (a1) next;
                next.getClass();
                com.amazon.aps.iva.yb0.j.f(a1Var, "other");
                if (!next.isEmpty() || !a1Var.isEmpty()) {
                    ArrayList arrayList5 = new ArrayList();
                    Collection<Integer> values = a1.c.a.values();
                    com.amazon.aps.iva.yb0.j.e(values, "idPerType.values");
                    for (Integer num : values) {
                        int intValue = num.intValue();
                        y0 y0Var = (y0) next.b.get(intValue);
                        y0 y0Var2 = (y0) a1Var.b.get(intValue);
                        if (y0Var == null) {
                            if (y0Var2 != null) {
                                c2 = y0Var2.c(y0Var);
                            } else {
                                c2 = null;
                            }
                        } else {
                            c2 = y0Var.c(y0Var2);
                        }
                        com.amazon.aps.iva.a60.b.i(arrayList5, c2);
                    }
                    next = a1.a.c(arrayList5);
                }
            }
            a1 a1Var2 = (a1) next;
            if (linkedHashSet.size() == 1) {
                c = (m0) x.O0(linkedHashSet);
            } else {
                new s(linkedHashSet);
                ArrayList a2 = a(linkedHashSet, new t(this));
                a2.isEmpty();
                com.amazon.aps.iva.sd0.n nVar = com.amazon.aps.iva.sd0.n.INTERSECTION_TYPE;
                if (a2.isEmpty()) {
                    m0Var = null;
                } else {
                    Iterator it6 = a2.iterator();
                    if (it6.hasNext()) {
                        ?? next2 = it6.next();
                        while (it6.hasNext()) {
                            m0 m0Var4 = (m0) it6.next();
                            next2 = (m0) next2;
                            if (next2 != 0 && m0Var4 != null) {
                                c1 I0 = next2.I0();
                                c1 I02 = m0Var4.I0();
                                boolean z = I0 instanceof com.amazon.aps.iva.sd0.p;
                                if (z && (I02 instanceof com.amazon.aps.iva.sd0.p)) {
                                    com.amazon.aps.iva.sd0.p pVar = (com.amazon.aps.iva.sd0.p) I0;
                                    com.amazon.aps.iva.sd0.p pVar2 = (com.amazon.aps.iva.sd0.p) I02;
                                    int i = com.amazon.aps.iva.sd0.o.a[nVar.ordinal()];
                                    if (i != 1) {
                                        if (i == 2) {
                                            Set<e0> set = pVar.c;
                                            Set<e0> set2 = pVar2.c;
                                            com.amazon.aps.iva.yb0.j.f(set, "<this>");
                                            com.amazon.aps.iva.yb0.j.f(set2, "other");
                                            y0 = x.b1(set);
                                            com.amazon.aps.iva.lb0.t.d0(y0, set2);
                                        } else {
                                            throw new com.amazon.aps.iva.kb0.h();
                                        }
                                    } else {
                                        y0 = x.y0(pVar.c, pVar2.c);
                                    }
                                    com.amazon.aps.iva.sd0.p pVar3 = new com.amazon.aps.iva.sd0.p(pVar.a, pVar.b, y0);
                                    a1.c.getClass();
                                    next2 = f0.d(a1.d, pVar3);
                                } else if (z) {
                                    if (((com.amazon.aps.iva.sd0.p) I0).c.contains(m0Var4)) {
                                        next2 = m0Var4;
                                    }
                                } else if ((I02 instanceof com.amazon.aps.iva.sd0.p) && ((com.amazon.aps.iva.sd0.p) I02).c.contains(next2)) {
                                }
                            }
                            next2 = 0;
                        }
                        m0Var = next2;
                    } else {
                        throw new UnsupportedOperationException("Empty collection can't be reduced.");
                    }
                }
                if (m0Var != null) {
                    c = m0Var;
                } else {
                    l.b.getClass();
                    ArrayList a3 = a(a2, new u(l.a.b));
                    a3.isEmpty();
                    if (a3.size() < 2) {
                        c = (m0) x.O0(a3);
                    } else {
                        c = new c0(linkedHashSet).c();
                    }
                }
            }
            return c.O0(a1Var2);
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }
}

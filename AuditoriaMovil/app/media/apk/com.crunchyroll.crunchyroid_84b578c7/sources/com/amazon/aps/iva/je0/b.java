package com.amazon.aps.iva.je0;

import com.amazon.aps.iva.ee0.c1;
import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.f0;
import com.amazon.aps.iva.ee0.j1;
import com.amazon.aps.iva.ee0.l1;
import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.ee0.o1;
import com.amazon.aps.iva.ee0.q1;
import com.amazon.aps.iva.ee0.s1;
import com.amazon.aps.iva.ee0.v1;
import com.amazon.aps.iva.kb0.h;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.lc0.k;
import com.amazon.aps.iva.oc0.y0;
import com.amazon.aps.iva.yb0.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: CapturedTypeApproximation.kt */
/* loaded from: classes4.dex */
public final class b {

    /* compiled from: CapturedTypeApproximation.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[v1.values().length];
            try {
                iArr[v1.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v1.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v1.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final com.amazon.aps.iva.je0.a<e0> a(e0 e0Var) {
        Object b;
        v1 b2;
        e eVar;
        j.f(e0Var, "type");
        if (com.amazon.aps.iva.dg.b.x(e0Var)) {
            com.amazon.aps.iva.je0.a<e0> a2 = a(com.amazon.aps.iva.dg.b.C(e0Var));
            com.amazon.aps.iva.je0.a<e0> a3 = a(com.amazon.aps.iva.dg.b.J(e0Var));
            return new com.amazon.aps.iva.je0.a<>(com.amazon.aps.iva.dg.b.w(f0.c(com.amazon.aps.iva.dg.b.C(a2.a), com.amazon.aps.iva.dg.b.J(a3.a)), e0Var), com.amazon.aps.iva.dg.b.w(f0.c(com.amazon.aps.iva.dg.b.C(a2.b), com.amazon.aps.iva.dg.b.J(a3.b)), e0Var));
        }
        c1 I0 = e0Var.I0();
        if (e0Var.I0() instanceof com.amazon.aps.iva.rd0.b) {
            j.d(I0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            j1 b3 = ((com.amazon.aps.iva.rd0.b) I0).b();
            e0 type = b3.getType();
            j.e(type, "typeProjection.type");
            e0 k = s1.k(type, e0Var.J0());
            int i = a.a[b3.c().ordinal()];
            if (i != 2) {
                if (i == 3) {
                    m0 o = com.amazon.aps.iva.da0.a.n(e0Var).o();
                    j.e(o, "type.builtIns.nothingType");
                    return new com.amazon.aps.iva.je0.a<>(s1.k(o, e0Var.J0()), k);
                }
                throw new AssertionError("Only nontrivial projections should have been captured, not: " + b3);
            }
            m0 p = com.amazon.aps.iva.da0.a.n(e0Var).p();
            j.e(p, "type.builtIns.nullableAnyType");
            return new com.amazon.aps.iva.je0.a<>(k, p);
        } else if (!e0Var.G0().isEmpty() && e0Var.G0().size() == I0.getParameters().size()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List<y0> parameters = I0.getParameters();
            j.e(parameters, "typeConstructor.parameters");
            Iterator it = x.e1(e0Var.G0(), parameters).iterator();
            while (true) {
                boolean z = true;
                if (it.hasNext()) {
                    com.amazon.aps.iva.kb0.j jVar = (com.amazon.aps.iva.kb0.j) it.next();
                    j1 j1Var = (j1) jVar.b;
                    y0 y0Var = (y0) jVar.c;
                    j.e(y0Var, "typeParameter");
                    v1 i2 = y0Var.i();
                    if (i2 != null) {
                        if (j1Var != null) {
                            q1 q1Var = q1.b;
                            if (j1Var.b()) {
                                b2 = v1.OUT_VARIANCE;
                                if (b2 == null) {
                                    q1.a(37);
                                    throw null;
                                }
                            } else {
                                b2 = q1.b(i2, j1Var.c());
                            }
                            int i3 = a.a[b2.ordinal()];
                            if (i3 != 1) {
                                if (i3 != 2) {
                                    if (i3 == 3) {
                                        m0 o2 = com.amazon.aps.iva.ud0.b.e(y0Var).o();
                                        j.e(o2, "typeParameter.builtIns.nothingType");
                                        e0 type2 = j1Var.getType();
                                        j.e(type2, "type");
                                        eVar = new e(y0Var, o2, type2);
                                    } else {
                                        throw new h();
                                    }
                                } else {
                                    e0 type3 = j1Var.getType();
                                    j.e(type3, "type");
                                    m0 p2 = com.amazon.aps.iva.ud0.b.e(y0Var).p();
                                    j.e(p2, "typeParameter.builtIns.nullableAnyType");
                                    eVar = new e(y0Var, type3, p2);
                                }
                            } else {
                                e0 type4 = j1Var.getType();
                                j.e(type4, "type");
                                e0 type5 = j1Var.getType();
                                j.e(type5, "type");
                                eVar = new e(y0Var, type4, type5);
                            }
                            if (j1Var.b()) {
                                arrayList.add(eVar);
                                arrayList2.add(eVar);
                            } else {
                                com.amazon.aps.iva.je0.a<e0> a4 = a(eVar.b);
                                com.amazon.aps.iva.je0.a<e0> a5 = a(eVar.c);
                                y0 y0Var2 = eVar.a;
                                e eVar2 = new e(y0Var2, a4.b, a5.a);
                                e eVar3 = new e(y0Var2, a4.a, a5.b);
                                arrayList.add(eVar2);
                                arrayList2.add(eVar3);
                            }
                        } else {
                            q1.a(36);
                            throw null;
                        }
                    } else {
                        q1.a(35);
                        throw null;
                    }
                } else {
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            e eVar4 = (e) it2.next();
                            eVar4.getClass();
                            if (!com.amazon.aps.iva.fe0.d.a.d(eVar4.b, eVar4.c)) {
                                break;
                            }
                        }
                    }
                    z = false;
                    if (z) {
                        b = com.amazon.aps.iva.da0.a.n(e0Var).o();
                        j.e(b, "type.builtIns.nothingType");
                    } else {
                        b = b(arrayList, e0Var);
                    }
                    return new com.amazon.aps.iva.je0.a<>(b, b(arrayList2, e0Var));
                }
            }
        } else {
            return new com.amazon.aps.iva.je0.a<>(e0Var, e0Var);
        }
    }

    public static final e0 b(ArrayList arrayList, e0 e0Var) {
        l1 l1Var;
        boolean z;
        e0Var.G0().size();
        arrayList.size();
        ArrayList arrayList2 = new ArrayList(r.Y(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            eVar.getClass();
            com.amazon.aps.iva.fe0.d.a.d(eVar.b, eVar.c);
            e0 e0Var2 = eVar.b;
            e0 e0Var3 = eVar.c;
            if (!j.a(e0Var2, e0Var3)) {
                y0 y0Var = eVar.a;
                v1 i = y0Var.i();
                v1 v1Var = v1.IN_VARIANCE;
                if (i != v1Var) {
                    if (k.F(e0Var2) && y0Var.i() != v1Var) {
                        v1 v1Var2 = v1.OUT_VARIANCE;
                        if (v1Var2 == y0Var.i()) {
                            v1Var2 = v1.INVARIANT;
                        }
                        l1Var = new l1(e0Var3, v1Var2);
                    } else if (e0Var3 != null) {
                        if (k.y(e0Var3) && e0Var3.J0()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            if (v1Var == y0Var.i()) {
                                v1Var = v1.INVARIANT;
                            }
                            l1Var = new l1(e0Var2, v1Var);
                        } else {
                            v1 v1Var3 = v1.OUT_VARIANCE;
                            if (v1Var3 == y0Var.i()) {
                                v1Var3 = v1.INVARIANT;
                            }
                            l1Var = new l1(e0Var3, v1Var3);
                        }
                    } else {
                        k.a(140);
                        throw null;
                    }
                    arrayList2.add(l1Var);
                }
            }
            l1Var = new l1(e0Var2);
            arrayList2.add(l1Var);
        }
        return o1.c(e0Var, arrayList2, null, 6);
    }
}

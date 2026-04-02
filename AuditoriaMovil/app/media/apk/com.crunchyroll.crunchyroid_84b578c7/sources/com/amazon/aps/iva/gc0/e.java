package com.amazon.aps.iva.gc0;

import com.amazon.aps.iva.ee0.a1;
import com.amazon.aps.iva.ee0.c1;
import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.f0;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ee0.l1;
import com.amazon.aps.iva.ee0.s0;
import com.amazon.aps.iva.ee0.v1;
import com.amazon.aps.iva.fc0.s;
import com.amazon.aps.iva.he0.k;
import com.amazon.aps.iva.ic0.k0;
import com.amazon.aps.iva.ic0.q;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.oc0.h;
import com.amazon.aps.iva.oc0.y0;
import com.amazon.aps.iva.yb0.j;
import java.util.ArrayList;
import java.util.List;
/* compiled from: KClassifiers.kt */
/* loaded from: classes4.dex */
public final class e {

    /* compiled from: KClassifiers.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[s.values().length];
            try {
                iArr[s.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final k0 a(com.amazon.aps.iva.fc0.d dVar, List list, boolean z, List list2) {
        q qVar;
        h m;
        a1 a1Var;
        e0 e0Var;
        int i;
        k s0Var;
        j.f(dVar, "<this>");
        j.f(list, "arguments");
        j.f(list2, "annotations");
        if (dVar instanceof q) {
            qVar = (q) dVar;
        } else {
            qVar = null;
        }
        if (qVar != null && (m = qVar.m()) != null) {
            c1 h = m.h();
            j.e(h, "descriptor.typeConstructor");
            List<y0> parameters = h.getParameters();
            j.e(parameters, "typeConstructor.parameters");
            if (parameters.size() == list.size()) {
                if (list2.isEmpty()) {
                    a1.c.getClass();
                    a1Var = a1.d;
                } else {
                    a1.c.getClass();
                    a1Var = a1.d;
                }
                List<y0> parameters2 = h.getParameters();
                j.e(parameters2, "typeConstructor.parameters");
                List list3 = list;
                ArrayList arrayList = new ArrayList(r.Y(list3));
                int i2 = 0;
                for (Object obj : list3) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        com.amazon.aps.iva.fc0.r rVar = (com.amazon.aps.iva.fc0.r) obj;
                        k0 k0Var = (k0) rVar.b;
                        if (k0Var != null) {
                            e0Var = k0Var.b;
                        } else {
                            e0Var = null;
                        }
                        s sVar = rVar.a;
                        if (sVar == null) {
                            i = -1;
                        } else {
                            i = a.a[sVar.ordinal()];
                        }
                        if (i != -1) {
                            if (i != 1) {
                                if (i != 2) {
                                    if (i == 3) {
                                        v1 v1Var = v1.OUT_VARIANCE;
                                        j.c(e0Var);
                                        s0Var = new l1(e0Var, v1Var);
                                    } else {
                                        throw new com.amazon.aps.iva.kb0.h();
                                    }
                                } else {
                                    v1 v1Var2 = v1.IN_VARIANCE;
                                    j.c(e0Var);
                                    s0Var = new l1(e0Var, v1Var2);
                                }
                            } else {
                                v1 v1Var3 = v1.INVARIANT;
                                j.c(e0Var);
                                s0Var = new l1(e0Var, v1Var3);
                            }
                        } else {
                            y0 y0Var = parameters2.get(i2);
                            j.e(y0Var, "parameters[index]");
                            s0Var = new s0(y0Var);
                        }
                        arrayList.add(s0Var);
                        i2 = i3;
                    } else {
                        f1.S();
                        throw null;
                    }
                }
                return new k0(f0.f(a1Var, h, arrayList, z, null), null);
            }
            throw new IllegalArgumentException("Class declares " + parameters.size() + " type parameters, but " + list.size() + " were provided.");
        }
        throw new com.amazon.aps.iva.wb0.a("Cannot create type for an unsupported classifier: " + dVar + " (" + dVar.getClass() + ')');
    }
}

package com.amazon.aps.iva.l0;

import com.amazon.aps.iva.j0.e1;
import com.amazon.aps.iva.j0.p2;
import com.amazon.aps.iva.j0.q2;
import com.amazon.aps.iva.l0.d0;
import com.amazon.aps.iva.o0.q1;
/* compiled from: TextFieldSelectionManager.android.kt */
/* loaded from: classes.dex */
public final class e0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.e1.c> {
    public final /* synthetic */ c0 h;
    public final /* synthetic */ q1<com.amazon.aps.iva.o2.j> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(c0 c0Var, q1<com.amazon.aps.iva.o2.j> q1Var) {
        super(0);
        this.h = c0Var;
        this.i = q1Var;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.e1.c invoke() {
        boolean z;
        int i;
        long j;
        int i2;
        q2 c;
        com.amazon.aps.iva.c2.y yVar;
        e1 e1Var;
        com.amazon.aps.iva.c2.b bVar;
        com.amazon.aps.iva.s1.q qVar;
        com.amazon.aps.iva.s1.q qVar2;
        boolean z2;
        long j2 = this.i.getValue().a;
        c0 c0Var = this.h;
        com.amazon.aps.iva.yb0.j.f(c0Var, "manager");
        if (c0Var.j().a.b.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            j = com.amazon.aps.iva.e1.c.d;
        } else {
            com.amazon.aps.iva.j0.h0 h0Var = (com.amazon.aps.iva.j0.h0) c0Var.o.getValue();
            if (h0Var == null) {
                i = -1;
            } else {
                i = d0.c.a[h0Var.ordinal()];
            }
            if (i != -1) {
                if (i != 1 && i != 2) {
                    if (i == 3) {
                        i2 = com.amazon.aps.iva.c2.z.c(c0Var.j().b);
                    } else {
                        throw new com.amazon.aps.iva.kb0.h();
                    }
                } else {
                    long j3 = c0Var.j().b;
                    int i3 = com.amazon.aps.iva.c2.z.c;
                    i2 = (int) (j3 >> 32);
                }
                int b = c0Var.b.b(i2);
                p2 p2Var = c0Var.d;
                if (p2Var != null && (c = p2Var.c()) != null && (yVar = c.a) != null) {
                    p2 p2Var2 = c0Var.d;
                    if (p2Var2 != null && (e1Var = p2Var2.a) != null && (bVar = e1Var.a) != null) {
                        com.amazon.aps.iva.ec0.j m0 = com.amazon.aps.iva.oe0.q.m0(bVar);
                        if (m0 instanceof com.amazon.aps.iva.ec0.f) {
                            b = ((Number) com.amazon.aps.iva.aq.j.l(Integer.valueOf(b), (com.amazon.aps.iva.ec0.f) m0)).intValue();
                        } else if (!m0.isEmpty()) {
                            if (b < ((Number) m0.d()).intValue()) {
                                b = ((Number) m0.d()).intValue();
                            } else if (b > ((Number) m0.e()).intValue()) {
                                b = ((Number) m0.e()).intValue();
                            }
                        } else {
                            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + m0 + '.');
                        }
                        long a = yVar.b(b).a();
                        p2 p2Var3 = c0Var.d;
                        if (p2Var3 != null && (qVar = p2Var3.g) != null) {
                            q2 c2 = p2Var3.c();
                            if (c2 != null && (qVar2 = c2.b) != null) {
                                com.amazon.aps.iva.e1.c cVar = (com.amazon.aps.iva.e1.c) c0Var.p.getValue();
                                if (cVar != null) {
                                    float c3 = com.amazon.aps.iva.e1.c.c(qVar2.a0(qVar, cVar.a));
                                    int g = yVar.g(b);
                                    int k = yVar.k(g);
                                    int f = yVar.f(g, true);
                                    if (((int) (c0Var.j().b >> 32)) > com.amazon.aps.iva.c2.z.c(c0Var.j().b)) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    float A = com.amazon.aps.iva.e.w.A(yVar, k, true, z2);
                                    float A2 = com.amazon.aps.iva.e.w.A(yVar, f, false, z2);
                                    float i4 = com.amazon.aps.iva.aq.j.i(c3, Math.min(A, A2), Math.max(A, A2));
                                    if (Math.abs(c3 - i4) > ((int) (j2 >> 32)) / 2) {
                                        j = com.amazon.aps.iva.e1.c.d;
                                    } else {
                                        j = qVar.a0(qVar2, com.amazon.aps.iva.e1.d.d(i4, com.amazon.aps.iva.e1.c.d(a)));
                                    }
                                } else {
                                    j = com.amazon.aps.iva.e1.c.d;
                                }
                            } else {
                                j = com.amazon.aps.iva.e1.c.d;
                            }
                        } else {
                            j = com.amazon.aps.iva.e1.c.d;
                        }
                    } else {
                        j = com.amazon.aps.iva.e1.c.d;
                    }
                } else {
                    j = com.amazon.aps.iva.e1.c.d;
                }
            } else {
                j = com.amazon.aps.iva.e1.c.d;
            }
        }
        return new com.amazon.aps.iva.e1.c(j);
    }
}

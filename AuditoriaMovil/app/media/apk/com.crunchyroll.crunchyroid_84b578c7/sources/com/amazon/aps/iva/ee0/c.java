package com.amazon.aps.iva.ee0;

import com.amazon.aps.iva.ee0.b1;
import java.util.ArrayDeque;
/* compiled from: AbstractTypeChecker.kt */
/* loaded from: classes4.dex */
public final class c {
    public static boolean a(b1 b1Var, com.amazon.aps.iva.he0.i iVar, b1.c cVar) {
        boolean z;
        b1.c cVar2;
        boolean z2;
        com.amazon.aps.iva.yb0.j.f(b1Var, "<this>");
        com.amazon.aps.iva.yb0.j.f(iVar, "type");
        com.amazon.aps.iva.yb0.j.f(cVar, "supertypesPolicy");
        com.amazon.aps.iva.he0.n nVar = b1Var.c;
        if ((nVar.W(iVar) && !nVar.o(iVar)) || nVar.Y(iVar)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            b1Var.c();
            ArrayDeque<com.amazon.aps.iva.he0.i> arrayDeque = b1Var.g;
            com.amazon.aps.iva.yb0.j.c(arrayDeque);
            com.amazon.aps.iva.me0.d dVar = b1Var.h;
            com.amazon.aps.iva.yb0.j.c(dVar);
            arrayDeque.push(iVar);
            while (!arrayDeque.isEmpty()) {
                if (dVar.c <= 1000) {
                    com.amazon.aps.iva.he0.i pop = arrayDeque.pop();
                    com.amazon.aps.iva.yb0.j.e(pop, "current");
                    if (dVar.add(pop)) {
                        if (nVar.o(pop)) {
                            cVar2 = b1.c.C0222c.a;
                        } else {
                            cVar2 = cVar;
                        }
                        if (!(!com.amazon.aps.iva.yb0.j.a(cVar2, b1.c.C0222c.a))) {
                            cVar2 = null;
                        }
                        if (cVar2 == null) {
                            continue;
                        } else {
                            for (com.amazon.aps.iva.he0.h hVar : nVar.M(nVar.i(pop))) {
                                com.amazon.aps.iva.he0.i a = cVar2.a(b1Var, hVar);
                                if ((nVar.W(a) && !nVar.o(a)) || nVar.Y(a)) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    b1Var.a();
                                } else {
                                    arrayDeque.add(a);
                                }
                            }
                            continue;
                        }
                    }
                } else {
                    throw new IllegalStateException(("Too many supertypes for type: " + iVar + ". Supertypes = " + com.amazon.aps.iva.lb0.x.B0(dVar, null, null, null, null, 63)).toString());
                }
            }
            b1Var.a();
            return false;
        }
        return true;
    }

    public static boolean b(b1 b1Var, com.amazon.aps.iva.he0.i iVar, com.amazon.aps.iva.he0.l lVar) {
        com.amazon.aps.iva.he0.n nVar = b1Var.c;
        if (nVar.e(iVar)) {
            return true;
        }
        if (nVar.o(iVar)) {
            return false;
        }
        if (b1Var.b && nVar.j0(iVar)) {
            return true;
        }
        return nVar.w(nVar.i(iVar), lVar);
    }
}

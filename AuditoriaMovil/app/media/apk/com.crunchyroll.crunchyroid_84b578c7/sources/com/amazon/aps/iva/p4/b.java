package com.amazon.aps.iva.p4;

import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.r4.t1;
import java.util.ArrayList;
import java.util.List;
/* compiled from: Applier.kt */
/* loaded from: classes.dex */
public final class b extends com.amazon.aps.iva.o0.a<i> {
    public final int d;

    public b(t1 t1Var) {
        super(t1Var);
        this.d = t1Var.a;
    }

    @Override // com.amazon.aps.iva.o0.d
    public final void a(int i, int i2, int i3) {
        int i4;
        ArrayList j = j();
        com.amazon.aps.iva.yb0.j.f(j, "<this>");
        if (i > i2) {
            i4 = i2;
        } else {
            i4 = i2 - i3;
        }
        if (i3 == 1) {
            if (i != i2 + 1 && i != i2 - 1) {
                j.add(i4, j.remove(i));
                return;
            } else {
                j.set(i, j.set(i2, j.get(i)));
                return;
            }
        }
        List subList = j.subList(i, i3 + i);
        ArrayList Z0 = x.Z0(subList);
        subList.clear();
        j.addAll(i4, Z0);
    }

    @Override // com.amazon.aps.iva.o0.d
    public final void b(int i, int i2) {
        ArrayList j = j();
        com.amazon.aps.iva.yb0.j.f(j, "<this>");
        if (i2 == 1) {
            j.remove(i);
        } else {
            j.subList(i, i2 + i).clear();
        }
    }

    @Override // com.amazon.aps.iva.o0.d
    public final void c(int i, Object obj) {
        boolean z;
        int i2;
        i iVar = (i) obj;
        com.amazon.aps.iva.yb0.j.f(iVar, "instance");
        T t = this.c;
        com.amazon.aps.iva.yb0.j.d(t, "null cannot be cast to non-null type androidx.glance.EmittableWithChildren");
        int i3 = ((l) t).a;
        if (i3 > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (iVar instanceof l) {
                l lVar = (l) iVar;
                if (lVar.b) {
                    i2 = this.d;
                } else {
                    i2 = i3 - 1;
                }
                lVar.a = i2;
            }
            j().add(i, iVar);
            return;
        }
        StringBuilder sb = new StringBuilder("Too many embedded views for the current surface. The maximum depth is: ");
        T t2 = this.a;
        com.amazon.aps.iva.yb0.j.d(t2, "null cannot be cast to non-null type androidx.glance.EmittableWithChildren");
        sb.append(((l) t2).a);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    @Override // com.amazon.aps.iva.o0.d
    public final void f(int i, Object obj) {
        com.amazon.aps.iva.yb0.j.f((i) obj, "instance");
    }

    @Override // com.amazon.aps.iva.o0.a
    public final void i() {
        T t = this.a;
        com.amazon.aps.iva.yb0.j.d(t, "null cannot be cast to non-null type androidx.glance.EmittableWithChildren");
        ((l) t).c.clear();
    }

    public final ArrayList j() {
        i iVar = (i) this.c;
        if (iVar instanceof l) {
            return ((l) iVar).c;
        }
        throw new IllegalStateException("Current node cannot accept children");
    }
}

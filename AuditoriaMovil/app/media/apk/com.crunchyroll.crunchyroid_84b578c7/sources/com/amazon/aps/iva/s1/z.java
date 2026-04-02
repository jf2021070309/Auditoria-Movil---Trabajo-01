package com.amazon.aps.iva.s1;

import com.amazon.aps.iva.s1.e1;
/* compiled from: SubcomposeLayout.kt */
/* loaded from: classes.dex */
public final class z implements e1.a {
    public final /* synthetic */ x a;
    public final /* synthetic */ Object b;

    public z(x xVar, Object obj) {
        this.a = xVar;
        this.b = obj;
    }

    @Override // com.amazon.aps.iva.s1.e1.a
    public final int a() {
        androidx.compose.ui.node.e eVar = (androidx.compose.ui.node.e) this.a.j.get(this.b);
        if (eVar != null) {
            return eVar.r().size();
        }
        return 0;
    }

    @Override // com.amazon.aps.iva.s1.e1.a
    public final void b(int i, long j) {
        x xVar = this.a;
        androidx.compose.ui.node.e eVar = (androidx.compose.ui.node.e) xVar.j.get(this.b);
        if (eVar != null && eVar.F()) {
            int size = eVar.r().size();
            if (i >= 0 && i < size) {
                if (!eVar.G()) {
                    androidx.compose.ui.node.e eVar2 = xVar.a;
                    eVar2.m = true;
                    com.amazon.aps.iva.aq.j.K(eVar).l(eVar.r().get(i), j);
                    eVar2.m = false;
                    return;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IndexOutOfBoundsException("Index (" + i + ") is out of bound of [0, " + size + ')');
        }
    }

    @Override // com.amazon.aps.iva.s1.e1.a
    public final void dispose() {
        boolean z;
        boolean z2;
        x xVar = this.a;
        xVar.b();
        androidx.compose.ui.node.e eVar = (androidx.compose.ui.node.e) xVar.j.remove(this.b);
        if (eVar != null) {
            if (xVar.m > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                androidx.compose.ui.node.e eVar2 = xVar.a;
                int indexOf = eVar2.t().indexOf(eVar);
                int size = eVar2.t().size();
                int i = xVar.m;
                if (indexOf >= size - i) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    xVar.l++;
                    xVar.m = i - 1;
                    int size2 = (eVar2.t().size() - xVar.m) - xVar.l;
                    eVar2.m = true;
                    eVar2.J(indexOf, size2, 1);
                    eVar2.m = false;
                    xVar.a(size2);
                    return;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }
}

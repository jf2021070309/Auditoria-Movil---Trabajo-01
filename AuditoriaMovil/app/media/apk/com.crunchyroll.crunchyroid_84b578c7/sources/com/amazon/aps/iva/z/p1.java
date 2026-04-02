package com.amazon.aps.iva.z;

import java.util.ArrayList;
/* compiled from: VectorizedAnimationSpec.kt */
/* loaded from: classes.dex */
public final class p1 implements q {
    public final ArrayList a;

    public p1(float f, float f2, p pVar) {
        com.amazon.aps.iva.ec0.j T = com.amazon.aps.iva.aq.j.T(0, pVar.b());
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(T));
        com.amazon.aps.iva.ec0.i it = T.iterator();
        while (it.d) {
            arrayList.add(new c0(f, f2, pVar.a(it.b())));
        }
        this.a = arrayList;
    }

    @Override // com.amazon.aps.iva.z.q
    public final a0 get(int i) {
        return (c0) this.a.get(i);
    }
}

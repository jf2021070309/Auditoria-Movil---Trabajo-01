package com.amazon.aps.iva.u2;

import com.amazon.aps.iva.v2.o;
import java.util.ArrayList;
/* compiled from: HelperWidget.java */
/* loaded from: classes.dex */
public class j extends e implements i {
    public e[] s0 = new e[4];
    public int t0 = 0;

    public final void R(int i, o oVar, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.t0; i2++) {
            e eVar = this.s0[i2];
            ArrayList<e> arrayList2 = oVar.a;
            if (!arrayList2.contains(eVar)) {
                arrayList2.add(eVar);
            }
        }
        for (int i3 = 0; i3 < this.t0; i3++) {
            com.amazon.aps.iva.v2.i.a(this.s0[i3], i, arrayList, oVar);
        }
    }

    @Override // com.amazon.aps.iva.u2.i
    public void a() {
    }
}

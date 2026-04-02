package com.amazon.aps.iva.u2;

import java.util.ArrayList;
/* compiled from: WidgetContainer.java */
/* loaded from: classes.dex */
public class m extends e {
    public ArrayList<e> s0 = new ArrayList<>();

    @Override // com.amazon.aps.iva.u2.e
    public void D() {
        this.s0.clear();
        super.D();
    }

    @Override // com.amazon.aps.iva.u2.e
    public final void G(com.amazon.aps.iva.s2.c cVar) {
        super.G(cVar);
        int size = this.s0.size();
        for (int i = 0; i < size; i++) {
            this.s0.get(i).G(cVar);
        }
    }

    public void R() {
        ArrayList<e> arrayList = this.s0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            e eVar = this.s0.get(i);
            if (eVar instanceof m) {
                ((m) eVar).R();
            }
        }
    }
}

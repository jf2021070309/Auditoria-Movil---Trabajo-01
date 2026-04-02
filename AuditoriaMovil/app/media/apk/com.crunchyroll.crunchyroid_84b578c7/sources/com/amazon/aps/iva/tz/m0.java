package com.amazon.aps.iva.tz;

import com.amazon.aps.iva.uz.h;
import com.ellation.crunchyroll.model.Panel;
import java.util.ArrayList;
import java.util.List;
/* compiled from: BrowseAllUiMapper.kt */
/* loaded from: classes2.dex */
public final class m0 implements l0 {
    public final y0 a;

    public m0(y0 y0Var) {
        this.a = y0Var;
    }

    @Override // com.amazon.aps.iva.tz.l0
    public final ArrayList a(int i, int i2, List list) {
        com.amazon.aps.iva.yb0.j.f(list, "panels");
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Panel panel = (Panel) com.amazon.aps.iva.lb0.x.w0(i4, list);
            int i5 = i + i4 + i3;
            y0 y0Var = this.a;
            if (y0Var.b(i5) && i4 + i3 < i2) {
                arrayList.add(y0Var.d(i5));
                if (panel != null) {
                    arrayList.add(new h.c.a(panel));
                }
                i3++;
            } else if (y0Var.c(i5) && i5 == i) {
                if (panel != null) {
                    arrayList.add(new h.c.a(panel));
                }
            } else if (panel != null) {
                arrayList.add(new h.c.C0774c(panel));
            }
        }
        if (arrayList.size() != i2) {
            int size = i2 - arrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i6 = 0; i6 < size; i6++) {
                arrayList2.add(h.a.b);
            }
            return com.amazon.aps.iva.lb0.x.L0(arrayList2, arrayList);
        }
        return arrayList;
    }
}

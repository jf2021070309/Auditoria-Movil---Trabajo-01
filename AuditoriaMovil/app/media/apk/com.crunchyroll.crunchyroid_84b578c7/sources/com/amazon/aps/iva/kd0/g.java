package com.amazon.aps.iva.kd0;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.id0.p;
import com.amazon.aps.iva.id0.s;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.od0.v;
import com.amazon.aps.iva.yb0.j;
import java.util.ArrayList;
import java.util.List;
/* compiled from: TypeTable.kt */
/* loaded from: classes4.dex */
public final class g {
    public final List<p> a;

    public g(s sVar) {
        boolean z;
        List<p> list = sVar.d;
        int i = 0;
        if ((sVar.c & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i2 = sVar.e;
            j.e(list, "typeTable.typeList");
            List<p> list2 = list;
            ArrayList arrayList = new ArrayList(r.Y(list2));
            for (Object obj : list2) {
                int i3 = i + 1;
                if (i >= 0) {
                    p pVar = (p) obj;
                    if (i >= i2) {
                        pVar.getClass();
                        p.c n = p.n(pVar);
                        n.e |= 2;
                        n.g = true;
                        pVar = n.f();
                        if (!pVar.isInitialized()) {
                            throw new v();
                        }
                    }
                    arrayList.add(pVar);
                    i = i3;
                } else {
                    f1.S();
                    throw null;
                }
            }
            list = arrayList;
        }
        j.e(list, "run {\n        val origin… else originalTypes\n    }");
        this.a = list;
    }

    public final p a(int i) {
        return this.a.get(i);
    }
}

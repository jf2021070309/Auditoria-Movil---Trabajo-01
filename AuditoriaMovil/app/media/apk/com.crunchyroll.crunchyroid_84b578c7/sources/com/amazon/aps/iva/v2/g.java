package com.amazon.aps.iva.v2;

import com.amazon.aps.iva.v2.f;
import java.util.Iterator;
/* compiled from: DimensionDependency.java */
/* loaded from: classes.dex */
public class g extends f {
    public int m;

    public g(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.e = f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // com.amazon.aps.iva.v2.f
    public final void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            dVar.a(dVar);
        }
    }
}

package com.amazon.aps.iva.ud0;

import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.me0.a;
import java.util.Collection;
/* loaded from: classes4.dex */
public final class a implements a.c {
    public final boolean b;

    public a(boolean z) {
        this.b = z;
    }

    @Override // com.amazon.aps.iva.me0.a.c
    public final Iterable h(Object obj) {
        com.amazon.aps.iva.oc0.b bVar = (com.amazon.aps.iva.oc0.b) obj;
        Collection<? extends com.amazon.aps.iva.oc0.b> collection = null;
        if (this.b) {
            if (bVar != null) {
                bVar = bVar.a();
            } else {
                bVar = null;
            }
        }
        if (bVar != null) {
            collection = bVar.k();
        }
        if (collection == null) {
            return z.b;
        }
        return collection;
    }
}

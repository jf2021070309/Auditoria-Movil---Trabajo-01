package com.amazon.aps.iva.v4;

import com.amazon.aps.iva.v4.s;
import java.util.Map;
/* compiled from: SmallSortedMap.java */
/* loaded from: classes.dex */
public final class g1 extends h1<Object, Object> {
    @Override // com.amazon.aps.iva.v4.h1
    public final void i() {
        if (!this.e) {
            for (int i = 0; i < e(); i++) {
                ((s.b) d(i).getKey()).isRepeated();
            }
            for (Map.Entry<Object, Object> entry : g()) {
                ((s.b) entry.getKey()).isRepeated();
            }
        }
        super.i();
    }

    @Override // com.amazon.aps.iva.v4.h1, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((s.b) obj, obj2);
    }
}

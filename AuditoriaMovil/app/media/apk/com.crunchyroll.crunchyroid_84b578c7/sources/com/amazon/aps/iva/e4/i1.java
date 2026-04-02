package com.amazon.aps.iva.e4;

import com.amazon.aps.iva.e4.t;
import java.util.Map;
/* compiled from: SmallSortedMap.java */
/* loaded from: classes.dex */
public final class i1 extends j1<Object, Object> {
    @Override // com.amazon.aps.iva.e4.j1
    public final void i() {
        if (!this.e) {
            for (int i = 0; i < e(); i++) {
                ((t.b) d(i).getKey()).isRepeated();
            }
            for (Map.Entry<Object, Object> entry : g()) {
                ((t.b) entry.getKey()).isRepeated();
            }
        }
        super.i();
    }

    @Override // com.amazon.aps.iva.e4.j1, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((t.b) obj, obj2);
    }
}

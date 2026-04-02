package com.amazon.aps.iva.rc;

import com.amazon.aps.iva.rc.n;
import java.util.ArrayDeque;
/* compiled from: ModelCache.java */
/* loaded from: classes.dex */
public final class m extends com.amazon.aps.iva.hd.i<n.a<Object>, Object> {
    public m() {
        super(500L);
    }

    @Override // com.amazon.aps.iva.hd.i
    public final void c(n.a<Object> aVar, Object obj) {
        n.a<Object> aVar2 = aVar;
        aVar2.getClass();
        ArrayDeque arrayDeque = n.a.d;
        synchronized (arrayDeque) {
            arrayDeque.offer(aVar2);
        }
    }
}

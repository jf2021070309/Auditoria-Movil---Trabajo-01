package com.amazon.aps.iva.hb;

import java.util.LinkedList;
/* compiled from: SkipLastRowStrategy.java */
/* loaded from: classes.dex */
public final class n implements j {
    public final j b;
    public final boolean c;

    public n(j jVar, boolean z) {
        this.b = jVar;
        this.c = z;
    }

    @Override // com.amazon.aps.iva.hb.j
    public final void b(com.amazon.aps.iva.ib.a aVar, LinkedList linkedList) {
        if (this.c && !aVar.j) {
            return;
        }
        this.b.b(aVar, linkedList);
    }
}

package com.amazon.aps.iva.pc;

import com.amazon.aps.iva.nc.m;
import com.amazon.aps.iva.nc.w;
import com.amazon.aps.iva.pc.h;
/* compiled from: LruResourceCache.java */
/* loaded from: classes.dex */
public final class g extends com.amazon.aps.iva.hd.i<com.amazon.aps.iva.kc.f, w<?>> implements h {
    public h.a d;

    @Override // com.amazon.aps.iva.hd.i
    public final int b(w<?> wVar) {
        w<?> wVar2 = wVar;
        if (wVar2 == null) {
            return 1;
        }
        return wVar2.a();
    }

    @Override // com.amazon.aps.iva.hd.i
    public final void c(com.amazon.aps.iva.kc.f fVar, w<?> wVar) {
        w<?> wVar2 = wVar;
        h.a aVar = this.d;
        if (aVar != null && wVar2 != null) {
            ((m) aVar).e.a(wVar2, true);
        }
    }
}

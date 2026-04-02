package com.amazon.aps.iva.jb;

import com.amazon.aps.iva.a9.w;
/* compiled from: CacheRowBreaker.java */
/* loaded from: classes.dex */
public final class b extends w {
    public final com.amazon.aps.iva.gb.b e;

    public b(com.amazon.aps.iva.gb.b bVar, f fVar) {
        super(fVar);
        this.e = bVar;
    }

    @Override // com.amazon.aps.iva.a9.w, com.amazon.aps.iva.jb.f
    public final boolean h(com.amazon.aps.iva.ib.a aVar) {
        boolean contains = ((com.amazon.aps.iva.gb.c) this.e).c.contains(Integer.valueOf(aVar.c));
        if (!super.h(aVar) && !contains) {
            return false;
        }
        return true;
    }
}

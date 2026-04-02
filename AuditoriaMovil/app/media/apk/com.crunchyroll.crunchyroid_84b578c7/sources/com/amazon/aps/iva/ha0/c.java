package com.amazon.aps.iva.ha0;

import com.amazon.aps.iva.fa0.t;
/* loaded from: classes4.dex */
public class c implements com.amazon.aps.iva.da0.g {
    public int b;
    public final com.amazon.aps.iva.da0.f c;

    public c(com.amazon.aps.iva.da0.f fVar) {
        this.c = fVar;
    }

    @Override // com.amazon.aps.iva.da0.g
    public final void a(int i) {
        this.b = i;
    }

    @Override // com.amazon.aps.iva.da0.g
    public void b(com.amazon.aps.iva.da0.e eVar) {
        if (eVar.w()) {
            d((t) eVar);
        }
    }

    public final void c(com.amazon.aps.iva.da0.a aVar) {
        this.c.a(aVar);
    }

    @Override // com.amazon.aps.iva.da0.g
    public final int getId() {
        return this.b;
    }

    public void d(t tVar) {
    }
}

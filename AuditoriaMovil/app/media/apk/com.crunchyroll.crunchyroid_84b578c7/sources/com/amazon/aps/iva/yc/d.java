package com.amazon.aps.iva.yc;

import android.graphics.Bitmap;
import com.amazon.aps.iva.yc.f;
/* compiled from: GifDrawableResource.java */
/* loaded from: classes.dex */
public final class d extends com.amazon.aps.iva.wc.f<c> {
    public d(c cVar) {
        super(cVar);
    }

    @Override // com.amazon.aps.iva.nc.w
    public final int a() {
        f fVar = ((c) this.b).b.a;
        return fVar.a.f() + fVar.o;
    }

    @Override // com.amazon.aps.iva.nc.w
    public final void b() {
        c cVar = (c) this.b;
        cVar.stop();
        cVar.e = true;
        f fVar = cVar.b.a;
        fVar.c.clear();
        Bitmap bitmap = fVar.l;
        if (bitmap != null) {
            fVar.e.d(bitmap);
            fVar.l = null;
        }
        fVar.f = false;
        f.a aVar = fVar.i;
        com.amazon.aps.iva.ec.g gVar = fVar.d;
        if (aVar != null) {
            gVar.a(aVar);
            fVar.i = null;
        }
        f.a aVar2 = fVar.k;
        if (aVar2 != null) {
            gVar.a(aVar2);
            fVar.k = null;
        }
        f.a aVar3 = fVar.n;
        if (aVar3 != null) {
            gVar.a(aVar3);
            fVar.n = null;
        }
        fVar.a.clear();
        fVar.j = true;
    }

    @Override // com.amazon.aps.iva.nc.w
    public final Class<c> d() {
        return c.class;
    }

    @Override // com.amazon.aps.iva.wc.f, com.amazon.aps.iva.nc.s
    public final void initialize() {
        ((c) this.b).b.a.l.prepareToDraw();
    }
}

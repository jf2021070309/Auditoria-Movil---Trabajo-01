package com.amazon.aps.iva.yc;

import android.graphics.Bitmap;
import com.amazon.aps.iva.kc.l;
import com.amazon.aps.iva.nc.w;
import java.security.MessageDigest;
/* compiled from: GifDrawableTransformation.java */
/* loaded from: classes.dex */
public final class e implements l<c> {
    public final l<Bitmap> b;

    public e(l<Bitmap> lVar) {
        defpackage.i.l(lVar);
        this.b = lVar;
    }

    @Override // com.amazon.aps.iva.kc.f
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // com.amazon.aps.iva.kc.l
    public final w b(com.bumptech.glide.c cVar, w wVar, int i, int i2) {
        c cVar2 = (c) wVar.get();
        com.amazon.aps.iva.uc.e eVar = new com.amazon.aps.iva.uc.e(cVar2.b.a.l, com.bumptech.glide.a.a(cVar).b);
        l<Bitmap> lVar = this.b;
        w b = lVar.b(cVar, eVar, i, i2);
        if (!eVar.equals(b)) {
            eVar.b();
        }
        cVar2.b.a.c(lVar, (Bitmap) b.get());
        return wVar;
    }

    @Override // com.amazon.aps.iva.kc.f
    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.b.equals(((e) obj).b);
        }
        return false;
    }

    @Override // com.amazon.aps.iva.kc.f
    public final int hashCode() {
        return this.b.hashCode();
    }
}

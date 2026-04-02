package com.amazon.aps.iva.uc;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;
/* compiled from: DrawableTransformation.java */
/* loaded from: classes.dex */
public final class p implements com.amazon.aps.iva.kc.l<Drawable> {
    public final com.amazon.aps.iva.kc.l<Bitmap> b;
    public final boolean c;

    public p(com.amazon.aps.iva.kc.l<Bitmap> lVar, boolean z) {
        this.b = lVar;
        this.c = z;
    }

    @Override // com.amazon.aps.iva.kc.f
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // com.amazon.aps.iva.kc.l
    public final com.amazon.aps.iva.nc.w b(com.bumptech.glide.c cVar, com.amazon.aps.iva.nc.w wVar, int i, int i2) {
        com.amazon.aps.iva.oc.c cVar2 = com.bumptech.glide.a.a(cVar).b;
        Drawable drawable = (Drawable) wVar.get();
        e a = o.a(cVar2, drawable, i, i2);
        if (a == null) {
            if (!this.c) {
                return wVar;
            }
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
        com.amazon.aps.iva.nc.w b = this.b.b(cVar, a, i, i2);
        if (b.equals(a)) {
            b.b();
            return wVar;
        }
        return new v(cVar.getResources(), b);
    }

    @Override // com.amazon.aps.iva.kc.f
    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.b.equals(((p) obj).b);
        }
        return false;
    }

    @Override // com.amazon.aps.iva.kc.f
    public final int hashCode() {
        return this.b.hashCode();
    }
}

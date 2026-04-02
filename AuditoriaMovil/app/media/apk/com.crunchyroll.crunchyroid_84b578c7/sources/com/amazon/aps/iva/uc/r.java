package com.amazon.aps.iva.uc;

import android.graphics.Bitmap;
import java.security.MessageDigest;
/* compiled from: FitCenter.java */
/* loaded from: classes.dex */
public final class r extends f {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(com.amazon.aps.iva.kc.f.a);

    @Override // com.amazon.aps.iva.kc.f
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // com.amazon.aps.iva.uc.f
    public final Bitmap c(com.amazon.aps.iva.oc.c cVar, Bitmap bitmap, int i, int i2) {
        return a0.b(cVar, bitmap, i, i2);
    }

    @Override // com.amazon.aps.iva.kc.f
    public final boolean equals(Object obj) {
        return obj instanceof r;
    }

    @Override // com.amazon.aps.iva.kc.f
    public final int hashCode() {
        return 1572326941;
    }
}

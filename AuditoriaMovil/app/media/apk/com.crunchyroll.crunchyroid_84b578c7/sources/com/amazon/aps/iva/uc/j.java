package com.amazon.aps.iva.uc;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;
/* compiled from: CenterInside.java */
/* loaded from: classes.dex */
public final class j extends f {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(com.amazon.aps.iva.kc.f.a);

    @Override // com.amazon.aps.iva.kc.f
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // com.amazon.aps.iva.uc.f
    public final Bitmap c(com.amazon.aps.iva.oc.c cVar, Bitmap bitmap, int i, int i2) {
        Paint paint = a0.a;
        if (bitmap.getWidth() <= i && bitmap.getHeight() <= i2) {
            Log.isLoggable("TransformationUtils", 2);
            return bitmap;
        }
        Log.isLoggable("TransformationUtils", 2);
        return a0.b(cVar, bitmap, i, i2);
    }

    @Override // com.amazon.aps.iva.kc.f
    public final boolean equals(Object obj) {
        return obj instanceof j;
    }

    @Override // com.amazon.aps.iva.kc.f
    public final int hashCode() {
        return -670243078;
    }
}

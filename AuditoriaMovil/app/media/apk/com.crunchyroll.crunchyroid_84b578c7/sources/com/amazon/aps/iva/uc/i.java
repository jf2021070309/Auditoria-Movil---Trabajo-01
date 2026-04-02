package com.amazon.aps.iva.uc;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;
/* compiled from: CenterCrop.java */
/* loaded from: classes.dex */
public final class i extends f {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(com.amazon.aps.iva.kc.f.a);

    @Override // com.amazon.aps.iva.kc.f
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // com.amazon.aps.iva.uc.f
    public final Bitmap c(com.amazon.aps.iva.oc.c cVar, Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        Bitmap.Config config;
        Paint paint = a0.a;
        if (bitmap.getWidth() != i || bitmap.getHeight() != i2) {
            Matrix matrix = new Matrix();
            float f = 0.0f;
            if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
                width = i2 / bitmap.getHeight();
                f = (i - (bitmap.getWidth() * width)) * 0.5f;
                height = 0.0f;
            } else {
                width = i / bitmap.getWidth();
                height = (i2 - (bitmap.getHeight() * width)) * 0.5f;
            }
            matrix.setScale(width, width);
            matrix.postTranslate((int) (f + 0.5f), (int) (height + 0.5f));
            if (bitmap.getConfig() != null) {
                config = bitmap.getConfig();
            } else {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap e = cVar.e(i, i2, config);
            e.setHasAlpha(bitmap.hasAlpha());
            a0.a(bitmap, e, matrix);
            return e;
        }
        return bitmap;
    }

    @Override // com.amazon.aps.iva.kc.f
    public final boolean equals(Object obj) {
        return obj instanceof i;
    }

    @Override // com.amazon.aps.iva.kc.f
    public final int hashCode() {
        return -599754482;
    }
}

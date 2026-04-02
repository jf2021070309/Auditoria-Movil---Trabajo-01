package com.amazon.aps.iva.uc;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;
/* compiled from: CircleCrop.java */
/* loaded from: classes.dex */
public final class k extends f {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(com.amazon.aps.iva.kc.f.a);

    @Override // com.amazon.aps.iva.kc.f
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // com.amazon.aps.iva.uc.f
    public final Bitmap c(com.amazon.aps.iva.oc.c cVar, Bitmap bitmap, int i, int i2) {
        Bitmap.Config config;
        Bitmap e;
        Bitmap.Config config2;
        Paint paint = a0.a;
        int min = Math.min(i, i2);
        float f = min;
        float f2 = f / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float max = Math.max(f / width, f / height);
        float f3 = width * max;
        float f4 = max * height;
        float f5 = (f - f3) / 2.0f;
        float f6 = (f - f4) / 2.0f;
        RectF rectF = new RectF(f5, f6, f3 + f5, f4 + f6);
        if (Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) {
            config = Bitmap.Config.RGBA_F16;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        if (config.equals(bitmap.getConfig())) {
            e = bitmap;
        } else {
            e = cVar.e(bitmap.getWidth(), bitmap.getHeight(), config);
            new Canvas(e).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        if (Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) {
            config2 = Bitmap.Config.RGBA_F16;
        } else {
            config2 = Bitmap.Config.ARGB_8888;
        }
        Bitmap e2 = cVar.e(min, min, config2);
        e2.setHasAlpha(true);
        Lock lock = a0.d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(e2);
            canvas.drawCircle(f2, f2, f2, a0.b);
            canvas.drawBitmap(e, (Rect) null, rectF, a0.c);
            canvas.setBitmap(null);
            lock.unlock();
            if (!e.equals(bitmap)) {
                cVar.d(e);
            }
            return e2;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // com.amazon.aps.iva.kc.f
    public final boolean equals(Object obj) {
        return obj instanceof k;
    }

    @Override // com.amazon.aps.iva.kc.f
    public final int hashCode() {
        return 1101716364;
    }
}

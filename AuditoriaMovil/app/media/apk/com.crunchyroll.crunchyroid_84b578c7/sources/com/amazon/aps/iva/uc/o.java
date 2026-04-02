package com.amazon.aps.iva.uc;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;
/* compiled from: DrawableToBitmapConverter.java */
/* loaded from: classes.dex */
public final class o {
    public static final a a = new a();

    public static e a(com.amazon.aps.iva.oc.c cVar, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            if (i == Integer.MIN_VALUE && current.getIntrinsicWidth() <= 0) {
                if (Log.isLoggable("DrawableToBitmap", 5)) {
                    current.toString();
                }
            } else if (i2 == Integer.MIN_VALUE && current.getIntrinsicHeight() <= 0) {
                if (Log.isLoggable("DrawableToBitmap", 5)) {
                    current.toString();
                }
            } else {
                if (current.getIntrinsicWidth() > 0) {
                    i = current.getIntrinsicWidth();
                }
                if (current.getIntrinsicHeight() > 0) {
                    i2 = current.getIntrinsicHeight();
                }
                Lock lock = a0.d;
                lock.lock();
                Bitmap e = cVar.e(i, i2, Bitmap.Config.ARGB_8888);
                try {
                    Canvas canvas = new Canvas(e);
                    current.setBounds(0, 0, i, i2);
                    current.draw(canvas);
                    canvas.setBitmap(null);
                    lock.unlock();
                    bitmap = e;
                    z = true;
                } catch (Throwable th) {
                    lock.unlock();
                    throw th;
                }
            }
            bitmap = null;
            z = true;
        } else {
            bitmap = null;
        }
        if (!z) {
            cVar = a;
        }
        return e.c(bitmap, cVar);
    }

    /* compiled from: DrawableToBitmapConverter.java */
    /* loaded from: classes.dex */
    public class a extends com.amazon.aps.iva.oc.d {
        @Override // com.amazon.aps.iva.oc.d, com.amazon.aps.iva.oc.c
        public final void d(Bitmap bitmap) {
        }
    }
}

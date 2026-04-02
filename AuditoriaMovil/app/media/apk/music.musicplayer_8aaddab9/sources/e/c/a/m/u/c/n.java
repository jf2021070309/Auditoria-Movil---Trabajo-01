package e.c.a.m.u.c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;
/* loaded from: classes.dex */
public final class n {
    public static final e.c.a.m.s.c0.d a = new a();

    /* loaded from: classes.dex */
    public class a extends e.c.a.m.s.c0.e {
        @Override // e.c.a.m.s.c0.e, e.c.a.m.s.c0.d
        public void d(Bitmap bitmap) {
        }
    }

    public static e.c.a.m.s.w<Bitmap> a(e.c.a.m.s.c0.d dVar, Drawable drawable, int i2, int i3) {
        Drawable current = drawable.getCurrent();
        boolean z = false;
        Bitmap bitmap = null;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            if (i2 != Integer.MIN_VALUE || current.getIntrinsicWidth() > 0) {
                if (i3 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                    if (current.getIntrinsicWidth() > 0) {
                        i2 = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        i3 = current.getIntrinsicHeight();
                    }
                    Lock lock = z.f5905d;
                    lock.lock();
                    Bitmap e2 = dVar.e(i2, i3, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(e2);
                        current.setBounds(0, 0, i2, i3);
                        current.draw(canvas);
                        canvas.setBitmap(null);
                        lock.unlock();
                        bitmap = e2;
                    } catch (Throwable th) {
                        lock.unlock();
                        throw th;
                    }
                } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                }
            } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            z = true;
        }
        if (!z) {
            dVar = a;
        }
        return e.b(bitmap, dVar);
    }
}

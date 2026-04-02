package android.support.v4.graphics;

import android.graphics.Bitmap;
import android.os.Build;
/* JADX WARN: Classes with same name are omitted:
  classes2.dex
 */
/* loaded from: classes.dex */
public final class BitmapCompat {

    /* loaded from: classes2.dex */
    static class BitmapCompatBaseImpl {
        BitmapCompatBaseImpl() {
        }

        public boolean hasMipMap(Bitmap bitmap) {
            return false;
        }

        public void setHasMipMap(Bitmap bitmap, boolean z) {
        }

        public int getAllocationByteCount(Bitmap bitmap) {
            return bitmap.getByteCount();
        }
    }

    public static boolean hasMipMap(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 18) {
            return bitmap.hasMipMap();
        }
        return false;
    }

    public static void setHasMipMap(Bitmap bitmap, boolean hasMipMap) {
        if (Build.VERSION.SDK_INT >= 18) {
            bitmap.setHasMipMap(hasMipMap);
        }
    }

    /* loaded from: classes2.dex */
    static class BitmapCompatApi18Impl extends BitmapCompatBaseImpl {
        BitmapCompatApi18Impl() {
        }

        @Override // android.support.v4.graphics.BitmapCompat.BitmapCompatBaseImpl
        public boolean hasMipMap(Bitmap bitmap) {
            return bitmap.hasMipMap();
        }

        @Override // android.support.v4.graphics.BitmapCompat.BitmapCompatBaseImpl
        public void setHasMipMap(Bitmap bitmap, boolean z) {
            bitmap.setHasMipMap(z);
        }
    }

    public static int getAllocationByteCount(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 19) {
            return bitmap.getAllocationByteCount();
        }
        return bitmap.getByteCount();
    }

    /* loaded from: classes2.dex */
    static class BitmapCompatApi19Impl extends BitmapCompatApi18Impl {
        BitmapCompatApi19Impl() {
        }

        @Override // android.support.v4.graphics.BitmapCompat.BitmapCompatBaseImpl
        public int getAllocationByteCount(Bitmap bitmap) {
            return bitmap.getAllocationByteCount();
        }
    }

    private BitmapCompat() {
    }
}

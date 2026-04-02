package com.amazon.aps.iva.ma;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import com.amazon.aps.iva.e.z;
import java.io.Closeable;
/* compiled from: Utils.java */
/* loaded from: classes.dex */
public final class g {
    public static final a a = new a();
    public static final b b = new b();
    public static final c c = new c();
    public static final d d = new d();
    public static final float e = (float) (Math.sqrt(2.0d) / 2.0d);

    /* compiled from: Utils.java */
    /* loaded from: classes.dex */
    public class a extends ThreadLocal<PathMeasure> {
        @Override // java.lang.ThreadLocal
        public final PathMeasure initialValue() {
            return new PathMeasure();
        }
    }

    /* compiled from: Utils.java */
    /* loaded from: classes.dex */
    public class b extends ThreadLocal<Path> {
        @Override // java.lang.ThreadLocal
        public final Path initialValue() {
            return new Path();
        }
    }

    /* compiled from: Utils.java */
    /* loaded from: classes.dex */
    public class c extends ThreadLocal<Path> {
        @Override // java.lang.ThreadLocal
        public final Path initialValue() {
            return new Path();
        }
    }

    /* compiled from: Utils.java */
    /* loaded from: classes.dex */
    public class d extends ThreadLocal<float[]> {
        @Override // java.lang.ThreadLocal
        public final float[] initialValue() {
            return new float[4];
        }
    }

    public static void a(Path path, float f, float f2, float f3) {
        PathMeasure pathMeasure = a.get();
        Path path2 = b.get();
        Path path3 = c.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            z.s();
        } else if (length >= 1.0f && Math.abs((f2 - f) - 1.0f) >= 0.01d) {
            float f4 = f * length;
            float f5 = f2 * length;
            float f6 = f3 * length;
            float min = Math.min(f4, f5) + f6;
            float max = Math.max(f4, f5) + f6;
            if (min >= length && max >= length) {
                min = f.c(min, length);
                max = f.c(max, length);
            }
            if (min < 0.0f) {
                min = f.c(min, length);
            }
            if (max < 0.0f) {
                max = f.c(max, length);
            }
            int i = (min > max ? 1 : (min == max ? 0 : -1));
            if (i == 0) {
                path.reset();
                z.s();
                return;
            }
            if (i >= 0) {
                min -= length;
            }
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            if (max > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, max % length, path3, true);
                path2.addPath(path3);
            } else if (min < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(min + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
            z.s();
        } else {
            z.s();
        }
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static float c() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static float d(Matrix matrix) {
        float[] fArr = d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = e;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static Bitmap e(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return createScaledBitmap;
    }
}

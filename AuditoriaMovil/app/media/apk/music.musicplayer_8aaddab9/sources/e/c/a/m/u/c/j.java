package e.c.a.m.u.c;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;
/* loaded from: classes.dex */
public class j extends f {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f5860b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(e.c.a.m.k.a);

    @Override // e.c.a.m.k
    public void a(MessageDigest messageDigest) {
        messageDigest.update(f5860b);
    }

    @Override // e.c.a.m.u.c.f
    public Bitmap c(e.c.a.m.s.c0.d dVar, Bitmap bitmap, int i2, int i3) {
        Paint paint = z.a;
        if (bitmap.getWidth() > i2 || bitmap.getHeight() > i3) {
            Log.isLoggable("TransformationUtils", 2);
            return z.b(dVar, bitmap, i2, i3);
        }
        Log.isLoggable("TransformationUtils", 2);
        return bitmap;
    }

    @Override // e.c.a.m.k
    public boolean equals(Object obj) {
        return obj instanceof j;
    }

    @Override // e.c.a.m.k
    public int hashCode() {
        return -670243078;
    }
}

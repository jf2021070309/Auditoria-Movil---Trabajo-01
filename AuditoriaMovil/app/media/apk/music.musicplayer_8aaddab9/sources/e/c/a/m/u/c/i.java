package e.c.a.m.u.c;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;
/* loaded from: classes.dex */
public class i extends f {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f5859b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(e.c.a.m.k.a);

    @Override // e.c.a.m.k
    public void a(MessageDigest messageDigest) {
        messageDigest.update(f5859b);
    }

    @Override // e.c.a.m.u.c.f
    public Bitmap c(e.c.a.m.s.c0.d dVar, Bitmap bitmap, int i2, int i3) {
        float width;
        float height;
        Paint paint = z.a;
        if (bitmap.getWidth() == i2 && bitmap.getHeight() == i3) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f2 = 0.0f;
        if (bitmap.getWidth() * i3 > bitmap.getHeight() * i2) {
            width = i3 / bitmap.getHeight();
            f2 = (i2 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i2 / bitmap.getWidth();
            height = (i3 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (f2 + 0.5f), (int) (height + 0.5f));
        Bitmap e2 = dVar.e(i2, i3, z.c(bitmap));
        e2.setHasAlpha(bitmap.hasAlpha());
        z.a(bitmap, e2, matrix);
        return e2;
    }

    @Override // e.c.a.m.k
    public boolean equals(Object obj) {
        return obj instanceof i;
    }

    @Override // e.c.a.m.k
    public int hashCode() {
        return -599754482;
    }
}

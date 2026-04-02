package e.c.a.m.u.c;

import android.graphics.Bitmap;
import java.security.MessageDigest;
/* loaded from: classes.dex */
public class q extends f {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f5883b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(e.c.a.m.k.a);

    @Override // e.c.a.m.k
    public void a(MessageDigest messageDigest) {
        messageDigest.update(f5883b);
    }

    @Override // e.c.a.m.u.c.f
    public Bitmap c(e.c.a.m.s.c0.d dVar, Bitmap bitmap, int i2, int i3) {
        return z.b(dVar, bitmap, i2, i3);
    }

    @Override // e.c.a.m.k
    public boolean equals(Object obj) {
        return obj instanceof q;
    }

    @Override // e.c.a.m.k
    public int hashCode() {
        return 1572326941;
    }
}

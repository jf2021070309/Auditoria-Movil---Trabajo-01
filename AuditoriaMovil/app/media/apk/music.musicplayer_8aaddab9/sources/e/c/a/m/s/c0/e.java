package e.c.a.m.s.c0;

import android.graphics.Bitmap;
/* loaded from: classes.dex */
public class e implements d {
    @Override // e.c.a.m.s.c0.d
    public void a(int i2) {
    }

    @Override // e.c.a.m.s.c0.d
    public void b() {
    }

    @Override // e.c.a.m.s.c0.d
    public Bitmap c(int i2, int i3, Bitmap.Config config) {
        return Bitmap.createBitmap(i2, i3, config);
    }

    @Override // e.c.a.m.s.c0.d
    public void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // e.c.a.m.s.c0.d
    public Bitmap e(int i2, int i3, Bitmap.Config config) {
        return Bitmap.createBitmap(i2, i3, config);
    }
}

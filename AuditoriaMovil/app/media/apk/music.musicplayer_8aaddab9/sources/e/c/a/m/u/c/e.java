package e.c.a.m.u.c;

import android.graphics.Bitmap;
import java.util.Objects;
/* loaded from: classes.dex */
public class e implements e.c.a.m.s.w<Bitmap>, e.c.a.m.s.s {
    public final Bitmap a;

    /* renamed from: b  reason: collision with root package name */
    public final e.c.a.m.s.c0.d f5858b;

    public e(Bitmap bitmap, e.c.a.m.s.c0.d dVar) {
        Objects.requireNonNull(bitmap, "Bitmap must not be null");
        this.a = bitmap;
        Objects.requireNonNull(dVar, "BitmapPool must not be null");
        this.f5858b = dVar;
    }

    public static e b(Bitmap bitmap, e.c.a.m.s.c0.d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new e(bitmap, dVar);
    }

    @Override // e.c.a.m.s.w
    public void a() {
        this.f5858b.d(this.a);
    }

    @Override // e.c.a.m.s.w
    public Class<Bitmap> c() {
        return Bitmap.class;
    }

    @Override // e.c.a.m.s.w
    public Bitmap get() {
        return this.a;
    }

    @Override // e.c.a.m.s.w
    public int getSize() {
        return e.c.a.s.j.d(this.a);
    }

    @Override // e.c.a.m.s.s
    public void initialize() {
        this.a.prepareToDraw();
    }
}

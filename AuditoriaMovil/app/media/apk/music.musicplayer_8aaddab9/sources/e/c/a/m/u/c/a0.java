package e.c.a.m.u.c;

import android.graphics.Bitmap;
import java.io.IOException;
/* loaded from: classes.dex */
public final class a0 implements e.c.a.m.o<Bitmap, Bitmap> {

    /* loaded from: classes.dex */
    public static final class a implements e.c.a.m.s.w<Bitmap> {
        public final Bitmap a;

        public a(Bitmap bitmap) {
            this.a = bitmap;
        }

        @Override // e.c.a.m.s.w
        public void a() {
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
    }

    @Override // e.c.a.m.o
    public /* bridge */ /* synthetic */ boolean a(Bitmap bitmap, e.c.a.m.m mVar) throws IOException {
        return true;
    }

    @Override // e.c.a.m.o
    public e.c.a.m.s.w<Bitmap> b(Bitmap bitmap, int i2, int i3, e.c.a.m.m mVar) throws IOException {
        return new a(bitmap);
    }
}

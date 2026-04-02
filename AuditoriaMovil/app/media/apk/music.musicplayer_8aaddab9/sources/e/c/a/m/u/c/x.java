package e.c.a.m.u.c;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.IOException;
/* loaded from: classes.dex */
public class x implements e.c.a.m.o<Uri, Bitmap> {
    public final e.c.a.m.u.e.d a;

    /* renamed from: b  reason: collision with root package name */
    public final e.c.a.m.s.c0.d f5900b;

    public x(e.c.a.m.u.e.d dVar, e.c.a.m.s.c0.d dVar2) {
        this.a = dVar;
        this.f5900b = dVar2;
    }

    @Override // e.c.a.m.o
    public boolean a(Uri uri, e.c.a.m.m mVar) throws IOException {
        return "android.resource".equals(uri.getScheme());
    }

    @Override // e.c.a.m.o
    public e.c.a.m.s.w<Bitmap> b(Uri uri, int i2, int i3, e.c.a.m.m mVar) throws IOException {
        e.c.a.m.s.w c2 = this.a.c(uri);
        if (c2 == null) {
            return null;
        }
        return n.a(this.f5900b, (Drawable) ((e.c.a.m.u.e.b) c2).get(), i2, i3);
    }
}

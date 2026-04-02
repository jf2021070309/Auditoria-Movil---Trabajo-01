package e.c.a.m.u.g;

import android.graphics.Bitmap;
import e.c.a.m.m;
import e.c.a.m.o;
import e.c.a.m.s.w;
import java.io.IOException;
/* loaded from: classes.dex */
public final class h implements o<e.c.a.l.a, Bitmap> {
    public final e.c.a.m.s.c0.d a;

    public h(e.c.a.m.s.c0.d dVar) {
        this.a = dVar;
    }

    @Override // e.c.a.m.o
    public /* bridge */ /* synthetic */ boolean a(e.c.a.l.a aVar, m mVar) throws IOException {
        return true;
    }

    @Override // e.c.a.m.o
    public w<Bitmap> b(e.c.a.l.a aVar, int i2, int i3, m mVar) throws IOException {
        return e.c.a.m.u.c.e.b(aVar.a(), this.a);
    }
}

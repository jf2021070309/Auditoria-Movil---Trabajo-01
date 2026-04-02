package e.c.a.m.u.g;

import android.graphics.Bitmap;
import e.c.a.m.s.s;
import e.c.a.m.u.g.g;
/* loaded from: classes.dex */
public class e extends e.c.a.m.u.e.b<c> implements s {
    public e(c cVar) {
        super(cVar);
    }

    @Override // e.c.a.m.s.w
    public void a() {
        ((c) this.a).stop();
        c cVar = (c) this.a;
        cVar.f5915d = true;
        g gVar = cVar.a.a;
        gVar.f5924c.clear();
        Bitmap bitmap = gVar.f5933l;
        if (bitmap != null) {
            gVar.f5926e.d(bitmap);
            gVar.f5933l = null;
        }
        gVar.f5927f = false;
        g.a aVar = gVar.f5930i;
        if (aVar != null) {
            gVar.f5925d.i(aVar);
            gVar.f5930i = null;
        }
        g.a aVar2 = gVar.f5932k;
        if (aVar2 != null) {
            gVar.f5925d.i(aVar2);
            gVar.f5932k = null;
        }
        g.a aVar3 = gVar.f5935n;
        if (aVar3 != null) {
            gVar.f5925d.i(aVar3);
            gVar.f5935n = null;
        }
        gVar.a.clear();
        gVar.f5931j = true;
    }

    @Override // e.c.a.m.s.w
    public Class<c> c() {
        return c.class;
    }

    @Override // e.c.a.m.s.w
    public int getSize() {
        g gVar = ((c) this.a).a.a;
        return gVar.a.g() + gVar.o;
    }

    @Override // e.c.a.m.u.e.b, e.c.a.m.s.s
    public void initialize() {
        ((c) this.a).b().prepareToDraw();
    }
}

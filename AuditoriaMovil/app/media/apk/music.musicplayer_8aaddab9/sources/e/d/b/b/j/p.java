package e.d.b.b.j;

import e.d.d.p.k.h;
import java.util.HashMap;
/* loaded from: classes.dex */
public abstract class p {
    public static final e.d.d.p.k.h a;

    static {
        h.a aVar = new h.a();
        aVar.registerEncoder(p.class, f.a);
        aVar.registerEncoder(e.d.b.b.j.a0.a.a.class, b.a);
        aVar.registerEncoder(e.d.b.b.j.a0.a.f.class, h.a);
        aVar.registerEncoder(e.d.b.b.j.a0.a.d.class, e.a);
        aVar.registerEncoder(e.d.b.b.j.a0.a.c.class, d.a);
        aVar.registerEncoder(e.d.b.b.j.a0.a.b.class, c.a);
        aVar.registerEncoder(e.d.b.b.j.a0.a.e.class, g.a);
        a = new e.d.d.p.k.h(new HashMap(aVar.a), new HashMap(aVar.f7562b), aVar.f7563c);
    }

    public abstract e.d.b.b.j.a0.a.a a();
}

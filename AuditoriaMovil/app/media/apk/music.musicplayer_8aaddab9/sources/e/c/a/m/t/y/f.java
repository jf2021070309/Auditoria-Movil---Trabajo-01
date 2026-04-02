package e.c.a.m.t.y;

import e.c.a.m.m;
import e.c.a.m.t.g;
import e.c.a.m.t.n;
import e.c.a.m.t.o;
import e.c.a.m.t.r;
import java.io.InputStream;
import java.net.URL;
/* loaded from: classes.dex */
public class f implements n<URL, InputStream> {
    public final n<g, InputStream> a;

    /* loaded from: classes.dex */
    public static class a implements o<URL, InputStream> {
        @Override // e.c.a.m.t.o
        public n<URL, InputStream> b(r rVar) {
            return new f(rVar.b(g.class, InputStream.class));
        }
    }

    public f(n<g, InputStream> nVar) {
        this.a = nVar;
    }

    @Override // e.c.a.m.t.n
    public /* bridge */ /* synthetic */ boolean a(URL url) {
        return true;
    }

    @Override // e.c.a.m.t.n
    public n.a<InputStream> b(URL url, int i2, int i3, m mVar) {
        return this.a.b(new g(url), i2, i3, mVar);
    }
}

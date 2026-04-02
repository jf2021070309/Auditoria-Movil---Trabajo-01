package e.c.a.m.r;

import e.c.a.m.r.e;
import e.c.a.m.u.c.w;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public final class k implements e<InputStream> {
    public final w a;

    /* loaded from: classes.dex */
    public static final class a implements e.a<InputStream> {
        public final e.c.a.m.s.c0.b a;

        public a(e.c.a.m.s.c0.b bVar) {
            this.a = bVar;
        }

        @Override // e.c.a.m.r.e.a
        public Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // e.c.a.m.r.e.a
        public e<InputStream> b(InputStream inputStream) {
            return new k(inputStream, this.a);
        }
    }

    public k(InputStream inputStream, e.c.a.m.s.c0.b bVar) {
        w wVar = new w(inputStream, bVar);
        this.a = wVar;
        wVar.mark(5242880);
    }

    @Override // e.c.a.m.r.e
    public void b() {
        this.a.release();
    }

    @Override // e.c.a.m.r.e
    /* renamed from: c */
    public InputStream a() throws IOException {
        this.a.reset();
        return this.a;
    }
}

package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_for12;

import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.l;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.r;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.a0;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.t;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.y;
import java.io.IOException;
import java.net.ProtocolException;
/* loaded from: classes.dex */
public final class b implements t {
    private final boolean a;

    /* loaded from: classes.dex */
    static final class a extends bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.g {
        long b;

        a(r rVar) {
            super(rVar);
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.g, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.r
        public void b(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.c cVar, long j) throws IOException {
            super.b(cVar, j);
            this.b += j;
        }
    }

    public b(boolean z) {
        this.a = z;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.t
    public a0 a(t.a aVar) throws IOException {
        g gVar = (g) aVar;
        c h = gVar.h();
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_if122.g i = gVar.i();
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_if122.c cVar = (bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_if122.c) gVar.f();
        y b = gVar.b();
        long currentTimeMillis = System.currentTimeMillis();
        gVar.g().d(gVar.e());
        h.a(b);
        gVar.g().a(gVar.e(), b);
        a0.a aVar2 = null;
        if (f.b(b.e()) && b.a() != null) {
            if ("100-continue".equalsIgnoreCase(b.a("Expect"))) {
                h.b();
                gVar.g().f(gVar.e());
                aVar2 = h.a(true);
            }
            if (aVar2 == null) {
                gVar.g().c(gVar.e());
                a aVar3 = new a(h.a(b, b.a().a()));
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.d a2 = l.a(aVar3);
                b.a().a(a2);
                a2.close();
                gVar.g().a(gVar.e(), aVar3.b);
            } else if (!cVar.c()) {
                i.d();
            }
        }
        h.a();
        if (aVar2 == null) {
            gVar.g().f(gVar.e());
            aVar2 = h.a(false);
        }
        a0 a3 = aVar2.a(b).a(i.b().b()).b(currentTimeMillis).a(System.currentTimeMillis()).a();
        gVar.g().a(gVar.e(), a3);
        int k = a3.k();
        a0 a4 = ((this.a && k == 101) ? a3.p().a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.c) : a3.p().a(h.a(a3))).a();
        if ("close".equalsIgnoreCase(a4.s().a("Connection")) || "close".equalsIgnoreCase(a4.b("Connection"))) {
            i.d();
        }
        if ((k == 204 || k == 205) && a4.i().i() > 0) {
            throw new ProtocolException("HTTP " + k + " had non-zero Content-Length: " + a4.i().i());
        }
        return a4;
    }
}

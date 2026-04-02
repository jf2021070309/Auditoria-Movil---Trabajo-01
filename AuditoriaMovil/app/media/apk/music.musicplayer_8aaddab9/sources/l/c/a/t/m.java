package l.c.a.t;

import java.io.Serializable;
/* loaded from: classes2.dex */
public final class m extends h implements Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final m f9736c = new m();

    private Object readResolve() {
        return f9736c;
    }

    @Override // l.c.a.t.h
    public f G(l.c.a.d dVar, l.c.a.p pVar) {
        e.j.d.w.k0(dVar, "instant");
        e.j.d.w.k0(pVar, "zone");
        return l.c.a.s.W(dVar.f9674b, dVar.f9675c, pVar);
    }

    @Override // l.c.a.t.h
    public f I(l.c.a.w.e eVar) {
        return l.c.a.s.a0(eVar);
    }

    public boolean K(long j2) {
        return (3 & j2) == 0 && (j2 % 100 != 0 || j2 % 400 == 0);
    }

    @Override // l.c.a.t.h
    public b b(l.c.a.w.e eVar) {
        return l.c.a.e.T(eVar);
    }

    @Override // l.c.a.t.h
    public i t(int i2) {
        return n.of(i2);
    }

    @Override // l.c.a.t.h
    public String v() {
        return "iso8601";
    }

    @Override // l.c.a.t.h
    public String y() {
        return "ISO";
    }

    @Override // l.c.a.t.h
    public c z(l.c.a.w.e eVar) {
        return l.c.a.f.T(eVar);
    }
}

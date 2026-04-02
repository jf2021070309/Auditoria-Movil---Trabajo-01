package l.c.a.t;

import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public abstract class h implements Comparable<h> {
    public static final ConcurrentHashMap<String, h> a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public static final ConcurrentHashMap<String, h> f9718b = new ConcurrentHashMap<>();

    static {
        try {
            Locale.class.getMethod("getUnicodeLocaleType", String.class);
        } catch (Throwable unused) {
        }
    }

    public static void B(h hVar) {
        a.putIfAbsent(hVar.y(), hVar);
        String v = hVar.v();
        if (v != null) {
            f9718b.putIfAbsent(v, hVar);
        }
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static h u(l.c.a.w.e eVar) {
        e.j.d.w.k0(eVar, "temporal");
        h hVar = (h) eVar.query(l.c.a.w.j.f9809b);
        return hVar != null ? hVar : m.f9736c;
    }

    private Object writeReplace() {
        return new u((byte) 11, this);
    }

    public f<?> G(l.c.a.d dVar, l.c.a.p pVar) {
        return g.a0(this, dVar, pVar);
    }

    public f<?> I(l.c.a.w.e eVar) {
        try {
            l.c.a.p t = l.c.a.p.t(eVar);
            try {
                return G(l.c.a.d.v(eVar), t);
            } catch (l.c.a.a unused) {
                return g.W(h(z(eVar)), t, null);
            }
        } catch (l.c.a.a e2) {
            StringBuilder y = e.a.d.a.a.y("Unable to obtain ChronoZonedDateTime from TemporalAccessor: ");
            y.append(eVar.getClass());
            throw new l.c.a.a(y.toString(), e2);
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(h hVar) {
        return y().compareTo(hVar.y());
    }

    public abstract b b(l.c.a.w.e eVar);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && compareTo((h) obj) == 0;
    }

    public <D extends b> D f(l.c.a.w.d dVar) {
        D d2 = (D) dVar;
        if (equals(d2.v())) {
            return d2;
        }
        StringBuilder y = e.a.d.a.a.y("Chrono mismatch, expected: ");
        y.append(y());
        y.append(", actual: ");
        y.append(d2.v().y());
        throw new ClassCastException(y.toString());
    }

    public <D extends b> d<D> h(l.c.a.w.d dVar) {
        d<D> dVar2 = (d) dVar;
        if (equals(dVar2.a.v())) {
            return dVar2;
        }
        StringBuilder y = e.a.d.a.a.y("Chrono mismatch, required: ");
        y.append(y());
        y.append(", supplied: ");
        y.append(dVar2.a.v().y());
        throw new ClassCastException(y.toString());
    }

    public int hashCode() {
        return getClass().hashCode() ^ y().hashCode();
    }

    public <D extends b> g<D> i(l.c.a.w.d dVar) {
        g<D> gVar = (g) dVar;
        if (equals(gVar.G().v())) {
            return gVar;
        }
        StringBuilder y = e.a.d.a.a.y("Chrono mismatch, required: ");
        y.append(y());
        y.append(", supplied: ");
        y.append(gVar.G().v().y());
        throw new ClassCastException(y.toString());
    }

    public abstract i t(int i2);

    public String toString() {
        return y();
    }

    public abstract String v();

    public abstract String y();

    public c<?> z(l.c.a.w.e eVar) {
        try {
            return b(eVar).t(l.c.a.g.v(eVar));
        } catch (l.c.a.a e2) {
            StringBuilder y = e.a.d.a.a.y("Unable to obtain ChronoLocalDateTime from TemporalAccessor: ");
            y.append(eVar.getClass());
            throw new l.c.a.a(y.toString(), e2);
        }
    }
}

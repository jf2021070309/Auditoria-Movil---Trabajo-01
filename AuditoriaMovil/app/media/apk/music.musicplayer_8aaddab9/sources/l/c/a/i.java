package l.c.a;

import ch.qos.logback.core.CoreConstants;
import e.j.d.w;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
/* loaded from: classes2.dex */
public final class i extends l.c.a.v.c implements l.c.a.w.e, l.c.a.w.f, Comparable<i>, Serializable {
    public static final /* synthetic */ int a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final int f9689b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9690c;

    static {
        l.c.a.u.b bVar = new l.c.a.u.b();
        bVar.d("--");
        bVar.h(l.c.a.w.a.MONTH_OF_YEAR, 2);
        bVar.c(CoreConstants.DASH_CHAR);
        bVar.h(l.c.a.w.a.DAY_OF_MONTH, 2);
        bVar.l();
    }

    public i(int i2, int i3) {
        this.f9689b = i2;
        this.f9690c = i3;
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static i t(int i2, int i3) {
        h of = h.of(i2);
        w.k0(of, "month");
        l.c.a.w.a.DAY_OF_MONTH.checkValidValue(i3);
        if (i3 <= of.maxLength()) {
            return new i(of.getValue(), i3);
        }
        StringBuilder z = e.a.d.a.a.z("Illegal value for DayOfMonth field, value ", i3, " is not valid for month ");
        z.append(of.name());
        throw new a(z.toString());
    }

    private Object writeReplace() {
        return new m((byte) 64, this);
    }

    @Override // l.c.a.w.f
    public l.c.a.w.d adjustInto(l.c.a.w.d dVar) {
        if (l.c.a.t.h.u(dVar).equals(l.c.a.t.m.f9736c)) {
            l.c.a.w.d a2 = dVar.a(l.c.a.w.a.MONTH_OF_YEAR, this.f9689b);
            l.c.a.w.a aVar = l.c.a.w.a.DAY_OF_MONTH;
            return a2.a(aVar, Math.min(a2.range(aVar).f9817d, this.f9690c));
        }
        throw new a("Adjustment only supported on ISO date-time");
    }

    @Override // java.lang.Comparable
    public int compareTo(i iVar) {
        i iVar2 = iVar;
        int i2 = this.f9689b - iVar2.f9689b;
        return i2 == 0 ? this.f9690c - iVar2.f9690c : i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return this.f9689b == iVar.f9689b && this.f9690c == iVar.f9690c;
        }
        return false;
    }

    @Override // l.c.a.v.c, l.c.a.w.e
    public int get(l.c.a.w.i iVar) {
        return range(iVar).a(getLong(iVar), iVar);
    }

    @Override // l.c.a.w.e
    public long getLong(l.c.a.w.i iVar) {
        int i2;
        if (iVar instanceof l.c.a.w.a) {
            int ordinal = ((l.c.a.w.a) iVar).ordinal();
            if (ordinal == 18) {
                i2 = this.f9690c;
            } else if (ordinal != 23) {
                throw new l.c.a.w.m(e.a.d.a.a.o("Unsupported field: ", iVar));
            } else {
                i2 = this.f9689b;
            }
            return i2;
        }
        return iVar.getFrom(this);
    }

    public int hashCode() {
        return (this.f9689b << 6) + this.f9690c;
    }

    @Override // l.c.a.w.e
    public boolean isSupported(l.c.a.w.i iVar) {
        return iVar instanceof l.c.a.w.a ? iVar == l.c.a.w.a.MONTH_OF_YEAR || iVar == l.c.a.w.a.DAY_OF_MONTH : iVar != null && iVar.isSupportedBy(this);
    }

    @Override // l.c.a.v.c, l.c.a.w.e
    public <R> R query(l.c.a.w.k<R> kVar) {
        return kVar == l.c.a.w.j.f9809b ? (R) l.c.a.t.m.f9736c : (R) super.query(kVar);
    }

    @Override // l.c.a.v.c, l.c.a.w.e
    public l.c.a.w.n range(l.c.a.w.i iVar) {
        return iVar == l.c.a.w.a.MONTH_OF_YEAR ? iVar.range() : iVar == l.c.a.w.a.DAY_OF_MONTH ? l.c.a.w.n.h(1L, h.of(this.f9689b).minLength(), h.of(this.f9689b).maxLength()) : super.range(iVar);
    }

    public String toString() {
        StringBuilder v = e.a.d.a.a.v(10, "--");
        v.append(this.f9689b < 10 ? "0" : "");
        v.append(this.f9689b);
        v.append(this.f9690c < 10 ? "-0" : "-");
        v.append(this.f9690c);
        return v.toString();
    }
}

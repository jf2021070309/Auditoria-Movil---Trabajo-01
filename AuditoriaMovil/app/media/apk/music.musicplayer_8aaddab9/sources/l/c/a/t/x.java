package l.c.a.t;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Locale;
/* loaded from: classes2.dex */
public enum x implements i {
    BEFORE_BE,
    BE;

    public static x of(int i2) {
        if (i2 != 0) {
            if (i2 == 1) {
                return BE;
            }
            throw new l.c.a.a("Era is not valid for ThaiBuddhistEra");
        }
        return BEFORE_BE;
    }

    public static x readExternal(DataInput dataInput) throws IOException {
        return of(dataInput.readByte());
    }

    private Object writeReplace() {
        return new u((byte) 8, this);
    }

    @Override // l.c.a.w.f
    public l.c.a.w.d adjustInto(l.c.a.w.d dVar) {
        return dVar.a(l.c.a.w.a.ERA, getValue());
    }

    @Override // l.c.a.w.e
    public int get(l.c.a.w.i iVar) {
        return iVar == l.c.a.w.a.ERA ? getValue() : range(iVar).a(getLong(iVar), iVar);
    }

    public String getDisplayName(l.c.a.u.l lVar, Locale locale) {
        l.c.a.u.b bVar = new l.c.a.u.b();
        bVar.f(l.c.a.w.a.ERA, lVar);
        return bVar.m(locale).a(this);
    }

    @Override // l.c.a.w.e
    public long getLong(l.c.a.w.i iVar) {
        if (iVar == l.c.a.w.a.ERA) {
            return getValue();
        }
        if (iVar instanceof l.c.a.w.a) {
            throw new l.c.a.w.m(e.a.d.a.a.o("Unsupported field: ", iVar));
        }
        return iVar.getFrom(this);
    }

    public int getValue() {
        return ordinal();
    }

    @Override // l.c.a.w.e
    public boolean isSupported(l.c.a.w.i iVar) {
        return iVar instanceof l.c.a.w.a ? iVar == l.c.a.w.a.ERA : iVar != null && iVar.isSupportedBy(this);
    }

    @Override // l.c.a.w.e
    public <R> R query(l.c.a.w.k<R> kVar) {
        if (kVar == l.c.a.w.j.f9810c) {
            return (R) l.c.a.w.b.ERAS;
        }
        if (kVar == l.c.a.w.j.f9809b || kVar == l.c.a.w.j.f9811d || kVar == l.c.a.w.j.a || kVar == l.c.a.w.j.f9812e || kVar == l.c.a.w.j.f9813f || kVar == l.c.a.w.j.f9814g) {
            return null;
        }
        return kVar.a(this);
    }

    @Override // l.c.a.w.e
    public l.c.a.w.n range(l.c.a.w.i iVar) {
        if (iVar == l.c.a.w.a.ERA) {
            return iVar.range();
        }
        if (iVar instanceof l.c.a.w.a) {
            throw new l.c.a.w.m(e.a.d.a.a.o("Unsupported field: ", iVar));
        }
        return iVar.rangeRefinedBy(this);
    }

    public void writeExternal(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(getValue());
    }
}

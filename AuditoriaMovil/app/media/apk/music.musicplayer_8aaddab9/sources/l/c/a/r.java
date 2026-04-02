package l.c.a;

import e.j.d.w;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
public final class r extends p implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f9710b = Pattern.compile("[A-Za-z][A-Za-z0-9~/._+-]+");

    /* renamed from: c  reason: collision with root package name */
    public final String f9711c;

    /* renamed from: d  reason: collision with root package name */
    public final transient l.c.a.x.f f9712d;

    public r(String str, l.c.a.x.f fVar) {
        this.f9711c = str;
        this.f9712d = fVar;
    }

    public static r B(String str, boolean z) {
        w.k0(str, "zoneId");
        if (str.length() < 2 || !f9710b.matcher(str).matches()) {
            throw new a(e.a.d.a.a.k("Invalid ID for region-based ZoneId, invalid format: ", str));
        }
        l.c.a.x.f fVar = null;
        try {
            fVar = l.c.a.x.i.a(str, true);
        } catch (l.c.a.x.g e2) {
            if (str.equals("GMT0")) {
                fVar = q.f9705d.v();
            } else if (z) {
                throw e2;
            }
        }
        return new r(str, fVar);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new m((byte) 7, this);
    }

    @Override // l.c.a.p
    public String u() {
        return this.f9711c;
    }

    @Override // l.c.a.p
    public l.c.a.x.f v() {
        l.c.a.x.f fVar = this.f9712d;
        return fVar != null ? fVar : l.c.a.x.i.a(this.f9711c, false);
    }

    @Override // l.c.a.p
    public void z(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(7);
        dataOutput.writeUTF(this.f9711c);
    }
}

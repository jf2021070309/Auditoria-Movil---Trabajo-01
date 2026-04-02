package l.c.a;

import ch.qos.logback.core.CoreConstants;
import e.j.d.w;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
/* loaded from: classes2.dex */
public final class g extends l.c.a.v.c implements l.c.a.w.d, l.c.a.w.f, Comparable<g>, Serializable {
    public static final g a;

    /* renamed from: b  reason: collision with root package name */
    public static final g f9683b;

    /* renamed from: c  reason: collision with root package name */
    public static final g[] f9684c = new g[24];

    /* renamed from: d  reason: collision with root package name */
    public final byte f9685d;

    /* renamed from: e  reason: collision with root package name */
    public final byte f9686e;

    /* renamed from: f  reason: collision with root package name */
    public final byte f9687f;

    /* renamed from: g  reason: collision with root package name */
    public final int f9688g;

    static {
        int i2 = 0;
        while (true) {
            g[] gVarArr = f9684c;
            if (i2 >= gVarArr.length) {
                g gVar = gVarArr[0];
                g gVar2 = gVarArr[12];
                a = gVarArr[0];
                f9683b = new g(23, 59, 59, 999999999);
                return;
            }
            gVarArr[i2] = new g(i2, 0, 0, 0);
            i2++;
        }
    }

    public g(int i2, int i3, int i4, int i5) {
        this.f9685d = (byte) i2;
        this.f9686e = (byte) i3;
        this.f9687f = (byte) i4;
        this.f9688g = i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2 */
    public static g P(DataInput dataInput) throws IOException {
        byte b2;
        int i2;
        byte b3;
        int readByte = dataInput.readByte();
        byte b4 = 0;
        if (readByte >= 0) {
            byte readByte2 = dataInput.readByte();
            if (readByte2 < 0) {
                int i3 = readByte2 ^ (-1);
                i2 = 0;
                b4 = i3 == 1 ? 1 : 0;
                b2 = 0;
            } else {
                byte readByte3 = dataInput.readByte();
                if (readByte3 < 0) {
                    b4 = readByte2;
                    b3 = readByte3 ^ (-1);
                } else {
                    int readInt = dataInput.readInt();
                    b2 = readByte3;
                    i2 = readInt;
                    b4 = readByte2;
                }
            }
            l.c.a.w.a.HOUR_OF_DAY.checkValidValue(readByte);
            l.c.a.w.a.MINUTE_OF_HOUR.checkValidValue(b4);
            l.c.a.w.a.SECOND_OF_MINUTE.checkValidValue(b2);
            l.c.a.w.a.NANO_OF_SECOND.checkValidValue(i2);
            return u(readByte, b4, b2, i2);
        }
        readByte ^= -1;
        b3 = 0;
        i2 = 0;
        b2 = b3;
        l.c.a.w.a.HOUR_OF_DAY.checkValidValue(readByte);
        l.c.a.w.a.MINUTE_OF_HOUR.checkValidValue(b4);
        l.c.a.w.a.SECOND_OF_MINUTE.checkValidValue(b2);
        l.c.a.w.a.NANO_OF_SECOND.checkValidValue(i2);
        return u(readByte, b4, b2, i2);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static g u(int i2, int i3, int i4, int i5) {
        return ((i3 | i4) | i5) == 0 ? f9684c[i2] : new g(i2, i3, i4, i5);
    }

    public static g v(l.c.a.w.e eVar) {
        g gVar = (g) eVar.query(l.c.a.w.j.f9814g);
        if (gVar != null) {
            return gVar;
        }
        throw new a("Unable to obtain LocalTime from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
    }

    private Object writeReplace() {
        return new m((byte) 5, this);
    }

    public static g z(long j2) {
        l.c.a.w.a.NANO_OF_DAY.checkValidValue(j2);
        int i2 = (int) (j2 / 3600000000000L);
        long j3 = j2 - (i2 * 3600000000000L);
        int i3 = (int) (j3 / 60000000000L);
        long j4 = j3 - (i3 * 60000000000L);
        int i4 = (int) (j4 / 1000000000);
        return u(i2, i3, i4, (int) (j4 - (i4 * 1000000000)));
    }

    @Override // l.c.a.w.d
    /* renamed from: B */
    public g h(long j2, l.c.a.w.l lVar) {
        if (lVar instanceof l.c.a.w.b) {
            switch (((l.c.a.w.b) lVar).ordinal()) {
                case 0:
                    return K(j2);
                case 1:
                    return K((j2 % 86400000000L) * 1000);
                case 2:
                    return K((j2 % 86400000) * 1000000);
                case 3:
                    return M(j2);
                case 4:
                    return I(j2);
                case 5:
                    return G(j2);
                case 6:
                    return G((j2 % 2) * 12);
                default:
                    throw new l.c.a.w.m("Unsupported unit: " + lVar);
            }
        }
        return (g) lVar.addTo(this, j2);
    }

    public g G(long j2) {
        return j2 == 0 ? this : u(((((int) (j2 % 24)) + this.f9685d) + 24) % 24, this.f9686e, this.f9687f, this.f9688g);
    }

    public g I(long j2) {
        if (j2 == 0) {
            return this;
        }
        int i2 = (this.f9685d * 60) + this.f9686e;
        int i3 = ((((int) (j2 % 1440)) + i2) + 1440) % 1440;
        return i2 == i3 ? this : u(i3 / 60, i3 % 60, this.f9687f, this.f9688g);
    }

    public g K(long j2) {
        if (j2 == 0) {
            return this;
        }
        long Q = Q();
        long j3 = (((j2 % 86400000000000L) + Q) + 86400000000000L) % 86400000000000L;
        return Q == j3 ? this : u((int) (j3 / 3600000000000L), (int) ((j3 / 60000000000L) % 60), (int) ((j3 / 1000000000) % 60), (int) (j3 % 1000000000));
    }

    public g M(long j2) {
        if (j2 == 0) {
            return this;
        }
        int i2 = (this.f9686e * 60) + (this.f9685d * 3600) + this.f9687f;
        int i3 = ((((int) (j2 % 86400)) + i2) + 86400) % 86400;
        return i2 == i3 ? this : u(i3 / 3600, (i3 / 60) % 60, i3 % 60, this.f9688g);
    }

    public long Q() {
        return (this.f9687f * 1000000000) + (this.f9686e * 60000000000L) + (this.f9685d * 3600000000000L) + this.f9688g;
    }

    public int T() {
        return (this.f9686e * 60) + (this.f9685d * 3600) + this.f9687f;
    }

    @Override // l.c.a.w.d
    /* renamed from: W */
    public g a(l.c.a.w.i iVar, long j2) {
        if (iVar instanceof l.c.a.w.a) {
            l.c.a.w.a aVar = (l.c.a.w.a) iVar;
            aVar.checkValidValue(j2);
            switch (aVar.ordinal()) {
                case 0:
                    return b0((int) j2);
                case 1:
                    return z(j2);
                case 2:
                    return b0(((int) j2) * 1000);
                case 3:
                    return z(j2 * 1000);
                case 4:
                    return b0(((int) j2) * 1000000);
                case 5:
                    return z(j2 * 1000000);
                case 6:
                    int i2 = (int) j2;
                    if (this.f9687f == i2) {
                        return this;
                    }
                    l.c.a.w.a.SECOND_OF_MINUTE.checkValidValue(i2);
                    return u(this.f9685d, this.f9686e, i2, this.f9688g);
                case 7:
                    return M(j2 - T());
                case 8:
                    int i3 = (int) j2;
                    if (this.f9686e == i3) {
                        return this;
                    }
                    l.c.a.w.a.MINUTE_OF_HOUR.checkValidValue(i3);
                    return u(this.f9685d, i3, this.f9687f, this.f9688g);
                case 9:
                    return I(j2 - ((this.f9685d * 60) + this.f9686e));
                case 10:
                    return G(j2 - (this.f9685d % 12));
                case 11:
                    if (j2 == 12) {
                        j2 = 0;
                    }
                    return G(j2 - (this.f9685d % 12));
                case 12:
                    return a0((int) j2);
                case 13:
                    if (j2 == 24) {
                        j2 = 0;
                    }
                    return a0((int) j2);
                case 14:
                    return G((j2 - (this.f9685d / 12)) * 12);
                default:
                    throw new l.c.a.w.m(e.a.d.a.a.o("Unsupported field: ", iVar));
            }
        }
        return (g) iVar.adjustInto(this, j2);
    }

    public g a0(int i2) {
        if (this.f9685d == i2) {
            return this;
        }
        l.c.a.w.a.HOUR_OF_DAY.checkValidValue(i2);
        return u(i2, this.f9686e, this.f9687f, this.f9688g);
    }

    @Override // l.c.a.w.f
    public l.c.a.w.d adjustInto(l.c.a.w.d dVar) {
        return dVar.a(l.c.a.w.a.NANO_OF_DAY, Q());
    }

    @Override // l.c.a.w.d
    public l.c.a.w.d b(l.c.a.w.f fVar) {
        return fVar instanceof g ? (g) fVar : (g) fVar.adjustInto(this);
    }

    public g b0(int i2) {
        if (this.f9688g == i2) {
            return this;
        }
        l.c.a.w.a.NANO_OF_SECOND.checkValidValue(i2);
        return u(this.f9685d, this.f9686e, this.f9687f, i2);
    }

    public void c0(DataOutput dataOutput) throws IOException {
        if (this.f9688g != 0) {
            dataOutput.writeByte(this.f9685d);
            dataOutput.writeByte(this.f9686e);
            dataOutput.writeByte(this.f9687f);
            dataOutput.writeInt(this.f9688g);
        } else if (this.f9687f != 0) {
            dataOutput.writeByte(this.f9685d);
            dataOutput.writeByte(this.f9686e);
            dataOutput.writeByte(this.f9687f ^ (-1));
        } else if (this.f9686e == 0) {
            dataOutput.writeByte(this.f9685d ^ (-1));
        } else {
            dataOutput.writeByte(this.f9685d);
            dataOutput.writeByte(this.f9686e ^ (-1));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f9685d == gVar.f9685d && this.f9686e == gVar.f9686e && this.f9687f == gVar.f9687f && this.f9688g == gVar.f9688g;
        }
        return false;
    }

    @Override // l.c.a.w.d
    public l.c.a.w.d f(long j2, l.c.a.w.l lVar) {
        return j2 == Long.MIN_VALUE ? h(Long.MAX_VALUE, lVar).h(1L, lVar) : h(-j2, lVar);
    }

    @Override // l.c.a.v.c, l.c.a.w.e
    public int get(l.c.a.w.i iVar) {
        return iVar instanceof l.c.a.w.a ? y(iVar) : range(iVar).a(getLong(iVar), iVar);
    }

    @Override // l.c.a.w.e
    public long getLong(l.c.a.w.i iVar) {
        return iVar instanceof l.c.a.w.a ? iVar == l.c.a.w.a.NANO_OF_DAY ? Q() : iVar == l.c.a.w.a.MICRO_OF_DAY ? Q() / 1000 : y(iVar) : iVar.getFrom(this);
    }

    public int hashCode() {
        long Q = Q();
        return (int) (Q ^ (Q >>> 32));
    }

    @Override // l.c.a.w.d
    public long i(l.c.a.w.d dVar, l.c.a.w.l lVar) {
        g v = v(dVar);
        if (lVar instanceof l.c.a.w.b) {
            long Q = v.Q() - Q();
            switch (((l.c.a.w.b) lVar).ordinal()) {
                case 0:
                    return Q;
                case 1:
                    return Q / 1000;
                case 2:
                    return Q / 1000000;
                case 3:
                    return Q / 1000000000;
                case 4:
                    return Q / 60000000000L;
                case 5:
                    return Q / 3600000000000L;
                case 6:
                    return Q / 43200000000000L;
                default:
                    throw new l.c.a.w.m("Unsupported unit: " + lVar);
            }
        }
        return lVar.between(this, v);
    }

    @Override // l.c.a.w.e
    public boolean isSupported(l.c.a.w.i iVar) {
        return iVar instanceof l.c.a.w.a ? iVar.isTimeBased() : iVar != null && iVar.isSupportedBy(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.c.a.v.c, l.c.a.w.e
    public <R> R query(l.c.a.w.k<R> kVar) {
        if (kVar == l.c.a.w.j.f9810c) {
            return (R) l.c.a.w.b.NANOS;
        }
        if (kVar == l.c.a.w.j.f9814g) {
            return this;
        }
        if (kVar == l.c.a.w.j.f9809b || kVar == l.c.a.w.j.a || kVar == l.c.a.w.j.f9811d || kVar == l.c.a.w.j.f9812e || kVar == l.c.a.w.j.f9813f) {
            return null;
        }
        return kVar.a(this);
    }

    @Override // l.c.a.v.c, l.c.a.w.e
    public l.c.a.w.n range(l.c.a.w.i iVar) {
        return super.range(iVar);
    }

    @Override // java.lang.Comparable
    /* renamed from: t */
    public int compareTo(g gVar) {
        int t = w.t(this.f9685d, gVar.f9685d);
        if (t == 0) {
            int t2 = w.t(this.f9686e, gVar.f9686e);
            if (t2 == 0) {
                int t3 = w.t(this.f9687f, gVar.f9687f);
                return t3 == 0 ? w.t(this.f9688g, gVar.f9688g) : t3;
            }
            return t2;
        }
        return t;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b2 = this.f9685d;
        byte b3 = this.f9686e;
        byte b4 = this.f9687f;
        int i2 = this.f9688g;
        sb.append(b2 < 10 ? "0" : "");
        sb.append((int) b2);
        sb.append(b3 < 10 ? ":0" : ":");
        sb.append((int) b3);
        if (b4 > 0 || i2 > 0) {
            sb.append(b4 >= 10 ? ":" : ":0");
            sb.append((int) b4);
            if (i2 > 0) {
                sb.append(CoreConstants.DOT);
                if (i2 % 1000000 == 0) {
                    sb.append(Integer.toString((i2 / 1000000) + 1000).substring(1));
                } else if (i2 % 1000 == 0) {
                    sb.append(Integer.toString((i2 / 1000) + 1000000).substring(1));
                } else {
                    sb.append(Integer.toString(i2 + 1000000000).substring(1));
                }
            }
        }
        return sb.toString();
    }

    public final int y(l.c.a.w.i iVar) {
        switch (((l.c.a.w.a) iVar).ordinal()) {
            case 0:
                return this.f9688g;
            case 1:
                throw new a(e.a.d.a.a.o("Field too large for an int: ", iVar));
            case 2:
                return this.f9688g / 1000;
            case 3:
                throw new a(e.a.d.a.a.o("Field too large for an int: ", iVar));
            case 4:
                return this.f9688g / 1000000;
            case 5:
                return (int) (Q() / 1000000);
            case 6:
                return this.f9687f;
            case 7:
                return T();
            case 8:
                return this.f9686e;
            case 9:
                return (this.f9685d * 60) + this.f9686e;
            case 10:
                return this.f9685d % 12;
            case 11:
                int i2 = this.f9685d % 12;
                if (i2 % 12 == 0) {
                    return 12;
                }
                return i2;
            case 12:
                return this.f9685d;
            case 13:
                byte b2 = this.f9685d;
                if (b2 == 0) {
                    return 24;
                }
                return b2;
            case 14:
                return this.f9685d / 12;
            default:
                throw new l.c.a.w.m(e.a.d.a.a.o("Unsupported field: ", iVar));
        }
    }
}

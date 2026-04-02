package l.c.a;

import e.j.d.w;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import l.c.a.x.f;
import org.slf4j.Marker;
/* loaded from: classes2.dex */
public final class q extends p implements l.c.a.w.e, l.c.a.w.f, Comparable<q>, Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final ConcurrentMap<Integer, q> f9703b = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: c  reason: collision with root package name */
    public static final ConcurrentMap<String, q> f9704c = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: d  reason: collision with root package name */
    public static final q f9705d = K(0);

    /* renamed from: e  reason: collision with root package name */
    public static final q f9706e = K(-64800);

    /* renamed from: f  reason: collision with root package name */
    public static final q f9707f = K(64800);

    /* renamed from: g  reason: collision with root package name */
    public final int f9708g;

    /* renamed from: h  reason: collision with root package name */
    public final transient String f9709h;

    public q(int i2) {
        String sb;
        this.f9708g = i2;
        if (i2 == 0) {
            sb = "Z";
        } else {
            int abs = Math.abs(i2);
            StringBuilder sb2 = new StringBuilder();
            int i3 = abs / 3600;
            int i4 = (abs / 60) % 60;
            sb2.append(i2 < 0 ? "-" : Marker.ANY_NON_NULL_MARKER);
            sb2.append(i3 < 10 ? "0" : "");
            sb2.append(i3);
            sb2.append(i4 < 10 ? ":0" : ":");
            sb2.append(i4);
            int i5 = abs % 60;
            if (i5 != 0) {
                sb2.append(i5 >= 10 ? ":" : ":0");
                sb2.append(i5);
            }
            sb = sb2.toString();
        }
        this.f9709h = sb;
    }

    public static q B(l.c.a.w.e eVar) {
        q qVar = (q) eVar.query(l.c.a.w.j.f9812e);
        if (qVar != null) {
            return qVar;
        }
        throw new a("Unable to obtain ZoneOffset from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.c.a.q G(java.lang.String r7) {
        /*
            java.lang.String r0 = "offsetId"
            e.j.d.w.k0(r7, r0)
            java.util.concurrent.ConcurrentMap<java.lang.String, l.c.a.q> r0 = l.c.a.q.f9704c
            java.lang.Object r0 = r0.get(r7)
            l.c.a.q r0 = (l.c.a.q) r0
            if (r0 == 0) goto L10
            return r0
        L10:
            int r0 = r7.length()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L62
            r1 = 3
            if (r0 == r1) goto L7e
            r4 = 5
            if (r0 == r4) goto L59
            r5 = 6
            r6 = 4
            if (r0 == r5) goto L50
            r5 = 7
            if (r0 == r5) goto L43
            r1 = 9
            if (r0 != r1) goto L37
            int r0 = M(r7, r2, r3)
            int r1 = M(r7, r6, r2)
            int r2 = M(r7, r5, r2)
            goto L84
        L37:
            l.c.a.a r0 = new l.c.a.a
            java.lang.String r1 = "Invalid ID for ZoneOffset, invalid format: "
            java.lang.String r7 = e.a.d.a.a.k(r1, r7)
            r0.<init>(r7)
            throw r0
        L43:
            int r0 = M(r7, r2, r3)
            int r1 = M(r7, r1, r3)
            int r2 = M(r7, r4, r3)
            goto L84
        L50:
            int r0 = M(r7, r2, r3)
            int r1 = M(r7, r6, r2)
            goto L83
        L59:
            int r0 = M(r7, r2, r3)
            int r1 = M(r7, r1, r3)
            goto L83
        L62:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char r1 = r7.charAt(r3)
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            char r7 = r7.charAt(r2)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
        L7e:
            int r0 = M(r7, r2, r3)
            r1 = 0
        L83:
            r2 = 0
        L84:
            char r3 = r7.charAt(r3)
            r4 = 43
            r5 = 45
            if (r3 == r4) goto L9d
            if (r3 != r5) goto L91
            goto L9d
        L91:
            l.c.a.a r0 = new l.c.a.a
            java.lang.String r1 = "Invalid ID for ZoneOffset, plus/minus not found when expected: "
            java.lang.String r7 = e.a.d.a.a.k(r1, r7)
            r0.<init>(r7)
            throw r0
        L9d:
            if (r3 != r5) goto La7
            int r7 = -r0
            int r0 = -r1
            int r1 = -r2
            l.c.a.q r7 = I(r7, r0, r1)
            return r7
        La7:
            l.c.a.q r7 = I(r0, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l.c.a.q.G(java.lang.String):l.c.a.q");
    }

    public static q I(int i2, int i3, int i4) {
        if (i2 < -18 || i2 > 18) {
            throw new a(e.a.d.a.a.f("Zone offset hours not in valid range: value ", i2, " is not in the range -18 to 18"));
        }
        if (i2 > 0) {
            if (i3 < 0 || i4 < 0) {
                throw new a("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i2 < 0) {
            if (i3 > 0 || i4 > 0) {
                throw new a("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i3 > 0 && i4 < 0) || (i3 < 0 && i4 > 0)) {
            throw new a("Zone offset minutes and seconds must have the same sign");
        }
        if (Math.abs(i3) > 59) {
            StringBuilder y = e.a.d.a.a.y("Zone offset minutes not in valid range: abs(value) ");
            y.append(Math.abs(i3));
            y.append(" is not in the range 0 to 59");
            throw new a(y.toString());
        } else if (Math.abs(i4) > 59) {
            StringBuilder y2 = e.a.d.a.a.y("Zone offset seconds not in valid range: abs(value) ");
            y2.append(Math.abs(i4));
            y2.append(" is not in the range 0 to 59");
            throw new a(y2.toString());
        } else if (Math.abs(i2) != 18 || (Math.abs(i3) <= 0 && Math.abs(i4) <= 0)) {
            return K((i3 * 60) + (i2 * 3600) + i4);
        } else {
            throw new a("Zone offset not in valid range: -18:00 to +18:00");
        }
    }

    public static q K(int i2) {
        if (Math.abs(i2) <= 64800) {
            if (i2 % 900 == 0) {
                Integer valueOf = Integer.valueOf(i2);
                ConcurrentMap<Integer, q> concurrentMap = f9703b;
                q qVar = concurrentMap.get(valueOf);
                if (qVar == null) {
                    concurrentMap.putIfAbsent(valueOf, new q(i2));
                    q qVar2 = concurrentMap.get(valueOf);
                    f9704c.putIfAbsent(qVar2.f9709h, qVar2);
                    return qVar2;
                }
                return qVar;
            }
            return new q(i2);
        }
        throw new a("Zone offset not in valid range: -18:00 to +18:00");
    }

    public static int M(CharSequence charSequence, int i2, boolean z) {
        if (z && charSequence.charAt(i2 - 1) != ':') {
            throw new a("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) charSequence));
        }
        char charAt = charSequence.charAt(i2);
        char charAt2 = charSequence.charAt(i2 + 1);
        if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9') {
            return (charAt2 - '0') + ((charAt - '0') * 10);
        }
        throw new a("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) charSequence));
    }

    public static q P(DataInput dataInput) throws IOException {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? K(dataInput.readInt()) : K(readByte * 900);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new m((byte) 8, this);
    }

    public void Q(DataOutput dataOutput) throws IOException {
        int i2 = this.f9708g;
        int i3 = i2 % 900 == 0 ? i2 / 900 : 127;
        dataOutput.writeByte(i3);
        if (i3 == 127) {
            dataOutput.writeInt(i2);
        }
    }

    @Override // l.c.a.w.f
    public l.c.a.w.d adjustInto(l.c.a.w.d dVar) {
        return dVar.a(l.c.a.w.a.OFFSET_SECONDS, this.f9708g);
    }

    @Override // java.lang.Comparable
    public int compareTo(q qVar) {
        return qVar.f9708g - this.f9708g;
    }

    @Override // l.c.a.p
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && this.f9708g == ((q) obj).f9708g;
    }

    @Override // l.c.a.w.e
    public int get(l.c.a.w.i iVar) {
        if (iVar == l.c.a.w.a.OFFSET_SECONDS) {
            return this.f9708g;
        }
        if (iVar instanceof l.c.a.w.a) {
            throw new l.c.a.w.m(e.a.d.a.a.o("Unsupported field: ", iVar));
        }
        return range(iVar).a(getLong(iVar), iVar);
    }

    @Override // l.c.a.w.e
    public long getLong(l.c.a.w.i iVar) {
        if (iVar == l.c.a.w.a.OFFSET_SECONDS) {
            return this.f9708g;
        }
        if (iVar instanceof l.c.a.w.a) {
            throw new a(e.a.d.a.a.o("Unsupported field: ", iVar));
        }
        return iVar.getFrom(this);
    }

    @Override // l.c.a.p
    public int hashCode() {
        return this.f9708g;
    }

    @Override // l.c.a.w.e
    public boolean isSupported(l.c.a.w.i iVar) {
        return iVar instanceof l.c.a.w.a ? iVar == l.c.a.w.a.OFFSET_SECONDS : iVar != null && iVar.isSupportedBy(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.c.a.w.e
    public <R> R query(l.c.a.w.k<R> kVar) {
        if (kVar == l.c.a.w.j.f9812e || kVar == l.c.a.w.j.f9811d) {
            return this;
        }
        if (kVar == l.c.a.w.j.f9813f || kVar == l.c.a.w.j.f9814g || kVar == l.c.a.w.j.f9810c || kVar == l.c.a.w.j.f9809b || kVar == l.c.a.w.j.a) {
            return null;
        }
        return kVar.a(this);
    }

    @Override // l.c.a.w.e
    public l.c.a.w.n range(l.c.a.w.i iVar) {
        if (iVar == l.c.a.w.a.OFFSET_SECONDS) {
            return iVar.range();
        }
        if (iVar instanceof l.c.a.w.a) {
            throw new l.c.a.w.m(e.a.d.a.a.o("Unsupported field: ", iVar));
        }
        return iVar.rangeRefinedBy(this);
    }

    @Override // l.c.a.p
    public String toString() {
        return this.f9709h;
    }

    @Override // l.c.a.p
    public String u() {
        return this.f9709h;
    }

    @Override // l.c.a.p
    public l.c.a.x.f v() {
        w.k0(this, "offset");
        return new f.a(this);
    }

    @Override // l.c.a.p
    public void z(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(8);
        Q(dataOutput);
    }
}

package l.c.a;

import e.j.d.w;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
/* loaded from: classes2.dex */
public final class d extends l.c.a.v.c implements l.c.a.w.d, l.c.a.w.f, Comparable<d>, Serializable {
    public static final d a = new d(0, 0);

    /* renamed from: b  reason: collision with root package name */
    public final long f9674b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9675c;

    static {
        B(-31557014167219200L, 0L);
        B(31556889864403199L, 999999999L);
    }

    public d(long j2, int i2) {
        this.f9674b = j2;
        this.f9675c = i2;
    }

    public static d B(long j2, long j3) {
        return u(w.n0(j2, w.G(j3, 1000000000L)), w.H(j3, 1000000000));
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static d u(long j2, int i2) {
        if ((i2 | j2) == 0) {
            return a;
        }
        if (j2 < -31557014167219200L || j2 > 31556889864403199L) {
            throw new a("Instant exceeds minimum or maximum instant");
        }
        return new d(j2, i2);
    }

    public static d v(l.c.a.w.e eVar) {
        try {
            return B(eVar.getLong(l.c.a.w.a.INSTANT_SECONDS), eVar.get(l.c.a.w.a.NANO_OF_SECOND));
        } catch (a e2) {
            throw new a("Unable to obtain Instant from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName(), e2);
        }
    }

    private Object writeReplace() {
        return new m((byte) 2, this);
    }

    public static d z(long j2) {
        return u(w.G(j2, 1000L), w.H(j2, 1000) * 1000000);
    }

    public final d G(long j2, long j3) {
        if ((j2 | j3) == 0) {
            return this;
        }
        return B(w.n0(w.n0(this.f9674b, j2), j3 / 1000000000), this.f9675c + (j3 % 1000000000));
    }

    @Override // l.c.a.w.d
    /* renamed from: I */
    public d h(long j2, l.c.a.w.l lVar) {
        if (lVar instanceof l.c.a.w.b) {
            switch (((l.c.a.w.b) lVar).ordinal()) {
                case 0:
                    return G(0L, j2);
                case 1:
                    return G(j2 / 1000000, (j2 % 1000000) * 1000);
                case 2:
                    return G(j2 / 1000, (j2 % 1000) * 1000000);
                case 3:
                    return G(j2, 0L);
                case 4:
                    return K(w.p0(j2, 60));
                case 5:
                    return K(w.p0(j2, 3600));
                case 6:
                    return K(w.p0(j2, 43200));
                case 7:
                    return K(w.p0(j2, 86400));
                default:
                    throw new l.c.a.w.m("Unsupported unit: " + lVar);
            }
        }
        return (d) lVar.addTo(this, j2);
    }

    public d K(long j2) {
        return G(j2, 0L);
    }

    public final long M(d dVar) {
        long r0 = w.r0(dVar.f9674b, this.f9674b);
        long j2 = dVar.f9675c - this.f9675c;
        return (r0 <= 0 || j2 >= 0) ? (r0 >= 0 || j2 <= 0) ? r0 : r0 + 1 : r0 - 1;
    }

    public long P() {
        long j2 = this.f9674b;
        return j2 >= 0 ? w.n0(w.q0(j2, 1000L), this.f9675c / 1000000) : w.r0(w.q0(j2 + 1, 1000L), 1000 - (this.f9675c / 1000000));
    }

    @Override // l.c.a.w.d
    public l.c.a.w.d a(l.c.a.w.i iVar, long j2) {
        if (iVar instanceof l.c.a.w.a) {
            l.c.a.w.a aVar = (l.c.a.w.a) iVar;
            aVar.checkValidValue(j2);
            int ordinal = aVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 2) {
                    int i2 = ((int) j2) * 1000;
                    if (i2 != this.f9675c) {
                        return u(this.f9674b, i2);
                    }
                } else if (ordinal == 4) {
                    int i3 = ((int) j2) * 1000000;
                    if (i3 != this.f9675c) {
                        return u(this.f9674b, i3);
                    }
                } else if (ordinal != 28) {
                    throw new l.c.a.w.m(e.a.d.a.a.o("Unsupported field: ", iVar));
                } else {
                    if (j2 != this.f9674b) {
                        return u(j2, this.f9675c);
                    }
                }
            } else if (j2 != this.f9675c) {
                return u(this.f9674b, (int) j2);
            }
            return this;
        }
        return (d) iVar.adjustInto(this, j2);
    }

    @Override // l.c.a.w.f
    public l.c.a.w.d adjustInto(l.c.a.w.d dVar) {
        return dVar.a(l.c.a.w.a.INSTANT_SECONDS, this.f9674b).a(l.c.a.w.a.NANO_OF_SECOND, this.f9675c);
    }

    @Override // l.c.a.w.d
    public l.c.a.w.d b(l.c.a.w.f fVar) {
        return (d) fVar.adjustInto(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return this.f9674b == dVar.f9674b && this.f9675c == dVar.f9675c;
        }
        return false;
    }

    @Override // l.c.a.w.d
    public l.c.a.w.d f(long j2, l.c.a.w.l lVar) {
        return j2 == Long.MIN_VALUE ? h(Long.MAX_VALUE, lVar).h(1L, lVar) : h(-j2, lVar);
    }

    @Override // l.c.a.v.c, l.c.a.w.e
    public int get(l.c.a.w.i iVar) {
        if (iVar instanceof l.c.a.w.a) {
            int ordinal = ((l.c.a.w.a) iVar).ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal == 4) {
                        return this.f9675c / 1000000;
                    }
                    throw new l.c.a.w.m(e.a.d.a.a.o("Unsupported field: ", iVar));
                }
                return this.f9675c / 1000;
            }
            return this.f9675c;
        }
        return super.range(iVar).a(iVar.getFrom(this), iVar);
    }

    @Override // l.c.a.w.e
    public long getLong(l.c.a.w.i iVar) {
        int i2;
        if (iVar instanceof l.c.a.w.a) {
            int ordinal = ((l.c.a.w.a) iVar).ordinal();
            if (ordinal == 0) {
                i2 = this.f9675c;
            } else if (ordinal == 2) {
                i2 = this.f9675c / 1000;
            } else if (ordinal != 4) {
                if (ordinal == 28) {
                    return this.f9674b;
                }
                throw new l.c.a.w.m(e.a.d.a.a.o("Unsupported field: ", iVar));
            } else {
                i2 = this.f9675c / 1000000;
            }
            return i2;
        }
        return iVar.getFrom(this);
    }

    public int hashCode() {
        long j2 = this.f9674b;
        return (this.f9675c * 51) + ((int) (j2 ^ (j2 >>> 32)));
    }

    @Override // l.c.a.w.d
    public long i(l.c.a.w.d dVar, l.c.a.w.l lVar) {
        d v = v(dVar);
        if (lVar instanceof l.c.a.w.b) {
            switch (((l.c.a.w.b) lVar).ordinal()) {
                case 0:
                    return y(v);
                case 1:
                    return y(v) / 1000;
                case 2:
                    return w.r0(v.P(), P());
                case 3:
                    return M(v);
                case 4:
                    return M(v) / 60;
                case 5:
                    return M(v) / 3600;
                case 6:
                    return M(v) / 43200;
                case 7:
                    return M(v) / 86400;
                default:
                    throw new l.c.a.w.m("Unsupported unit: " + lVar);
            }
        }
        return lVar.between(this, v);
    }

    @Override // l.c.a.w.e
    public boolean isSupported(l.c.a.w.i iVar) {
        return iVar instanceof l.c.a.w.a ? iVar == l.c.a.w.a.INSTANT_SECONDS || iVar == l.c.a.w.a.NANO_OF_SECOND || iVar == l.c.a.w.a.MICRO_OF_SECOND || iVar == l.c.a.w.a.MILLI_OF_SECOND : iVar != null && iVar.isSupportedBy(this);
    }

    @Override // l.c.a.v.c, l.c.a.w.e
    public <R> R query(l.c.a.w.k<R> kVar) {
        if (kVar == l.c.a.w.j.f9810c) {
            return (R) l.c.a.w.b.NANOS;
        }
        if (kVar == l.c.a.w.j.f9813f || kVar == l.c.a.w.j.f9814g || kVar == l.c.a.w.j.f9809b || kVar == l.c.a.w.j.a || kVar == l.c.a.w.j.f9811d || kVar == l.c.a.w.j.f9812e) {
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
    public int compareTo(d dVar) {
        int u = w.u(this.f9674b, dVar.f9674b);
        return u != 0 ? u : this.f9675c - dVar.f9675c;
    }

    public String toString() {
        return l.c.a.u.a.f9762e.a(this);
    }

    public final long y(d dVar) {
        return w.n0(w.p0(w.r0(dVar.f9674b, this.f9674b), 1000000000), dVar.f9675c - this.f9675c);
    }
}

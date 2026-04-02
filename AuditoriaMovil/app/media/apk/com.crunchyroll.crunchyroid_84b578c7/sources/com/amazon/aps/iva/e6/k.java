package com.amazon.aps.iva.e6;

import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.t5.g0;
import com.google.common.math.BigIntegerMath;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
/* compiled from: SegmentBase.java */
/* loaded from: classes.dex */
public abstract class k {
    public final i a;
    public final long b;
    public final long c;

    /* compiled from: SegmentBase.java */
    /* loaded from: classes.dex */
    public static abstract class a extends k {
        public final long d;
        public final long e;
        public final List<d> f;
        public final long g;
        public final long h;
        public final long i;

        public a(i iVar, long j, long j2, long j3, long j4, List<d> list, long j5, long j6, long j7) {
            super(iVar, j, j2);
            this.d = j3;
            this.e = j4;
            this.f = list;
            this.i = j5;
            this.g = j6;
            this.h = j7;
        }

        public final long b(long j, long j2) {
            long d = d(j);
            if (d != -1) {
                return d;
            }
            return (int) (f((j2 - this.h) + this.i, j) - c(j, j2));
        }

        public final long c(long j, long j2) {
            int i = (d(j) > (-1L) ? 1 : (d(j) == (-1L) ? 0 : -1));
            long j3 = this.d;
            if (i == 0) {
                long j4 = this.g;
                if (j4 != -9223372036854775807L) {
                    return Math.max(j3, f((j2 - this.h) - j4, j));
                }
            }
            return j3;
        }

        public abstract long d(long j);

        public final long e(long j, long j2) {
            long j3 = this.b;
            long j4 = this.d;
            List<d> list = this.f;
            if (list != null) {
                return (list.get((int) (j - j4)).b * 1000000) / j3;
            }
            long d = d(j2);
            if (d != -1 && j == (j4 + d) - 1) {
                return j2 - g(j);
            }
            return (this.e * 1000000) / j3;
        }

        public final long f(long j, long j2) {
            long d = d(j2);
            int i = (d > 0L ? 1 : (d == 0L ? 0 : -1));
            long j3 = this.d;
            if (i == 0) {
                return j3;
            }
            if (this.f == null) {
                long j4 = (j / ((this.e * 1000000) / this.b)) + j3;
                if (j4 >= j3) {
                    if (d == -1) {
                        return j4;
                    }
                    return Math.min(j4, (j3 + d) - 1);
                }
                return j3;
            }
            long j5 = (d + j3) - 1;
            long j6 = j3;
            while (j6 <= j5) {
                long j7 = ((j5 - j6) / 2) + j6;
                int i2 = (g(j7) > j ? 1 : (g(j7) == j ? 0 : -1));
                if (i2 < 0) {
                    j6 = j7 + 1;
                } else if (i2 > 0) {
                    j5 = j7 - 1;
                } else {
                    return j7;
                }
            }
            if (j6 == j3) {
                return j6;
            }
            return j5;
        }

        public final long g(long j) {
            long j2;
            long j3 = this.d;
            List<d> list = this.f;
            if (list != null) {
                j2 = list.get((int) (j - j3)).a - this.c;
            } else {
                j2 = (j - j3) * this.e;
            }
            return g0.X(j2, 1000000L, this.b);
        }

        public abstract i h(long j, j jVar);

        public boolean i() {
            if (this.f != null) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: SegmentBase.java */
    /* loaded from: classes.dex */
    public static final class b extends a {
        public final List<i> j;

        public b(i iVar, long j, long j2, long j3, long j4, List<d> list, long j5, List<i> list2, long j6, long j7) {
            super(iVar, j, j2, j3, j4, list, j5, j6, j7);
            this.j = list2;
        }

        @Override // com.amazon.aps.iva.e6.k.a
        public final long d(long j) {
            return this.j.size();
        }

        @Override // com.amazon.aps.iva.e6.k.a
        public final i h(long j, j jVar) {
            return this.j.get((int) (j - this.d));
        }

        @Override // com.amazon.aps.iva.e6.k.a
        public final boolean i() {
            return true;
        }
    }

    /* compiled from: SegmentBase.java */
    /* loaded from: classes.dex */
    public static final class c extends a {
        public final m j;
        public final m k;
        public final long l;

        public c(i iVar, long j, long j2, long j3, long j4, long j5, List<d> list, long j6, m mVar, m mVar2, long j7, long j8) {
            super(iVar, j, j2, j3, j5, list, j6, j7, j8);
            this.j = mVar;
            this.k = mVar2;
            this.l = j4;
        }

        @Override // com.amazon.aps.iva.e6.k
        public final i a(j jVar) {
            m mVar = this.j;
            if (mVar != null) {
                v vVar = jVar.b;
                return new i(mVar.a(vVar.b, 0L, vVar.i, 0L), 0L, -1L);
            }
            return this.a;
        }

        @Override // com.amazon.aps.iva.e6.k.a
        public final long d(long j) {
            List<d> list = this.f;
            if (list != null) {
                return list.size();
            }
            long j2 = this.l;
            if (j2 != -1) {
                return (j2 - this.d) + 1;
            }
            if (j == -9223372036854775807L) {
                return -1L;
            }
            return BigIntegerMath.divide(BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.b)), BigInteger.valueOf(this.e).multiply(BigInteger.valueOf(1000000L)), RoundingMode.CEILING).longValue();
        }

        @Override // com.amazon.aps.iva.e6.k.a
        public final i h(long j, j jVar) {
            long j2;
            long j3 = this.d;
            List<d> list = this.f;
            if (list != null) {
                j2 = list.get((int) (j - j3)).a;
            } else {
                j2 = (j - j3) * this.e;
            }
            long j4 = j2;
            m mVar = this.k;
            v vVar = jVar.b;
            return new i(mVar.a(vVar.b, j, vVar.i, j4), 0L, -1L);
        }
    }

    /* compiled from: SegmentBase.java */
    /* loaded from: classes.dex */
    public static final class d {
        public final long a;
        public final long b;

        public d(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.a == dVar.a && this.b == dVar.b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (((int) this.a) * 31) + ((int) this.b);
        }
    }

    public k(i iVar, long j, long j2) {
        this.a = iVar;
        this.b = j;
        this.c = j2;
    }

    public i a(j jVar) {
        return this.a;
    }

    /* compiled from: SegmentBase.java */
    /* loaded from: classes.dex */
    public static class e extends k {
        public final long d;
        public final long e;

        public e(i iVar, long j, long j2, long j3, long j4) {
            super(iVar, j, j2);
            this.d = j3;
            this.e = j4;
        }

        public e() {
            this(null, 1L, 0L, 0L, 0L);
        }
    }
}

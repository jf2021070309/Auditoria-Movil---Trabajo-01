package com.amazon.aps.iva.o7;

import android.util.Pair;
import com.amazon.aps.iva.o7.a;
import com.amazon.aps.iva.q5.f0;
import com.amazon.aps.iva.q5.h0;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.t5.p;
import com.amazon.aps.iva.t5.v;
import com.amazon.aps.iva.x6.q;
/* compiled from: AtomParsers.java */
/* loaded from: classes.dex */
public final class b {
    public static final byte[] a = g0.H("OpusHead");

    /* compiled from: AtomParsers.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final int a;
        public int b;
        public int c;
        public long d;
        public final boolean e;
        public final v f;
        public final v g;
        public int h;
        public int i;

        public a(v vVar, v vVar2, boolean z) throws h0 {
            this.g = vVar;
            this.f = vVar2;
            this.e = z;
            vVar2.F(12);
            this.a = vVar2.x();
            vVar.F(12);
            this.i = vVar.x();
            q.a("first_chunk must be 1", vVar.e() == 1);
            this.b = -1;
        }

        public final boolean a() {
            long v;
            int i;
            int i2 = this.b + 1;
            this.b = i2;
            if (i2 == this.a) {
                return false;
            }
            boolean z = this.e;
            v vVar = this.f;
            if (z) {
                v = vVar.y();
            } else {
                v = vVar.v();
            }
            this.d = v;
            if (this.b == this.h) {
                v vVar2 = this.g;
                this.c = vVar2.x();
                vVar2.G(4);
                int i3 = this.i - 1;
                this.i = i3;
                if (i3 > 0) {
                    i = vVar2.x() - 1;
                } else {
                    i = -1;
                }
                this.h = i;
            }
            return true;
        }
    }

    /* compiled from: AtomParsers.java */
    /* renamed from: com.amazon.aps.iva.o7.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0559b {
        public final String a;
        public final byte[] b;
        public final long c;
        public final long d;

        public C0559b(String str, byte[] bArr, long j, long j2) {
            this.a = str;
            this.b = bArr;
            this.c = j;
            this.d = j2;
        }
    }

    /* compiled from: AtomParsers.java */
    /* loaded from: classes.dex */
    public static final class c {
        public final f0 a;
        public final long b;

        public c(f0 f0Var, long j) {
            this.a = f0Var;
            this.b = j;
        }
    }

    /* compiled from: AtomParsers.java */
    /* loaded from: classes.dex */
    public interface d {
        int a();

        int b();

        int c();
    }

    /* compiled from: AtomParsers.java */
    /* loaded from: classes.dex */
    public static final class e {
        public final m[] a;
        public com.amazon.aps.iva.q5.v b;
        public int c;
        public int d = 0;

        public e(int i) {
            this.a = new m[i];
        }
    }

    /* compiled from: AtomParsers.java */
    /* loaded from: classes.dex */
    public static final class f implements d {
        public final int a;
        public final int b;
        public final v c;

        public f(a.b bVar, com.amazon.aps.iva.q5.v vVar) {
            v vVar2 = bVar.b;
            this.c = vVar2;
            vVar2.F(12);
            int x = vVar2.x();
            if ("audio/raw".equals(vVar.m)) {
                int A = g0.A(vVar.B, vVar.z);
                if (x == 0 || x % A != 0) {
                    p.g();
                    x = A;
                }
            }
            this.a = x == 0 ? -1 : x;
            this.b = vVar2.x();
        }

        @Override // com.amazon.aps.iva.o7.b.d
        public final int a() {
            int i = this.a;
            if (i == -1) {
                return this.c.x();
            }
            return i;
        }

        @Override // com.amazon.aps.iva.o7.b.d
        public final int b() {
            return this.a;
        }

        @Override // com.amazon.aps.iva.o7.b.d
        public final int c() {
            return this.b;
        }
    }

    /* compiled from: AtomParsers.java */
    /* loaded from: classes.dex */
    public static final class g implements d {
        public final v a;
        public final int b;
        public final int c;
        public int d;
        public int e;

        public g(a.b bVar) {
            v vVar = bVar.b;
            this.a = vVar;
            vVar.F(12);
            this.c = vVar.x() & 255;
            this.b = vVar.x();
        }

        @Override // com.amazon.aps.iva.o7.b.d
        public final int a() {
            v vVar = this.a;
            int i = this.c;
            if (i == 8) {
                return vVar.u();
            }
            if (i == 16) {
                return vVar.z();
            }
            int i2 = this.d;
            this.d = i2 + 1;
            if (i2 % 2 == 0) {
                int u = vVar.u();
                this.e = u;
                return (u & 240) >> 4;
            }
            return this.e & 15;
        }

        @Override // com.amazon.aps.iva.o7.b.d
        public final int b() {
            return -1;
        }

        @Override // com.amazon.aps.iva.o7.b.d
        public final int c() {
            return this.b;
        }
    }

    public static C0559b a(int i, v vVar) {
        long j;
        long j2;
        vVar.F(i + 8 + 4);
        vVar.G(1);
        b(vVar);
        vVar.G(2);
        int u = vVar.u();
        if ((u & 128) != 0) {
            vVar.G(2);
        }
        if ((u & 64) != 0) {
            vVar.G(vVar.u());
        }
        if ((u & 32) != 0) {
            vVar.G(2);
        }
        vVar.G(1);
        b(vVar);
        String f2 = com.amazon.aps.iva.q5.g0.f(vVar.u());
        if (!"audio/mpeg".equals(f2) && !"audio/vnd.dts".equals(f2) && !"audio/vnd.dts.hd".equals(f2)) {
            vVar.G(4);
            long v = vVar.v();
            long v2 = vVar.v();
            vVar.G(1);
            int b = b(vVar);
            byte[] bArr = new byte[b];
            vVar.d(0, bArr, b);
            if (v2 > 0) {
                j = v2;
            } else {
                j = -1;
            }
            if (v > 0) {
                j2 = v;
            } else {
                j2 = -1;
            }
            return new C0559b(f2, bArr, j, j2);
        }
        return new C0559b(f2, null, -1L, -1L);
    }

    public static int b(v vVar) {
        int u = vVar.u();
        int i = u & 127;
        while ((u & 128) == 128) {
            u = vVar.u();
            i = (i << 7) | (u & 127);
        }
        return i;
    }

    public static c c(v vVar) {
        long j;
        vVar.F(8);
        if (((vVar.e() >> 24) & 255) == 0) {
            j = vVar.v();
            vVar.G(4);
        } else {
            long n = vVar.n();
            vVar.G(8);
            j = n;
        }
        return new c(new f0(new com.amazon.aps.iva.u5.a((j - 2082844800) * 1000)), vVar.v());
    }

    public static Pair d(int i, int i2, v vVar) throws h0 {
        boolean z;
        boolean z2;
        boolean z3;
        Integer num;
        m mVar;
        Pair create;
        int i3;
        int i4;
        boolean z4;
        byte[] bArr;
        int i5 = vVar.b;
        while (i5 - i < i2) {
            vVar.F(i5);
            int e2 = vVar.e();
            boolean z5 = true;
            if (e2 > 0) {
                z = true;
            } else {
                z = false;
            }
            q.a("childAtomSize must be positive", z);
            if (vVar.e() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = 0;
                int i8 = -1;
                String str = null;
                Integer num2 = null;
                while (i6 - i5 < e2) {
                    vVar.F(i6);
                    int e3 = vVar.e();
                    int e4 = vVar.e();
                    if (e4 == 1718775137) {
                        num2 = Integer.valueOf(vVar.e());
                    } else if (e4 == 1935894637) {
                        vVar.G(4);
                        str = vVar.r(4);
                    } else if (e4 == 1935894633) {
                        i8 = i6;
                        i7 = e3;
                    }
                    i6 += e3;
                }
                if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
                    create = null;
                } else {
                    if (num2 != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    q.a("frma atom is mandatory", z2);
                    if (i8 != -1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    q.a("schi atom is mandatory", z3);
                    int i9 = i8 + 8;
                    while (true) {
                        if (i9 - i8 < i7) {
                            vVar.F(i9);
                            int e5 = vVar.e();
                            if (vVar.e() == 1952804451) {
                                int e6 = (vVar.e() >> 24) & 255;
                                vVar.G(1);
                                if (e6 == 0) {
                                    vVar.G(1);
                                    i3 = 0;
                                    i4 = 0;
                                } else {
                                    int u = vVar.u();
                                    i3 = u & 15;
                                    i4 = (u & 240) >> 4;
                                }
                                if (vVar.u() == 1) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                int u2 = vVar.u();
                                byte[] bArr2 = new byte[16];
                                vVar.d(0, bArr2, 16);
                                if (z4 && u2 == 0) {
                                    int u3 = vVar.u();
                                    byte[] bArr3 = new byte[u3];
                                    vVar.d(0, bArr3, u3);
                                    bArr = bArr3;
                                } else {
                                    bArr = null;
                                }
                                num = num2;
                                mVar = new m(z4, str, u2, bArr2, i4, i3, bArr);
                            } else {
                                i9 += e5;
                            }
                        } else {
                            num = num2;
                            mVar = null;
                            break;
                        }
                    }
                    if (mVar == null) {
                        z5 = false;
                    }
                    q.a("tenc atom is mandatory", z5);
                    int i10 = g0.a;
                    create = Pair.create(num, mVar);
                }
                if (create != null) {
                    return create;
                }
            }
            i5 += e2;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:230:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x070b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.amazon.aps.iva.o7.b.e e(com.amazon.aps.iva.t5.v r44, int r45, int r46, java.lang.String r47, com.amazon.aps.iva.q5.r r48, boolean r49) throws com.amazon.aps.iva.q5.h0 {
        /*
            Method dump skipped, instructions count: 2896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o7.b.e(com.amazon.aps.iva.t5.v, int, int, java.lang.String, com.amazon.aps.iva.q5.r, boolean):com.amazon.aps.iva.o7.b$e");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x083a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList f(com.amazon.aps.iva.o7.a.C0558a r46, com.amazon.aps.iva.x6.x r47, long r48, com.amazon.aps.iva.q5.r r50, boolean r51, boolean r52, com.google.common.base.Function r53) throws com.amazon.aps.iva.q5.h0 {
        /*
            Method dump skipped, instructions count: 2116
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o7.b.f(com.amazon.aps.iva.o7.a$a, com.amazon.aps.iva.x6.x, long, com.amazon.aps.iva.q5.r, boolean, boolean, com.google.common.base.Function):java.util.ArrayList");
    }
}

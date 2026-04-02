package com.umeng.analytics.pro;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
/* compiled from: TCompactProtocol.java */
/* loaded from: classes3.dex */
public class ci extends co {
    private static final ct d = new ct("");
    private static final cj e = new cj("", (byte) 0, 0);
    private static final byte[] f;
    private static final byte h = -126;
    private static final byte i = 1;
    private static final byte j = 31;
    private static final byte k = -32;
    private static final int l = 5;
    byte[] a;
    byte[] b;
    byte[] c;
    private bn m;
    private short n;
    private cj o;
    private Boolean p;
    private final long q;
    private byte[] r;

    static {
        f = r0;
        byte[] bArr = {0, 0, 1, 3, 7, 0, 4, 0, 5, 0, 6, 8, 12, 11, 10, 9};
    }

    /* compiled from: TCompactProtocol.java */
    /* loaded from: classes3.dex */
    public static class a implements cq {
        private final long a;

        public a() {
            this.a = -1L;
        }

        public a(int i) {
            this.a = i;
        }

        @Override // com.umeng.analytics.pro.cq
        public co a(dc dcVar) {
            return new ci(dcVar, this.a);
        }
    }

    /* compiled from: TCompactProtocol.java */
    /* loaded from: classes3.dex */
    private static class b {
        public static final byte a = 1;
        public static final byte b = 2;
        public static final byte c = 3;
        public static final byte d = 4;
        public static final byte e = 5;
        public static final byte f = 6;
        public static final byte g = 7;
        public static final byte h = 8;
        public static final byte i = 9;
        public static final byte j = 10;
        public static final byte k = 11;
        public static final byte l = 12;

        private b() {
        }
    }

    public ci(dc dcVar, long j2) {
        super(dcVar);
        this.m = new bn(15);
        this.n = (short) 0;
        this.o = null;
        this.p = null;
        this.a = new byte[5];
        this.b = new byte[10];
        this.r = new byte[1];
        this.c = new byte[1];
        this.q = j2;
    }

    public ci(dc dcVar) {
        this(dcVar, -1L);
    }

    @Override // com.umeng.analytics.pro.co
    public void B() {
        this.m.c();
        this.n = (short) 0;
    }

    @Override // com.umeng.analytics.pro.co
    public void a(cm cmVar) throws bv {
        b(h);
        d(((cmVar.b << 5) & (-32)) | 1);
        b(cmVar.c);
        a(cmVar.a);
    }

    @Override // com.umeng.analytics.pro.co
    public void a(ct ctVar) throws bv {
        this.m.a(this.n);
        this.n = (short) 0;
    }

    @Override // com.umeng.analytics.pro.co
    public void b() throws bv {
        this.n = this.m.a();
    }

    @Override // com.umeng.analytics.pro.co
    public void a(cj cjVar) throws bv {
        if (cjVar.b == 2) {
            this.o = cjVar;
        } else {
            a(cjVar, (byte) -1);
        }
    }

    private void a(cj cjVar, byte b2) throws bv {
        if (b2 == -1) {
            b2 = e(cjVar.b);
        }
        if (cjVar.c > this.n && cjVar.c - this.n <= 15) {
            d(b2 | ((cjVar.c - this.n) << 4));
        } else {
            b(b2);
            a(cjVar.c);
        }
        this.n = cjVar.c;
    }

    @Override // com.umeng.analytics.pro.co
    public void d() throws bv {
        b((byte) 0);
    }

    @Override // com.umeng.analytics.pro.co
    public void a(cl clVar) throws bv {
        if (clVar.c == 0) {
            d(0);
            return;
        }
        b(clVar.c);
        d(e(clVar.b) | (e(clVar.a) << 4));
    }

    @Override // com.umeng.analytics.pro.co
    public void a(ck ckVar) throws bv {
        a(ckVar.a, ckVar.b);
    }

    @Override // com.umeng.analytics.pro.co
    public void a(cs csVar) throws bv {
        a(csVar.a, csVar.b);
    }

    @Override // com.umeng.analytics.pro.co
    public void a(boolean z) throws bv {
        cj cjVar = this.o;
        if (cjVar != null) {
            a(cjVar, z ? (byte) 1 : (byte) 2);
            this.o = null;
            return;
        }
        b(z ? (byte) 1 : (byte) 2);
    }

    @Override // com.umeng.analytics.pro.co
    public void a(byte b2) throws bv {
        b(b2);
    }

    @Override // com.umeng.analytics.pro.co
    public void a(short s) throws bv {
        b(c((int) s));
    }

    @Override // com.umeng.analytics.pro.co
    public void a(int i2) throws bv {
        b(c(i2));
    }

    @Override // com.umeng.analytics.pro.co
    public void a(long j2) throws bv {
        b(c(j2));
    }

    @Override // com.umeng.analytics.pro.co
    public void a(double d2) throws bv {
        byte[] bArr = {0, 0, 0, 0, 0, 0, 0, 0};
        a(Double.doubleToLongBits(d2), bArr, 0);
        this.g.b(bArr);
    }

    @Override // com.umeng.analytics.pro.co
    public void a(String str) throws bv {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            a(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException e2) {
            throw new bv("UTF-8 not supported!");
        }
    }

    @Override // com.umeng.analytics.pro.co
    public void a(ByteBuffer byteBuffer) throws bv {
        a(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.limit() - byteBuffer.position());
    }

    private void a(byte[] bArr, int i2, int i3) throws bv {
        b(i3);
        this.g.b(bArr, i2, i3);
    }

    @Override // com.umeng.analytics.pro.co
    public void a() throws bv {
    }

    @Override // com.umeng.analytics.pro.co
    public void e() throws bv {
    }

    @Override // com.umeng.analytics.pro.co
    public void f() throws bv {
    }

    @Override // com.umeng.analytics.pro.co
    public void g() throws bv {
    }

    @Override // com.umeng.analytics.pro.co
    public void c() throws bv {
    }

    protected void a(byte b2, int i2) throws bv {
        if (i2 <= 14) {
            d(e(b2) | (i2 << 4));
            return;
        }
        d(e(b2) | 240);
        b(i2);
    }

    private void b(int i2) throws bv {
        int i3 = 0;
        while ((i2 & (-128)) != 0) {
            this.a[i3] = (byte) ((i2 & 127) | 128);
            i2 >>>= 7;
            i3++;
        }
        this.a[i3] = (byte) i2;
        this.g.b(this.a, 0, i3 + 1);
    }

    private void b(long j2) throws bv {
        int i2 = 0;
        while (((-128) & j2) != 0) {
            this.b[i2] = (byte) ((127 & j2) | 128);
            j2 >>>= 7;
            i2++;
        }
        this.b[i2] = (byte) j2;
        this.g.b(this.b, 0, i2 + 1);
    }

    private long c(long j2) {
        return (j2 >> 63) ^ (j2 << 1);
    }

    private int c(int i2) {
        return (i2 >> 31) ^ (i2 << 1);
    }

    private void a(long j2, byte[] bArr, int i2) {
        bArr[i2 + 0] = (byte) (j2 & 255);
        bArr[i2 + 1] = (byte) ((j2 >> 8) & 255);
        bArr[i2 + 2] = (byte) ((j2 >> 16) & 255);
        bArr[i2 + 3] = (byte) ((j2 >> 24) & 255);
        bArr[i2 + 4] = (byte) ((j2 >> 32) & 255);
        bArr[i2 + 5] = (byte) ((j2 >> 40) & 255);
        bArr[i2 + 6] = (byte) ((j2 >> 48) & 255);
        bArr[i2 + 7] = (byte) ((j2 >> 56) & 255);
    }

    private void b(byte b2) throws bv {
        this.r[0] = b2;
        this.g.b(this.r);
    }

    private void d(int i2) throws bv {
        b((byte) i2);
    }

    @Override // com.umeng.analytics.pro.co
    public cm h() throws bv {
        byte u = u();
        if (u != -126) {
            throw new cp("Expected protocol id " + Integer.toHexString(-126) + " but got " + Integer.toHexString(u));
        }
        byte u2 = u();
        byte b2 = (byte) (u2 & j);
        if (b2 != 1) {
            throw new cp("Expected version 1 but got " + ((int) b2));
        }
        int E = E();
        return new cm(z(), (byte) ((u2 >> 5) & 3), E);
    }

    @Override // com.umeng.analytics.pro.co
    public ct j() throws bv {
        this.m.a(this.n);
        this.n = (short) 0;
        return d;
    }

    @Override // com.umeng.analytics.pro.co
    public void k() throws bv {
        this.n = this.m.a();
    }

    @Override // com.umeng.analytics.pro.co
    public cj l() throws bv {
        short s;
        byte u = u();
        if (u == 0) {
            return e;
        }
        short s2 = (short) ((u & 240) >> 4);
        if (s2 == 0) {
            s = v();
        } else {
            s = (short) (this.n + s2);
        }
        byte b2 = (byte) (u & cv.m);
        cj cjVar = new cj("", d(b2), s);
        if (c(u)) {
            this.p = b2 == 1 ? Boolean.TRUE : Boolean.FALSE;
        }
        this.n = cjVar.c;
        return cjVar;
    }

    @Override // com.umeng.analytics.pro.co
    public cl n() throws bv {
        int E = E();
        byte u = E == 0 ? (byte) 0 : u();
        return new cl(d((byte) (u >> 4)), d((byte) (u & cv.m)), E);
    }

    @Override // com.umeng.analytics.pro.co
    public ck p() throws bv {
        byte u = u();
        int i2 = (u >> 4) & 15;
        if (i2 == 15) {
            i2 = E();
        }
        return new ck(d(u), i2);
    }

    @Override // com.umeng.analytics.pro.co
    public cs r() throws bv {
        return new cs(p());
    }

    @Override // com.umeng.analytics.pro.co
    public boolean t() throws bv {
        Boolean bool = this.p;
        if (bool == null) {
            return u() == 1;
        }
        boolean booleanValue = bool.booleanValue();
        this.p = null;
        return booleanValue;
    }

    @Override // com.umeng.analytics.pro.co
    public byte u() throws bv {
        if (this.g.h() > 0) {
            byte b2 = this.g.f()[this.g.g()];
            this.g.a(1);
            return b2;
        }
        this.g.d(this.c, 0, 1);
        return this.c[0];
    }

    @Override // com.umeng.analytics.pro.co
    public short v() throws bv {
        return (short) g(E());
    }

    @Override // com.umeng.analytics.pro.co
    public int w() throws bv {
        return g(E());
    }

    @Override // com.umeng.analytics.pro.co
    public long x() throws bv {
        return d(F());
    }

    @Override // com.umeng.analytics.pro.co
    public double y() throws bv {
        byte[] bArr = new byte[8];
        this.g.d(bArr, 0, 8);
        return Double.longBitsToDouble(a(bArr));
    }

    @Override // com.umeng.analytics.pro.co
    public String z() throws bv {
        int E = E();
        f(E);
        if (E == 0) {
            return "";
        }
        try {
            if (this.g.h() >= E) {
                String str = new String(this.g.f(), this.g.g(), E, "UTF-8");
                this.g.a(E);
                return str;
            }
            return new String(e(E), "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            throw new bv("UTF-8 not supported!");
        }
    }

    @Override // com.umeng.analytics.pro.co
    public ByteBuffer A() throws bv {
        int E = E();
        f(E);
        if (E == 0) {
            return ByteBuffer.wrap(new byte[0]);
        }
        byte[] bArr = new byte[E];
        this.g.d(bArr, 0, E);
        return ByteBuffer.wrap(bArr);
    }

    private byte[] e(int i2) throws bv {
        if (i2 == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i2];
        this.g.d(bArr, 0, i2);
        return bArr;
    }

    private void f(int i2) throws cp {
        if (i2 < 0) {
            throw new cp("Negative length: " + i2);
        }
        long j2 = this.q;
        if (j2 != -1 && i2 > j2) {
            throw new cp("Length exceeded max allowed: " + i2);
        }
    }

    @Override // com.umeng.analytics.pro.co
    public void i() throws bv {
    }

    @Override // com.umeng.analytics.pro.co
    public void m() throws bv {
    }

    @Override // com.umeng.analytics.pro.co
    public void o() throws bv {
    }

    @Override // com.umeng.analytics.pro.co
    public void q() throws bv {
    }

    @Override // com.umeng.analytics.pro.co
    public void s() throws bv {
    }

    private int E() throws bv {
        int i2 = 0;
        if (this.g.h() < 5) {
            int i3 = 0;
            while (true) {
                byte u = u();
                i2 |= (u & Byte.MAX_VALUE) << i3;
                if ((u & 128) != 128) {
                    return i2;
                }
                i3 += 7;
            }
        } else {
            byte[] f2 = this.g.f();
            int g = this.g.g();
            int i4 = 0;
            int i5 = 0;
            while (true) {
                byte b2 = f2[g + i2];
                i4 |= (b2 & Byte.MAX_VALUE) << i5;
                if ((b2 & 128) == 128) {
                    i5 += 7;
                    i2++;
                } else {
                    this.g.a(i2 + 1);
                    return i4;
                }
            }
        }
    }

    private long F() throws bv {
        byte u;
        byte b2;
        int i2 = 0;
        long j2 = 0;
        if (this.g.h() >= 10) {
            byte[] f2 = this.g.f();
            int g = this.g.g();
            long j3 = 0;
            int i3 = 0;
            while (true) {
                j3 |= (b2 & Byte.MAX_VALUE) << i3;
                if ((f2[g + i2] & 128) == 128) {
                    i3 += 7;
                    i2++;
                } else {
                    this.g.a(i2 + 1);
                    return j3;
                }
            }
        } else {
            while (true) {
                j2 |= (u & Byte.MAX_VALUE) << i2;
                if ((u() & 128) != 128) {
                    return j2;
                }
                i2 += 7;
            }
        }
    }

    private int g(int i2) {
        return (-(i2 & 1)) ^ (i2 >>> 1);
    }

    private long d(long j2) {
        return (-(j2 & 1)) ^ (j2 >>> 1);
    }

    private long a(byte[] bArr) {
        return ((bArr[7] & 255) << 56) | ((bArr[6] & 255) << 48) | ((bArr[5] & 255) << 40) | ((bArr[4] & 255) << 32) | ((bArr[3] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[1] & 255) << 8) | (255 & bArr[0]);
    }

    private boolean c(byte b2) {
        int i2 = b2 & cv.m;
        return i2 == 1 || i2 == 2;
    }

    private byte d(byte b2) throws cp {
        byte b3 = (byte) (b2 & cv.m);
        switch (b3) {
            case 0:
                return (byte) 0;
            case 1:
            case 2:
                return (byte) 2;
            case 3:
                return (byte) 3;
            case 4:
                return (byte) 6;
            case 5:
                return (byte) 8;
            case 6:
                return (byte) 10;
            case 7:
                return (byte) 4;
            case 8:
                return (byte) 11;
            case 9:
                return cv.m;
            case 10:
                return cv.l;
            case 11:
                return cv.k;
            case 12:
                return (byte) 12;
            default:
                throw new cp("don't know what type: " + ((int) b3));
        }
    }

    private byte e(byte b2) {
        return f[b2];
    }
}

package com.umeng.analytics.pro;

import com.flurry.android.Constants;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
/* compiled from: TBinaryProtocol.java */
/* loaded from: classes3.dex */
public class ch extends co {
    protected static final int a = -65536;
    protected static final int b = -2147418112;
    private static final ct h = new ct();
    protected boolean c;
    protected boolean d;
    protected int e;
    protected boolean f;
    private byte[] i;
    private byte[] j;
    private byte[] k;
    private byte[] l;
    private byte[] m;
    private byte[] n;
    private byte[] o;
    private byte[] p;

    /* compiled from: TBinaryProtocol.java */
    /* loaded from: classes3.dex */
    public static class a implements cq {
        protected boolean a;
        protected boolean b;
        protected int c;

        public a() {
            this(false, true);
        }

        public a(boolean z, boolean z2) {
            this(z, z2, 0);
        }

        public a(boolean z, boolean z2, int i) {
            this.a = false;
            this.b = true;
            this.a = z;
            this.b = z2;
            this.c = i;
        }

        @Override // com.umeng.analytics.pro.cq
        public co a(dc dcVar) {
            ch chVar = new ch(dcVar, this.a, this.b);
            int i = this.c;
            if (i != 0) {
                chVar.c(i);
            }
            return chVar;
        }
    }

    public ch(dc dcVar) {
        this(dcVar, false, true);
    }

    public ch(dc dcVar, boolean z, boolean z2) {
        super(dcVar);
        this.c = false;
        this.d = true;
        this.f = false;
        this.i = new byte[1];
        this.j = new byte[2];
        this.k = new byte[4];
        this.l = new byte[8];
        this.m = new byte[1];
        this.n = new byte[2];
        this.o = new byte[4];
        this.p = new byte[8];
        this.c = z;
        this.d = z2;
    }

    @Override // com.umeng.analytics.pro.co
    public void a(cm cmVar) throws bv {
        if (this.d) {
            a(b | cmVar.b);
            a(cmVar.a);
            a(cmVar.c);
            return;
        }
        a(cmVar.a);
        a(cmVar.b);
        a(cmVar.c);
    }

    @Override // com.umeng.analytics.pro.co
    public void a() {
    }

    @Override // com.umeng.analytics.pro.co
    public void a(ct ctVar) {
    }

    @Override // com.umeng.analytics.pro.co
    public void b() {
    }

    @Override // com.umeng.analytics.pro.co
    public void a(cj cjVar) throws bv {
        a(cjVar.b);
        a(cjVar.c);
    }

    @Override // com.umeng.analytics.pro.co
    public void c() {
    }

    @Override // com.umeng.analytics.pro.co
    public void d() throws bv {
        a((byte) 0);
    }

    @Override // com.umeng.analytics.pro.co
    public void a(cl clVar) throws bv {
        a(clVar.a);
        a(clVar.b);
        a(clVar.c);
    }

    @Override // com.umeng.analytics.pro.co
    public void e() {
    }

    @Override // com.umeng.analytics.pro.co
    public void a(ck ckVar) throws bv {
        a(ckVar.a);
        a(ckVar.b);
    }

    @Override // com.umeng.analytics.pro.co
    public void f() {
    }

    @Override // com.umeng.analytics.pro.co
    public void a(cs csVar) throws bv {
        a(csVar.a);
        a(csVar.b);
    }

    @Override // com.umeng.analytics.pro.co
    public void g() {
    }

    @Override // com.umeng.analytics.pro.co
    public void a(boolean z) throws bv {
        a(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.umeng.analytics.pro.co
    public void a(byte b2) throws bv {
        this.i[0] = b2;
        this.g.b(this.i, 0, 1);
    }

    @Override // com.umeng.analytics.pro.co
    public void a(short s) throws bv {
        byte[] bArr = this.j;
        bArr[0] = (byte) ((s >> 8) & 255);
        bArr[1] = (byte) (s & 255);
        this.g.b(this.j, 0, 2);
    }

    @Override // com.umeng.analytics.pro.co
    public void a(int i) throws bv {
        byte[] bArr = this.k;
        bArr[0] = (byte) ((i >> 24) & 255);
        bArr[1] = (byte) ((i >> 16) & 255);
        bArr[2] = (byte) ((i >> 8) & 255);
        bArr[3] = (byte) (i & 255);
        this.g.b(this.k, 0, 4);
    }

    @Override // com.umeng.analytics.pro.co
    public void a(long j) throws bv {
        byte[] bArr = this.l;
        bArr[0] = (byte) ((j >> 56) & 255);
        bArr[1] = (byte) ((j >> 48) & 255);
        bArr[2] = (byte) ((j >> 40) & 255);
        bArr[3] = (byte) ((j >> 32) & 255);
        bArr[4] = (byte) ((j >> 24) & 255);
        bArr[5] = (byte) ((j >> 16) & 255);
        bArr[6] = (byte) ((j >> 8) & 255);
        bArr[7] = (byte) (j & 255);
        this.g.b(this.l, 0, 8);
    }

    @Override // com.umeng.analytics.pro.co
    public void a(double d) throws bv {
        a(Double.doubleToLongBits(d));
    }

    @Override // com.umeng.analytics.pro.co
    public void a(String str) throws bv {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            a(bytes.length);
            this.g.b(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException e) {
            throw new bv("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.umeng.analytics.pro.co
    public void a(ByteBuffer byteBuffer) throws bv {
        int limit = byteBuffer.limit() - byteBuffer.position();
        a(limit);
        this.g.b(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), limit);
    }

    @Override // com.umeng.analytics.pro.co
    public cm h() throws bv {
        int w = w();
        if (w < 0) {
            if (((-65536) & w) != b) {
                throw new cp(4, "Bad version in readMessageBegin");
            }
            return new cm(z(), (byte) (w & 255), w());
        } else if (this.c) {
            throw new cp(4, "Missing version in readMessageBegin, old client?");
        } else {
            return new cm(b(w), u(), w());
        }
    }

    @Override // com.umeng.analytics.pro.co
    public void i() {
    }

    @Override // com.umeng.analytics.pro.co
    public ct j() {
        return h;
    }

    @Override // com.umeng.analytics.pro.co
    public void k() {
    }

    @Override // com.umeng.analytics.pro.co
    public cj l() throws bv {
        byte u = u();
        return new cj("", u, u == 0 ? (short) 0 : v());
    }

    @Override // com.umeng.analytics.pro.co
    public void m() {
    }

    @Override // com.umeng.analytics.pro.co
    public cl n() throws bv {
        return new cl(u(), u(), w());
    }

    @Override // com.umeng.analytics.pro.co
    public void o() {
    }

    @Override // com.umeng.analytics.pro.co
    public ck p() throws bv {
        return new ck(u(), w());
    }

    @Override // com.umeng.analytics.pro.co
    public void q() {
    }

    @Override // com.umeng.analytics.pro.co
    public cs r() throws bv {
        return new cs(u(), w());
    }

    @Override // com.umeng.analytics.pro.co
    public void s() {
    }

    @Override // com.umeng.analytics.pro.co
    public boolean t() throws bv {
        return u() == 1;
    }

    @Override // com.umeng.analytics.pro.co
    public byte u() throws bv {
        if (this.g.h() >= 1) {
            byte b2 = this.g.f()[this.g.g()];
            this.g.a(1);
            return b2;
        }
        a(this.m, 0, 1);
        return this.m[0];
    }

    @Override // com.umeng.analytics.pro.co
    public short v() throws bv {
        byte[] bArr = this.n;
        int i = 0;
        if (this.g.h() >= 2) {
            bArr = this.g.f();
            i = this.g.g();
            this.g.a(2);
        } else {
            a(this.n, 0, 2);
        }
        return (short) ((bArr[i + 1] & Constants.UNKNOWN) | ((bArr[i] & Constants.UNKNOWN) << 8));
    }

    @Override // com.umeng.analytics.pro.co
    public int w() throws bv {
        byte[] bArr = this.o;
        int i = 0;
        if (this.g.h() >= 4) {
            bArr = this.g.f();
            i = this.g.g();
            this.g.a(4);
        } else {
            a(this.o, 0, 4);
        }
        return (bArr[i + 3] & Constants.UNKNOWN) | ((bArr[i] & Constants.UNKNOWN) << 24) | ((bArr[i + 1] & Constants.UNKNOWN) << 16) | ((bArr[i + 2] & Constants.UNKNOWN) << 8);
    }

    @Override // com.umeng.analytics.pro.co
    public long x() throws bv {
        byte[] bArr = this.p;
        int i = 0;
        if (this.g.h() >= 8) {
            bArr = this.g.f();
            i = this.g.g();
            this.g.a(8);
        } else {
            a(this.p, 0, 8);
        }
        return (bArr[i + 7] & Constants.UNKNOWN) | ((bArr[i] & Constants.UNKNOWN) << 56) | ((bArr[i + 1] & Constants.UNKNOWN) << 48) | ((bArr[i + 2] & Constants.UNKNOWN) << 40) | ((bArr[i + 3] & Constants.UNKNOWN) << 32) | ((bArr[i + 4] & Constants.UNKNOWN) << 24) | ((bArr[i + 5] & Constants.UNKNOWN) << 16) | ((bArr[i + 6] & Constants.UNKNOWN) << 8);
    }

    @Override // com.umeng.analytics.pro.co
    public double y() throws bv {
        return Double.longBitsToDouble(x());
    }

    @Override // com.umeng.analytics.pro.co
    public String z() throws bv {
        int w = w();
        if (this.g.h() >= w) {
            try {
                String str = new String(this.g.f(), this.g.g(), w, "UTF-8");
                this.g.a(w);
                return str;
            } catch (UnsupportedEncodingException e) {
                throw new bv("JVM DOES NOT SUPPORT UTF-8");
            }
        }
        return b(w);
    }

    public String b(int i) throws bv {
        try {
            d(i);
            byte[] bArr = new byte[i];
            this.g.d(bArr, 0, i);
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new bv("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.umeng.analytics.pro.co
    public ByteBuffer A() throws bv {
        int w = w();
        d(w);
        if (this.g.h() >= w) {
            ByteBuffer wrap = ByteBuffer.wrap(this.g.f(), this.g.g(), w);
            this.g.a(w);
            return wrap;
        }
        byte[] bArr = new byte[w];
        this.g.d(bArr, 0, w);
        return ByteBuffer.wrap(bArr);
    }

    private int a(byte[] bArr, int i, int i2) throws bv {
        d(i2);
        return this.g.d(bArr, i, i2);
    }

    public void c(int i) {
        this.e = i;
        this.f = true;
    }

    protected void d(int i) throws bv {
        if (i < 0) {
            throw new cp("Negative length: " + i);
        } else if (this.f) {
            int i2 = this.e - i;
            this.e = i2;
            if (i2 < 0) {
                throw new cp("Message length exceeded: " + i);
            }
        }
    }
}

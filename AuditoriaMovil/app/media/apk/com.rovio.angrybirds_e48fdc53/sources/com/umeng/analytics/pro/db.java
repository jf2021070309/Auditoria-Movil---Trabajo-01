package com.umeng.analytics.pro;
/* compiled from: TMemoryInputTransport.java */
/* loaded from: classes3.dex */
public final class db extends dc {
    private byte[] a;
    private int b;
    private int c;

    public db() {
    }

    public db(byte[] bArr) {
        a(bArr);
    }

    public db(byte[] bArr, int i, int i2) {
        c(bArr, i, i2);
    }

    public void a(byte[] bArr) {
        c(bArr, 0, bArr.length);
    }

    public void c(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.b = i;
        this.c = i + i2;
    }

    public void e() {
        this.a = null;
    }

    @Override // com.umeng.analytics.pro.dc
    public void c() {
    }

    @Override // com.umeng.analytics.pro.dc
    public boolean a() {
        return true;
    }

    @Override // com.umeng.analytics.pro.dc
    public void b() throws dd {
    }

    @Override // com.umeng.analytics.pro.dc
    public int a(byte[] bArr, int i, int i2) throws dd {
        int h = h();
        if (i2 > h) {
            i2 = h;
        }
        if (i2 > 0) {
            System.arraycopy(this.a, this.b, bArr, i, i2);
            a(i2);
        }
        return i2;
    }

    @Override // com.umeng.analytics.pro.dc
    public void b(byte[] bArr, int i, int i2) throws dd {
        throw new UnsupportedOperationException("No writing allowed!");
    }

    @Override // com.umeng.analytics.pro.dc
    public byte[] f() {
        return this.a;
    }

    @Override // com.umeng.analytics.pro.dc
    public int g() {
        return this.b;
    }

    @Override // com.umeng.analytics.pro.dc
    public int h() {
        return this.c - this.b;
    }

    @Override // com.umeng.analytics.pro.dc
    public void a(int i) {
        this.b += i;
    }
}

package com.amazon.aps.iva.c7;

import com.amazon.aps.iva.x6.i;
import com.amazon.aps.iva.x6.o;
/* compiled from: StartOffsetExtractorInput.java */
/* loaded from: classes.dex */
public final class c implements o {
    public final o a;
    public final long b;

    public c(i iVar, long j) {
        boolean z;
        this.a = iVar;
        if (iVar.d >= j) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.t(z);
        this.b = j;
    }

    @Override // com.amazon.aps.iva.x6.o
    public final long a() {
        return this.a.a() - this.b;
    }

    @Override // com.amazon.aps.iva.x6.o
    public final boolean c(byte[] bArr, int i, int i2, boolean z) {
        return this.a.c(bArr, i, i2, z);
    }

    @Override // com.amazon.aps.iva.x6.o
    public final void e() {
        this.a.e();
    }

    @Override // com.amazon.aps.iva.x6.o
    public final boolean f(byte[] bArr, int i, int i2, boolean z) {
        return this.a.f(bArr, i, i2, z);
    }

    @Override // com.amazon.aps.iva.x6.o
    public final void g(int i, byte[] bArr, int i2) {
        this.a.g(i, bArr, i2);
    }

    @Override // com.amazon.aps.iva.x6.o
    public final long getPosition() {
        return this.a.getPosition() - this.b;
    }

    @Override // com.amazon.aps.iva.x6.o
    public final long h() {
        return this.a.h() - this.b;
    }

    @Override // com.amazon.aps.iva.x6.o
    public final void i(int i) {
        this.a.i(i);
    }

    @Override // com.amazon.aps.iva.x6.o
    public final void k(int i) {
        this.a.k(i);
    }

    @Override // com.amazon.aps.iva.q5.o
    public final int l(byte[] bArr, int i, int i2) {
        return this.a.l(bArr, i, i2);
    }

    @Override // com.amazon.aps.iva.x6.o
    public final void readFully(byte[] bArr, int i, int i2) {
        this.a.readFully(bArr, i, i2);
    }
}

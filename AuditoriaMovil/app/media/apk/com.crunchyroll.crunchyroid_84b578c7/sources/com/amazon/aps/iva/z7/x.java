package com.amazon.aps.iva.z7;

import android.util.SparseArray;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
/* compiled from: PsExtractor.java */
/* loaded from: classes.dex */
public final class x implements com.amazon.aps.iva.x6.n {
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public u i;
    public com.amazon.aps.iva.x6.p j;
    public boolean k;
    public final com.amazon.aps.iva.t5.b0 a = new com.amazon.aps.iva.t5.b0(0);
    public final com.amazon.aps.iva.t5.v c = new com.amazon.aps.iva.t5.v(4096);
    public final SparseArray<a> b = new SparseArray<>();
    public final v d = new v();

    /* compiled from: PsExtractor.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final j a;
        public final com.amazon.aps.iva.t5.b0 b;
        public final com.amazon.aps.iva.t5.u c = new com.amazon.aps.iva.t5.u(new byte[64]);
        public boolean d;
        public boolean e;
        public boolean f;
        public long g;

        public a(j jVar, com.amazon.aps.iva.t5.b0 b0Var) {
            this.a = jVar;
            this.b = b0Var;
        }
    }

    @Override // com.amazon.aps.iva.x6.n
    public final boolean b(com.amazon.aps.iva.x6.o oVar) throws IOException {
        byte[] bArr = new byte[14];
        com.amazon.aps.iva.x6.i iVar = (com.amazon.aps.iva.x6.i) oVar;
        iVar.c(bArr, 0, 14, false);
        if (442 != (((bArr[0] & UnsignedBytes.MAX_VALUE) << 24) | ((bArr[1] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[2] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[3] & UnsignedBytes.MAX_VALUE)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        iVar.m(bArr[13] & 7, false);
        iVar.c(bArr, 0, 3, false);
        if (1 != (((bArr[0] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[1] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[2] & UnsignedBytes.MAX_VALUE))) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void c(long j, long j2) {
        long j3;
        boolean z;
        com.amazon.aps.iva.t5.b0 b0Var = this.a;
        synchronized (b0Var) {
            j3 = b0Var.b;
        }
        int i = (j3 > (-9223372036854775807L) ? 1 : (j3 == (-9223372036854775807L) ? 0 : -1));
        boolean z2 = true;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            long c = b0Var.c();
            if (c == -9223372036854775807L || c == 0 || c == j2) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            b0Var.e(j2);
        }
        u uVar = this.i;
        if (uVar != null) {
            uVar.c(j2);
        }
        int i2 = 0;
        while (true) {
            SparseArray<a> sparseArray = this.b;
            if (i2 < sparseArray.size()) {
                a valueAt = sparseArray.valueAt(i2);
                valueAt.f = false;
                valueAt.a.b();
                i2++;
            } else {
                return;
            }
        }
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void g(com.amazon.aps.iva.x6.p pVar) {
        this.j = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01ea  */
    @Override // com.amazon.aps.iva.x6.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(com.amazon.aps.iva.x6.o r19, com.amazon.aps.iva.x6.c0 r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.z7.x.h(com.amazon.aps.iva.x6.o, com.amazon.aps.iva.x6.c0):int");
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void release() {
    }
}

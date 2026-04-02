package com.amazon.aps.iva.o6;

import android.net.Uri;
import com.amazon.aps.iva.o6.d0;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/* compiled from: IcyDataSource.java */
/* loaded from: classes.dex */
public final class p implements com.amazon.aps.iva.w5.f {
    public final com.amazon.aps.iva.w5.f a;
    public final int b;
    public final a c;
    public final byte[] d;
    public int e;

    /* compiled from: IcyDataSource.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    public p(com.amazon.aps.iva.w5.w wVar, int i, a aVar) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.t(z);
        this.a = wVar;
        this.b = i;
        this.c = aVar;
        this.d = new byte[1];
        this.e = i;
    }

    @Override // com.amazon.aps.iva.w5.f
    public final long b(com.amazon.aps.iva.w5.i iVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.amazon.aps.iva.w5.f
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // com.amazon.aps.iva.w5.f
    public final Map<String, List<String>> d() {
        return this.a.d();
    }

    @Override // com.amazon.aps.iva.w5.f
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // com.amazon.aps.iva.w5.f
    public final void j(com.amazon.aps.iva.w5.y yVar) {
        yVar.getClass();
        this.a.j(yVar);
    }

    @Override // com.amazon.aps.iva.q5.o
    public final int l(byte[] bArr, int i, int i2) throws IOException {
        long max;
        int i3 = this.e;
        com.amazon.aps.iva.w5.f fVar = this.a;
        if (i3 == 0) {
            byte[] bArr2 = this.d;
            boolean z = false;
            if (fVar.l(bArr2, 0, 1) != -1) {
                int i4 = (bArr2[0] & 255) << 4;
                if (i4 != 0) {
                    byte[] bArr3 = new byte[i4];
                    int i5 = i4;
                    int i6 = 0;
                    while (i5 > 0) {
                        int l = fVar.l(bArr3, i6, i5);
                        if (l == -1) {
                            break;
                        }
                        i6 += l;
                        i5 -= l;
                    }
                    while (i4 > 0) {
                        int i7 = i4 - 1;
                        if (bArr3[i7] != 0) {
                            break;
                        }
                        i4 = i7;
                    }
                    if (i4 > 0) {
                        com.amazon.aps.iva.t5.v vVar = new com.amazon.aps.iva.t5.v(bArr3, i4);
                        d0.a aVar = (d0.a) this.c;
                        if (!aVar.m) {
                            max = aVar.j;
                        } else {
                            Map<String, String> map = d0.N;
                            max = Math.max(d0.this.x(true), aVar.j);
                        }
                        int i8 = vVar.c - vVar.b;
                        g0 g0Var = aVar.l;
                        g0Var.getClass();
                        g0Var.f(i8, vVar);
                        g0Var.d(max, 1, i8, 0, null);
                        aVar.m = true;
                    }
                }
                z = true;
            }
            if (!z) {
                return -1;
            }
            this.e = this.b;
        }
        int l2 = fVar.l(bArr, i, Math.min(this.e, i2));
        if (l2 != -1) {
            this.e -= l2;
        }
        return l2;
    }
}

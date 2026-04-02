package com.amazon.aps.iva.x6;

import com.amazon.aps.iva.i7.g;
import java.io.EOFException;
import java.io.IOException;
/* compiled from: Id3Peeker.java */
/* loaded from: classes.dex */
public final class z {
    public final com.amazon.aps.iva.t5.v a = new com.amazon.aps.iva.t5.v(10);

    public final com.amazon.aps.iva.q5.f0 a(i iVar, g.a aVar) throws IOException {
        com.amazon.aps.iva.t5.v vVar = this.a;
        com.amazon.aps.iva.q5.f0 f0Var = null;
        int i = 0;
        while (true) {
            try {
                iVar.c(vVar.a, 0, 10, false);
                vVar.F(0);
                if (vVar.w() != 4801587) {
                    break;
                }
                vVar.G(3);
                int t = vVar.t();
                int i2 = t + 10;
                if (f0Var == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(vVar.a, 0, bArr, 0, 10);
                    iVar.c(bArr, 10, t, false);
                    f0Var = new com.amazon.aps.iva.i7.g(aVar).s(i2, bArr);
                } else {
                    iVar.m(t, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        iVar.f = 0;
        iVar.m(i, false);
        return f0Var;
    }
}
